/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

//package com.sun.tools.example.debug.tty;
package ucb.gjdb;

import com.sun.jdi.ThreadGroupReference;
import com.sun.jdi.ThreadReference;
import java.util.List;
import java.util.Iterator;
                     
class ThreadIterator implements Iterator {
    Iterator it = null;
    ThreadGroupIterator tgi;

    ThreadIterator(ThreadGroupReference tg) {
        tgi = new ThreadGroupIterator(tg);
    }

    ThreadIterator(List tgl) {
        tgi = new ThreadGroupIterator(tgl);
    }

    ThreadIterator() {
        tgi = new ThreadGroupIterator();
    }

    public boolean hasNext() {
        while (it == null || !it.hasNext()) {
            if (!tgi.hasNext()) {
                return false; // no more
            }
            it = tgi.nextThreadGroup().threads().iterator();
        }
        return true;
    }

    public Object next() {
        return it.next();
    }

    public ThreadReference nextThread() {
        return (ThreadReference)next();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}


