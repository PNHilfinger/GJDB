/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import com.sun.jdi.event.*;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.EventRequest;

import java.util.List;
import java.util.ArrayList;

public class EventHandler implements Runnable {

    private EventNotifier notifier;
    private Thread thread;
    private volatile boolean connected;
    private boolean completed;
    private String shutdownMessage;
    private final boolean stopOnVMStart;
    private boolean vmDied;

    static <T extends EventRequest> void setEnables (List<T> events, 
                                                     boolean state) {
        for (EventRequest event : events)
            event.setEnabled (state);
    }

    static void setEnables (boolean state) {
        EventRequestManager erm = Env.vm ().eventRequestManager ();
        setEnables (erm.methodEntryRequests (), state);
        setEnables (erm.methodExitRequests (), state);
        setEnables (erm.stepRequests (), state);
        setEnables (erm.modificationWatchpointRequests (), state);
        setEnables (erm.exceptionRequests (), state);
        setEnables (erm.breakpointRequests (), state);
        setEnables (erm.modificationWatchpointRequests (), state);
        setEnables (erm.accessWatchpointRequests (), state);
    }

    EventHandler (EventNotifier notifier, boolean stopOnVMStart) {
        this.notifier = notifier;
        this.connected = true;
        this.completed = false;
        this.vmDied = false;
        this.stopOnVMStart = stopOnVMStart;
        this.thread = new Thread (this, "event-handler"); 
        this.thread.start ();
    }

    /** Disconnect and terminate event-handling thread. */
    synchronized void shutdown () {
        connected = false;
        thread.interrupt ();
        while (!completed) {
            try {
                wait ();
            } catch (InterruptedException exc) {}
        }
    }

    /** Handle events until disconnected. */
    public void run () { 
        EventQueue queue = Env.vm ().eventQueue ();
        while (connected) {
            try {
                /* The setting of eventSet statement is pure, shameless 
                 * black magic.  Due to some kind of race condition, on 
                 * Linux platforms we apparently lose some events if we 
                 * try to dequeue too rapidly.  So first, try with a 
                 * timeout, and only then try with no timeout. Last
                 * seen using SDE 1.3.1. FIXME. */ 
                EventSet eventSet;
                eventSet = queue.remove (100);
                if (eventSet == null)
                    eventSet = queue.remove ();

                boolean resumeStoppedApp;
                resumeStoppedApp = true;

                ArrayList<EventRequestSpec> specs =
                    new ArrayList<EventRequestSpec> ();
                for (Event event : eventSet) {
                    EventRequestSpec spec = Env.specList.getRequestSpec (event);
                    if (spec != null)
                        specs.add (spec);
                    resumeStoppedApp &= !handleEvent (event);
                }

                if (resumeStoppedApp) {
                    eventSet.resume ();
                } else if (eventSet.suspendPolicy ()
                           == EventRequest.SUSPEND_ALL) {
                    setCurrentThread (eventSet);
                    notifier.vmInterrupted (eventSet, specs);
                }
            } catch (InterruptedException exc) {
                /* Do nothing. Any changes will be seen at top of loop. */
            } catch (VMDisconnectedException discExc) {
                handleDisconnectedException ();
                break;
            }
        }
        synchronized (this) {
            completed = true;
            notifyAll ();
        }
    }

    /** Dispatch to appropriate notification routine, depending on type of 
     *  EVENT. */
    private boolean handleEvent (Event event) {
        if (event instanceof ExceptionEvent) {
            return exceptionEvent (event);
        } else if (event instanceof BreakpointEvent) {
            return breakpointEvent (event);
        } else if (event instanceof WatchpointEvent) {
            return fieldWatchEvent (event);
        } else if (event instanceof StepEvent) {
            return stepEvent (event);
        } else if (event instanceof MethodEntryEvent) {
            return methodEntryEvent (event);
        } else if (event instanceof MethodExitEvent) {
            return methodExitEvent (event);
        } else if (event instanceof ClassPrepareEvent) {
            return classPrepareEvent (event);
        } else if (event instanceof VMStartEvent) {
            return vmStartEvent (event);
        } else {
            return handleExitEvent (event);
        }
    }

    private boolean handleExitEvent (Event event) {
        if (event instanceof VMDeathEvent) {
            vmDied = true;
            return vmDeathEvent (event);
        } else if (event instanceof VMDisconnectEvent) {
            connected = false;
            if (!vmDied) {
                vmDisconnectEvent (event);
            }
            Env.shutdown (shutdownMessage);
            notifier.vmInterrupted (null, null);
            return false;
        } else {
            return false;
        }
    }

    /**
     *  Flush the event queue, dealing only with exit events (VMDeath, 
     *  VMDisconnect). */
    synchronized void handleDisconnectedException () {
        EventQueue queue = Env.vm ().eventQueue ();
        while (connected) {
            try {
                for (Event event : queue.remove ())
                    handleExitEvent (event);
            } catch (InterruptedException exc) {
            } catch (VMDisconnectedException e) {
                connected = false;
            }
        }
    }

    /** The thread, if any, associated with EVENT, or null if there is none. */
    private ThreadReference eventThread (Event event) {
        if (event instanceof ClassPrepareEvent) {
            return ((ClassPrepareEvent) event).thread ();
        } else if (event instanceof LocatableEvent) {
            return ((LocatableEvent) event).thread ();
        } else if (event instanceof ThreadStartEvent) {
            return ((ThreadStartEvent) event).thread ();
        } else if (event instanceof ThreadDeathEvent) {
            return ((ThreadDeathEvent) event).thread ();
        } else if (event instanceof VMStartEvent) {
            return ((VMStartEvent) event).thread ();
        } else {
            return null;
        }
    }

    /** If any event in SET has an associated thread, make one the current 
     *  thread. */
    private void setCurrentThread (EventSet set) {
        ThreadReference thread;
        thread = null;
        for (Event event : set) {
            thread = eventThread (event);
            if (thread != null)
                break;
        }
        setCurrentThread (thread);
    }

    /** Set the debugger's current thread to THREAD. */
    private void setCurrentThread (ThreadReference thread) {
        ThreadInfo.invalidateAll ();
        ThreadInfo.setCurrentThread (thread); 
    }

    /** Notify of VM starting.   Returns true iff should halt. */
    private boolean vmStartEvent (Event event)  {
        notifier.vmStartEvent ((VMStartEvent) event);
        return stopOnVMStart;
    }

    /** Notify of breakpoint and return true if EVENT represents an 
     *  active breakpoint whose condition is satisfied. Otherwise, returns 
     *  false. */
    private boolean breakpointEvent (Event event)  {
        BreakpointSpec spec = 
            (BreakpointSpec) Env.specList.getRequestSpec (event);
        if (spec != null)
            spec.resetCount (-1);
        BreakpointEvent be = (BreakpointEvent) event;
        if (spec == null || spec.conditionSatisfied (be)) {
            notifier.breakpointEvent (be);
            return true;
        } else
            return false;
    }

    /** Notify of method entry indicated by EVENT.  Always returns true. */
    private boolean methodEntryEvent (Event event)  {
        notifier.methodEntryEvent ((MethodEntryEvent) event);
        return true;
    }

    /** Notify of method exit indicated by EVENT. Always returns true. */
    private boolean methodExitEvent (Event event)  {
        notifier.methodExitEvent ((MethodExitEvent) event);
        return true;
    }

    /** If EVENT indicates a requested watchpoint, notify of event and
     *  return true.  Else return false. */
    private boolean fieldWatchEvent (Event event)  {
        WatchpointEvent fwe = (WatchpointEvent) event;
        WatchpointSpec spec = 
            (WatchpointSpec) Env.specList.getRequestSpec (event);
        if (spec != null)
            spec.resetCount (-1);
        if (spec == null || spec.rightObject (fwe)) {
            notifier.fieldWatchEvent (fwe);
            return true;
        } else
            return false;
    }

    /** Notify of step event and return true. */
    private boolean stepEvent (Event event)  {
        notifier.stepEvent ((StepEvent) event);
        return true;
    }

    /** Resolve any unresolved breakpoint requests that can be as a result
     *  of the introduction of the class indicated by EVENT.  Returns true
     *  iff a breakpoint error results. */
    private boolean classPrepareEvent (Event event)  {
        if (!Env.specList.resolve ((ClassPrepareEvent) event)) {
            Env.errorln ("\nStopping due to deferred breakpoint errors.\n");
            notifier.otherEvent (event);
            return true;
        } else {
            return false;
        }
    }

    /** Notify of exception indicated by EVENT and return true. */
    private boolean exceptionEvent (Event event) {
        ExceptionEvent ee = (ExceptionEvent) event;
        EventRequestSpec spec = Env.specList.getRequestSpec (event);
        if (spec != null)
            spec.resetCount (-1);
        notifier.exceptionEvent (ee);
        return true;
    }

    /** Clear current thread if EVENT indicates it has just died and 
     *  notify user if so.  Returns false. */
    private boolean threadDeathEvent (Event event) {
        ThreadReference thread = ((ThreadDeathEvent) event).thread ();
        if (ThreadInfo.current != null && 
            ThreadInfo.current.equals (thread)) {

            String currentThreadName;
            try {
                currentThreadName = " \"" + thread.name () + "\"";
            } catch (Exception e) {
                currentThreadName = "";
            }
                 
            setCurrentThread ((ThreadReference) null);

            Env.errorln ("");
            Env.errorln ("Current thread %s died. Execution continuing...",
                         currentThreadName);
        }
        return false;
    }

	
    /** Notify user that application has exited.  Returns false. */
    public boolean vmDeathEvent (Event event) {
        shutdownMessage = "\nThe application exited";
        return false;
    }

    /** Notify user that application has been disconnected.  Returns false. */
    public boolean vmDisconnectEvent (Event event) {
        shutdownMessage = "\nThe application has been disconnected";
        return false;
    }
}
