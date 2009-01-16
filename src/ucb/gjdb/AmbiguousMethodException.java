/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

//package com.sun.tools.example.debug.tty;
package ucb.gjdb;

public class AmbiguousMethodException extends Exception
{
    public AmbiguousMethodException()
    {
        super();
    }

    public AmbiguousMethodException(String s)
    {
        super(s);
    }
}
