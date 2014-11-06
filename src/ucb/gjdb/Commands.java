/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import com.sun.jdi.event.*;
import com.sun.jdi.request.*;

import java.util.*;
import java.io.*;
import java.util.regex.*;

import static ucb.gjdb.CommandException.ERROR;

class Commands implements EventNotifier {

    static String STOP_COMMAND = "\006";

    /** Values indicating detail of value printing desired. */
    static final int NO_PRINT = -2,
        PRINT_TYPE = -1,
        PRINT      = 0,
        EXAMINE    = 1;  /* and above */

    private Value evaluate(String expr, boolean wait, 
                           String[] uncommentedSrc) {
        try {
            GetFrame frameGetter = null;
            final ThreadInfo tinfo = ThreadInfo.current;
            if (tinfo != null) {
                frameGetter = new GetFrame() {
                        public StackFrame get() 
                            throws IncompatibleThreadStateException 
                        {
                            return tinfo.getCurrentFrame();
                        }
                    };
            }
            Value val = ExpressionParser.evaluate(expr, Env.vm(), frameGetter,
                                                  uncommentedSrc);
            if (wait)
                try {
                    Env.connection ().waitOutputQuiet ();
                } catch (InterruptedException e) { }
            return val;
        } catch (InvocationException ie) {
            throw ERROR ("Exception in expression: %s",
                         ie.exception().referenceType().name());
        } catch (InvalidTypeException ite) {
            throw ERROR (ite.getMessage());
        } catch (IncompatibleThreadStateException itse) {
            throw ERROR (itse.getMessage());
        } catch (ClassNotLoadedException tnle) {
            throw ERROR (tnle.getMessage());
        }
    }

    Value evaluate(String expr) {
        return evaluate (expr, false, null);
    }

    /** Wait for up to 5 seconds for T to terminate. */
    private void waitValue (Thread t) {
        try {
            t.join (5000);
        } catch (InterruptedException e) { }
    }

    String inputLine () {
        try {
            System.out.flush ();
            return input.readLine ();
        } catch (IOException e) { 
            return null;
        }
    }

    private static final Pattern TRIMMER = 
        Pattern.compile ("(?s)\\s*(.*?)\\s*$");
    /** Trim whitespace at beginning and end of S.  Unlike String.trim,
     *  does not touch non-whitespace control characters. */
    String trim (String s) {
        Matcher m = TRIMMER.matcher (s);
        if (m.matches ())
            return m.group (1);
        else
            return s;
    }

    boolean yorn (String prompt, String additionalYes, 
                  String additionalNo) {
        String resp;

        while (true) {
            Env.notice (prompt + " [yn]: ");
            resp = inputLine ();
            if (resp == null)
                return false;
            resp = resp.toLowerCase ();
            if (resp.equals ("y") || resp.equals ("yes")
                || additionalYes.indexOf (resp) >= 0)
                return true;
            if (resp.equals ("n") || resp.equals ("no")
                || additionalNo.indexOf (resp) >= 0)
                return false;
            Env.errorln ("Please respond 'yes' or 'no'.");
        }
    }   

    boolean yorn (String prompt) {
        return yorn (prompt, "", "");
    }

    static void printPrompt() {
        if (! Env.relayingInput ()) 
            Env.printPrompt();
    }

    void printCurrentLocation(boolean printLoc) {
        ThreadInfo tinfo = ThreadInfo.current;
        StackFrame frame;
        try {
            frame = tinfo.getCurrentFrame();
        } catch (IncompatibleThreadStateException exc) {
            Env.errorln("current thread isn't suspended anymore?!?");
            return;
        } catch (NullPointerException exc) {
            Env.errorln("No threads.");
            return;
        }
        if (frame == null) {
            Env.errorln("No frames on the current call stack");
        } else {
            Location loc = frame.location();

            if (printLoc) {
                Env.notice("thread=\"%s\"", tinfo.thread.name());
                Env.notice(", ");
                Env.noticeln("%s", Commands.locationString(loc));
            }

            // Output the current source line, if possible
            if (loc.lineNumber() != -1 && ! Env.annotate) {
                String line;
                try {
                    line = Env.sourceLine(loc, loc.lineNumber());
                } catch (java.io.IOException e) {
                    line = null;
                }
                if (line != null) {
                    Env.noticeln("  %d %s", loc.lineNumber(), line);
                }
            }

            if (printLoc)
                Env.noticeln();

            annotatePosn (loc);
        }
    }

    static void annotatePosn (Location loc) {
        if (Env.annotate) {
            File sourceFile = Env.sourceFile (loc);
            if (sourceFile != null) {
                Env.noticeln ("\032\032%s:%d:0:beg:0", sourceFile.getPath (),
                              loc.lineNumber ());
                Env.flush ();
            }
        }
    }

    private ThreadInfo getThread (String idToken) {
        ThreadInfo tinfo = ThreadInfo.getThread(idToken);
        if (tinfo == null) {
            Env.errorln("\"%s\" is not a valid thread id.", idToken);
        }
        return tinfo;
    }

    private String typedName(Method method) {
        StringBuffer buf = new StringBuffer();
        buf.append(method.name());
        buf.append("(");
        Iterator it = method.argumentTypeNames().iterator();
        while (it.hasNext()) {
            buf.append((String)it.next());
            if (it.hasNext()) {
                buf.append(",");
            }
        }
        buf.append(")");
        return buf.toString();
    }   
                            
    /** Returns TRUE if currently connected and user does not want to 
     *  disconnect. */
    private boolean checkPriorConnection (String query) {
        return Env.isConnected () 
            && ! yorn ("Program is already running.  " + query);
    }

    void commandLoadclass(String classId) {
        Value val = evaluate ("java.lang.Class.forName (\"" + classId + "\")",
                              true, null);
        dump (val, 0, ' ', 0, false, null);
    }

    void commandClasses() {
        List list = Env.vm().allClasses();

        Env.noticeln("** classes list **");
        for (int i = 0 ; i < list.size() ; i++) {
            ReferenceType refType = (ReferenceType)list.get(i);
            Env.noticeln("%s", refType.name().replace ('$', '.'));
        }
    }

    void commandClass (String idClass, boolean showAll) {
        List list = Env.vm().allClasses();

        ReferenceType type = Env.getReferenceTypeFromToken(idClass);
        if (type == null)
            throw ERROR ("\"%s\" is not a valid id or class name.", idClass);
        if (type instanceof ClassType) {
            ClassType clazz = (ClassType)type;
            Env.noticeln("Class: %s", clazz.name());
            ClassType superclass = clazz.superclass();
            while (superclass != null) {
                Env.noticeln("extends: " + superclass.name());
                superclass = showAll ? superclass.superclass() : null;
            }
            List interfaces = showAll ? clazz.allInterfaces() 
                : clazz.interfaces();
            Iterator iter = interfaces.iterator();
            while (iter.hasNext()) {
                InterfaceType interfaze = (InterfaceType)iter.next();
                Env.noticeln("implements: %s", interfaze.name());
            }
            List subs = clazz.subclasses();
            iter = subs.iterator();
            while (iter.hasNext()) {
                ClassType sub = (ClassType)iter.next();
                Env.noticeln("subclass: %s", sub.name());
            }
            List nested = clazz.nestedTypes();
            iter = nested.iterator();
            while (iter.hasNext()) {
                ReferenceType nest = (ReferenceType)iter.next();
                Env.noticeln("nested: %s", nest.name());
            }
        } else if (type instanceof InterfaceType) {
            InterfaceType interfaze = (InterfaceType)type;
            Env.noticeln("Interface: %s", interfaze.name());
            List supers = interfaze.superinterfaces();
            Iterator iter = supers.iterator();
            while (iter.hasNext()) {
                InterfaceType superinterface = (InterfaceType)iter.next();
                Env.noticeln("extends: %s", superinterface.name());
            }
            List subs = interfaze.subinterfaces();
            iter = subs.iterator();
            while (iter.hasNext()) {
                InterfaceType sub = (InterfaceType)iter.next();
                Env.noticeln("subinterface: %s", sub.name());
            }
            List implementors = interfaze.implementors();
            iter = implementors.iterator();
            while (iter.hasNext()) {
                ClassType implementor = (ClassType)iter.next();
                Env.noticeln("implementor: %s", implementor.name());
            }
            List nested = interfaze.nestedTypes();
            iter = nested.iterator();
            while (iter.hasNext()) {
                ReferenceType nest = (ReferenceType)iter.next();
                Env.noticeln("nested: %s", nest.name());
            }
        } else {  // array type
            ArrayType array = (ArrayType)type;
            Env.noticeln("Array: %s", array.name());
        }
    }

    void commandMethods(String idClass) {
        ReferenceType cls = Env.getReferenceTypeFromToken(idClass);
        if (cls != null) {
            List methods = cls.allMethods();
            for (int i = 0; i < methods.size(); i++) {
                Method method = (Method)methods.get(i);
                Env.notice("%s %s(", method.declaringType().name(),
                           method.name());
                List<String> argTypeNames = method.argumentTypeNames();
                for (String name : argTypeNames) {
                    if (!name.equals (argTypeNames.get (0)))
                        Env.notice (", ");
                    Env.notice("%s", name);
                }
                Env.noticeln(")");
            }
        } else
            throw ERROR ("\"%s\" is not a valid id or class name.", idClass);
    }

    void commandFields(String idClass) {
        ReferenceType cls = Env.getReferenceTypeFromToken(idClass);
        if (cls != null) {
            List fields = cls.allFields();
            List visible = cls.visibleFields();
            for (int i = 0; i < fields.size(); i++) {
                Field field = (Field)fields.get(i);
                Env.notice("%s %s", field.typeName(), field.name());
                if (!visible.contains(field)) {
                    Env.noticeln(" (hidden)");
                } else if (!field.declaringType().equals(cls)) {
                    Env.noticeln(" (inherited from %s)", 
                                 field.declaringType().name());
                } else {
                    Env.noticeln();
                }
            }
        } else
            throw ERROR ("\"%s\" is not a valid id or class name.", idClass);
    }

    private int printThreadGroup(ThreadGroupReference tg, int iThread) {
        Env.noticeln("Group %s:", tg.name());
        List tlist = tg.threads();
        ThreadInfo[] all = ThreadInfo.threads();

        int maxId = 0;
        int maxName = 0;
        for (int i = 0 ; i < tlist.size() ; i++) {
            ThreadReference thr = (ThreadReference)tlist.get(i);
            int len = Env.description(thr).length();
            if (len > maxId)
                maxId = len;
            String name = thr.name();
            int iDot = name.lastIndexOf('.');
            if (iDot >= 0 && name.length() > iDot) {
                name = name.substring(iDot + 1);
            }
            if (name.length() > maxName)
                maxName = name.length();
        }

        String maxNumString = String.valueOf(all.length);
        int maxNumDigits = maxNumString.length();

        for (int i = 0 ; i < tlist.size() ; i++) {
            ThreadReference thr = (ThreadReference)tlist.get(i);
            String thrStat = Env.getStatus (thr);
            if (thrStat == null)
                continue;
            int threadId = 0;
            for (int j = 0; j < all.length; j++) {
                if (all[j].thread.equals(thr)) {
                    threadId = j + 1;
                    break;
                }
            }

            char buf[] = new char[80];
            for (int j = 0; j < 79; j++) {
                buf[j] = ' ';
            }
            buf[79] = '\0';
            StringBuilder sbOut = new StringBuilder();
            sbOut.append(buf);

            // Right-justify the thread number at start of output string
            String numString = String.valueOf(threadId);
            sbOut.insert(maxNumDigits - numString.length(),
                         numString);
            sbOut.insert(maxNumDigits, ".");

            int iBuf = maxNumDigits + 2;
            sbOut.insert(iBuf, Env.description(thr));
            iBuf += maxId + 1;
            String name = thr.name();
            int iDot = name.lastIndexOf('.');
            if (iDot >= 0 && name.length() > iDot) {
                name = name.substring(iDot + 1);
            }
            sbOut.insert(iBuf, name);
            iBuf += maxName + 1;
            sbOut.insert(iBuf, Env.getStatus(thr));
            sbOut.setLength(79);
            Env.noticeln("%s", sbOut);
        }

        List tglist = tg.threadGroups();
        for (int ig = 0; ig < tglist.size(); ig++) {
            ThreadGroupReference tg0 = (ThreadGroupReference)tglist.get(ig);
            if (!tg.equals(tg0)) { 
                iThread += printThreadGroup(tg0, iThread + tlist.size());
            }
        }
        return tlist.size();
    }

    void commandThreads() {
        printThreadGroup(ThreadInfo.group(), 0);
    }

    void commandThreads(String name) {
        ThreadInfo.updateThreads();
        ThreadGroupReference tg = ThreadGroupIterator.find(name);
        if (tg == null)
            throw ERROR ("%s is not a valid threadgroup name.", name);
        else
            printThreadGroup(tg, 0);
    }

    void commandThreadGroups() {
        ThreadGroupIterator it = new ThreadGroupIterator();
        int cnt = 0;
        while (it.hasNext()) {
            ThreadGroupReference tg = it.nextThreadGroup();
            ++cnt;
            Env.noticeln("%d. %s %s", cnt, Env.description(tg), tg.name());
        }
    }
    
    void commandThread (String threadId) {
        ThreadInfo tinfo = getThread(threadId);
        if (tinfo != null) {
            ThreadInfo.current = tinfo;
        }
    }
    
    void commandThreadGroup(String name) {
        ThreadGroupReference tg = ThreadGroupIterator.find(name);
        if (tg == null) {
            Env.errorln("%s is not a valid threadgroup name.", name);
        } else {
            ThreadInfo.setThreadGroup(tg);
        }
    }
    
    void commandSetClass (String cl) {
        Env.cmdClass = cl;
    }

    void commandSetArgs (CommandLineSpec spec) {
        Env.commandLine = spec;
    }

    void commandInfoRun () {
        if (Env.cmdClass.equals (""))
            Env.errorln ("No default main class chosen.");
        else
            Env.noticeln ("Default run command: %s", Env.commandLine);
    }

    void commandRun () {
        commandRun (Env.commandLine);
    }

    void commandRun(CommandLineSpec commandLine) {
        if (Env.cmdClass.length () <= 0) {
            Env.errorln ("Specify main class with exec-class");
            return;
        }

        if (checkPriorConnection ("Restart from the beginning?"))
            return;
    
        commandSetArgs (commandLine);

        shutdown ();
        Env.shutdown ();

        Env.connectSpec = "com.sun.jdi.CommandLineLaunch:";
        Env.init ();
        Env.noticeln("java %s%s", Env.cmdClass, Env.commandLine);
        ThreadInfo.invalidateAll ();

        Env.connection ().open();
        if (Env.connection ().isOpen ())
            Env.requestInputRelay (true);
    }

    private void doAttach (String defaultConnectorSpec, 
                           String sharedMemoryConnectorSpec, 
                           String address) {
        if (checkPriorConnection ("Detach first?"))
            return;

        shutdown ();
        Env.shutdown ();

        if (sharedMemoryConnectorSpec != null
            && VMConnection.supportsSharedMemory ()) {

            Env.connectSpec = sharedMemoryConnectorSpec;
            if (address != null)
                Env.connectSpec += ":name=" + address;
        } else if (address != null)
            Env.connectSpec = defaultConnectorSpec + ":" 
                + VMConnection.addressToSocketArgs(address);
        else
            Env.connectSpec = defaultConnectorSpec;
        Env.init ();
        ThreadInfo.invalidateAll ();
        Env.connection ().open ();
    }

    void commandAttach (int address) {
        doAttach ("com.sun.jdi.SocketAttach", 
                  "com.sun.jdi.SharedMemoryAttach",
                  Integer.toString (address));
    }

    void commandListen (int address) {
        doAttach ("com.sun.jdi.SocketListen", 
                  "com.sun.jdi.SharedMemoryListen",
                  address == -1 ? null : Integer.toString (address));
    }

    void commandConnect (String spec) {
        doAttach (spec, null, null);
    }

    void commandDetach () {
        if (!Env.isConnected ()) {
            Env.errorln ("Not currently attached.");
            return;
        }

        if (Env.connection ().isLaunch ())
            Env.noticeln ("Terminating current application...");
        else 
            Env.noticeln ("Detaching...");

        shutdown ();
        Env.shutdown ();
    }

    void commandSuspend() {
        Env.requestInputRelay (false);
        if (Env.isConnected ()) {
            ThreadIterator ti = ThreadInfo.threadIterator();
            while (ti.hasNext()) {
                ti.nextThread().suspend();
            }
            Env.noticeln("All (non-system) threads suspended.");
            if (ThreadInfo.current == null) {
                ThreadInfo.current = ThreadInfo.getThread ("main");
                if (ThreadInfo.current != null)
                    printCurrentLocation (true);
            }
        }
    }

    void commandSuspend(List<String> threadIds) {
        for (String threadId : threadIds) {
            ThreadInfo tinfo = getThread(threadId);
            if (tinfo != null) {
                tinfo.thread.suspend();
            }                
        }
    }

    void commandResume() {
        Env.resumeVM ();
        ThreadInfo.invalidateAll();
        Env.noticeln("All threads resumed.");
    }

    void commandResume(List<String> threadIds) {
        for (String threadId : threadIds) {
            ThreadInfo tinfo = getThread(threadId);
            if (tinfo != null) {
                tinfo.thread.resume();
                tinfo.invalidate();
            }
        }
    }

    void commandCont () {
        if (ThreadInfo.current == null) {
            Env.errorln("Use 'thread' to choose a thread first.");
            return;
        }
        clearPreviousStep ();
        ThreadInfo.current.invalidate ();
        Env.requestInputRelay (true);
        Env.resumeVM ();
    }

    /** Remove any event requests for 'step' commands that have not yet 
     *  completed. */
    void clearPreviousStep() {
        EventRequestManager mgr = Env.vm().eventRequestManager();
        for (EventRequest request : pendingStepRequests)
            mgr.deleteEventRequest(request);
        pendingStepRequests.clear ();
    }

    /** Continue the program after setting up a step event request that will
     *  fire after REPS > 0 hits.  DEPTH is one of the constants STEP_INTO
     *  (stop in next called method), STEP_OVER (stop in current frame), or
     *  STEP_OUT (stop in caller's frame).  STEPSIZE is STEP_MIN (for single
     *  VM instruction) or STEP_LINE (stop at source line boundary).  These
     *  constants are in class StepRequest.  */
    void commandStep(int stepSize, int depth, int reps) {
        if (reps < 1)
            throw ERROR ("Repetition count must be positive.");
        clearPreviousStep();
        EventRequestManager reqMgr = Env.vm().eventRequestManager();
        if (depth == StepRequest.STEP_OUT 
            && Env.printReturnValues
            && Env.connection ().canGetMethodReturnValues ()) {
            try {
                stepTargetFrameCount =
                    ThreadInfo.current.thread.frameCount ();
            } catch (IncompatibleThreadStateException e) {
                Env.errorln ("Thread not stopped.");
            }
            MethodExitRequest exit = reqMgr.createMethodExitRequest ();
            exit.addThreadFilter (ThreadInfo.current.thread);
            Env.insertExcludes (exit);
            exit.setSuspendPolicy (exit.SUSPEND_EVENT_THREAD);
            exit.enable ();
            pendingStepRequests.add (exit);
        }
        StepRequest request = 
            reqMgr.createStepRequest(ThreadInfo.current.thread,
                                     stepSize, depth);
        if (depth != StepRequest.STEP_OUT) {
            Env.insertExcludes(request);
        }
        pendingStepRequests.add (request);

        request.addCountFilter(reps);
        request.enable();
        Env.requestInputRelay (true);
        Env.resumeVM ();
    }

    void doKill(ThreadReference thread, String expr) {
        Value val = null;
        val = evaluate(expr);

        if (val instanceof ObjectReference) {
            try {
                thread.stop((ObjectReference)val);
                Env.noticeln( "%s killed", thread);
            } catch (InvalidTypeException e) {
                Env.errorln("Invalid exception object");
            }
        } else {
            Env.errorln("Expression must evaluate to an object");
        }
    }

    void doKillThread(ThreadReference ttk, final String expr) {
        final ThreadReference invokingThread = ThreadInfo.current.thread;
        final ThreadReference threadToKill = ttk;
        Thread thread = new Thread("kill command") {
                public void run() {
                    doKill(threadToKill, expr);
                    // If events have been processing during this command,
                    // the cached stack may now be stale, so invalidate it.
                    ThreadInfo.invalidateAll();
                    ThreadInfo.setCurrentThread(invokingThread);
                    Env.printPrompt();
                }
            };
        thread.start();
        waitValue (thread);
    }

    void commandKill(String threadId, String expr) {
        ThreadInfo tinfo = ThreadInfo.getThread(threadId);
        if (tinfo != null) {
            Env.noticeln("killing thread: %s", tinfo.thread.name());
            doKillThread(tinfo.thread, expr);
            return;
        } else {
            Env.errorln("invalid thread");
        }
    }

    void commandCatch () {
        listEventSpecs (ExceptionSpec.EXMPL);
    }

    void commandCatch (EventRequestSpec spec) {
        if (spec != null)
            resolveNow(spec);
    }
    
    void commandPass () {
        deleteRequestedEvents (ExceptionSpec.EXMPL);
    }

    void commandPass (EventRequestSpec spec) {
        if (Env.specList.delete(spec))
            Env.noticeln("Removed %s", spec);
        else
            Env.errorln("Not found: %s", spec);
    }
    
    void commandFrame(int n) {
        if (ThreadInfo.current == null) {
            Env.errorln("Current thread not set.");
            return;
        }

        try {
            ThreadInfo.current.setFrame (n);
            printCurrentLocation (true);
        } catch (IncompatibleThreadStateException e) {
            Env.errorln("Thread isn't suspended.");
        } catch (ArrayIndexOutOfBoundsException e) {
            Env.errorln("No such frame.");
        }
    }

    void commandUp(int nLevels) {
        if (ThreadInfo.current == null) {
            Env.errorln("Current thread not set.");
            return;
        }

        if (nLevels == 0)
            throw ERROR ("Number of frames must be positive");

        try {
            if (nLevels > 0)
                ThreadInfo.current.up(nLevels);
            else 
                ThreadInfo.current.down(-nLevels);
            printCurrentLocation (true);
        } catch (IncompatibleThreadStateException e) {
            Env.errorln("Thread isn't suspended.");
        } catch (ArrayIndexOutOfBoundsException e) {
            Env.errorln("End of stack.");
        }
    }

    private void dumpStack(ThreadInfo tinfo, boolean showPC) {
        List stack = null;
        try {
            stack = tinfo.stack();
        } catch (IncompatibleThreadStateException e) {
            Env.errorln("Current thread isn't suspended.");
            return;
        }
        if (stack == null) {  
            Env.errorln("Thread is not running (no stack).");
        } else {
            int nFrames = 
                Math.min (stack.size(),
                          tinfo.currentFrameIndex + Env.maxStackFrames);
            for (int i = tinfo.currentFrameIndex; i < nFrames; i++) {
                StackFrame frame = (StackFrame)stack.get(i);
                Location loc = frame.location();
                Method meth = loc.method();
                Env.notice("  [%d] ", i);
                Env.notice("%s", meth.declaringType().name());
                Env.notice(".%s (", meth.name ());
                if (meth instanceof Method && ((Method)meth).isNative()) {
                    Env.notice("native method");
                } else if (loc.lineNumber() != -1) {
                    try {
                        Env.notice("%s", loc.sourceName());
                    } catch (AbsentInformationException e) {
                        Env.notice("<unknown>");
                    }
                    Env.notice(":%d", loc.lineNumber());
                }
                Env.notice(")");
                if (showPC) {
                    long pc = loc.codeIndex();
                    if (pc != -1) {
                        Env.notice(", pc = %d", pc);
                    }
                }
                Env.noticeln();
            }
            if (nFrames < stack.size ()) 
                Env.noticeln ("  ... + %d more frames.", 
                              stack.size () - nFrames);
        }
    }

    void commandWhere(String threadId, boolean showPC) {
        if (threadId == null) {
            if (ThreadInfo.current == null) {
                Env.errorln("No thread specified.");
                return;
            }
            dumpStack(ThreadInfo.current, showPC);
        } else {
            ThreadInfo tinfo = getThread(threadId);
            if (tinfo != null)
                ThreadInfo.current = tinfo;
            dumpStack(tinfo, showPC);
        }
    }

    void commandWhereAll (boolean showPC) {
        ThreadInfo[] list = ThreadInfo.threads();
        for (int i = 0; i < list.length; i += 1) {
            ThreadInfo tinfo = list[i];
            Env.noticeln("%s: ", tinfo.thread.name());
            dumpStack(tinfo, showPC);
        }
    }

    void commandInterrupt() {
        if (ThreadInfo.current == null) {
            Env.errorln("No thread specified.");
            return;
        }
        ThreadInfo.current.thread.interrupt();
    }

    void commandInterrupt(String threadId) {
        ThreadInfo tinfo = getThread(threadId);
        if (tinfo != null) {
            tinfo.thread.interrupt();
        } else {
            Env.errorln("Invalid thread");
        }
    }

    /*
     * The next two methods are used by this class and by EventHandler
     * to print consistent locations and error messages.
     */
    static String locationString(Location loc) {
        return  loc.declaringType().name() + 
            "." + loc.method().name() + "(), line=" + 
            loc.lineNumber() + ", bci=" + loc.codeIndex();
    }


    private void resolveNow(EventRequestSpec spec) {
        boolean success = Env.specList.addEagerlyResolve(spec);
        if (success && !spec.isResolved()) {
            Env.noticeln("%s", spec);
            Env.noticeln("    (will be set after the class is loaded)");
        } 
    }

    void commandBreak() {
        listEventSpecs (BreakpointSpec.EXMPL);
    }

    void commandBreak(BreakpointSpec spec) {
        try {
            spec.suspendPolicy = EventRequest.SUSPEND_ALL;
            resolveNow(spec);
            lastBreakpointSet = spec;
        } catch (NullPointerException e) { 
        }
    }

    /** Delete event requests of the same type as EXEMPLAR, per user request. 
     *  Return deleted event requests. */
    List<EventRequestSpec> deleteRequestedEvents (EventRequestSpec exemplar) {
        List<EventRequestSpec> items = listEventSpecs (exemplar);
        List<EventRequestSpec> deletions = getUserSelections (items);
        for (EventRequestSpec spec : deletions) {
            Env.specList.delete (spec);
        }

        if (items == deletions) {
            if (exemplar == null)
                Env.noticeln ("All stops removed.");
            else
                Env.noticeln ("All %ss removed.", 
                              exemplar.getTypeDescription ());
        }
        return deletions;
    }

    /** Ask user to select 0 or more from the list of ITEMS. */
    List<EventRequestSpec> getUserSelections (List<EventRequestSpec> items) {
        List<EventRequestSpec> result = 
            new ArrayList<EventRequestSpec> (items.size ());
        if (items.size () == 1) {
            if (yorn ("Delete?", "aA", "0"))
                result.add (items.get (0));
        } else if (items.size () > 0) {
            Env.noticeln ("[A] All");
            Env.noticeln ("[0] Cancel");
            Env.notice ("Delete which? ");
            Env.flush ();

            for (String item : trim (inputLine ()).split ("[\\s,]+")) {
                if (item.equals ("a"))
                    return items;
                else if (item.equals ("0"))
                    return result;
                else {
                    try {
                        int n = Integer.parseInt (item);
                        EventRequestSpec spec =
                            EventRequestSpec.idToSpec (items, n);
                        if (spec == null) 
                            Env.noticeln ("No event %d", n);
                        else
                            result.add (spec);
                    } catch (NumberFormatException e) {
                        Env.noticeln ("Invalid number: %s", item);
                    }
                }
            }
        }
        return result;
    }
    
    void commandClear (List<BreakpointSpec> L) {
        for (BreakpointSpec spec : L) {
            if (Env.specList.delete(spec))
                Env.noticeln ("Removed: %s", spec);
            else
                Env.noticeln ("Not found: %s", spec);
            if (spec == lastBreakpointSet)
                lastBreakpointSet = null;
        }
    }

    void commandDelete () {
        List<EventRequestSpec> deletions = deleteRequestedEvents (null);
        if (deletions.contains (lastBreakpointSet))
            lastBreakpointSet = null;
        return;
    }

    void commandDelete (List<Integer> L) {
        List<EventRequestSpec> specs = Env.eventRequestSpecs (null);
        for (int id : L) {
            EventRequestSpec spec = EventRequestSpec.idToSpec (specs, id);
            if (spec == null)
                Env.noticeln ("No event %d", id);
            else {
                if (Env.specList.delete (spec))
                    Env.noticeln ("Removed: %s", spec);
                if (spec == lastBreakpointSet)
                    lastBreakpointSet = null;
            }
        }
    }


    void setCondition (BreakpointSpec spec, String expr) {
        if (expr.equals (""))
            spec.setCondition (null);
        else
            spec.setCondition (expr);
        if (expr.equals ("")) {
            spec.setCondition (null);
            Env.noticeln ("%s (now unconditional)", spec);
        } else {
            spec.setCondition (expr);
            Env.noticeln ("%s", spec);
        }
    }
		

    void commandCond (String expr) {
        if (lastBreakpointSet == null)
            throw ERROR ("No prior breakpoint.");
        setCondition (lastBreakpointSet, expr);
    }

    void commandCond (int number, String expr) {
        BreakpointSpec spec;
        spec = (BreakpointSpec) EventRequestSpec.idToSpec 
            (Env.eventRequestSpecs (BreakpointSpec.EXMPL), number);
        if (spec == null)
            throw ERROR ("No such breakpoint: %d", number);
        setCondition (spec, expr);
    }

    void commandCommand (BufferedReader reader, boolean prompt) {
        if (lastBreakpointSet == null)
            throw ERROR ("No prior breakpoint.");
        commandCommand (lastBreakpointSet, reader, prompt);
    }

    void commandCommand (int id, BufferedReader reader, boolean prompt) {
        BreakpointSpec spec = 
            (BreakpointSpec) EventRequestSpec.idToSpec 
            (Env.eventRequestSpecs (BreakpointSpec.EXMPL), id);
        if (spec == null)
            throw ERROR ("No such breakpoint: %s", id);
        commandCommand (spec, reader, prompt);
    }

    void commandCommand (BreakpointSpec spec, BufferedReader reader, 
                         boolean prompt) {
        try {
            Env.noticeln ("Enter commands, terminated with a line containing "
                          + "just 'end'.");
            StringBuilder commands = new StringBuilder ();
            while (true) {
                if (prompt) {
                    Env.notice ("> ");
                    Env.flush ();
                }
                String ln = reader.readLine ();
                if (ln == null)
                    break;
                ln = trim (ln);
                if (ln.equals ("") || ln.startsWith ("#")) 
                    continue;
                if (ln.equals ("end"))
                    break;
                commands.append (ln);
                commands.append ("\n");
            }
            if (commands.length () == 0)
                spec.setCommands (null);
            else
                spec.setCommands (commands.toString ());
        } catch (IOException e) {
            throw ERROR ("Error reading breakpoint command list");
        }
    }

    List<EventRequestSpec> listEventSpecs (EventRequestSpec exemplar) {
        List<EventRequestSpec> specs = Env.eventRequestSpecs (exemplar);

        for (EventRequestSpec spec : specs) 
            Env.noticeln("%s", spec);
        if (specs.size () == 0)
            Env.noticeln("No %ss set.",
                         exemplar == null 
                         ? "stop" 
                         : exemplar.getTypeDescription ());
        return specs;
    }

    void commandWatch(List<EventRequestSpec> specs) {
        for (EventRequestSpec spec : specs)
            resolveNow((WatchpointSpec) spec);
    }

    void commandUnwatch() {
        deleteRequestedEvents (WatchpointSpec.EXMPL);
    }

    void commandUnwatch(List<EventRequestSpec> specs) {
        for (EventRequestSpec request : specs) {
            WatchpointSpec spec = (WatchpointSpec) request;
            if (Env.specList.delete(spec)) {
                Env.noticeln("Removed %s", spec);
            } else {
                Env.errorln("Not found: %s", spec);
            }
        }
    }

    void commandIgnore (int id, int count) {
        if (count < 0)
            throw ERROR ("Invalid ignore count.");
        EventRequestSpec spec = 
            EventRequestSpec.idToSpec (Env.eventRequestSpecs (null), id);
        if (spec == null)
            throw ERROR ("No event %d.", id);
        if (! spec.isResolved ())
            throw ERROR ("Class for event %d not yet loaded.", id);
        spec.resetCount (count);
        if (count == 1)
            Env.noticeln ("Will skip event #%d the next time it occurs.", id);
        else if (count > 0)
            Env.noticeln ("Will skip event #%d the next %d times it occurs.",
                          id, count);
    }

    void commandEnable (int id, boolean enabled) {
        EventRequestSpec spec = 
            EventRequestSpec.idToSpec (Env.eventRequestSpecs (null), id);
        if (spec == null)
            throw ERROR ("No event %d.", id);
        spec.setEnabled (enabled);
        Env.noticeln ("Event #%d %sabled.", id, enabled ? "en" : "dis");
    }

    void commandTrace(int policy, String threadId) {
        EventRequestManager erm = Env.vm().eventRequestManager();
        MethodEntryRequest entry = erm.createMethodEntryRequest();
        MethodExitRequest exit = erm.createMethodExitRequest();
        if (threadId != null) {
            ThreadInfo tinfo = getThread (threadId);
            entry.addThreadFilter(tinfo.thread);
            exit.addThreadFilter(tinfo.thread);
        }
        Env.insertExcludes(entry);
        Env.insertExcludes(exit);

        entry.setSuspendPolicy(policy);
        exit.setSuspendPolicy(policy);
        entry.enable();
        exit.enable();
    }

    void commandUntrace() {
        EventRequestManager erm = Env.vm().eventRequestManager();
        /* Note: Spec is unclear as to whether deleting 
         * erm.methodEntryRequests () directly will work, so I take the 
         * precaution of copying it first. */
        erm.deleteEventRequests (new ArrayList (erm.methodEntryRequests ()));
        erm.deleteEventRequests (new ArrayList (erm.methodExitRequests()));
    }
    
    void commandList(int lineno, String methodId) {
        StackFrame frame = null;
        if (ThreadInfo.current == null) {
            Env.errorln("No thread specified.");
            return;
        }
        try {
            frame = ThreadInfo.current.getCurrentFrame();
        } catch (IncompatibleThreadStateException e) {
            Env.errorln("Current thread isn't suspended.");
            return;
        }

        if (frame == null) {
            Env.errorln("No frames on the current call stack");
            return;
        }
        
        Location loc = frame.location();
        if (loc.method().isNative()) {
            Env.noticeln ("Current method is native");
            return;
        }

        String sourceFileName = null;
        try {
            sourceFileName = loc.sourceName();
            ReferenceType refType = loc.declaringType();
            if (lineno == -1)
                lineno = loc.lineNumber();
            else if (methodId != null) {
                List meths = refType.methodsByName (methodId);
                if (meths == null || meths.size() == 0)
                    throw ERROR ("%s is not a valid line for class %%s", 
                                 methodId, refType.name());
                else if (meths.size() > 1)
                    throw ERROR ("%s is an ambiguous method name in %s",
                                 methodId, refType.name());
                loc = ((Method)meths.get(0)).location();
                lineno = loc.lineNumber();
            }

            int startLine = (lineno > 4) ? lineno - 4 : 1;
            int endLine = startLine + 9;

            if (Env.sourceLine(loc, lineno) == null)
                throw ERROR("%d is an invalid line number for %s",
                            lineno, refType.name());
            else {
                for (int i = startLine; i <= endLine; i += 1) {
                    String sourceLine = Env.sourceLine(loc, i);
                    if (sourceLine == null)
                        break;
                    Env.notice("%d\t", i);
                    if (i == lineno)
                        Env.notice("=> ");
                    else
                        Env.notice("   ");
                    Env.noticeln("%s", sourceLine);
                }
            }
        } catch (AbsentInformationException e) {
            throw ERROR ("No source information available for %s", loc);
        } catch(FileNotFoundException exc) {
            throw ERROR ("Source file not found: %s", sourceFileName);
        } catch(IOException exc) {
            throw ERROR ("I/O Exception occurred: %s", exc);
        } 
    }

    void commandLines(String classId, String methodId) {
        try {
            ReferenceType refType = Env.getReferenceTypeFromToken(classId);
            if (refType != null) {
                List<Location> lines;
                lines = null;
                if (methodId == null) {
                    lines = refType.allLineLocations();
                } else {
                    for (Method method : refType.allMethods()) {
                        if (method.name().equals(methodId))
                            lines = method.allLineLocations();
                    }
                    if (lines == null) {
                        throw ERROR ("\"%s\" is not a method name.", methodId);
                    }	
                }
                for (Location line : lines)
                    Env.noticeln("%s", line);
            } else {
                throw ERROR ("\"%s\" is not a valid id or class name.",
                             classId);
            }
        } catch (AbsentInformationException e) {
            throw ERROR ("Line number information not available for \"%s\"",
                         classId);
        }
    }


    void commandClasspathInfo () {
        if (Env.vm() == null) {
            Env.errorln ("The program is not running yet");
        } else if (Env.vm() instanceof PathSearchingVirtualMachine) {
            PathSearchingVirtualMachine vm = (PathSearchingVirtualMachine)Env.vm();
            Env.noticeln("base directory: %s", vm.baseDirectory());
            Env.noticeln("classpath: %s", vm.classPath());
            Env.noticeln("bootclasspath: %s", vm.bootClassPath());
        } else {
            Env.errorln("The VM does not use paths");
        }
    }

    void commandUse () {
        Env.noticeln("%s", Env.getSourcePath ());
    }

    void commandUse (String path) {
        Env.setSourcePath(path);
    }

    void commandClasspath() {
        if (Env.classPath.equals (""))
            Env.noticeln("No classpath specified");
        else 
            Env.noticeln("%s", Env.classPath.substring (11));
    }

    void commandClasspath(String path) {
        Env.classPath = "-classpath " + path;
    }

    /* Print a stack variable */
    private void printVar(LocalVariable var, Value value) {
        Env.noticeln("  %s = %s", var.name(), value);
    }

    /* Print all local variables in current stack frame. */
    void commandLocals() {
        StackFrame frame;
        if (ThreadInfo.current == null) {
            Env.errorln("No default thread specified: " +
                        "use the \"thread\" command first.");
            return;
        }
        try {
            frame = ThreadInfo.current.getCurrentFrame();
            List vars = frame.visibleVariables();
    
            if (vars.size() == 0) {
                Env.noticeln("No local variables");
                return;
            }
            Map values = frame.getValues(vars);

            Env.noticeln("Method arguments:");
            for (Iterator it = vars.iterator(); it.hasNext(); ) {
                LocalVariable var = (LocalVariable)it.next();
                if (var.isArgument()) {
                    Value val = (Value)values.get(var);
                    printVar(var, val);
                }
            }
            Env.noticeln("Local variables:");
            for (Iterator it = vars.iterator(); it.hasNext(); ) {
                LocalVariable var = (LocalVariable)it.next();
                if (!var.isArgument()) {
                    Value val = (Value)values.get(var);
                    printVar(var, val);
                }
            }
        } catch (AbsentInformationException aie) {
            Env.errorln("Local variable information not available." +
                        " Compile with -g to generate variable information");
        } catch (IncompatibleThreadStateException exc) {
            Env.errorln("Thread isn't suspended.");
        }
    }

    /** Dump value VAL to DEPTH levels, indenting continuation lines
     *  by INDENT.  Use FORMAT for integral data. Print static fields 
     *  only if WANTSTATICS. */
    private void dump(Value val, int depth, char format,
                      int indent, boolean wantStatics, 
                      Set<ObjectReference> dumped) {
        if (val == null || depth == 0
            || val instanceof PrimitiveValue || val instanceof VoidValue
            || val instanceof StringReference
            || (dumped != null && dumped.contains (val))) {
            Env.noticeln ("%s", LValue.toString (val, format));
            return; 
        }

        Type typeBase = val.type ();

        ObjectReference obj = (ObjectReference) val;
        ReferenceType refType = (ReferenceType) typeBase;
        if (dumped != null)
            dumped.add (obj);

        if (obj instanceof ArrayReference) {
            ArrayReference arr = (ArrayReference) obj;
            int len = Math.min (arr.length (), Env.maxArrayElements);
            Env.notice ("{ ");
            if (len > 0) {
                List<Value> elts = arr.getValues (0, len);
                if (Env.prettyArrays
                    || (depth > 0 
                        && (elts.get (0) == null
                            || elts.get (0) instanceof ObjectReference))) {
                    /* Print one item per line */
                    Env.noticeln ();
					
                    for (Value v : elts) {
                        Env.indent (indent + 2);
                        dump (v, depth-1, format, indent+2,
                              wantStatics, dumped);
                    }
                    if (len < arr.length ()) {
                        Env.indent (indent + 2);
                        Env.noticeln ("... <%d more elements>", 
                                      arr.length () - len);
                    }
                    Env.indent (indent);
                } else {
                    /* Print compressed: all items on one line */
                    boolean commaNeeded;
                    commaNeeded = false;
                    for (Value v : elts) {
                        if (commaNeeded) 
                            Env.notice (", ");
                        commaNeeded = true;
                        Env.notice ("%s", LValue.toString (v, format));
                    }
                    if (len < arr.length ()) 
                        Env.notice (",... <%d more elements>", 
                                    arr.length () - len);
                    Env.notice (" ");
                }
            }
            Env.noticeln ("}");
            return;
        }
     
        Env.noticeln ("%s {", val);
		
        while (refType != null) {
            for (Field field : refType.fields()) {
                if (! wantStatics && field.isStatic ())
                    continue;
                Env.indent(indent+2);
                if (!refType.equals(typeBase)) {
                    Env.notice("%s.", refType.name());
                }
                Env.notice("%s: ", field.name());
                dump (obj.getValue(field), depth-1, format, 
                      indent+2, wantStatics, dumped);
            }
            if (refType instanceof ClassType)
                refType = ((ClassType)refType).superclass();
            else if (refType instanceof InterfaceType) {
                // NOTE: The original code seemed to think this possible, but
                // since refType always comes from the type of a value, not
                // a variable, it cannot have an interface type.  
                Env.errorln ("dump unexpectedly encountered an interface type");
                refType = null;
            }
        }
        Env.indent (indent);
        Env.noticeln ("}");
    }

    /** Print a specified reference at level of detail indicated by 
     *  DUMPLEVEL and FORMAT (see commandPrint).  Do not print static 
     *  fields unless WANTSTATICS. */
    void doPrint(String expr, int dumpLevel, char format, 
                 boolean wantStatics) {
        Value val;
        String[] cleanedExpr = new String[1];
        try {
            val = evaluate (expr, true, cleanedExpr);
        } catch (CommandException e) {
            Env.errorln ("%s", e.getMessage ());
            return;
        }

        switch (dumpLevel) {
        case NO_PRINT:
            break;
        case PRINT_TYPE:
            if (val == null) 
                Env.noticeln("%s is null", cleanedExpr[0]);
            else 
                Env.noticeln("%s has type %s", 
                             cleanedExpr[0], val.type().name());
            break;
        default:
            int id = Env.connection ().saveValue (val);
            switch (Env.printHeaderFormat) {
            default:
                Env.notice ("$%d = ", id);
                break;
            case 1:
                Env.notice ("%s = ", expr);
                break;
            case 2:
                Env.notice ("%s = $%d = ", expr, id);
                break;
            }
            dump (val, dumpLevel, format, 0, wantStatics, 
                  new HashSet<ObjectReference> ());
        } 
    }

    static final private Pattern PRINT_OPTIONS_PATN 
        = Pattern.compile ("(?i)/?([xodb]*)(\\d+)?([xodb]*)");
    

    /** Evaluate expression EXPR, and print it according to DUMPLEVEL, 
     *  with formatting FORMAT. Do not print static fields unless
     *  WANTSTATICS.
     *
     *  NO_PRINT -- just evaluate for side effects.
     *  PRINT_TYPE
     *           -- evaluate and print type of value.
     *  PRINT    -- evaluate and minimally print value
     *  >=EXAMINE-- evaluate and display inner structure, and display
     *              any inner structure, in addition to printing
     *              value, to the level indicated (1 == print
     *              components, 2 == print components of components....).
     */ 
    void commandPrint(final String expr,
                      final int dumpLevel, final char format,
                      final boolean wantStatics) {
        final ThreadReference thr =
            ThreadInfo.current==null? null : ThreadInfo.current.thread;
        final int framePosn0 = 
            (thr == null) ? 0 : ThreadInfo.current.currentFrameIndex;
        final int frameSize0 =
            (thr == null) ? 0 : ThreadInfo.current.getFrameCount ();
    
        Thread thread = new Thread("print command") {
                public void run() {
                    doPrint(expr, dumpLevel, format, wantStatics);
                    // If events have been processing during this command,
                    // the cached stack may now be stale, so invalidate it.
                    ThreadInfo.invalidateAll();
                    if (thr != null) {
                        ThreadInfo.setCurrentThread(thr);
                        if (ThreadInfo.current.getFrameCount () == frameSize0)
                            try {
                                ThreadInfo.current.setFrame (framePosn0);
                            } catch (IncompatibleThreadStateException e) { }
                    }
                    Env.printPrompt();
                }
            };
        thread.start();
    }

    void commandPtype (String expr) {
        commandPrint (expr, PRINT_TYPE, ' ', false);
    }

    void commandSet(String var, String val0, int val1) {
        if (var.equals ("print")) {
            switch (val0) {
            case "pretty":
                Env.prettyArrays = true;
                break;
            case "compressed":
                Env.prettyArrays = false;
                break;
            case "elements":
                Env.maxArrayElements = val1;
                break;
            case "max-frames":
                if (val1 < 1)
                    throw ERROR ("Max-stack must be >= 1");
                else
                    Env.maxStackFrames = val1;
                break;
            case "return":
                Env.printReturnValues = (val1 != 0);
                break;
            case "prefix":
                Env.printHeaderFormat = val1;
                break;
            default:
                break;
            }
        } else if (var.equals ("stdin"))
            Env.noStdin = val0.equals ("on");
        else if (var.equals ("history")) 
            Env.historyRetention = Math.max (0, val1);
    }
        
    void doLock(String expr) {
        Value val = evaluate(expr);

        try {
            if (val instanceof ObjectReference) {
                ObjectReference object = (ObjectReference)val;
                Env.noticeln("Monitor information for %s:", val);
                ThreadReference owner = object.owningThread();
                if (owner == null) {
                    Env.noticeln("  Not owned");
                } else {
                    Env.noticeln("  Owned by: %s, entry count: %d",
                                 owner.name(), object.entryCount());
                }
                List waiters = object.waitingThreads();
                if (waiters.size() == 0) {
                    Env.noticeln("  No waiters");
                } else {
                    Iterator iter = waiters.iterator();
                    while (iter.hasNext()) {
                        ThreadReference waiter = (ThreadReference)iter.next();
                        Env.noticeln("  Waiting thread: %s", owner.name());
                    }
                }
            } else {
                Env.errorln("Expression must evaluate to an object");
            }
        } catch (IncompatibleThreadStateException e) {
            Env.errorln("Threads must be suspended");
        }
    }

    void commandLock(final String expr) {
        final ThreadReference invokingThread = ThreadInfo.current.thread;
        Thread thread = new Thread("lock command") {
                public void run() {
                    doLock (expr);
                    // If events have been processing during this command,
                    // the cached stack may now be stale, so invalidate it.
                    ThreadInfo.invalidateAll();
                    ThreadInfo.setCurrentThread(invokingThread);
                    Env.printPrompt();
                }
            };
        thread.start();
        waitValue (thread);
    }

    private void printThreadLockInfo(ThreadReference thread) {
        try {
            Env.noticeln("Monitor information for thread %s:", thread.name());
            List owned = thread.ownedMonitors();
            if (owned.size() == 0) {
                Env.noticeln("  No monitors owned");
            } else {
                Iterator iter = owned.iterator();
                while (iter.hasNext()) {
                    ObjectReference monitor = (ObjectReference)iter.next();
                    Env.noticeln("  Owned monitor: %s", monitor);
                }
            }
            ObjectReference waiting = thread.currentContendedMonitor();
            if (waiting == null) {
                Env.noticeln("  Not waiting for a monitor");
            } else {
                Env.noticeln("  Waiting for monitor: %s", waiting);
            }
        } catch (IncompatibleThreadStateException e) {
            Env.errorln("Threads must be suspended");
        }
    }

    void commandThreadlocks() {
        printThreadLockInfo(ThreadInfo.current.thread);
    }

    void commandThreadlocksAll() {
        ThreadInfo[] list = ThreadInfo.threads();
        for (int i = 0; i < list.length; i++) {
            ThreadInfo tinfo = list[i];
            printThreadLockInfo(tinfo.thread);
        }
    }

    void commandThreadlocks(String token) {
        ThreadInfo tinfo = getThread(token);
        if (tinfo != null) {
            ThreadInfo.current = tinfo;
        }
        printThreadLockInfo(tinfo.thread);
    }

    void doEnableGC(String expr, boolean enabled) {
        Value val = evaluate(expr);

        if (val instanceof ObjectReference) {
            ObjectReference object = (ObjectReference)val;
            if (enabled)
                object.enableCollection ();
            else
                object.disableCollection ();
            Env.noticeln("GC %s for %s:", enabled ? "enabled" : "disabled",
                         val.toString());
        } else
            throw ERROR ("Expression must evaluate to an object");
    }

    void commandEnableGC(final String expr, final boolean enabled) {
        final ThreadReference invokingThread = ThreadInfo.current.thread;
        Thread thread = new Thread("modify gc command") {
                public void run() {
                    doEnableGC (expr, enabled);
                    // If events have been processing during this command,
                    // the cached stack may now be stale, so invalidate it.
                    ThreadInfo.invalidateAll();
                    ThreadInfo.setCurrentThread(invokingThread);
                    Env.printPrompt();
                }
            };
        thread.start();
        waitValue (thread);
    }

    void doSave(String key, String expr) {
        Value val;
        try {
            val = evaluate(expr);
        } catch (CommandException e) {
            Env.errorln ("%s", e.getMessage ());
            return;
        }

        if (Env.isConnected ()) {
            Env.connection ().saveValue(key, val);
            Env.noticeln("%s saved", val);
        } else {
            Env.errorln("Must be connected to save values");
        }
    }

    void commandSave() {
        if (!Env.isConnected ()) {
            Env.noticeln ("Not connected");
            return;
        }
        boolean haveOne;
        haveOne = false;
        for (Object key : Env.connection ().getSaveKeys()) {
            if (! (key instanceof String))
                continue;
            haveOne = true;
            Value value = Env.connection ().retrieveHistory (key);
            Env.notice("%s = ", key);
            if ((value instanceof ObjectReference) &&
                ((ObjectReference)value).isCollected()) {
                Env.noticeln(" <collected>");
            } else {
                Env.noticeln("%s", value);
            }
        }
        if (!haveOne) {
            Env.noticeln("No saved values");
            return;
        }
    }

    void commandSave (final String key, final String expr) {
        final ThreadReference invokingThread = ThreadInfo.current.thread;
        Thread thread = new Thread("save command") {
                public void run() {
                    doSave(key, expr);
                    // If events have been processing during this command,
                    // the cached stack may now be stale, so invalidate it.
                    ThreadInfo.invalidateAll();
                    ThreadInfo.setCurrentThread(invokingThread);
                    Env.printPrompt();
                }
            };
        thread.start();
        waitValue (thread);
    }

    void commandBytecodes(String className, String methodName) {
        List<ReferenceType> classes = Env.vm().classesByName(className);
        // TO DO: handle multiple classes found
        if (classes.size() == 0)
            throw ERROR ("%s not found %s", className,
                         (className.indexOf('.') > 0)
                         ? " (try the full name)" : "");
        
        ReferenceType rt = classes.get(0);
        if (!(rt instanceof ClassType))
            throw ERROR ("%s is not a class", className);

        byte[] bytecodes;
        bytecodes = null;                                               
        for (Method method : rt.methodsByName(methodName)) {
            if (!method.isAbstract()) {
                bytecodes = method.bytecodes();
                break;
            }
        }

        StringBuilder line = new StringBuilder(80);
        line.append("0000: ");
        for (int i = 0; i < bytecodes.length; i++) {
            if ((i > 0) && (i % 16 == 0)) {
                Env.noticeln("%s", line);
                line.setLength(0);
                line.append(String.valueOf(i));
                line.append(": ");
                int len = line.length();
                for (int j = 0; j < 6 - len; j++) {
                    line.insert(0, '0');
                }
            }
            int val = 0xff & bytecodes[i];
            String str = Integer.toHexString(val);
            if (str.length() == 1) {
                line.append('0');
            }
            line.append(str);
            line.append(' ');
        }
        if (line.length() > 6) {
            Env.noticeln("%s", line);
        }
    }

    void commandExclude() {
        Env.noticeln ("%s", Env.excludesString ());
    }

    void commandExcludeClear () {
        Env.setExcludes(Collections.EMPTY_LIST);
    }

    void commandExcludeReset () {
        Env.setStandardExcludes ();
    }

    void commandExcludeAdd (List<String> L) {
        Env.addExcludes (L);
    }

    void commandExcludeSet (List<String> L) {
        Env.setExcludes(L);
    }

    void commandRepeat (int repeats, String cmnd, BufferedReader reader) {
     	for (int i = 0; i < repeats; i += 1)
            CommandParser.execute (cmnd, this, reader, false, true);
    }


    void commandVersion(String debuggerName, 
                        String debuggerVersion) {
        Env.noticeln("%s, version %s", debuggerName, debuggerVersion);
        if (Env.isConnected ())
            Env.noticeln("%s", Env.vm().description());
    }

    void commandQuit () {
        if (!Env.isConnected () 
            || yorn ("Terminate current program?")) {
            shutdown ();
            Env.shutdown(); 
            System.exit (0);
        }
    }

    private void executeMonitorCommands () {
        for (String cmnd : monitorCommands) {
            int start = cmnd.indexOf (':');
            if (start >= 0)
                CommandParser.execute (cmnd.substring (start + 1), this,
                                       null, false);
        }
    }

    void commandMonitor () {
        for (String cmnd : monitorCommands) 
            Env.noticeln ("%s", cmnd);
    }

    void commandMonitor (String cmnd) {
        monitorCount += 1;
        monitorCommands.add(monitorCount + ": " + cmnd);
    }

    void commandUnmonitor (int num) {
        String label = num + ":";
        for (String cmd : monitorCommands) {
            if (cmd.startsWith (label)) {
                monitorCommands.remove (cmd);
                Env.noticeln("Unmonitoring %s", cmd);
                return;
            }
        }
        Env.errorln("No monitor labeled %s", num);
    }

    public void run () {
        Env.noticeln("%s", GJDB.GREETING);
        Env.noticeln("Initializing...");

        try {
            standardInputReader =
                new BufferedReader(new InputStreamReader(System.in,
                                                         "ISO-8859-1"));
            startHandler (true);
            input = standardInputReader;
            String lastLine = null;
    
            /*
             * Try reading user's home startup file. Handle Unix and 
             * and Win32 conventions for the names of these files. 
             */
            if (!readCommandFile(System.getProperty("user.home") + 
                                 File.separator + "jdb.ini")) {
                readCommandFile(System.getProperty("user.home") + 
                                File.separator + ".jdbrc");
            }
    
            // Try startup file in local directory
            if (!readCommandFile(System.getProperty("user.dir") + 
                                 File.separator + "jdb.ini")) {
                readCommandFile(System.getProperty("user.dir") + 
                                File.separator + ".jdbrc");
            }
    
            // Process interactive commands.
            printPrompt();
            while (true) {
                String ln = input.readLine();
                if (ln == null && Env.relayingInput ()) {
                    Env.connection ().closeOutputToRemote ();
                    input = standardInputReader;
                    ln = input.readLine ();
                }
                if (ln == null) {
                    Env.noticeln("Input stream closed.");
                    return;
                }
    
                if (! ln.startsWith (STOP_COMMAND)
                    && Env.relayingInput ()) {
                    Env.connection ().sendToRemote (ln);
                    Env.connection ().sendToRemote ("\n");
                } else {
                    if (ln.startsWith("!!")) {
                        if (lastLine == null) {
                            Env.errorln ("No last line");
                            printPrompt ();
                            continue;
                        }
                        ln = lastLine + ln.substring(2);
                        Env.noticeln("%s", ln);
                    }
                    ln = trim (ln);
    
                    if (ln.length () > 0) {
                        lastLine = ln;
                        CommandParser.execute(ln, this, input, true);
                    } else {
                        printPrompt();
                    }
                }
            }
        } catch (IOException e) {
            Env.errorln ("Unexpected I/O error.");
        } catch (VMDisconnectedException e) {
            handler.handleDisconnectedException();
        }
    }

    void commandRead (String fileName) {
        if (!readCommandFile (fileName))
            throw ERROR ("Could not open: %s", fileName);
    }

    /**
     * Read and execute a command file.  Return true if the
     * file could be opened.
     */
    boolean readCommandFile(String filename) {
        try {
            File fle = new File (filename);
            BufferedReader reader = new BufferedReader (new FileReader (fle));
            Env.noticeln("*** Reading commands from %s",
                         fle.getCanonicalPath ());
            readCommandStream (reader);
            return true;
        } catch (IOException e) {
            return false;
        } 
    }

    /**
     *  Read and execute a stream of commands from READER.
     */
    void readCommandStream (BufferedReader reader) {
        try {
            while (true) {
                String ln = reader.readLine();
                if (ln == null) 
                    break;
                CommandParser.execute(ln, this, reader, false);
            }
        } catch (IOException e) {
            throw ERROR ("Input error while reading commands: %s", 
                         e.getMessage ());
        } finally {
            try {
                reader.close ();
            } catch (IOException e) {
                throw ERROR ("Could not close reader: %s", e.getMessage ());
            }
        }
    }

    void readCommandStream (String commands) {
        readCommandStream (new BufferedReader (new StringReader (commands)));
    }

    /** Cause exception if we are not currently connected to a VM. */
    void checkConnect () {
        if (!Env.isConnected ())
            throw new VMNotConnectedException ();
    }

    void startHandler (boolean stopOnVmEvent) {
        if ((handler == null) && Env.isConnected ()) {
            handler = new EventHandler(this, stopOnVmEvent);
        }
    }

    void startHandler () {
        startHandler (false);
    }

    void shutdown () {
        pendingStepRequests.clear ();
        if (handler != null)
            handler.shutdown ();
        handler = null;
    }

    public void vmStartEvent(VMStartEvent se)  {
        Thread.yield();  // fetch output
        Env.noticeln ("Program Started.");
        otherEvent(se);
    }

    public void breakpointEvent(BreakpointEvent be)  {
        Thread.yield();  // fetch output
        BreakpointSpec spec = 
            (BreakpointSpec) Env.specList.getRequestSpec (be.request ());
        if (spec == null) 
            Env.notice("\nBreakpoint hit: ");
        else
            Env.notice("\nBreakpoint %s: ", spec.getId ());
        otherEvent(be);
    }

    public void fieldWatchEvent(WatchpointEvent fwe)  {
        Field field = fwe.field();
        ObjectReference obj = fwe.object();
        Thread.yield();  // fetch output
        Env.notice("\nField (%s) ", field);
        if (fwe instanceof ModificationWatchpointEvent) {
            Env.notice("is ");
            EventHandler.setEnables (false);
            Env.notice("%s", fwe.valueCurrent());
            EventHandler.setEnables (true);
            Env.notice(", will be ");
            Env.notice("%s", ((ModificationWatchpointEvent)fwe).valueToBe());
            Env.notice(": ");
        } else {
            Env.notice("access encountered: ");
        }
        otherEvent(fwe);
    }

    public void stepEvent(StepEvent se)  {
        Thread.yield();  // fetch output
        if (! Env.annotate)
            Env.notice("\nStep completed: ");
        otherEvent(se);
    }

    public void exceptionEvent(ExceptionEvent ee) {
        Thread.yield();  // fetch output
        Env.notice("\nException occurred: %s",
                   ee.exception().referenceType().name());
        Location catchLocation = ee.catchLocation();
        if (catchLocation == null) {
            Env.notice(" (uncaught) ");
        } else {
            Env.notice(" (to be caught at: %s)",
                       Commands.locationString(catchLocation));
        }
        otherEvent(ee);
    }

    public void methodEntryEvent(MethodEntryEvent me) {
        Thread.yield();  // fetch output
        Env.notice ("%nMethod Entered: %s.%s ",
                    me.method ().declaringType ().name (),
                    me.method ().name ());
        otherEvent(me);
    }

    public void methodExitEvent(MethodExitEvent me) {
        if (pendingStepRequests.contains (me.request ())) {
            try {
                if (me.thread ().frameCount () == stepTargetFrameCount) {
                    Value val = Env.connection ().returnValue (me);
                    if (! (val instanceof VoidValue)) {
                        int id = Env.connection ().saveValue (val);
                        Env.notice ("$%d = ", id);
                        dump (val, PRINT, ' ', 0, false, 
                              new HashSet<ObjectReference> ());
                    }
                }
            } catch (IncompatibleThreadStateException e) {
                Env.errorln ("Thread not stopped at method exit.");
            } finally {
                me.thread ().resume ();
            }
        } else {
            Thread.yield();  // fetch output
            Env.notice ("%nMethod Exited: %s.%s ",
                        me.method ().declaringType ().name (),
                        me.method ().name ());
        }
        otherEvent(me);
    }

    public void otherEvent(Event event) {
    }

    /** True iff a human-readable location description is needed for stopping
     *  due to the event set EVENTS. */
    private boolean needsLoc (EventSet events) {
        if (!Env.annotate || events == null)
            return true;
        for (Event e : events)
            if (! (e instanceof StepEvent))
                return true;
        return false;
    }

    public void vmInterrupted (EventSet events, 
                               Collection<EventRequestSpec> specs) {
        Thread.yield();  // fetch output
        if (Env.isConnected () && ThreadInfo.current != null) {
            printCurrentLocation(needsLoc (events));
            executeMonitorCommands ();
        }
        Env.requestInputRelay (false);
        if (specs != null) {
            for (EventRequestSpec spec : specs)
                if (spec.getCommands () != null) 
                    readCommandStream (spec.getCommands ());
        }

        if (!Env.isConnected () || ThreadInfo.current == null
            || needsLoc (events))
            printPrompt();
    }

    /** List of Strings to execute at each stop. */
    private ArrayList<String> monitorCommands = new ArrayList<String>();
    private int monitorCount = 0;

    /** List of step-related event requests now active. */
    private ArrayList<EventRequest> pendingStepRequests 
        = new ArrayList<EventRequest> ();
    private int stepTargetFrameCount;

    EventHandler handler = null;
    BufferedReader input;
    BufferedReader standardInputReader;
    BreakpointSpec lastBreakpointSet;
}

