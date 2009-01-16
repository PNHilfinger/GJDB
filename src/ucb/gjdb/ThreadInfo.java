/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000, 2001 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.ThreadReference;
import com.sun.jdi.ThreadGroupReference;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.StackFrame;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.*;

class ThreadInfo {
    static ThreadInfo current = null;
    private static ThreadInfo[] threads;
    private static ThreadGroupReference group = null;

    final ThreadReference thread;
    int currentFrameIndex = 0;

    private ThreadInfo(ThreadReference thread) {
        this.thread = thread;
        if (thread == null) {
            Env.fatalError("Internal error: null ThreadInfo created");
        }
    }

    List stack() throws IncompatibleThreadStateException {
        return thread.frames();
    }

    StackFrame getCurrentFrame() throws IncompatibleThreadStateException {
        if (thread.frameCount() == 0) {
            //Env.out.println("No stack");
            return null;
        }
        return thread.frame(currentFrameIndex);
    }

    int getFrameCount () {
        try {
            return thread.frameCount (); 
        } catch (NullPointerException e) { 
            return 0;
        }
        catch (IncompatibleThreadStateException e) {
            return 0;
        }
    }

    static synchronized ThreadInfo[] threads() {
        if (threads == null) {
            ThreadIterator ti = threadIterator();
            List tlist = new ArrayList();
            while (ti.hasNext()) {
                ThreadInfo tinfo = new ThreadInfo(ti.nextThread());
                tlist.add(tinfo);
            }
            threads = (ThreadInfo[])tlist.toArray(new ThreadInfo[tlist.size()]);
        }
        return threads;
    }
            

    void invalidate() {
        currentFrameIndex = 0;
    }

    static synchronized void invalidateAll() {
        current = null;
        threads = null;
        group = null;
    }

    /* Throw IncompatibleThreadStateException if not suspended */
    private void assureSuspended() throws IncompatibleThreadStateException {
        if (!thread.isSuspended()) {
            throw new IncompatibleThreadStateException();
        }
    }

    /**
     * Change the current stackframe to a specific frame relative to the 
     * top of the stack.
     *
     * @param nFrame    the number of the stackframe, with 0 being the top,
     *                  and higher numbers indicating lower frames.
     * @exception IllegalAccessError when the thread isn't 
     * suspended or waiting at a breakpoint
     * @exception ArrayIndexOutOfBoundsException when the 
     * requested frame is beyond the stack boundary
     */
    void setFrame(int nFrame) throws IncompatibleThreadStateException {
        assureSuspended();
        if (nFrame < 0 || nFrame >= thread.frameCount()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        currentFrameIndex = nFrame;
    }

    /**
     * Change the current stackframe to be one or more frames higher
     * (as in, away from the current program counter).
     *
     * @param nFrames   the number of stackframes
     * @exception IllegalAccessError when the thread isn't 
     * suspended or waiting at a breakpoint
     * @exception ArrayIndexOutOfBoundsException when the 
     * requested frame is beyond the stack boundary
     */
    void up(int nFrames) throws IncompatibleThreadStateException {
        assureSuspended();
        if ((currentFrameIndex + nFrames) >= thread.frameCount()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        currentFrameIndex += nFrames;
    }

    /**
     * Change the current stackframe to be one or more frames lower
     * (as in, toward the current program counter).     *
     * @param nFrames   the number of stackframes
     * @exception IllegalAccessError when the thread isn't 
     * suspended or waiting at a breakpoint
     * @exception ArrayIndexOutOfBoundsException when the 
     * requested frame is beyond the stack boundary
     */
    void down(int nFrames) throws IncompatibleThreadStateException {
        assureSuspended();
        if ((currentFrameIndex - nFrames) < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        currentFrameIndex -= nFrames;
    }

    /** Discard cached information about list of threads. */
    static void updateThreads() {
        ThreadInfo current0 = current;
        threads = null;
        if (current0 != null)
            setCurrentThread (current0.thread);
    }

    static void setThreadGroup(ThreadGroupReference tg) {   
        ThreadInfo.invalidateAll();
        group = tg;
    }
    
    static void setCurrentThread(ThreadReference tr) { 
        if (tr == null) {
            current = null;
        } else {
            ThreadInfo tinfo = getThread(tr);
            current = tinfo;
            current.invalidate();
        }
    }
    
    static ThreadGroupReference group() {
        if (group == null) {
            // set system threadgroup
            // TO DO: handle multiple btter
            setThreadGroup((ThreadGroupReference)
                           Env.vm().topLevelThreadGroups().get(0));
        }
        return group;
    }
    
    static synchronized ThreadInfo getThread(int index) {
        if (index <= 0 || index > threads().length) {
            return null;
        }
        return threads()[index-1];
    }

    static synchronized ThreadInfo getThread(ThreadReference tr) {
        ThreadInfo[] thrs = threads();
        int cnt = thrs.length;
        for (int i = 0; i < cnt; ++i) {
            ThreadInfo tinfo = thrs[i];
            if (tinfo.thread.equals(tr)) {
                return tinfo;
            }
        }
        Env.out.println("Thread not found: " + tr.name());
        return null;
    }

    static ThreadReference getThreadByName (ThreadGroupReference tg, 
                                            String idToken) {
        for (Iterator i = tg.threads ().iterator (); i.hasNext (); ) {
            ThreadReference thr = (ThreadReference) i.next();
            if (idToken.equals (thr.name ()))
                return thr;
        }
        for (Iterator ti = tg.threadGroups ().iterator (); ti.hasNext (); ) {
            ThreadGroupReference tg0 = (ThreadGroupReference) ti.next ();
            if (tg0 != tg) {
                ThreadReference thr = getThreadByName (tg0, idToken);
                if (thr != null)
                    return thr;
            }
        }
        return null;
    }

    static ThreadInfo getThread(String idToken) {
        if (idToken == null || idToken.length () == 0)
            return null;
        if (idToken.startsWith("t@")) {
            idToken = idToken.substring(2);
        }
        if (Character.isDigit (idToken.charAt (0)))
            try {
                int threadId = Integer.valueOf(idToken).intValue();
                return getThread(threadId);
            } catch (NumberFormatException e) {
                return null;    
            }
        else {
            ThreadReference thr = 
                getThreadByName (ThreadInfo.group (), idToken);
            if (thr == null)
                return null;
            return getThread (thr);
        }
    }

    static ThreadIterator threadIterator() {
        return new ThreadIterator(group());
    }
}
                            
