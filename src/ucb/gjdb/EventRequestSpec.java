/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.event.ClassPrepareEvent;
import java.util.List;
import java.util.Iterator;

abstract class EventRequestSpec {

    final protected ReferenceTypeSpec refSpec;
    final private int id;
    private static int nextEventRequestId = 1;
    private String condition, commands;
    private boolean enabled;

    int suspendPolicy = EventRequest.SUSPEND_ALL;

    EventRequest resolved = null;

    EventRequestSpec(ReferenceTypeSpec refSpec) {
        this.refSpec = refSpec;
        id = nextEventRequestId;
        nextEventRequestId += 1;
        enabled = true;
    }

    /** For making exemplars, etc. */
    protected EventRequestSpec () { refSpec = null; id = 0; enabled = true; }

    /**
     * The 'refType' is known to match, return the EventRequest.
     */
    abstract EventRequest resolveEventRequest(ReferenceType refType) 
        throws Exception;

    /**
     * @return If this EventRequestSpec matches the 'refType'
     * return the corresponding EventRequest.  Otherwise
     * return null.
     */
    synchronized EventRequest resolve (ClassPrepareEvent event) 
        throws Exception
    {
        if (resolved == null && refSpec.matches (event.referenceType ()))
            resolved = resolveEventRequest (event.referenceType ());
        if (resolved != null && !enabled)
            resolved.disable ();
        return resolved;
    }   

    /** Return this request to the unresolved state it had immediately after
     *  creation. */
    synchronized void unresolve () {
        resolved = null;
    }

    private EventRequest resolveAgainstPreparedClasses() throws Exception {
        if (Env.vm () == null)
            return null;
        Iterator iter = Env.vm().allClasses().iterator();
        while ((resolved == null) && iter.hasNext()) {
            ReferenceType refType = (ReferenceType)iter.next();
            if (refType.isPrepared() && refSpec.matches(refType)) {
                resolved = resolveEventRequest(refType);
            }
        }
        if (resolved != null && !enabled)
            resolved.disable();
        return resolved;
    }

    synchronized EventRequest resolveEagerly() throws Exception {
        if (Env.vm () == null)
            return null;
        try {
            resolveAgainstPreparedClasses();
        } catch (VMNotConnectedException e) {
            /* Do nothing. Will again attempt to resolve when the 
             * VM is started. */
        }
        return resolved;
    }

    private static final Object COUNT_MARKER = "gjdb.Counted";
	
    /** Set the count filter on the event request to which THIS currently
     *  resolves (if any) to COUNT+1, or remove the count filter if COUNT<0.
     *  When an existing count filter must be removed or modified, re-resolves
     *  THIS.  Leaves THIS enabled. */
    void resetCount (int count) {
        EventRequest req;
        enabled = true;
        req = resolved ();
        if (req == null)
            return;
        if (req.getProperty (COUNT_MARKER) != null) {
            req.disable ();
            unresolve ();
            try {
                req = resolveEagerly ();
            } catch (Exception e) {
                Env.noticeln ("Problem resetting stop request #%d.", id);
                return;
            }
        }
        if (count >= 0) {
            req.disable ();
            req.addCountFilter (count + 1);
            req.putProperty (COUNT_MARKER, Boolean.TRUE);
            req.enable ();
        } else {
            req.putProperty (COUNT_MARKER, null);
        }
    }

    /** Return true iff this event is currently being ignored due to the
     *  ignore command. */
    boolean ignored () {
        EventRequest req = resolved ();
        return req != null && req.getProperty (COUNT_MARKER) != null;
    }

    /** Returns true iff this request spec is enabled. */
    boolean isEnabled () {
        return enabled;
    }

    /** Set isEnabled on this request spec to VAL. */
    void setEnabled (boolean val) {
        resetCount (-1);
        enabled = val;
        EventRequest req = resolved ();
        if (req != null)
            req.setEnabled (val);
    }

    /**
     * @return the eventRequest this spec has been resolved to,
     * null if so far unresolved.
     */
    EventRequest resolved() {
        return resolved;
    }

    /**
     * @return true if this spec has been resolved.
     */
    boolean isResolved() {
        return resolved != null;
    }

    /** True iff this event request can only make sense during the execution 
     *  in which it was created. */
    boolean isTransient () {
        return false;
    }

    int getId () {
        return this.id;
    }

    /** A descriptive word or phrase for this sort of event request. */
    abstract String getTypeDescription ();

    String getCondition () {
        return condition;
    }

    String getCommands () {
        return commands;
    }

    void setCommands (String commands) {
        this.commands = commands;
    }

    void setCondition (String condition) {
        this.condition = condition == null ? null : condition.trim ();
    }

    /** The EventRequentSpec in SPECS that has id() == ID, or null if none. */
    public static EventRequestSpec idToSpec (List specs, int id) {
        for (int i = 0; i < specs.size (); i += 1) {
            EventRequestSpec spec = (EventRequestSpec) specs.get (i);
            if (id == spec.getId ())
                return spec;
        }
        return null;
    }

    protected boolean isJavaIdentifier(String s) {
        if (s.length() == 0) {                              
            return false;
        }

        if (! Character.isJavaIdentifierStart(s.charAt(0))) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {
            if (! Character.isJavaIdentifierPart(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    String errorMessageFor(Exception e) { 
        if (e instanceof IllegalArgumentException) {
            return ("Invalid command syntax");
        } else if (e instanceof RuntimeException) {
            // A runtime exception that we were not expecting
            throw (RuntimeException)e;
        } else {
            return ("Internal error; unable to set" + this);
        } 
    }
}


