/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

//package com.sun.tools.example.debug.tty;
package ucb.gjdb;

import com.sun.jdi.ReferenceType;
import com.sun.jdi.request.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Formatter;

class ExceptionSpec extends EventRequestSpec {

    ExceptionSpec(ReferenceTypeSpec refSpec) {
        super(refSpec);
    }

    /** Dummy for making exemplars, etc. */
    private ExceptionSpec () { }

    static public final EventRequestSpec EXMPL = new ExceptionSpec ();

    String getTypeDescription () {
        return "caught exception";
    }

    /**
     * The 'refType' is known to match, return the EventRequest.
     */
    EventRequest resolveEventRequest(ReferenceType refType) {
        EventRequestManager em = refType.virtualMachine().eventRequestManager();
        ExceptionRequest excReq = em.createExceptionRequest(refType, 
                                                            true, true);
        excReq.enable();
        return excReq;
    }


    public int hashCode() {
        return refSpec.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExceptionSpec) {
            ExceptionSpec es = (ExceptionSpec)obj;

            return refSpec.equals(es.refSpec);
        } else {
            return false;
        }
    }

    public String toString() {
        Formatter buffer = new Formatter ();
        buffer.format ("CP [%d] %s", getId (), refSpec);
        if (!isEnabled ())
            buffer.format (" [disabled]");
        else if (ignored ())
            buffer.format (" [ignored]");
        return buffer.toString();
    }
}
