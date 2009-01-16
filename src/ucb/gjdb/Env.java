/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import com.sun.jdi.request.StepRequest;
import com.sun.jdi.request.MethodEntryRequest;
import com.sun.jdi.request.MethodExitRequest;
import com.sun.tools.jdi.*;
import java.util.*;
import java.io.*;


class Env {

    final static String endl = System.getProperty ("line.separator");

    static PrintStream out = System.out;    

    static EventRequestSpecList specList = new EventRequestSpecList();

    private static VMConnection connection;

    private static SourceMapper sourceMapper = new SourceMapper(".");
    private static ArrayList<String> excludes = new ArrayList<String> ();

    private static final int SOURCE_CACHE_SIZE = 5;
    private static List sourceCache = new LinkedList();

    private static HashMap<String,Value> savedValues = 
		new HashMap<String,Value> ();

	static boolean annotate;
    static String connectSpec;
    static String classPath;
    static String javaArgs;
    static String cmdClass;
	static CommandLineSpec commandLine = new CommandLineSpec ();
    static int traceFlags;
    private static boolean relayInput;
    static String promptPrefix;

    /* Parameters */
    /** Maximum number of array elements printed by dump */
    static int maxArrayElements = 16;
    /** True if arrays are pretty-printed in open format. */
    static boolean prettyArrays = false;
    static boolean noStdin = false;
    /** Maximum # of stack frames to print. */
    static int maxStackFrames = 20;

    static void init() {
        String spec;
		spec = connectSpec;
        if (!(javaArgs+classPath).equals ("")
			&& connectSpec.startsWith ("com.sun.jdi.CommandLineLaunch:")) 
			{
				spec += "options=" + javaArgs;
				if (!javaArgs.equals ("") && !classPath.equals (""))
					spec += " ";
				spec += classPath + ",";
			}
        connection = new VMConnection(spec, cmdClass, commandLine, traceFlags);
        specList.unresolveAll ();
        specList.removeTransients ();
        requestInputRelay (false);
    }

    static boolean relayingInput () {
        return 
            connection != null && ! connection.hasRedirectedInput ()
            && relayInput && ! noStdin;
    }

	static void requestInputRelay (boolean which) {
		if (connection != null && connection.allowsIO ())
			relayInput = which;
		else
			relayInput = false;
	}

    static VMConnection connection() {
        return connection;
    }

    static boolean isConnected () {
        return connection != null && connection.isOpen ();
    }

    static VirtualMachine vm() {
        if (connection == null)
            return null;
        else
            return connection.vm();
    }

	static void setClassPrepareEnabled (boolean val) {
		if (isConnected ())
			connection.setClassPrepareEnabled (val);
	}

    /** Resume all VM threads. */
    static void resumeVM () {
        if (connection == null)
            return;
        for (ThreadIterator ti = ThreadInfo.threadIterator (); ti.hasNext ();) {
            ThreadReference tr = ti.nextThread ();
            for (int k = tr.suspendCount ()-1; k > 0; k -= 1) {
                tr.resume ();
            }
        }
        vm ().resume ();
    }

    static void shutdown() {
        shutdown(null);
    }

    static void shutdown(String message) {
        requestInputRelay (false);
        if (connection != null) {
            try {
                connection.disposeVM();
            } catch (VMDisconnectedException e) { 
                // Shutting down after the VM has gone away. This is
                // not an error, and we just ignore it. 
            }
        }
        if (message != null)
            noticeln(message);
        ThreadInfo.current = null;
        connection = null;
    }

    static void fatalError(String msg) {
        System.err.println("Fatal error:");
        System.err.println(msg);
        shutdown();
        System.exit(0);
    }

    static void error(String msg, Object... args) {
        System.err.printf (String.format (msg, args));
    }

    static void errorln(String msg, Object... args) {
        System.err.printf (String.format (msg, args));
		System.err.println ();
    }

    static void notice(String msg, Object... args) {
        System.out.printf (msg, args);
    }

    static void noticeln(String msg, Object... args) {
        System.out.printf (msg, args);
		System.out.println ();
    }

    static void noticeln() {
        System.out.println();
    }

    static void indent (int n) {
        for (int i = 0; i < n; i += 1)
            System.out.print (' ');
    }

    static void flush() {
        System.out.flush ();
    }

    static void printPrompt() {
        ThreadInfo tinfo = ThreadInfo.current;
        if (promptPrefix != null)
            out.print (promptPrefix);
        if (!isConnected ())
            out.print("[-] ");
        else if (tinfo == null)
            out.print("[?] ");
        else {
            out.print(tinfo.thread.name() 
                      + "[" + tinfo.currentFrameIndex + "] ");
        }
        out.flush();
    }

    static void setSourcePath(String srcpath) {
        sourceMapper = new SourceMapper(srcpath);
        sourceCache.clear();
    }

    /** The source path used to construct this SourceMapper. */
    static String getSourcePath () {
        return sourceMapper.getSourcePath ();
    }

    static String excludesString() {
        String str = excludes.toString ();
        return str.substring (1, str.length () - 1);
    }

    static void insertExcludes(StepRequest request) {
        for (String pattern : excludes)
            request.addClassExclusionFilter(pattern);
    }

    static void insertExcludes(MethodEntryRequest request) {
        for (String pattern : excludes)
            request.addClassExclusionFilter(pattern);
    }

    static void insertExcludes(MethodExitRequest request) {
        for (String pattern : excludes)
            request.addClassExclusionFilter(pattern);
    }

    static void setExcludes(List<String> L) {
		excludes.clear ();
        excludes.addAll (L);
    }

	private static final List<String> standardExcludes =
		Arrays.asList 
		  (new String[] { "java.*", "javax.*", "sun.*", "com.sun.*" });

    static void setStandardExcludes () {
        setExcludes(standardExcludes);
    }

    static void addExcludes (List<String> L) {
        excludes.addAll (L);
    }

    static File sourceFile (Location loc) {
        return sourceMapper.sourceFile (loc);
    }

    /**
     * Return a Reader cooresponding to the source of this location.
     * Return null if not available.
     * Note: returned reader must be closed.
     */
    static BufferedReader sourceReader(Location location) {
        return sourceMapper.sourceReader(location);
    }

    static synchronized String sourceLine(Location location, int lineNumber) 
        throws IOException {
        if (lineNumber == -1) {
            throw new IllegalArgumentException();
        }

        try {
            String fileName = location.sourceName();
    
            Iterator iter = sourceCache.iterator();
            SourceCode code = null;
            while (iter.hasNext()) {
                SourceCode candidate = (SourceCode)iter.next();
                if (candidate.fileName().equals(fileName)) {
                    code = candidate;
                    iter.remove();
                    break;
                }
            }
            if (code == null) {
                BufferedReader reader = sourceReader(location);
                if (reader == null) {
                    throw new FileNotFoundException(fileName);
                }
                code = new SourceCode(fileName, reader);
                if (sourceCache.size() == SOURCE_CACHE_SIZE) {
                    sourceCache.remove(sourceCache.size() - 1);
                }
            }
            sourceCache.add(0, code);
            return code.sourceLine(lineNumber);
        } catch (AbsentInformationException e) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Return the thread status description.
     */
    static String getStatus(ThreadReference thr) {
        int status;
        try {
            status = thr.status();
        } catch (Exception e) {
            return null;
        }
        String statusString;
        switch (status) {
        case ThreadReference.THREAD_STATUS_UNKNOWN:
            statusString = "unknown";
            break;
        case ThreadReference.THREAD_STATUS_ZOMBIE:
            statusString = "zombie";
            break;
        case ThreadReference.THREAD_STATUS_RUNNING:
            statusString = "running";
            break;
        case ThreadReference.THREAD_STATUS_SLEEPING:
            statusString = "sleeping";
            break;
        case ThreadReference.THREAD_STATUS_MONITOR:
            statusString = "waiting in a monitor";
            break;
        case ThreadReference.THREAD_STATUS_WAIT:
            statusString = "cond. waiting";
            break;
        default:
            throw new InternalError("invalid thread status");
        }
        if (thr.isAtBreakpoint()) {
            statusString += " (at breakpoint)";
        }
        return statusString;
    }

    /** Return a description of an object. */
    static String description(ObjectReference ref) {
        ReferenceType clazz = ref.referenceType();
        long id = ref.uniqueID();  
        if (clazz == null) {
            return toHex(id);
        } else {
            return "(" + clazz.name() + ")" + toHex(id);
        }
    }

    /** Convert a long to a hexadecimal string. */
    static String toHex(long n) {
        char s1[] = new char[16];
        char s2[] = new char[18];

        /* Store digits in reverse order. */
        int i = 0;
        do {
            long d = n & 0xf;
            s1[i++] = (char)((d < 10) ? ('0' + d) : ('a' + d - 10));
        } while ((n >>>= 4) > 0);

        /* Now reverse the array. */
        s2[0] = '0';
        s2[1] = 'x';
        int j = 2;
        while (--i >= 0) {
            s2[j++] = s1[i];
        }
        return new String(s2, 0, j);
    }

    /** Convert hexadecimal strings to longs. */
    static long fromHex(String hexStr) {
        String str = hexStr.startsWith("0x") ?
            hexStr.substring(2).toLowerCase() : hexStr.toLowerCase();
        if (hexStr.length() == 0) {
            throw new NumberFormatException();
        }
    
        long ret = 0;
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                ret = (ret * 16) + (c - '0');
            } else if (c >= 'a' && c <= 'f') {
                ret = (ret * 16) + (c - 'a' + 10);
            } else {
                throw new NumberFormatException();
            }
        }
        return ret;
    }
    
    static ReferenceType getReferenceTypeFromToken(String idToken) {
        ReferenceType cls = null;
        if (Character.isDigit(idToken.charAt(0))) {
            cls = null;
        } else if (idToken.startsWith("*.")) {
            // This notation saves typing by letting the user omit leading
            // package names. The first 
            // loaded class whose name matches this limited regular
            // expression is selected.
            idToken = idToken.substring(1);
            List classes = Env.vm().allClasses();
            Iterator iter = classes.iterator();
            while (iter.hasNext()) {
                ReferenceType type = ((ReferenceType)iter.next());
                if (type.name().endsWith(idToken)) {
                    cls = type;
                    break;
                }
            }
        } else {
            // It's a class name
            List classes = Env.vm().classesByName(idToken);
            if (classes.size() > 0) {
                // TO DO: handle multiples
                cls = (ReferenceType)classes.get(0);
            }
        }
        return cls;
    }

    /** False iff we have evidence that there is no class named NAME. 
     *  Conservatively returns true if disconnected or if VM does not
     *  give search paths. */
    static boolean classMayExist (String name) {
        if (connection == null)
            return true;
        return connection.classMayExist (name);
    }

    static Set<String> getSaveKeys() {
        return savedValues.keySet();
    }

    static Value getSavedValue(String key) {
        return savedValues.get(key);
    }

    static void setSavedValue(String key, Value value) {
        savedValues.put(key, value);
    }

    /** A list of all current event request specifications with the same
     *  type as EXEMPLAR.  The resulting list is new, and does not change 
     *  with modifications to the set of requests. */
    static List<EventRequestSpec> eventRequestSpecs(EventRequestSpec exemplar) {
        return specList.eventRequestSpecs (exemplar);
    }

    static class SourceCode {
        private String fileName;
        private List sourceLines = new ArrayList();

        SourceCode(String fileName, BufferedReader reader)  throws IOException {
            this.fileName = fileName;
            try {
                String line = reader.readLine();
                while (line != null) {
                    sourceLines.add(line);
                    line = reader.readLine();
                }
            } finally {
                reader.close();
            }
        }

        String fileName() {
            return fileName;
        }

        String sourceLine(int number) {
            int index = number - 1; // list is 0-indexed
            if (index >= sourceLines.size()) {
                return null;
            } else {
                return (String)sourceLines.get(index);  
            }
        }
    }

    static {
        setStandardExcludes ();
    }
}
