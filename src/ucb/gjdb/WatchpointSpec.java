/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

//package com.sun.tools.example.debug.tty;
package ucb.gjdb;

import java.util.Formatter;

import com.sun.jdi.*;
import com.sun.jdi.event.*;
import com.sun.jdi.request.EventRequest;

class WatchpointSpec extends EventRequestSpec {
    final String fieldId;
    final ObjectReference obj;

    WatchpointSpec(ReferenceTypeSpec refSpec, String fieldId)
        throws BadMemberNameException {
        super(refSpec);
        this.fieldId = fieldId;
        this.obj = null;
        if (!isJavaIdentifier(fieldId)) {
            throw new BadMemberNameException(fieldId);
        }
    }

    WatchpointSpec (ObjectReference obj, String fieldId) 
        throws BadMemberNameException {
        super (toRefSpec (obj));
        this.fieldId = fieldId;
        Field fld;
        fld = null;
        try {
            fld = obj.referenceType ().fieldByName (fieldId);
        } catch (Exception e) {
        }
        if (fld == null)
            throw new BadMemberNameException (fieldId);
        if (fld.isStatic ())
            obj = null;
        this.obj = obj;
    }

    /** Dummy for making exemplars, etc. */
    private WatchpointSpec () { fieldId = ""; obj = null; }

    static public final EventRequestSpec EXMPL = new WatchpointSpec ();

    public int hashCode() {
        return refSpec.hashCode() + fieldId.hashCode() + 
            getClass().hashCode();
    }

    public boolean equals(Object x) {
        if (x instanceof WatchpointSpec) {
            WatchpointSpec watchpoint = (WatchpointSpec)x;

            return 
                fieldId.equals(watchpoint.fieldId) &&
                refSpec.equals(watchpoint.refSpec) &&
                (obj == null || obj.equals (watchpoint.obj)) &&
                getClass().equals(watchpoint.getClass());
        } else {
            return false;
        }
    }

    String getTypeDescription () {
        return "watchpoint";
    }

    boolean isTransient () {
        return obj != null;
    }

    public String toString () { 
        Formatter result = new Formatter ();
        result.format ("WP [%d] %s for %s.%s", 
                       getId (), getTypeDescription (), refSpec, fieldId);
        if (obj != null)
            try {
                result.format (" on object id %s", obj.uniqueID ());
            } catch (ObjectCollectedException e) {
                result.format (" on [obsolete object]");
            }
        else if (resolved == null)
            result.format (" [deferred]");
        if (!isEnabled ())
            result.format (" [disabled]");
        else if (ignored ())
            result.format (" [ignored]");
        return result.toString ();
    }

    String errorMessageFor(Exception e) { 
        if (e instanceof NoSuchFieldException) {
            return String.format ("No field %s in %s", fieldId, refSpec);
        } else {
            return super.errorMessageFor(e);
        } 
    }

    EventRequest resolveEventRequest(ReferenceType refType) 
        throws NoSuchFieldException {
        throw new UnsupportedOperationException ();
    }

    boolean rightObject (WatchpointEvent fwe) {
        if (obj == null) 
            return true;
        else
            return obj.equals (fwe.object ());
    }

    /** The class name of OBJ's class, or null if there is any
     *  error in evaluating this name. */
    private static ReferenceTypeSpec toRefSpec (ObjectReference obj) {
        try {
            return new PatternReferenceTypeSpec (obj.referenceType ().name ());
        } catch (Exception e) {
            return null;
        }
    }
}


