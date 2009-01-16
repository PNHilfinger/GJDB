/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import com.sun.jdi.event.*;
import com.sun.jdi.connect.*;

import java.util.*;
import java.io.*;

import static ucb.gjdb.CommandException.ERROR;

public class GJDB {

    static final String progname = "gjdb";
    static final String GREETING =
		String.format ("%s version %s%n"
					   + "  Please send all questions, comments, and bug reports%n"
					   + "  to Hilfinger@cs.berkeley.edu.",
					   progname, Version.value);

    private final static String[][] helpMsgs = 
    {
        { "run <args> [< <infile>] [>[&] <outfile>]", 
          "start execution of application's main class, using <args> "
          + "as command-line arguments.  Take the standard input from "
          + "<infile>, if specified.  Direct the standard output to "
          + "<outfile>, if specified, and with '>&', direct the standard "
          + "error stream to <outfile> as well." },
		{ "attach <address>", 
		  "attach to running Java VM at <address> using standard connector."
		},
		{ "connect <connector-name>:<name1>=<value1>,...",
		  "connect to target Java VM using named connector with listed "
		  + "argument values." },
        { "listen [ <address> ]",
		  "wait for a running Java VM to connect at the specified address "
		  + "using standard connector, or at any available address if none "
		  + "specified." },
		{ "detach", 
		  "detach from running Java VM or terminate current application." },
        { "exec-class <class>", 
          "make <class> be the class whose main program is called by run" },
        { "exec-args [<args>]",
          "cause run to pass the given arguments to the main program" },
        {  },
        { "where [<thread id> | all]", "dump a thread's stack" },
        { "backtrace [<thread id> | all]", "synonym for 'where'" },
        { "bt [<thread id>] | all", "synonym for 'where'" },
        { "wherei [<thread id> | all]", 
		  "dump a thread's stack, with pc info" },
		{ "up [<n>]", "move up a thread's stack by <n> frames, default 1" },
        { "down [<n>]",
		  "move down a thread's stack by <n> frames, default 1" },
        { "frame <n>", "move to frame #<n> in a thread's stack" },
        {  },
        { "call <expr>", "evaluate <expr>, ignoring value" },
        { "print <expr>", "print value of <expr>.  Abbrev: 'p'" },
        { "print/<d><f> <expr>", 
          "print all information about <expr> to <d> levels, "
          + "using format <f> for (null, d, x, o, b, s, c, r), excluding static fields" },
        { "save <id> <expr>", 
          "save the value of <expr> as <id> (an identifier or number).  In " 
          + "later expressions, you can use $<id> to retrieve the saved "
          + "value" },
        { "ptype <expr>", "print type of expression's value" },
        { "eval <expr>", "Same as print <expr>" },
        { "eval/<d><f> <expr>", "Same as print/<d><f>" },
        { "dump <expr>", "same as print/1" },
        { "dump/<d><f> <expr>", "same as print/<d> <expr>" },
        { "dumpall <expr>", "same as print/1, but also prints static fields" },
        { "dumpall/<d><f> <expr>", "same as print/<d> <expr>, but also prints "
          + "static fields" },
        { "da <expr>", "same as dumpall <expr>" },
        { "da/<d> <expr>", "same as dumpall/<d> <expr>" },
        { "set print compressed", "print arrays in compressed format" },
        { "set print pretty", "print arrays one element per line" },
        { "set print elements <n>", 
          "set maximum number of elements to print from an array to <n>" },
        { "set print max-frames <n>", 
          "set maximum number of frames that 'where' prints to <n>" },
        { "set stdin on", 
          "terminal input goes to debugged process when it "
          + "is not stopped and input is not redirected (default)." },
        { "set stdin off",
          "terminal input used only for gjdb commands." },
		{ "set variable <expr>", 
		  "same as print (<expr> is usually an assignment)" },
		{ "set <expr>", 
		  "same as set variable, but only when start of <expr> does "
		  + "not conflict with other keywords." },
        {  },
        { "thread <thread id>", "set default thread" },
        { "threadgroup <name>", "set current threadgroup" },
        { "suspend [<thread id>...]", "suspend threads (default: all)" },
        { "resume [<thread id>...]", "resume threads (default: all)" },
        { "kill <thread id> <expr>", 
          "kill a thread with the given exception object" },
        { "interrupt <thread id>", "interrupt a thread" },
        {  },
        { "break <class id>.<method>[(argument_type,...)] [if <cond>]",
          "set a breakpoint in a method.  You may replace leading package "
          + "names in <class id> with '*'.  A trailing \".0\" on the " 
          + "<class id> means \"any anonymous class\".  The optional " 
          + "\"if <cond>\" clause specifies a condition (see the `condition' "
          + "command)." },
        { "break <class id>:<line> [if <cond>]", 
          "set a breakpoint at a line" },
        { "break", "list breakpoints" },
        { "clear <breakpoint spec>", 
          "clear specified breakpoints.  Each <breakpoint spec> "
          + "is a breakpoint number, a method specification "
          + "(<class id>.<method>[(argument_type,...)]), or "
          + "a line specification (<class id>:<line>)." },
		{ "delete <n> ...", 
		  "delete stopping requests (breakpoints, exceptions, watchpoints) "
		  + "with the given numbers." },
        { "delete", "clear all stopping requests selected by the user" },
        { "command [<breakpoint num>]", 
          "read a list of commands from the current command input source "
          + "and attach them to the indicated breakpoint (default, last "
          + "breakpoint set) to be executed whenever the breakpoint is hit."
        },
        { "condition <breakpoint num> <cond>", 
          "make the breakpoint with the given number stop only when boolean "
          + "expression <cond> evaluates to true." }, 
        { "condition (<cond>)", 
          "make the last breakpoint set stop only when boolean expression "
          + "<cond> evaluates to true." },
        { "condition <breakpoint num>", 
          "make the breakpoint with the given number unconditional" },
        { "catch <class id>", "break when specified exception thrown" },
		{ "pass <class id>", "cancel 'catch' for the specified exception" },
        { "watch [go|thread] [access|all] <class id>.<field name>", 
          "watch access/modifications to named field of all objects of given "
		  + "class.  'go' indicates that execution continues on hitting "
  		  + "watch; 'thread' that only the thread hitting the watchpoint "
		  + "stops.  'access' looks just at reads of the field; 'all' "
		  + "both reads and modifications." },
        { "watch [go|thread] [access|all] ( <expr> ).<field name>", 
          "watch access/modifications to a field of a given object." },
        { "unwatch [go|thread] [access|all] <class id>.<field name>", 
          "discontinue watching access/modifications to named field of all "
		  + "objects of given class." },
        { "unwatch [go|thread] [access|all] ( <expr> ).<field name>", 
          "discontinue watching access/modifications to named field of a "
		  + "specified object." },
        { "unwatch", 
          "discontinue watching accesses/modifications to all fields "
          + "selected by the user" },
		{ "ignore <stop number> <n>",
		  "suppress stopping at stop request #<stop number> the next <n> "
		  + "times it is hit" },
        { "trace methods [<thread id>]", "trace method entry and exit" },
        { "untrace methods", "stop tracing method entry and exit" },
        { "step", "execute current line.  Abbrev: 's'" },
        { "step up", "execute until the current method returns to its caller" },  
        { "finish", "synonym for 'step up'" },  
        { "stepi", "execute current instruction.  Abbrev: 'si'" },
        { "next", "step one line (step OVER calls).  Abbrev: 'n'" },
        { "continue", "continue execution from breakpoint.  Abbrev: 'c'" },
        {  },
        { "info break", "list current breakpoints" },
        { "info class <class id>", "show details of named class" },
        { "info classes", "list currently known classes" },
        { "info classpath", "print classpath info from target VM" },
        { "info fields <class id>", "list a class's fields" },
        { "info locals", "print all local variables in current stack frame" },
        { "info methods <class id>", "list a class's methods" },
        { "info threadgroups", "list threadgroups" },
        { "info stack [<thread id> | all]", "same as 'where'" },
        { "info threads", "list all threads" },
        { "info threadlocks [<thread id>]", "print lock info for a thread" },
        { "info run", 
          "print the command that run will use to start the program" },
        { "info watch", "list current watchpoints" },
        {  },
        { "loadclass <class id>", 
          "cause debugged image to load indicated class, allowing access "
          + "to its static methods, etc." },
        { "list [line number|method]", "print source code. Abbrev: 'l'" },
        { "use (or sourcepath) [source-file-path]", 
          "display or change the source path" },
        { "classpath [class-file-path]",
          "display or change the classpath used by the next 'run' "
          + "command" },
        { "exclude [[+]class id ... | \"none\" | \"reset\" ]" , 
          "do not report step or method events for specified classes, " 
          + "or, with no arguments, list excluded class ids. "
          + "When class ids are preceded by '+', they are added to the "
          + "existing list; otherwise they replace it. "
          + "'none' means 'always stop'.  'reset' means 'exclude standard "
          + "library classes.'"     },
        {  },
        { "monitor <command>", "execute command each time the program stops" },
        { "unmonitor <monitor#>", "delete a monitor" },
        { "source <filename>", "read and execute a command file" },
        {  },
        { "lock <expr>", "print lock info for an object" },
        {  },
        { "disablegc <expr>", "prevent garbage collection of an object" },
        { "enablegc <expr>", "permit garbage collection of an object" },
        {  },
        { "!!", "repeat last command" },
        { "<n> <command>", "repeat command n times" },
        { "help (or ?)", "list commands" },
        { "version", "print version information" },
        { "exit (or quit)", "exit debugger" },
        {  },
        { "<class id>: full class name with package qualifiers or a " },
        { "    pattern with a leading or trailing wildcard ('*')." },
        { "<thread id>: thread number or thread name as reported in the" },
        { "    'info threads' command" },
        { "<expr>: a Java(tm) Programming Language expression." },
        { "    Most common syntax is supported." },
        {  },
        { "Startup commands can be placed in either \"jdb.ini\" or \".jdbrc\"" },
        { "    in user.home or user.dir." },

        // Undocumented commands useful for testing:
        //{ "lines <class id> [method]", "print executable source lines" },
        //{ "bytecodes <class id> <method>" },
        //{ "", "display the bytecodes of a method" },  
    };

    private static void indent (int n) {
        for (int i = 0; i < n; i += 1) 
            Env.notice (" ");
    }

    static void help () {
		help (0, helpMsgs.length);
	}

	static void help (String cmnd) {
        int first, last;
		for (first = 0; first < helpMsgs.length; first += 1)
			if (helpMsgs[first].length > 1
				&& helpMsgs[first][0].startsWith (cmnd))
				break;
		for (last = first+1; last < helpMsgs.length; last += 1)
			if (helpMsgs[last].length <= 1
				|| ! helpMsgs[last][0].startsWith (cmnd))
				break;
		if (first >= helpMsgs.length) {
			Env.noticeln ("No help on " + cmnd);
			return;
		}
		help (first, last);
	}

	private static void help (int first, int last) {
		int col0 = 0, col1 = 26, endcol = 72;

        for (int i = first; i < last; i += 1) {
            if (helpMsgs[i].length == 0)
                Env.noticeln ();
            else {
                indent (col0);
                if (helpMsgs[i].length > 1) {
                    Env.notice (helpMsgs[i][0]);
                    if (col0 + helpMsgs[i][0].length () >= col1) {
                        Env.noticeln ();
                        indent (col1);
                    } else 
                        indent (col1 - helpMsgs[i][0].length () - col0);
                    StringBuffer desc = new StringBuffer (helpMsgs[i][1]);
                    while (true) {
                        Env.notice ("-- ");
                        if (desc.length () + 3 + col1 < endcol) {
                            Env.noticeln (desc.toString ());
                            break;
                        }
                        else {
                            int split = desc.toString ()
                                .lastIndexOf (' ', endcol-col1-3);
                            Env.noticeln (desc.substring (0, split));
                            desc.replace (0, split+1, "");
                            if (desc.length () == 0)
                                break;
                            indent (col1);
                        }
                    }
                } else 
                    Env.noticeln (helpMsgs[i][0]);
            }
        }
    }

	static List<String> commandUsageMsgs (String cmnd) {
		String cmnd1 = cmnd + " ";
		ArrayList<String> result = new ArrayList<String> ();
		for (String[] entry : helpMsgs) {
			if (entry.length > 0 
				&& (entry[0].equals (cmnd) || entry[0].startsWith (cmnd1)))
				result.add (entry[0]);
		}
		return result;
	}

    private static void usage() {
        String separator = File.pathSeparator;
        Env.noticeln("Usage: " + progname + " <options> <class> <arguments>");
        Env.noticeln();
        Env.noticeln("where options include:");
        Env.noticeln("    -help             print out this message and exit");
        Env.noticeln("    -sourcepath <directories separated by \"" + 
                     separator + "\">");
        Env.noticeln("                      directories in which to look for source files");
        Env.noticeln("    -classpath <directories separated by \"" + 
                     separator + "\">");
        Env.noticeln("                      list directories in which to look for classes");
        Env.noticeln("    -dbgtrace [flags] print info for debugging " + progname);
        Env.noticeln("    -f                Annotate output for Emacs");
        Env.noticeln("    -prompt <prompt>  Prefix each GJDB prompt with <prompt>");
        Env.noticeln("    -thotspot         run the application in the Hotspot(tm) Performance Engine");
        Env.noticeln("    -tclassic         run the application in the Classic VM");
        Env.noticeln();
        Env.noticeln("options forwarded to debuggee process:");
        Env.noticeln("    -v -verbose[:class|gc|jni]");
        Env.noticeln("                      turn on verbose mode");
        Env.noticeln("    -D<name>=<value>  set a system property");
        Env.noticeln("    -X<option>        non-standard target VM option");
        Env.noticeln();
        Env.noticeln("<class> is the name of the class to begin debugging");
        Env.noticeln("<arguments> are the arguments passed to the main() method of <class>");
        Env.noticeln("A leading \"~\" in a directory name refers to the home directory.");
        Env.noticeln();
        Env.notice(GREETING);
        Env.noticeln("For command help type 'help' at " + progname + " prompt");
    }

    static void usageError(String message, Object... args) {
        Env.noticeln (String.format (message, args));
        System.err.println();
        usage();
        System.exit(1);
    }

    public static void main(String argv[]) {
        String cmdClass, cmdArgs, javaArgs, classPath;
        int traceFlags;
        String connectSpec;
		boolean annotate;

        cmdClass = cmdArgs = javaArgs = classPath = "";
        traceFlags = VirtualMachine.TRACE_NONE;
        annotate = false;
        connectSpec = null;

        for (int i = 0; i < argv.length; i++) {
            String token = argv[i];
            if (token.equals("-dbgtrace")) {
                if ((i == argv.length - 1) ||
                    ! Character.isDigit(argv[i+1].charAt(0))) {
                    traceFlags = VirtualMachine.TRACE_ALL;
                } else {
                    String flagStr = argv[++i];
                    traceFlags = Integer.decode(flagStr).intValue();
                }
            } else if (token.equals("-X")) {
                usageError("Use 'java -X' to see the available non-standard options");
                return;
            } else if (
                       // Standard VM options passed on
                       token.equals("-v") || token.startsWith("-v:") // -v[:...]
                       || token.startsWith("-verbose")               // -verbose[:...]
                       || token.startsWith("-ea") 
                       || token.startsWith("-enableassertions")
                       || token.startsWith("-da") 
                       || token.startsWith("-disableassertions")
                       || token.startsWith("-esa")
                       || token.startsWith("-enablesystemassertions")
                       || token.startsWith("-dsa")
                       || token.startsWith("-disablesystemassertions")
                       || token.startsWith("-D")
                       // -classpath handled below
                       // NonStandard options passed on
                       || token.startsWith("-X")) 
                {
                    javaArgs += token + " ";
                } else if (token.equals("-thotspot")) {
                    // -hotspot must be the first one
                    javaArgs = "-hotspot " + javaArgs;
                } else if (token.equals("-sourcepath")) {
                    if (i == (argv.length - 1)) {
                        usageError("No sourcepath specified.");
                        return;
                    }
                    Env.setSourcePath(argv[++i]);
                } else if (token.equals("-classpath")) {
                    if (i == (argv.length - 1)) {
                        usageError("No classpath specified.");
                        return;
                    }
                    classPath = "-classpath " + argv[i + 1].trim ();
                    i += 1;
                } else if (token.equals("-help")) {
                    usage();
                    System.exit(0);
                } else if (token.equals("-version")) {
                    Env.noticeln(progname + " version " + Version.value);
                    System.exit(0);
                } else if (token.equals ("-f")) {
                    annotate = true;
                } else if (token.equals ("-prompt")) {
                    i += 1;
                    Env.promptPrefix = argv[i];
                } else if (token.startsWith("-")) {
                    usageError("invalid option: " + token);
                    return;
                } else {
                    // Everything from here is part of the command line
                    cmdClass = token;
                    cmdArgs = "";
                    for (i++; i < argv.length; i++) {
                        cmdArgs += " " + argv[i];
                    }
                    break;
                }
        }

        javaArgs = javaArgs.trim();

        try {
			Commands evaluator = new Commands();
            Env.out = System.out;
            Env.connectSpec = null;
            Env.javaArgs = javaArgs;
            Env.classPath = classPath;
            Env.traceFlags = traceFlags;
            Env.cmdClass = cmdClass;
            Env.commandLine.cmdArgs = cmdArgs;
			Env.annotate = annotate;
            evaluator.run ();
        } catch(Exception e) {                
            System.out.flush();
            Env.error("Internal exception:  ");
            e.printStackTrace();
        }
        System.exit (0);
    }
}
