/* -*-Fundamental-*- */

/* Copyright (c) 2007, by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

%token<String> BOOLEAN "boolean"
%token<String> BYTE "byte"
%token<String> CHAR "char"
%token<String> DOUBLE "double"
%token<String> FLOAT "float"
%token<String> INT "int"
%token<String> LONG "long"
%token<String> SHORT "short"

%token<String> FLOATLIT INTLIT CHARLIT STRINGLIT
%token<String> IDENT INTERNALVAR HISTORYVAR

%left '=' "+=" "-=" "*=" "/=" "%=" ">>=" ">>>=" "<<=" "&=" "|=" "^="
%left '?' ':'
%left "||"
%left "&&"
%left '|'
%left '^'
%left '&'
%left "==" "!="
%left "<=" '<' ">=" '>' "instanceof"
%left "<<" ">>" ">>>"
%left '+' '-'
%left '*' '/' '%' 
%left '~' '!'
%left POSTFIX "++" "--"
%left '.' ')'

%type<String> name primitive_type reference_type
%type<LValue> expr primary cast create unary unary_no_pm postfix
%type<LValue> array_initializer 
%type<Integer> dims 
%type<List> params expr_list dimensions dimensions_prefix


%header{
   package ucb.gjdb;

   import com.sun.jdi.*;

   import java.util.Stack;
   import java.util.Collections;
   import java.util.Stack;
   import java.util.List;
   import java.util.ArrayList;
   import java.util.HashMap;

   import static ucb.gjdb.CommandException.ERROR;

   class ExpressionParser
%}

%valuetype Object
%debug

%{
    #define BINOP(LFT,OP,RGHT) \
        ((eval) ? LValue.operation (vm, #OP, (LFT), (RGHT)) : null)
    #define BINOPF(LFT,OP,RGHT) \
	((eval) ? LValue.operation (vm, #OP, (LFT), (RGHT), framer) \
	        : null)
    #define ASSGN(LFT,OP,RGHT) \
	((eval) ? (LFT).doAssign (vm, #OP, (RGHT)) : null)
    #define BOOLOP(LFT,OP,RGHT) \
	((eval) ? LValue.booleanOperation (vm, #OP, (LFT), (RGHT)) : null)
    #define UNOP(OP,RGHT) \
	((eval) ? LValue.operation (vm, #OP, (RGHT)) : null)

%}

%%

start:
	  expr 			{ value = $1; }

expr: 
	  unary
	| cast
	| create
	| expr '*' expr		{ $$ = BINOP ($1, *, $3); }
	| expr '/' expr		{ $$ = BINOP ($1, /, $3); }
	| expr '%' expr		{ $$ = BINOP ($1, %, $3); }
	| expr '+' expr		{ $$ = BINOPF ($1, +, $3); }
	| expr '-' expr		{ $$ = BINOPF ($1, -, $3); }
	| expr "<<" expr	{ $$ = BINOP ($1, <<, $3); }
	| expr ">>" expr	{ $$ = BINOP ($1, >>, $3); }
	| expr ">>>" expr	{ $$ = BINOP ($1, >>>, $3); }
	| expr '<' expr		{ $$ = BOOLOP ($1, <, $3); }
	| expr '>' expr		{ $$ = BOOLOP ($1, >, $3); }
	| expr "<=" expr	{ $$ = BOOLOP ($1, <=, $3); }
	| expr ">=" expr	{ $$ = BOOLOP ($1, >=, $3); }
	| expr "==" expr	{ $$ = BOOLOP ($1, ==, $3); }
	| expr "!=" expr	{ $$ = BOOLOP ($1, !=, $3); }
	| expr '&' expr		{ $$ = BINOP ($1, &, $3); }
	| expr '|' expr		{ $$ = BINOP ($1, |, $3); }
	| expr '^' expr		{ $$ = BINOP ($1, ^, $3); }
	| expr '=' expr		{ $$ = ASSGN ($1, =, $3); }
	| expr "*=" expr	{ $$ = ASSGN ($1, *=, $3); }
	| expr "/=" expr	{ $$ = ASSGN ($1, /=, $3); }
	| expr "%=" expr	{ $$ = ASSGN ($1, %=, $3); }
	| expr "+=" expr	{ $$ = ASSGN ($1, +=, $3); }
	| expr "-=" expr	{ $$ = ASSGN ($1, -=, $3); }
	| expr "<<=" expr	{ $$ = ASSGN ($1, <<=, $3); }
	| expr ">>=" expr	{ $$ = ASSGN ($1, >>=, $3); }
	| expr ">>>=" expr	{ $$ = ASSGN ($1, >>>=, $3); }
	| expr "&=" expr	{ $$ = ASSGN ($1, &=, $3); }
	| expr "^=" expr	{ $$ = ASSGN ($1, ^=, $3); }
	| expr "|=" expr	{ $$ = ASSGN ($1, |=, $3); }
	| expr "instanceof" reference_type
				{ $$ = (eval) 
					? $1.instanceOf (vm, framer, $3)
					: null; }
	;

	/* Conditional evaluations */
expr:
	  expr "&&" 	{ pushEval ();
			  if (eval) {
			      Value cond1 = $1.interiorGetValue ();
			      if (! (cond1 instanceof BooleanValue))
				  throw ERROR ("non-boolean operand to &&");
			      eval = ((BooleanValue) cond1).booleanValue ();
			      $$ = eval;
			  }
			}
	  expr		{ popEval ();
			  if (eval) {
			      $$ = $1;
			      if ($<Boolean>3) {
				  Value cond2 = $4.interiorGetValue ();
				  if (! (cond2 instanceof BooleanValue))
				     throw ERROR ("non-boolean operand to &&");
				  $$ = $4;
			      }
			  }
			}
	| expr "||" 	{ pushEval ();
			  if (eval) {
			      Value cond1 = $1.interiorGetValue ();
			      if (! (cond1 instanceof BooleanValue))
				  throw ERROR ("non-boolean operand to ||");
			      eval = !((BooleanValue) cond1).booleanValue ();
			      $$ = !eval;
			  }
			}
	  expr		{ popEval ();
			  if (eval) {
			      $$ = $1;
			      if (! $<Boolean>3) {
				  Value cond2 = $4.interiorGetValue ();
				  if (! (cond2 instanceof BooleanValue))
				     throw ERROR ("non-boolean operand to ||");
				  $$ = $4;
			      }
			  }
			}
	| expr '?' 	{ pushEval ();
			  if (eval) {
			      Value cond = $1.interiorGetValue ();
			      if (! (cond instanceof BooleanValue))
				  throw ERROR ("non-boolean condition on ?:");
			      eval = ((BooleanValue) cond).booleanValue ();
			      $$ = eval;
			  }
			}
	  expr ':' 	{ popEval ();
			  pushEval ();
			  if (eval)
			      eval = ! $<Boolean>3;
			} 
	  expr		{ popEval ();
			  if (eval)
			      $$ = $<Boolean>3 ? $4 : $7;
			}
	;

primary:
	  name		%prec POSTFIX
			{ if (eval)
			      $$ = LValue.makeName (vm, framer, $1); }
	| FLOATLIT	{ if (eval)
			      $$ = LValue.makeFloat (vm, $1); }
	| INTLIT	{ if (eval)
			      $$ = LValue.makeInteger (vm, $1); }
	| CHARLIT	{ if (eval)
			      $$ = LValue.makeCharacter (vm, $1); }
	| STRINGLIT     { if (eval)
			      $$ = LValue.makeString (vm, $1); }
	| '(' expr ')'	{ $$ = $2; }
	| "this"	{ if (eval)
			      $$ = LValue.makeThisObject (vm, framer,
						          "this"); }
	| "super" '.' IDENT 
			{ if (eval)
			      $$ = LValue.makeThisObject (vm, framer, 
							  "super")
					.superLValue (framer, $3); }
	| "true"	{ if (eval) 
			      $$ = LValue.makeBoolean (vm, "true"); }
	| "false"	{ if (eval) 
			      $$ = LValue.makeBoolean (vm, "false"); }
	| "null"	{ if (eval)
			      $$ = LValue.makeNull (vm, "null"); }
	
	;

primary:
	  INTERNALVAR   { if (eval) {
			      Value val = Env.connection ()
			          .retrieveHistory ($1.substring (1));
			      $$ = LValue.makeConstant (val);
			   }
			}
	| HISTORYVAR    { if (eval) {
	  		      Value val = Env.connection ()
			          .retrieveHistory (Integer.parseInt ($1.substring (1)));
			      $$ = LValue.makeConstant (val);
			   }
			}
	;

name:
	  IDENT
	| name '.' IDENT { $$ = $1 + "." + $3; }
	;

postfix:
	  primary  
	| postfix "++"	
		{ if (eval) {
		      $$ = LValue.makeConstant ($1.interiorGetValue ());
		      doIncr ($1, 1);
		  }
			}
	| postfix "--"	
		{ if (eval) {
		      $$ = LValue.makeConstant ($1.interiorGetValue ());
		      doIncr ($1, -1);
		  }
		}
	| postfix '[' expr ']' %prec POSTFIX
		{ if (eval)
		      $$ = $1.arrayElementLValue ($3); }
	/* postfix : primary and primary : name already take care of the
	 * case where postfix is just a name.  Precedence resolves the 
	 * the ambiguity in favor of extending a name as much as possible.
	 * This production is for other cases, such as A[0].foo. */
	| postfix '.' IDENT 
		{ if (eval) 
		      $$ = $1.memberLValue (framer, $3); }
	| postfix '.' IDENT params
		{ if (eval) {
		      LValue v = $1.memberLValue (framer, $3);
		      $$ = v;
		      v.invokeWith ($4);
		  }
		}
	| IDENT params  
		{ if (eval) {
		      LValue v = LValue.makeName (vm, framer, $1);
		      v.invokeWith ($2);
		      $$ = v;
		  }
		}

	/*  "Bridge" productions, to allow delaying reduction of 
	 *  name->primary.  Without these, expressions such as
	 *  ( x.y ) or  x.y () would "get stuck".  */
	| name '.' IDENT params
		{ if (eval) {
		      LValue v = LValue.makeName (vm, framer,
					          $1 + "." + $3);
		      v.invokeWith ($4);
		      $$ = v;
		   }
		}
	| '(' name ')'
		{ if (eval)
		     $$ = LValue.makeName (vm, framer, $2); }
	;

unary:
	  unary_no_pm
	| '+' unary_no_pm	{ $$ = UNOP (+, $2); }
	| '-' unary_no_pm	{ $$ = UNOP (-, $2); }
	;

unary_no_pm:
	  postfix
	| "++" postfix	{ $$ = eval ? doIncr ($2, 1) : null; }
	| "--" postfix  { $$ = eval ? doIncr ($2, -1) : null; }
	| '~' unary	{ $$ = UNOP (~, $2); }
	| '!' unary	{ $$ = UNOP (!, $2); }
	;

cast:
	  '(' primitive_type ')' unary	
				{ $$ = eval 
					? LValue.castPrimitive (vm, $2, $4)
					: null; }
	/* We don't bother doing anything for the rest of these, since the
	 * debugger relies on dynamic type information.  This means that
	 * certain errors don't occur when they should, as in
	 *     print (Integer) "Hello"
	 * but who cares, really? */
	| '(' primitive_type dims')' unary
					{ $$ = $4; }
	| '(' name dims ')' unary	{ $$ = $5; }
	| '(' name ')' unary_no_pm 	{ $$ = $4; }
	;

dims: 
	  dims "[]"	{ $$ = $1 + 1; }
	| "[]"		{ $$ = 1; }
	;

primitive_type:
	  "int"
	| "long"
	| "char"
	| "short"
	| "byte"
	| "boolean"
	| "float"
	| "double"
	;

create:
	  "new" primitive_type dimensions
			{ $$ = eval 
				? LValue.makeArray (vm, $2, framer, $3)
			        : null; }
	| "new" primitive_type dims 
			{ startArrayInitializer ($2, $3); }
		array_initializer
			{ $$ = finishArray (); }
	| "new" name params
			{ $$ = eval
			       ? LValue.makeNewObject (vm, framer, $2, $3)
			       : null; }
	| "new" name dimensions
			{ $$ = eval 
				? LValue.makeArray (vm, $2, framer, $3)
			        : null; }
	| "new" name dims 
			{ startArrayInitializer ($2, $3); }
		array_initializer
			{ $$ = finishArray (); }
	;

dimensions:
	  dimensions_prefix 
	| dimensions "[]"      { if (eval) {
				     $$ = $1; $1.add (null); 
				  }
				}
	;

dimensions_prefix:
	  '[' expr ']'		{ if (eval) {
				     ArrayList<Value> v =
					new ArrayList<Value> ();
				     v.add ($2.interiorGetValue ());
				     $$ = v;
				  }
				}
	| dimensions_prefix '[' expr ']'
				{ if (eval) {
				     $1.add ($3.interiorGetValue ());
				     $$ = $1;
				  }
				}				     
	;

array_initializer:
	  '{' '}'		{ }
	| '{' ',' '}'		{ }
	| '{' array_items '}'	{ }
	| '{' array_items ',' '}'
				{ }
	;

array_items:
	  expr 		{ addInitializer ($1); }
	| 		{ startArrayInitializer (); }
	  array_initializer
	| array_items ',' expr	{ addInitializer ($3); }
	| array_items ',' 	{ startArrayInitializer (); }
	  array_initializer
	;

params:
	  '(' expr_list ')'	{ $$ = $2; }
	| '(' ')'		{ $$ = Collections.EMPTY_LIST; }
	;

expr_list:
	  expr			{ if (eval) {
				     ArrayList<Value> v = 
					new ArrayList<Value> (); 
			             v.add ($1.interiorGetValue ()); 
				     $$ = v;
				  }
				}
	| expr_list ',' expr	{ if (eval) {
				      $1.add ($3.interiorGetValue ());
				      $$ = $1; 
				  }
				}
	;

reference_type:
	  primitive_type dims      { $$ = LValue.JVM_typeName ($1, $2); }
	| name 			   { $$ = $1; }
	| name dims		   { $$ = LValue.JVM_typeName ($1, $2); }

%%

private static final HashMap<String, Integer> tokenMap = 
	new HashMap<String, Integer> ();

static Value evaluate (String src, VirtualMachine vm, GetFrame framer,
		       String[] uncommentedSrc) 
    throws InvocationException, InvalidTypeException, 
	   IncompatibleThreadStateException, ClassNotLoadedException
{
    if (vm == null)
	throw ERROR ("Expression evaluation requires a running program.");
    ExpressionParser parser = 
	new ExpressionParser (new ExpressionLexer (src), vm, framer);
    parser.parse ();
    EventHandler.setEnables (false);
    Value val;
    try {
	val = parser.value.getValue ();
	if (uncommentedSrc != null)
	    uncommentedSrc[0] = parser.lexer.uncommentedSource ();
    } finally {
	EventHandler.setEnables (true);
    }
    return val;
}

static Value evaluate (String src, VirtualMachine vm, GetFrame framer)
    throws InvocationException, InvalidTypeException, 
	   IncompatibleThreadStateException, ClassNotLoadedException
{
    return evaluate (src, vm, framer, null);
}

private ExpressionParser (ExpressionLexer lexer, VirtualMachine vm,
			  GetFrame framer) {
    eval = true;	
    this.lexer = lexer;
    this.vm = vm;
    this.framer = framer;
    this.value = null;
}


private Stack<Boolean> evalState = new Stack<Boolean> ();
private boolean eval;
LValue value;
private ExpressionLexer lexer;
private VirtualMachine vm;
private GetFrame framer;

private void pushEval () {
    evalState.push (eval);
}

private void popEval () {
    eval = evalState.pop ();
}

private LValue doIncr (LValue var, int n) {
    return var.doAssign (vm, "+=", LValue.make (vm, n));
}

private static class ArrayInitializer {
    int dims;
    String eltType;
    ArrayList<LValue> elts = new ArrayList<LValue> ();
}

private Stack<ArrayInitializer> arrayInits = new Stack<ArrayInitializer>();

private void startArrayInitializer (String eltType, int dims) {
    ArrayInitializer v = new ArrayInitializer ();
    v.eltType = eltType; v.dims = dims;
    arrayInits.push (v);
}

private void startArrayInitializer () {
    startArrayInitializer (arrayInits.peek ().eltType, 
			   arrayInits.peek ().dims - 1);
}

private void addInitializer (LValue x) {
    arrayInits.peek ().elts.add (x);
}

private LValue finishArray () {
    ArrayInitializer I = arrayInits.pop ();
    if (eval) {
	ArrayReference val = 
	    LValue.makeSimpleArray (vm, I.eltType, framer, I.dims,
				    I.elts.size ());
	for (int i = 0; i < I.elts.size (); i += 1) {
	    try {
		val.setValue (i, I.elts.get (i).interiorGetValue ());
	    } catch (Exception e) {
		throw ERROR ("Problem setting array element: " + e);
	    }
	}
	return LValue.makeConstant (val);
    } else
	return null;
}

private int yylex () {
    try {
       int v = lexer.yylex ();
       yylval = lexer.lexeme;
       return v;
    } catch (CommandException e) {
       throw e;
    } catch (Exception e) {
       throw ERROR ("problem reading expression: %s", e);
    }
}

private void yyerror (int dummy, String msg) {
    throw ERROR ("%s", msg);
}

static int findQuotedToken (String s) {
	Integer i = tokenMap.get (s);
	return i == null ? 0 : i;
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
