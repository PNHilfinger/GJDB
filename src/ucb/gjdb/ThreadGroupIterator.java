/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

//package com.sun.tools.example.debug.tty;
package ucb.gjdb;

import com.sun.jdi.ThreadGroupReference;
import com.sun.jdi.ThreadReference;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Iterator;
            
/**
 * Descend the tree of thread groups.
 * @author Robert G. Field
 */
class ThreadGroupIterator implements Iterator {
    private final Stack stack = new Stack();

    ThreadGroupIterator(List tgl) {
        push(tgl);
    }

    ThreadGroupIterator(ThreadGroupReference tg) {
        List tgl = new ArrayList();
        tgl.add(tg);
        push(tgl);
    }

    ThreadGroupIterator() {
        this(Env.vm().topLevelThreadGroups());
    }

    private Iterator top() {
        return (Iterator)stack.peek();
    }

    /**
     * The invariant in this class is that the top iterator
     * on the stack has more elements.  If the stack is 
     * empty, there is no top.  This method assures
     * this invariant.
     */
    private void push(List tgl) {
        stack.push(tgl.iterator());
        while (!stack.isEmpty() && !top().hasNext()) {
            stack.pop();
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public Object next() {
        return nextThreadGroup();
    }

    public ThreadGroupReference nextThreadGroup() {
        ThreadGroupReference tg = (ThreadGroupReference)top().next();
        push(tg.threadGroups());
        return tg;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    static ThreadGroupReference find(String name) {
        ThreadGroupIterator tgi = new ThreadGroupIterator();
        while (tgi.hasNext()) {
            ThreadGroupReference tg = tgi.nextThreadGroup();
            if (tg.name().equals(name)) {
                return tg;
            }
        }
        return null;
    }

}
            
