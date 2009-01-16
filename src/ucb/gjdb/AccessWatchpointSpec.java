/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import com.sun.jdi.request.*;

class AccessWatchpointSpec extends WatchpointSpec {

    AccessWatchpointSpec(ReferenceTypeSpec refSpec, String fieldId)
        throws BadMemberNameException {
        super(refSpec, fieldId);
    }

    AccessWatchpointSpec(ObjectReference obj, String fieldId)
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
        EventRequest wp = em.createAccessWatchpointRequest(field);
        wp.setSuspendPolicy(suspendPolicy);
        wp.enable();
        return wp;
    }

    String getTypeDescription () {
        return "access watchpoint";
    }

}


