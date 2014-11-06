/* -*-Fundamental-*- */

/* Copyright (c) 2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

%token<String> WORD TEXT 

%token<String> INTLIT CHARLIT STRINGLIT
%token<String> IDENT 

%type<List> thread_id_list delete_breakpoint_spec_list int_list
%type<String> connector_args thread_id
%type<Integer> address address_opt intlit intlit_dflt1 intlit_dflt_m1
%type<Integer> suspend_policy
%type<BreakpointSpec> breakpoint_spec delete_breakpoint_spec
%type<EventRequestSpec> exception_spec
%type<String> class_id break_class_id watch_type id_pattern
%type<String> if_clause_opt formal_type
%type<List> formal_types_opt formal_types watchpoint_spec exclude_class_id_list
%type<String> expr

%header{
   package ucb.gjdb;

   import com.sun.jdi.*;
   import com.sun.jdi.request.*;

   import java.io.BufferedReader;
   import java.io.IOException;

   import java.util.Stack;
   import java.util.Collections;
   import java.util.Stack;
   import java.util.List;
   import java.util.ArrayList;
   import java.util.HashMap;
   import java.util.regex.Pattern;
   import java.util.regex.Matcher;
   import java.util.Formatter;

   import static ucb.gjdb.CommandException.ERROR;

   class CommandParser
%}

%valuetype Object
%debug

%%

start:   command
        ;

command:
          "run" _run_args_mode
                { evaluator.commandRun ();
                  startHandler (); }
        | "run" _run_args_mode { $$ = new CommandLineSpec (); } run_args
                {  evaluator.commandRun ($<CommandLineSpec>3); 
                   startHandler (); }
        | "attach" address
                { evaluator.commandAttach ($2); 
                  startHandler (); }
        | "connect" WORD ':' connector_args
                { evaluator.commandConnect ($2 + ":" + $4); 
                  startHandler (); }
        | "listen" address_opt
                { evaluator.commandListen ($2);
                  startHandler (); }
        | "detach" 
               { evaluator.commandDetach (); }
        | "print" _print_mode expr
                { evaluator.commandPrint ($3, evaluator.PRINT, ' ', false); 
                  showPrompt = false; }
        | "print" _print_mode '/' WORD expr
                { evaluator.commandPrint ($5, printDepth ($4), printFormat ($4),
                                          false);
                  showPrompt = false; }
        | "print" _print_mode '/' intlit expr
                { evaluator.commandPrint ($5, $4, ' ', false);
                  showPrompt = false; }
        | "call" expr
                { evaluator.commandPrint ($2, evaluator.NO_PRINT, ' ', false);
                  showPrompt = false; }
        | "exec-class"
                { evaluator.commandSetClass (""); }
        | "exec-class" WORD
                { evaluator.commandSetClass ($2); }
        | "exec-args" _run_args_mode
                { evaluator.commandSetArgs (new CommandLineSpec ()); }
        | "exec-args" _run_args_mode { $$ = new CommandLineSpec (); } run_args
                { evaluator.commandSetArgs ($<CommandLineSpec>3); }
        | "backtrace" WORD _check_connect
                { evaluator.commandWhere ($2, false); }
        | "backtrace" _check_connect
                { evaluator.commandWhere (null, false); }
        | "backtrace" "all" _check_connect
                { evaluator.commandWhereAll (false); }
        | "wherei" INTLIT _check_connect
                { evaluator.commandWhere ($2, true); }
        | "wherei" _check_connect 
                { evaluator.commandWhere (null, true); }
        | "wherei" "all" _check_connect
                { evaluator.commandWhereAll (true); }
        | "up" intlit_dflt1 _check_connect
                { evaluator.commandUp ($2); }
        | "down" intlit_dflt1 _check_connect
                { evaluator.commandUp (-$2); }
        | "frame" intlit _check_connect
                { evaluator.commandFrame ($2); }
        | "save" _check_connect
                { evaluator.commandSave (); 
                  showPrompt = false; }
        | "save" _check_connect WORD expr
                {  evaluator.commandSave ($3, $4);
                   showPrompt = false; }
        | "ptype" expr
                { evaluator.commandPtype ($2); }
        | "dumpall" _print_mode expr
                { evaluator.commandPrint ($3, evaluator.EXAMINE, ' ', true);
                  showPrompt = false; }
        | "dumpall" _print_mode '/' WORD expr
                { evaluator.commandPrint ($5, printDepth ($4), 
                                          printFormat ($4), true);
                  showPrompt = false; }
        | "dumpall" _print_mode '/' intlit expr
                { evaluator.commandPrint ($5, $4, ' ', true);
                  showPrompt = false; }
        | "set" "print" "compressed"
                { evaluator.commandSet ("print", "compressed", 0); }
        | "set" "print" "pretty" 
                { evaluator.commandSet ("print", "pretty", 0); }
        | "set" "print" "elements" intlit
                { evaluator.commandSet ("print", "elements", $4); }
        | "set" "print" "max-frames" intlit
                { evaluator.commandSet ("print", "max-frames", $4); }
        | "set" "print" "return" "on"
                { evaluator.commandSet ("print", "return", 1); }
        | "set" "print" "return" "off"
                { evaluator.commandSet ("print", "return", 0); }
        | "set" "print" "prefix" "standard"
                { evaluator.commandSet ("print", "prefix", 0); }
        | "set" "print" "prefix" "exprs"
                { evaluator.commandSet ("print", "prefix", 1); }
        | "set" "print" "prefix" "both"
                { evaluator.commandSet ("print", "prefix", 2); }
        | "set" "stdin" "on"
                { evaluator.commandSet ("stdin", "on", 0); }
        | "set" "stdin" "off"
                { evaluator.commandSet ("stdin", "off", 0); }
        | "set" "variable" expr
                { evaluator.commandPrint ($3, evaluator.PRINT, ' ', false); }
        | "set" "history" intlit
                { evaluator.commandSet ("history", "save", $3); }
        | "set" WORD _collect_all_mode TEXT
                { evaluator.commandPrint ($2 + " " + $4,
                                          evaluator.PRINT, ' ', false); }
        | "thread" thread_id _check_connect
                { evaluator.commandThread ($2); }
        | "threadgroup" WORD _check_connect
                { evaluator.commandThreadGroup ($2); }
        | "^F" _collect_all_mode
                { evaluator.commandSuspend (); }
        | "^F" _collect_all_mode TEXT
                { evaluator.commandSuspend (); }
        | "suspend" _check_connect
                { evaluator.commandSuspend (); }
        | "suspend" thread_id_list _check_connect
                { evaluator.commandSuspend ($2); }
        | "resume" _check_connect
                { evaluator.commandResume (); }
        | "resume" thread_id_list _check_connect
                { evaluator.commandResume ($2); }
        | "kill" thread_id expr
                { evaluator.commandKill ($2, $3); }
        | "interrupt" _check_connect
                { evaluator.commandInterrupt (); }
        | "interrupt" thread_id _check_connect
                { evaluator.commandInterrupt ($2); }
        | "break" _break_mode
                { evaluator.commandBreak (); }
        | "break" _break_mode breakpoint_spec 
                { evaluator.commandBreak ($3); }
        | "clear" _break_mode delete_breakpoint_spec_list 
                { evaluator.commandClear ($3); }
        | "command" 
                { evaluator.commandCommand (reader, false); }
        | "command" intlit
                { evaluator.commandCommand ($2, reader, false); }
        | "condition" '(' _balanced_collect_mode TEXT ')'
                { evaluator.commandCond ($4); }
        | "condition" intlit _balanced_collect_mode TEXT 
                { evaluator.commandCond ($2, $4); }
        | "catch" _break_mode
                { evaluator.commandCatch (); }
        | "catch" _break_mode exception_spec
                { evaluator.commandCatch ($3); }
        | "pass" _break_mode
                { evaluator.commandPass (); }
        | "pass" _break_mode exception_spec
                { evaluator.commandPass ($3); }
        | "watch" watchpoint_spec
                { evaluator.commandWatch ($2); }
        | "unwatch" _break_mode
                { evaluator.commandUnwatch (); }
        | "unwatch" watchpoint_spec
                { evaluator.commandUnwatch ($2); }
        | "delete" 
                { evaluator.commandDelete (); }
        | "delete" int_list
                { evaluator.commandDelete ($2); }
        | "disable" intlit
                { evaluator.commandEnable ($2, false); }
        | "enable" intlit
                { evaluator.commandEnable ($2, true); }
        | "ignore" intlit intlit
                { evaluator.commandIgnore ($2, $3); }
        | "trace" _check_connect suspend_policy "methods" 
                { evaluator.commandTrace ($3, null); }
        | "trace" _check_connect suspend_policy "methods" thread_id
                { evaluator.commandTrace ($3, $5); }
        | "untrace" _check_connect "methods"
                { evaluator.commandUntrace (); }
        | "step" _check_connect "up"
                { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_OUT, 1); }
        | "step" _check_connect intlit_dflt1
                { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_INTO, $3); }
        | "finish" _check_connect
                { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_OUT, 1); }
        | "next" _check_connect intlit_dflt1
                { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_OVER, $3); }
        | "stepi" _check_connect intlit_dflt1                           
                { evaluator.commandStep (StepRequest.STEP_MIN, 
                                         StepRequest.STEP_INTO, $3); }
        | "continue" _check_connect
                { evaluator.commandCont (); }
        | "exclude" 
                { evaluator.commandExclude (); }
        | "exclude" _break_mode "none"
                { evaluator.commandExcludeClear (); }
        | "exclude" _break_mode "reset"
                { evaluator.commandExcludeReset (); }
        | "exclude" _break_mode '+' exclude_class_id_list
                { evaluator.commandExcludeAdd ($4); }
        | "exclude" _break_mode exclude_class_id_list
                { evaluator.commandExcludeSet ($3); }
        | "lock" _check_connect expr
                { evaluator.commandLock ($3); 
                  showPrompt = false; }
        | "disablegc" _check_connect expr
                { evaluator.commandEnableGC ($3, false); 
                  showPrompt = false; }
        | "enablegc" _check_connect expr
                { evaluator.commandEnableGC ($3, true); 
                  showPrompt = false; }
        | "info" "locals" _check_connect
                { evaluator.commandLocals (); }
        | "info" "classes"
                { evaluator.commandClasses (); }
        | "info" "class" _break_mode _check_connect class_id _default_mode
                { evaluator.commandClass ($5, false); }
        | "info" "class" _break_mode _check_connect class_id _default_mode "all"
                { evaluator.commandClass ($5, true); }
        | "info" "methods" _break_mode class_id
                { evaluator.commandMethods ($4); }
        | "info" "fields" _break_mode class_id
                { evaluator.commandFields ($4); }
        | "info" "threads" _check_connect
                { evaluator.commandThreads (); }
        | "info" "threads" _check_connect WORD
                { evaluator.commandThreads ($4); }
        | "info" "threadgroups" _check_connect
                { evaluator.commandThreadGroups (); }
        | "info" "classpath" _check_connect
                { evaluator.commandClasspathInfo (); }
        | "info" "threadlocks" _check_connect
                { evaluator.commandThreadlocks (); }
        | "info" "threadlocks" _check_connect "all"
                { evaluator.commandThreadlocksAll (); }
        | "info" "threadlocks" _check_connect thread_id
                { evaluator.commandThreadlocks ($4); }
        | "info" "run"
                { evaluator.commandInfoRun (); }
        | "info" "break"
                { evaluator.listEventSpecs (BreakpointSpec.EXMPL); }
        | "info" "watch" 
                { evaluator.listEventSpecs (WatchpointSpec.EXMPL); }
        | "info" "catch" 
                { evaluator.listEventSpecs (ExceptionSpec.EXMPL); }
        | "info" "stack" WORD _check_connect
                { evaluator.commandWhere ($3, false); }
        | "info" "stack" _check_connect
                { evaluator.commandWhere (null, false); }
        | "info" "stack" "all" _check_connect
                { evaluator.commandWhereAll (false); }
        | "loadclass" _break_mode _check_connect class_id
                { evaluator.commandLoadclass ($4); }
        | "classpath" _run_args_mode
                { evaluator.commandClasspath (); }
        | "classpath" _run_args_mode WORD
                { evaluator.commandClasspath ($3); }
        | "sourcepath" _run_args_mode
                { evaluator.commandUse (); }
        | "sourcepath" _run_args_mode WORD
                { evaluator.commandUse ($3); }
        | "monitor" _balanced_collect_mode
                { evaluator.commandMonitor (); }
        | "monitor" _balanced_collect_mode TEXT
                { evaluator.commandMonitor ($3); }
        | "unmonitor" intlit 
                { evaluator.commandUnmonitor ($2); }
        | "source" _run_args_mode WORD
                { evaluator.commandRead ($3); }
        | "list" _break_mode
                { evaluator.commandList (-1, null); }
        | "list" intlit
                { evaluator.commandList ($2, null); }
        | "list" WORD
                { evaluator.commandList (-1, $2); }
        | "lines" _break_mode class_id 
                { evaluator.commandLines ($3, null); }
        | "lines" _break_mode class_id IDENT
                { evaluator.commandLines ($3, $4); }
        | "bytecodes" _break_mode _check_connect class_id IDENT
                { evaluator.commandBytecodes ($4, $5); }
        | "bytecodes" _break_mode _check_connect class_id '.' IDENT
                { evaluator.commandBytecodes ($4, $6); }
        | "version"
                { evaluator.commandVersion (GJDB.progname, Version.value); }
        | "quit"
                { evaluator.commandQuit (); }
        | "help"
                { GJDB.help (); }
        | "help" WORD
                { GJDB.help ($2); }
        | intlit _collect_all_mode TEXT
                { evaluator.commandRepeat ($1, $3, reader); }
        ;

intlit:
          INTLIT        { $$ = convertInt ($1); }

intlit_dflt1:
          /* EMPTY */   { $$ = 1; }
        | INTLIT        { $$ = convertInt ($1); }
        ;

intlit_dflt_m1:
          /* EMPTY */   { $$ = -1; }
        | INTLIT        { $$ = convertInt ($1); }
        ;

int_list:
          intlit        { ArrayList<Integer> L = new ArrayList<Integer> (); 
                          $$ = L; L.add ($1); }
        | int_list intlit 
                        { $$ = $1; $1.add ($2); }
        ;

thread_id:
          IDENT
        | INTLIT
        ;

thread_id_list:
          thread_id     { ArrayList<String> v = new ArrayList<String> ();
                          v.add ($1); 
                          $$ = v; }
        | thread_id_list thread_id
                        { $$ = $1; $1.add ($2); }
        ;

address:  intlit
        ;

address_opt:
          intlit_dflt_m1
        ;

/* Assumes $0 is a CommandLineSpec accumulating results. */
run_args:
          file_specs
        | WORD
                        { CommandLineSpec spec = $<CommandLineSpec>0;
                          spec.cmdArgs += " " + shellConvert ($1); 
                          $$ = spec; }
        | WORD _copy_two_back run_args
                        { CommandLineSpec spec = $<CommandLineSpec>2;
                          spec.cmdArgs = " " + shellConvert ($1) 
                                         + spec.cmdArgs; 
                          $$ = spec; }
        ;

/* Assumes $0 is a CommandLineSpec accumulating results. */
file_specs:
          file_spec             { $$ = $<CommandLineSpec>0; }
        | file_specs file_spec  { $$ = $1; }
        ;

/* Assumes $0 is a CommandLineSpec accumulating results. */
file_spec:
          '<' WORD
                        { CommandLineSpec spec = $<CommandLineSpec>0;
                          if (spec.inFile != null)
                              throw ERROR ("Ambiguous input redirection");
                          spec.inFile = shellConvert ($2);
                        }
        | '>' WORD
                        { CommandLineSpec spec = $<CommandLineSpec>0;
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = shellConvert ($2);
                        }
        | '>' '&' WORD
                        { CommandLineSpec spec = $<CommandLineSpec>0;
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = spec.errFile = shellConvert ($3);
                        }
        ;

connector_args:
          /* EMPTY */   { $$ = ""; }
        | WORD
        ;

formal_types_opt:
          /* EMPTY */   { $$ = null; }
        | '(' formal_types ')'
                        { $$ = $2; }
        | '(' ')'       { $$ = Collections.EMPTY_LIST; }
        ;

formal_types:
          formal_type   { ArrayList<String> L = new ArrayList<String> (); 
                          $$ = L;
                          L.add ($1); }
        | formal_types ',' formal_type
                        { $$ = $1; $1.add ($3); }
        ;

formal_type:
          class_id
        | formal_type "[]"  { $$ = $1 + "[]"; }
        ;

class_id:
          IDENT
        | class_id '.' IDENT    { $$ = $1 + "." + $3; }
        ;

breakpoint_spec:
          break_class_id '.' IDENT formal_types_opt if_clause_opt
             { $$ = createBreakpointSpec ($1, $3, $4, $5); }
        | break_class_id ':' intlit if_clause_opt
             { $$ = createBreakpointSpec ($1, $3, $4); }
        ;

delete_breakpoint_spec_list:
          delete_breakpoint_spec 
             { ArrayList<Object> L = new ArrayList<Object> ();
               $$ = L; 
               L.add ($1); }
        | delete_breakpoint_spec_list delete_breakpoint_spec
             { $$ = $1; $1.add ($2); }
        ;

delete_breakpoint_spec:
          intlit                { $$ = createBreakpointSpec ($1); }
        | break_class_id '.'  IDENT formal_types_opt
             { $$ = createBreakpointSpec ($1, $3, $4, null); }
        | break_class_id ':' intlit 
             { $$ = createBreakpointSpec ($1, $3, null); }
        ;

break_class_id:
          '*' '.' IDENT         { $$ = "*." + $3; }
        | IDENT 
        | break_class_id '.' IDENT 
                                { if ($1.endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  $$ = $1 + "." + $3; }
        | break_class_id ".0" 
                                { if ($1.endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  $$ = $1 + ".0"; }
        ;

exclude_class_id_list:
          id_pattern
                        { ArrayList<String> L = new ArrayList<String> ();
                          L.add ($1); 
                          $$ = L;
                        }
        | exclude_class_id_list opt_sep id_pattern 
                        { $$ = $1; $1.add ($3); }
        ;

opt_sep:
          /* EMPTY */
        | ','
        | ';'
        ;

id_pattern:
          IDENT
        | '*'                   { $$ = "*"; }
        | id_pattern '.' IDENT  { $$ = $1 + "." + $3; }
        | id_pattern '.' '*'    { $$ = $1 + ".*"; }
        ;

exception_spec:
          '*' '.' class_id      { $$ = createExceptionSpec ("*." + $3); }
        | class_id              { $$ = createExceptionSpec ($1); }
        ;

if_clause_opt:
          /* EMPTY */           { $$ = null; }
        | "if" _balanced_collect_mode TEXT
                                { $$ = $3; }
        ;

watchpoint_spec:
          _break_mode suspend_policy watch_type class_id '.' IDENT
                        { $$ = createWatchSpec ($2, $3, $4, null, $6); }
        | _break_mode suspend_policy watch_type '(' expr ')' 
                _break_mode '.' IDENT
                        { $$ = createWatchSpec ($2, $3, null, $5, $9); }
        ;

watch_type:
          /* EMPTY */           { $$ = ""; }
        | "all"                 { $$ = "all"; }
        | "access"              { $$ = "access"; }
        ;

suspend_policy:
          /* EMPTY */           { $$ = EventRequest.SUSPEND_ALL; }
        | "go"                  { $$ = EventRequest.SUSPEND_NONE; }
        | "thread"              { $$ = EventRequest.SUSPEND_EVENT_THREAD; }
        ;

expr:
          _balanced_collect_mode TEXT
                                { $$ = $2; }
        ;

_copy_two_back:
                          { $$ = $-1; }

        /* Mode setting commands (match the empty string) */

_default_mode:
                          { lexer.toDefaultMode (); }

_break_mode:
                          { lexer.toBreakMode (); }
        ;                       

_print_mode:
                          { lexer.toPrintMode (); }
        ;

_check_connect:
          /* EMPTY */     { evaluator.checkConnect (); }
        ;

_balanced_collect_mode:
          /* EMPTY */     { lexer.toBalancedCollectMode (); }
        ;

_collect_all_mode:
          /* EMPTY */     { lexer.toCollectMode (); }
        ;

_run_args_mode:
          /* EMPTY */     { lexer.toRunArgsMode (); }
        ;

%%

private Commands evaluator;
private boolean showPrompt;
private BufferedReader reader;
private static final HashMap<String, Integer> tokenMap =
        new HashMap<String, Integer> ();

static void execute (String src, Commands evaluator, BufferedReader reader,
                     boolean prompt) 
{
    execute (src, evaluator, reader, prompt, false);
}

static void execute (String src, Commands evaluator, BufferedReader reader,
                     boolean prompt, boolean passException)
{
    CommandParser parser = new CommandParser (new CommandLexer (src));

    try {
        try {
            parser.reader = reader;
            parser.evaluator = evaluator;
            parser.showPrompt = prompt;
            parser.parse ();
        } catch (UnsupportedOperationException uoe) {
            throw ERROR ("Command is not supported on the target VM");
        } catch (VMNotConnectedException vmnse) {
            throw ERROR ("Command is not valid until the program is started or attached");
        } catch (CommandException e) {
            throw e;
        } catch (VMDisconnectedException e) {
            Env.shutdown (null);
            throw ERROR ("Debugged process has disconnected.");
        } catch (Exception e) {
            throw ERROR ("Unknown error in command: %s", e);
        }
    } catch (CommandException e) {
        if (passException) 
            throw e;
        Env.errorln ("%s", e.getMessage ());
    }
            
    if (parser.showPrompt)
        evaluator.printPrompt ();   
}

private CommandParser (CommandLexer lexer) {
    this.lexer = lexer;
    lexer.parser = this;
}

private CommandLexer lexer;

private int convertInt (String s) {
    try {
        return Integer.decode (s);
    } catch (NumberFormatException e) {
        throw ERROR ("badly formed integer numeral");
    }
}

static final private Pattern PRINT_OPTIONS_PATN 
  = Pattern.compile ("(?i)([xodbcsr]?)(\\d*)([xodbcsr]?)$");

private void startHandler () {
    evaluator.startHandler ();
}       

private int printDepth (String spec) {
    Matcher m = PRINT_OPTIONS_PATN.matcher (spec);
    if (m.matches ()) {
        if (m.group (2).equals (""))
            return 0;
        else 
            return Integer.parseInt (m.group (2));
    } else
        throw ERROR ("bad print format or depth specifier");
}

private char printFormat (String spec) {
    Matcher m = PRINT_OPTIONS_PATN.matcher (spec);
    if (m.matches () && m.group (1).length () + m.group (3).length () < 2) {
        if (m.group (1).equals ("") && m.group (3).equals (""))
            return ' ';
        else 
            return (m.group (1) + m.group (3)).charAt (0);
    } else
        throw ERROR ("bad print format or depth specifier");
}



private BreakpointSpec createBreakpointSpec(int number)
{
    BreakpointSpec breakpoint = 
        (BreakpointSpec) EventRequestSpec.idToSpec 
            (Env.eventRequestSpecs (BreakpointSpec.EXMPL), number);
    if (breakpoint == null)
        throw ERROR ("No such breakpoint: %d", number);
    return breakpoint;
}


private BreakpointSpec createBreakpointSpec(String breakClass, 
                                            int lineNum,
                                            String cond)
{
    try { 
        BreakpointSpec breakpoint = (BreakpointSpec)
            Env.specList.createBreakpoint(breakClass, lineNum);
        breakpoint.setCondition (cond);
        return breakpoint;
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", breakClass);
    }
}

private BreakpointSpec createBreakpointSpec(String breakClass, 
                                            String method,
                                            List<String> formals,
                                            String cond)
{
    try {
        BreakpointSpec spec = 
                (BreakpointSpec) Env.specList.createBreakpoint(breakClass, 
                                                               method, formals);
        spec.setCondition (cond);
        return spec;
    } catch (BadMemberNameException exc) {
        throw ERROR ("Bad method name: %s", method);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", breakClass);
    }
}

private EventRequestSpec createExceptionSpec (String className) {
    try {
        return Env.specList.createExceptionCatch(className);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", className);
    }
}

private List<EventRequestSpec> createWatchSpec (int policy, String type, 
                                                String classId, String expr,
                                                String fld) 
{
    ArrayList<EventRequestSpec> specs = new ArrayList<EventRequestSpec> ();
    boolean access = !type.equals (""); 
    boolean modification = !type.equals ("access");
    ObjectReference obj;

    if (expr == null) {
        obj = null;
    } else {
        Value val = evaluator.evaluate (expr);
        if (val instanceof ObjectReference)
           obj = (ObjectReference) val;
        else
           throw ERROR ("Value of (%s) is not object an object reference.",
                        expr);
    }

    try {
        
        if (access) {
            EventRequestSpec spec = 
                Env.specList.createAccessWatchpoint(classId, fld, obj);
            spec.suspendPolicy = policy;
            specs.add (spec);
        }
        if (modification) {
            EventRequestSpec spec = 
                Env.specList.createModificationWatchpoint(classId, fld, obj);
            spec.suspendPolicy = policy;
            specs.add(spec);
        }
    } catch (BadMemberNameException exc) {
        throw ERROR ("Bad field name: %s", fld);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", classId);
    }

    return specs;
}

private int yylex () {
    try {
       int v = lexer.scan ();
       yylval = lexer.lexeme;
       return v;
    } catch (CommandException e) {
       throw e;
    } catch (Exception e) {
       throw ERROR ("problem reading expression: %s", e);
    }
}

private void yyerror (int ignored0, String ignored1) {
    if (lexer.lastCommand == null)
        throw ERROR ("Unknown command.");
    List<String> usage = GJDB.commandUsageMsgs (lexer.lastCommand);
    if (usage.size () == 0)
        throw ERROR ("Syntax error in command.");
    Formatter result = new Formatter ();
    String format;
    format = "Usage: %s";
    for (String S : usage) {
        result.format (format, S);
        format = "%n       %s";
    }
    throw ERROR ("%s", result);
}

static int findQuotedToken (String s) {
    Integer i = tokenMap.get (s);
    return i == null ? 0 : i;
}

static String tildeConvert (String s) {
    if (s.equals ("~"))
        return System.getProperty ("user.home");
    try {
        Process p = Runtime.getRuntime ().exec (new String[] {
            System.getenv ("SHELL"), "-c", "echo " + s });
        StringBuilder r = new StringBuilder ();
        while (true) {
            int c = p.getInputStream ().read ();
            if (c == '\n' || c == -1)
                break;
            r.append ((char) c);
        }
        p.destroy ();
        return r.toString ();
    } catch (IOException e) {
        return s;
    }
}

static String shellConvert (String s) {
    if (s.startsWith ("~")) {
        int sl = s.indexOf (System.getProperty ("file.separator"));
        if (sl < 0)
            sl = s.length ();
        return tildeConvert (s.substring (0, sl)) + s.substring (sl);
    } else
        return s;
}

static {
    for (int i = 0; i < yytname.length; i += 1) {
        if (yytname[i] instanceof String) {
            String token = (String) yytname[i];
            if (token.startsWith ("\""))
                tokenMap.put (token.substring (1, token.length () - 1),
                              yytoknum[i]);
        }
    }
}
