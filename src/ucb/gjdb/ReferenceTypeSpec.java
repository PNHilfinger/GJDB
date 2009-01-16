/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000, 2001, 2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;

interface ReferenceTypeSpec {
    /**
     * Does the specified ReferenceType match this spec.
     */
    
    boolean matches(ReferenceType refType);
    public boolean isAnyAnonymous ();

    int hashCode();

    boolean equals(Object obj);
}


