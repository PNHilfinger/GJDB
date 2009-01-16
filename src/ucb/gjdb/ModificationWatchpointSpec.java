/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

//package com.sun.tools.example.debug.tty;
package ucb.gjdb;

import com.sun.jdi.*;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.EventRequest;

class ModificationWatchpointSpec extends WatchpointSpec {

    ModificationWatchpointSpec(ReferenceTypeSpec refSpec, String fieldId)
        throws BadMemberNameException {
        super(refSpec, fieldId);
    }

    ModificationWatchpointSpec(ObjectReference obj, String fieldId)
        throws BadMemberNameException {
        super(obj, fieldId);
    }

    /**
     * The 'refType' is known to match, return the EventRequest.
     */
    EventRequest resolveEventRequest(ReferenceType refType) 
        throws NoSuchFieldException {
        Field field = refType.fieldByName(fieldId);
        EventRequestManager em = refType.virtualMachine().eventRequestManager();
        EventRequest wp = em.createModificationWatchpointRequest(field);
        wp.setSuspendPolicy(suspendPolicy);
        wp.enable();
        return wp;
    }

    String getTypeDescription () {
        return "access watchpoint";
    }

}


