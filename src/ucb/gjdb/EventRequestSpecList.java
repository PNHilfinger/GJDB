/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import com.sun.jdi.event.*;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.event.ClassPrepareEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

class EventRequestSpecList {

    private static final int statusResolved = 1;
    private static final int statusUnresolved = 2;
    private static final int statusError = 3;
    
    private List<EventRequestSpec> eventRequestSpecs = 
        Collections.synchronizedList(new ArrayList<EventRequestSpec>());

    EventRequestSpecList() {
    }

    /** The currently listed EventRequestSpec that resolves to REQUEST,
     *  or null if none. */
    EventRequestSpec getRequestSpec (EventRequest request) {
        for (EventRequestSpec spec : eventRequestSpecs)
            if (request == spec.resolved ())
                return spec;
        return null;
    }

    /** The currently listed EventRequestSpec that produced EVENT,
     *  or null if none. */
    EventRequestSpec getRequestSpec (Event event) {
        return getRequestSpec (event.request ());
    }

    /** 
     * Check all deferred eventRequests, trying to resolve each against
     * EVENT.refType(). 
     * @return true if it completes successfully, false on error.
     */
    boolean resolve(ClassPrepareEvent event) {
        boolean failure, allResolved;
        failure = false;
        allResolved = true;
        synchronized(eventRequestSpecs) {
            Iterator<EventRequestSpec> iter = eventRequestSpecs.iterator();
            while (iter.hasNext()) {
                EventRequestSpec spec = iter.next();
                if (!spec.isResolved()) {
                    try {
                        EventRequest eventRequest = spec.resolve(event);
                        if (eventRequest == null)
                            allResolved = false;
                        else
                            Env.noticeln("Set %s", spec);
                    } catch (Exception e) {
                        Env.errorln("Unable to set deferred %s: %s", spec,
                                    spec.errorMessageFor(e));
                        Env.errorln("Removing %s", spec);
                        iter.remove ();
                        failure = true;
                    }
                }
            }
        }
        if (allResolved)
            Env.setClassPrepareEnabled (false);
        return !failure;
    }

    void resolveAll() {
        boolean allResolved;
        allResolved = true;
        for (EventRequestSpec spec : eventRequestSpecs) {
            try {
                EventRequest eventRequest = spec.resolveEagerly();
                if (eventRequest == null)
                    allResolved = false;
                else
                    Env.noticeln("Set %s", spec);
            } catch (Exception e) {
                allResolved = false;
            }
        }
        if (allResolved)
            Env.setClassPrepareEnabled (false);
    }

    void unresolveAll () {
        Env.setClassPrepareEnabled (true);
        for (EventRequestSpec spec : eventRequestSpecs)
            spec.unresolve ();
    }
    
    void removeTransients () {
        for (Iterator<EventRequestSpec> iter = eventRequestSpecs.iterator();
             iter.hasNext(); ) {
            EventRequestSpec spec = iter.next ();
            if (spec.isTransient ()) {
                iter.remove ();
                Env.noticeln ("Removed obsolete request %s", spec);
            }
        }
    }

    boolean addEagerlyResolve(EventRequestSpec spec) {
        try {
            eventRequestSpecs.add(spec);
            Env.setClassPrepareEnabled (true);
            EventRequest eventRequest = spec.resolveEagerly();
            if (eventRequest != null) {
                Env.noticeln("Set %s", spec);
            } 
            return true;
        } catch (Exception exc) {
            Env.errorln("Unable to set %s : %s", spec,
                        spec.errorMessageFor(exc));
            delete(spec);
            return false;
        }
    }

    void add(EventRequestSpec spec) {
        eventRequestSpecs.add(spec);
        Env.setClassPrepareEnabled (true);
    }        
        
    EventRequestSpec createBreakpoint(String classPattern, 
                                      int line) throws ClassNotFoundException {
        ReferenceTypeSpec refSpec = 
            new PatternReferenceTypeSpec(classPattern);
        return new BreakpointSpec(refSpec, line);
    }
        
    EventRequestSpec createBreakpoint(String classPattern, 
                                      String methodId, 
                                      List methodArgs) 
        throws BadMemberNameException,  ClassNotFoundException {
        ReferenceTypeSpec refSpec = 
            new PatternReferenceTypeSpec(classPattern);
        return new BreakpointSpec(refSpec, methodId, methodArgs);
    }
        
    EventRequestSpec createExceptionCatch(String classPattern)
        throws ClassNotFoundException {
        ReferenceTypeSpec refSpec = 
            new PatternReferenceTypeSpec(classPattern, true);
        return new ExceptionSpec(refSpec);
    }
        
    EventRequestSpec createAccessWatchpoint(String classPattern, 
                                            String fieldId, 
                                            ObjectReference obj) 
        throws BadMemberNameException, ClassNotFoundException {

        if (obj == null)
            return 
                new AccessWatchpointSpec
                (new PatternReferenceTypeSpec(classPattern), fieldId);
        else
            return new AccessWatchpointSpec (obj, fieldId);
    }
        
    EventRequestSpec createModificationWatchpoint(String classPattern, 
                                                  String fieldId,
                                                  ObjectReference obj) 
        throws BadMemberNameException, ClassNotFoundException {

        if (obj == null)
            return 
                new ModificationWatchpointSpec
                (new PatternReferenceTypeSpec(classPattern), fieldId);
        else
            return new ModificationWatchpointSpec (obj, fieldId);
    }

    boolean delete(EventRequestSpec proto) {
        synchronized (eventRequestSpecs) {
            int inx = eventRequestSpecs.indexOf(proto);
            if (inx != -1) {
                EventRequestSpec spec = eventRequestSpecs.get(inx);
                eventRequestSpecs.remove(inx);
                if (spec.isResolved() && Env.vm () != null) {
                    Env.vm().eventRequestManager().deleteEventRequest(spec.resolved());
                }
                return true;
            } else {
                return false;
            }
        }
    }



    /** A list of all current event request specifications with the same
     *  type as EXEMPLAR (or all requests, if EXEMPLAR is null).
     *  The resulting list is new, and does not change with modifications
     *  to the set of requests. */
    List<EventRequestSpec> eventRequestSpecs(EventRequestSpec exemplar) {
        synchronized (eventRequestSpecs) {
            if (exemplar == null)
                return new ArrayList<EventRequestSpec> (eventRequestSpecs);
            Class<?> type = exemplar.getClass ();
            List<EventRequestSpec> result = 
                new ArrayList<EventRequestSpec> (eventRequestSpecs.size ());
            for (EventRequestSpec spec : eventRequestSpecs) {
                if (type.isInstance (spec))
                    result.add (spec);
            }
            return result;
        }
    }
}



