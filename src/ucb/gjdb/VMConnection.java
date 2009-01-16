/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000, 2001, 2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import com.sun.jdi.connect.*;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.ExceptionRequest;
import com.sun.jdi.request.ClassPrepareRequest;


import java.util.*;
import java.io.*;
import java.util.jar.*;

class VMConnection {

    static final int DUMPSTREAM_BUFFER_SIZE = 256;

    private VirtualMachine vm;    
    private List classPath;
    private Thread inputTransferThread;
    private Process process = null;
    private int outputCompleteCount = 0;
    private Writer remote_System_in;
    private QuiescenceMonitor activeIOMonitor = new QuiescenceMonitor (1000);

    private final Connector connector;
    private final Map connectorArgs;
    private final String inputFileName, outputFileName, errorFileName;
    private final int traceFlags;
	private final boolean IOFromDebuggerPossible;

    synchronized void notifyOutputComplete() {
        outputCompleteCount += 1;
        notifyAll();
    }

    void waitOutputQuiet () throws InterruptedException {
        activeIOMonitor.waitForQuiet ();
    }

	/** Wait for stdout and stderr streams from debugged process to be 
	 *  closed. */
    synchronized void waitOutputComplete() {
        if (process != null) {
            while (outputCompleteCount < 2) {
                try {
					wait();
				} catch (InterruptedException e) {}
            }
        }
    }

    private Connector findConnector(String name) {
        List connectors = Bootstrap.virtualMachineManager().allConnectors();
        Iterator iter = connectors.iterator();
        while (iter.hasNext()) {
            Connector connector = (Connector)iter.next();
            if (connector.name().equals(name)) {
                return connector;
            }
        }
        return null;
    }

    private Map parseConnectorArgs(Connector connector, String argString) {
        StringTokenizer tokenizer = new StringTokenizer(argString, ",");
        Map arguments = connector.defaultArguments();

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int index = token.indexOf('=');
            if (index == -1) {
                throw new IllegalArgumentException("Illegal connector argument: " +
                                                   token);
            }
            String name = token.substring(0, index);
            String value = token.substring(index + 1);
            Connector.Argument argument = (Connector.Argument)arguments.get(name);
            if (argument == null) {
                throw new IllegalArgumentException("Argument " + name + 
                                                   "is not defined for connector: " +
                                                   connector.name());
            }
            argument.setValue(value);
        }
        return arguments;
    }

    VMConnection(String connectSpec, String cmdClass, 
				 CommandLineSpec cmdLine, int traceFlags) {
        String nameString;
        String argString;
        int index = connectSpec.indexOf(':');
        if (index == -1) {
            nameString = connectSpec;
            argString = "";
        } else {
            nameString = connectSpec.substring(0, index);
            argString = connectSpec.substring(index + 1);
        }

        connector = findConnector(nameString);
        if (connector == null) {
            throw new IllegalArgumentException("No connector named: " + 
                                               nameString);
        } 

        connectorArgs = parseConnectorArgs(connector, argString);
		if (isLaunch ()) {
			setConnectorArg ("main", cmdClass + cmdLine.cmdArgs);
			inputFileName = cmdLine.inFile;
			outputFileName = cmdLine.outFile;
			errorFileName = cmdLine.errFile;
			IOFromDebuggerPossible = true;
		} else {
			inputFileName = outputFileName = errorFileName = null;
			IOFromDebuggerPossible = false;
		}
		this.traceFlags = traceFlags;
    }
        
    synchronized VirtualMachine open() {
        if (connector instanceof LaunchingConnector) {
            vm = launchTarget();
        } else if (connector instanceof AttachingConnector) {
            vm = attachTarget();
            // Allow debugger operations like 'cont'
            ThreadInfo.setCurrentThread(ThreadInfo.getThread(1).thread);
        } else if (connector instanceof ListeningConnector) {
            vm = listenTarget();
            // Allow debugger operations like 'cont'
            ThreadInfo.setCurrentThread(ThreadInfo.getThread(1).thread);
        } else {
            throw new InternalError("Invalid connect type");
        }
        if (vm != null) {
            vm.setDebugTraceMode(traceFlags);
            if (vm instanceof PathSearchingVirtualMachine) {
                PathSearchingVirtualMachine vm1 = 
                    (PathSearchingVirtualMachine) vm;
                classPath = new ArrayList ();
                classPath.addAll (vm1.classPath ());
                classPath.addAll (vm1.bootClassPath ());
                for (int i = 0; i < classPath.size (); i += 1)
                    for (int j = classPath.size ()-1; j > i; j -= 1)
                        if (classPath.get (i).equals (classPath.get (j)))
                            classPath.remove (j);
            } else
                classPath = null;

            setEventRequests(vm);
            resolveEventRequests();
        }
        return vm;
    }

    boolean setConnectorArg(String name, String value) {
        /*
         * Too late if the connection already made
         */
        if (vm != null) {
            return false;
        }

        Connector.Argument argument = (Connector.Argument)connectorArgs.get(name);
        if (argument == null) {
            return false;
        }
        argument.setValue(value);
        return true;
    }

    String connectorArg(String name) {
        Connector.Argument argument = (Connector.Argument)connectorArgs.get(name);
        if (argument == null) {
            return "";
        }
        return argument.value();
    }

    public synchronized VirtualMachine vm() {
        if (vm == null) {
            throw new VMNotConnectedException();
        } else {
            return vm;
        }
    }         

    boolean isOpen() {
        return (vm != null);
    }

    boolean isLaunch() {
        return (connector instanceof LaunchingConnector);
    }

	boolean allowsIO() {
		return IOFromDebuggerPossible;
	}

    boolean hasRedirectedInput () {
        return inputFileName != null;
    }

    public void disposeVM() {
        activeIOMonitor.done ();
        try {
            closeOutputToRemote ();
            if (vm != null) {
				if (isLaunch ())
					vm.exit (0);
				vm.dispose ();
			}					
        } finally {
			vm = null;
            if (process != null) {
                process.destroy();
                process = null;
            }
            waitOutputComplete();
        }
    }

	/** Enable all requests to be notified of ClassPrepareEvents (normally, 
	 *  there is only one) if VAL, else disable them.  */
	void setClassPrepareEnabled (boolean val) {
		if (vm == null)
			return;
		EventRequestManager erm = vm.eventRequestManager ();
		if (erm == null)
			return;
		for (ClassPrepareRequest req : erm.classPrepareRequests ())
			req.setEnabled (val);
	}

	/** Enable all permanent event requests.  Currently, we are notified
	 *  of 
	 *     1. All uncaught exceptions.
	 *     2. All class prepare events.
	 */
    private void setEventRequests(VirtualMachine vm) {
        EventRequestManager erm = vm.eventRequestManager();
        erm.createExceptionRequest (null, false, true).enable (); 
		erm.createClassPrepareRequest ().enable ();
    }

    private void resolveEventRequests() {
        Env.specList.resolveAll();
    }

    private void dumpStream(InputStream stream, PrintStream outStream,
                            QuiescenceMonitor monitor) 
        throws IOException {
        BufferedInputStream in = new BufferedInputStream (stream);
        byte[] buffer = new byte[DUMPSTREAM_BUFFER_SIZE];
        while (true) {
            int len = in.read (buffer, 0, buffer.length);
            if (len < 0)
                break;
            if (monitor != null)
                monitor.kick ();
            outStream.write (buffer, 0, len);
            outStream.flush ();
            if (monitor != null)
                monitor.kick ();
        }
        in.close ();
    }

    synchronized void sendToRemote (String str) {
        try {
            remote_System_in.write (str);
            remote_System_in.flush ();
        } catch (IOException e) {
            System.err.println ("Error sending input to debugged process:");
            System.err.println ("    " + e);
        }
    }

    /** Close the stream of output being supplied as the remote's 
     *  System.in, causing it to receive EOF. */
    synchronized void closeOutputToRemote () {
        if (inputTransferThread != null) {
            inputTransferThread.interrupt ();
            inputTransferThread = null;
        } else if (remote_System_in != null) {
            try {
                remote_System_in.close ();
            } catch (IOException e) { }
        }
    }

    /**
     *  Create and return a running thread that transfers input from 
     *  INPUTSTREAM to OUTPUTSTREAM.  Shuts down when INPUTSTREAM
     *  reaches EOF, or when there is an IOException. */
    private Thread transferInput (final Reader inp, final Writer out) {
        Thread result = 
            new Thread ("Input redirection") 
            {
                public void run () {
                    while (true) {
                        int c;
                        try { 
                            c = inp.read (); 
                            if (c < 0)
                                break;
                            out.write (c);
                        } catch (IOException e) { break; }
                    }
                    try { inp.close (); } catch (IOException e) {}
                    try { out.close (); } catch (IOException e) {}
                }
            };
        result.start ();
        return result;
    }

    /** 
     *  Create a Thread that will retrieve and display any output.
     */
    private void displayRemoteOutput(final InputStream stream, 
                                     final PrintStream out) {
        Thread thr = new Thread("output reader") { 
                public void run() {
                    try {
                        dumpStream(stream, out, activeIOMonitor);
                    } catch (IOException ex) {
                        /* Do nothing.  Presume that user will notice other 
                           problems and know whether to take action. */
                    } finally {
                        notifyOutputComplete();
                    }
                }
            };
        thr.start();
    }

    private void dumpFailedLaunchInfo(Process process) {
        try {
            dumpStream(process.getErrorStream(), Env.out, null);
            dumpStream(process.getInputStream(), Env.out, null);
        } catch (IOException e) {
            System.err.println("Unable to display process output: " +
                               e.getMessage());
        }
    }

    /* launch child target vm */
    private VirtualMachine launchTarget() {
        Reader inputReader = null;
        PrintStream stdoutStr, stderrStr;
        if (inputFileName != null) {
            try {
                inputReader 
                    = new BufferedReader (new FileReader (inputFileName));
            } catch (FileNotFoundException e) {
                Env.errorln ("Could not read file " + inputFileName);
                return null;
            }
        }
        stdoutStr = stderrStr = Env.out; 
        if (outputFileName != null) {
            try {
                stdoutStr = 
                    new PrintStream (new BufferedOutputStream 
                                     (new FileOutputStream (outputFileName)));
            } catch (FileNotFoundException f) {
                Env.errorln ("Could not open file " + outputFileName + 
                             " for output.");
                return null;
            }
        }
        if (errorFileName != null) {
            if (errorFileName.equals (outputFileName))
                stderrStr = stdoutStr;
            else 
                try {
                    stderrStr = 
                        new PrintStream (new BufferedOutputStream 
                                         (new FileOutputStream (errorFileName)));
                } catch (FileNotFoundException f) {
                    Env.errorln ("Could not open file " + errorFileName + 
                                 " for output.");
                    return null;
                }
        }       

        LaunchingConnector launcher = (LaunchingConnector)connector;
        try {
            VirtualMachine vm = launcher.launch(connectorArgs);
            process = vm.process();
            displayRemoteOutput(process.getErrorStream(), stderrStr);
            displayRemoteOutput(process.getInputStream(), stdoutStr);
            remote_System_in = 
                new OutputStreamWriter (process.getOutputStream ());
            if (inputReader != null) {
                inputTransferThread
                    = transferInput (inputReader, remote_System_in);
            }
            return vm;
        } catch (IOException ioe) {
            ioe.printStackTrace();
            Env.fatalError("\n Unable to launch target VM.");
        } catch (IllegalConnectorArgumentsException icae) {
            icae.printStackTrace();
            Env.fatalError("\n Internal debugger error.");
        } catch (VMStartException vmse) {
            System.err.println(vmse.getMessage() + "\n");
            dumpFailedLaunchInfo(vmse.process());
            Env.fatalError("\n Target VM failed to initialize.");
        }
        return null; // Shuts up the compiler
    }

    /* attach to running target vm */
    private VirtualMachine attachTarget() {
        AttachingConnector attacher = (AttachingConnector)connector;
        try {
            return attacher.attach(connectorArgs);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            Env.fatalError("\n Unable to attach to target VM.");
        } catch (IllegalConnectorArgumentsException icae) {
            icae.printStackTrace();
            Env.fatalError("\n Internal debugger error.");
        }
        return null; // Shuts up the compiler
    }

    /* listen for connection from target vm */
    private VirtualMachine listenTarget() {
        ListeningConnector listener = (ListeningConnector)connector;
        try {
            VirtualMachine vm;
            String retAddress = listener.startListening(connectorArgs);
            System.out.println("Listening at address: " + retAddress);
            vm = listener.accept(connectorArgs);
            listener.stopListening(connectorArgs);
            return vm;
        } catch (IOException ioe) {
            ioe.printStackTrace();
            Env.fatalError("\n Unable to attach to target VM.");
        } catch (IllegalConnectorArgumentsException icae) {
            icae.printStackTrace();
            Env.fatalError("\n Internal debugger error.");
        }
        return null; // Shuts up the compiler
    }


    /** False iff we have evidence that there is no class named NAME. 
     *  Conservatively returns true if disconnected or if VM does not
     *  give search paths. */
    boolean classMayExist (String name) {
        if (vm == null || classPath == null)
            return true;
        for (int i = 0; i < classPath.size (); i += 1) {
            if (containsClass ((String) classPath.get (i), name))
                return true;
        }
        return false;
    }

    /** True iff DIRORJAR contains a file for class NAME.  NAME is in
     *  standard Java notation (e.g., java.lang.String).  DIRORJAR is the 
     *  name of either a directory of class files or a .jar file containing
     *  class files. */
    static boolean containsClass (String dirOrJar, String name) {
        File f = new File (dirOrJar);
        if (! f.canRead ())
            return false;

        String fileName;
        fileName = name.replace ('.', File.separatorChar) + ".class";
        List classFileNames = new ArrayList (name.length () / 4);
        while (true) {
            classFileNames.add (fileName);
            int k = fileName.lastIndexOf (File.separatorChar);
            if (k == -1)
                break;
            fileName = fileName.substring (0, k) + "$" 
                + fileName.substring (k+1);
        }

        if (f.isDirectory ()) {
            for (int i = 0; i < classFileNames.size (); i += 1) 
                if ((new File ((String) classFileNames.get (i))).canRead ())
                    return true;
        } else if (dirOrJar.endsWith (".jar")) {
            JarFile jf;
            jf = null;
            try {
                jf = new JarFile (f);
                for (int i = 0; i < classFileNames.size (); i += 1)
                    if (jf.getEntry ((String) classFileNames.get (i)) != null)
                        return true;
            } catch (IOException e) {
            } finally {
                if (jf != null)
                    try {
                        jf.close ();
                    } catch (Exception e) { }
            }
        }

        return false;
    }
    
    static boolean supportsSharedMemory() {
        List connectors = Bootstrap.virtualMachineManager().allConnectors();
        Iterator iter = connectors.iterator();
        while (iter.hasNext()) {
            Connector connector = (Connector)iter.next();
            if (connector.transport().name().equals("dt_shmem")) {
                return true;
            }
        }
        return false;
    }

    static String addressToSocketArgs(String address) {
        int index = address.indexOf(':');
        if (index != -1) {
            String hostString = address.substring(0, index);
            String portString = address.substring(index + 1);
            return "hostname=" + hostString + ",port=" + portString;
        } else {
            return "port=" + address;
        }
    }


}
