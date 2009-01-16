/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import java.util.*;
import java.util.regex.*;

import static ucb.gjdb.CommandException.ERROR;

abstract class LValue {

    abstract Value getValue() throws InvocationException, 
                                     IncompatibleThreadStateException,
                                     CommandException,
                                     ClassNotLoadedException;

    abstract void setValue0(Value value) 
        throws InvalidTypeException, 
               ClassNotLoadedException;

    abstract void invokeWith(List arguments);

    void setValue(Value value) {
        try {
            setValue0(value);
        } catch (InvalidTypeException exc) {
            throw ERROR("Attempt to set value of incorrect type: %s",
				  excpMessage (exc));
        } catch (ClassNotLoadedException exc) {
            throw ERROR("Attempt to set value before %s was loaded: %s",
				  exc.className(), exc);
        }
    }        

    void setValue(LValue lval) {
        setValue(lval.interiorGetValue());
    }

    LValue memberLValue(GetFrame frameGetter, 
                        String fieldName) {
        try {
            return memberLValue (fieldName, frameGetter.get().thread());
        } catch (IncompatibleThreadStateException exc) {
            throw ERROR("Thread not suspended");
        }
    }

    LValue memberLValue(String fieldName, ThreadReference thread) {
        Value val = interiorGetValue ();
        if (val instanceof ArrayReference && fieldName.equals("length"))
            return make(val.virtualMachine (), 
                        ((ArrayReference) val).length ());
        else 
            return new LValueInstanceMember(val, fieldName, thread);
    }

    /** Create an LValue representing super.FIELDNAME, in the context 
     *  established by FRAMEGETTER. */
    LValue superLValue (GetFrame frameGetter,
                        String fieldName) {
        try {
            return superLValue (fieldName, frameGetter.get().thread());
        } catch (IncompatibleThreadStateException exc) {
            throw ERROR("Thread not suspended");
        }
    }
    
    LValue superLValue(String fieldName, ThreadReference thread) {
        ObjectReference val = (ObjectReference) interiorGetValue ();
        ClassType superType = ((ClassType) val.referenceType()).superclass();
        return new LValueInstanceMember(superType, val, fieldName, thread);
    }

    Value interiorGetValue() {
        Value value;
        try {
            value = getValue();
        } catch (InvocationException e) {
            throw ERROR("Unable to complete expression. Exception %s thrown",
				  e.exception());
        } catch (IncompatibleThreadStateException itse) {
            throw ERROR("Unable to complete expression. Thread "
				  + "not suspended for method invoke");
        } catch (ClassNotLoadedException tnle) {
            throw ERROR("Unable to complete expression. Method argument "
                  + "type %s not yet loaded", tnle.className());
        }
        return value;
    }

    LValue arrayElementLValue(LValue lval) {
        Value indexValue = lval.interiorGetValue();
        int index;
        if ( (indexValue instanceof IntegerValue) ||
             (indexValue instanceof ShortValue) ||
             (indexValue instanceof ByteValue) ||
             (indexValue instanceof CharValue) ) {
            index = ((PrimitiveValue)indexValue).intValue();
        } else {
            throw ERROR("Array index must be a integer type");
        }
        return new LValueArrayElement(interiorGetValue(), index);
    }

    public String toString() {
		return toString (' ');
    }

    private static String formattedInt (long v, char format) {
        switch (format) {
        case 'x': case 'X':
            return "0x" + Long.toHexString (v);
        case 'o': case 'O':
            if (v == 0)
                return "0";
            else
                return "0" + Long.toOctalString (v);
        case 'b':
            return Long.toBinaryString (v) + "B";
		case 'c': case 's':
			return formattedChar ((char) v, 'c');
        default:
            return Long.toString (v);
        }
    }

	/** Printed version of S according to FORMAT.  A FORMAT of 's' indicates
	 *  a string literal, with quotes and escapes.  A FORMAT of 'r' indicates
	 *  a raw string, with no quotes and all characters rendered literally.
	 *  All other formats yield a raw, quoted string. */
	static String formattedString (String S, char format) {
		switch (format) {
		case 'r':
			return S;
		case 's': {
			StringBuilder R = new StringBuilder ("\"");
			for (int i = 0; i < S.length (); i += 1) {
				char c = S.charAt (i);
				switch (c) {
				case '\b':
					R.append ("\\n");
					break;
				case '\f':
					R.append ("\\f");
					break;
				case '\n':
					R.append ("\\n");
					break;
				case '\r':
					R.append ("\\r");
					break;
				case '\t':
					R.append ("\\t");
					break;
				case '"': case '\\': 
					R.append ("\\"); R.append (c);
					break;
				default:
					if (c >= ' ' && c <= '~')
						R.append (c);
					else if (c <= '\377')
						R.append (String.format ("\\%03o", (int) c));
					else
						R.append (String.format ("\\u%04x", (int) c));
					break;
				}
			}
			R.append ("\"");
			return R.toString ();
		}
		default:
			return "\"" + S + "\"";
		}
	}

	/** Printed version of C according to FORMAT.  A FORMAT of 's' or 'c'
	 *  indicates character literal, with quotes and escapes.  A FORMAT of 'r'
	 *  indicates a raw character, with no quotes, rendered literally.
	 *  All other formats yield a raw, quoted character literal. */
	static String formattedChar (char c, char format) {
		switch (format) {
		case 'r':
			return String.format ("%c", c);
		case 'x': case 'X': case 'o': case 'O': case 'b':
			return formattedInt (c, format);
		case 's': case 'c': {
			switch (c) {
			case '\b':
				return "'\\n'";
			case '\f':
				return "'\\f'";
			case '\n':
				return "'\\n'";
			case '\r':
				return "'\\r'";
			case '\t':
				return "'\\t'";
			case '\'': 
				return "'\\'";
			case '\\':
				return "'\\\\'";
			default:
				if (c >= ' ' && c <= '~')
					return String.format ("'%c'", c);
				else if (c <= '\377')
					return String.format ("'\\%03o'", (int) c);
				else
					return String.format ("\\u%04x", (int) c);
			}
		}
		default:
			return String.format ("'%c'", c);
		}
	}

    public static String toString (Value v, char format) {
        if (v == null)
            return "null";
        else if (v instanceof LongValue)
            return formattedInt (((PrimitiveValue) v).longValue (), 
                                 format);
        else if (v instanceof IntegerValue
                 || v instanceof ShortValue 
                 || v instanceof ByteValue)
            return formattedInt (((PrimitiveValue) v).intValue (), format);
		else if (v instanceof CharValue)
			return formattedChar (((PrimitiveValue) v).charValue (), format);
		else if (v instanceof StringReference)
			return formattedString (((StringReference) v).value (), format);
        else
            return v.toString ();
    }

    public String toString (char format) {
        try {
            return toString (interiorGetValue(), format);
        } catch (CommandException e) {
            return "<Exception>";
        }
    }

    static final int STATIC = 1;
    static final int INSTANCE = 2;

    static Field fieldByName(ReferenceType refType, String name, int kind) {
        Field field = refType.fieldByName(name);
        if (field != null
            && (kind & (field.isStatic() ? STATIC : INSTANCE)) == 0)
            field = null;
        return field;
    }

    static List methodsByName(ReferenceType refType, String name, int kind) {
        List list = refType.methodsByName(name);
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            Method method = (Method)iter.next();
            if ((kind & (method.isStatic() ? STATIC : INSTANCE)) == 0)
                iter.remove();
        }
        return list;
    }

    static List primitiveTypeNames = new ArrayList();
    static {
        primitiveTypeNames.add("boolean");
        primitiveTypeNames.add("byte");
        primitiveTypeNames.add("char");
        primitiveTypeNames.add("short");
        primitiveTypeNames.add("int");
        primitiveTypeNames.add("long");
        primitiveTypeNames.add("float");
        primitiveTypeNames.add("double");
    }

    static Value invokeMethod (ObjectReference obj, ThreadReference thread,
                               List overloads, List arguments, int options) 
        throws InvocationException, ClassNotLoadedException, 
               IncompatibleThreadStateException, CommandException {

        for (Iterator it = overloads.iterator (); it.hasNext (); ) {
            Method method = (Method) it.next ();
            try {
                return obj.invokeMethod (thread, method, arguments, options);
            } catch (InvalidTypeException e) { 
                /* Type mismatch */
            } catch (IllegalArgumentException e) {
                /* Wrong # of arguments */
            }
        }
        throw ERROR ("Arguments match no method");
    }

    static Value invokeMethod (ClassType type, ThreadReference thread,
                               List overloads, List arguments, int options) 
        throws InvocationException, ClassNotLoadedException, 
               IncompatibleThreadStateException, CommandException {

        for (Iterator it = overloads.iterator (); it.hasNext (); ) {
            Method method = (Method) it.next ();
            try {
                return type.invokeMethod (thread, method, arguments, options);
            } catch (InvalidTypeException e) {
                /* Type mismatch */
            } catch (IllegalArgumentException e) {
                /* Wrong # of arguments */
            }
        }
        throw ERROR ("Arguments match no method");
    }

    static ObjectReference newInstance (ClassType type, ThreadReference thread,
                                        List overloads, List arguments)
        throws InvocationException, ClassNotLoadedException, 
               IncompatibleThreadStateException, CommandException {
    
        for (Iterator it = overloads.iterator (); it.hasNext (); ) {
            Method method = (Method) it.next ();
            try {
                return type.newInstance (thread, method, arguments, 0);
            } catch (InvalidTypeException e) { }
        }
        throw ERROR ("Arguments match no constructor");
    }

    static boolean argumentsMatch(List argNames, List arguments) {
        if (argNames.size() != arguments.size()) {
            return false;
        }
        Iterator nameIter = argNames.iterator();
        Iterator valIter = arguments.iterator();
        while (nameIter.hasNext()) {
            String argTypeName = (String)nameIter.next();
            Value value = (Value)valIter.next();
            /*
             * For now we require exact match
             */
            if (value == null) {
                // Null values can be passed to any non-primitive argument
                if (primitiveTypeNames.contains(argTypeName)) {
                    return false;
                }
            } else if (!argTypeName.equals(value.type().name())) {
                return false;
            }
        }
        return true;
    }

    /** Value of local variable or parameter. */
    private static class LValueLocal extends LValue {
        final StackFrame frame;
        final LocalVariable var;

        LValueLocal(StackFrame frame, LocalVariable var) {
            this.frame = frame;
            this.var = var;
        }
        
        Value getValue() {
            return frame.getValue(var);
        }

        void setValue0(Value val) throws InvalidTypeException, 
                                         ClassNotLoadedException {
            frame.setValue(var, val);
        }

        void invokeWith(List arguments) {
            throw ERROR("%s is not a method", var.name());
        }
    }

    /** Member referenced via a reference value.  */
    private static class LValueInstanceMember extends LValue {
        final ObjectReference obj;
        final ThreadReference thread;
        final Field matchingField;
        final List overloads;
        final int options;
        List methodArguments = null;

        LValueInstanceMember(Value value, 
                             String memberName, 
                             ThreadReference thread) {
            if (!(value instanceof ObjectReference)) {
                throw ERROR("Cannot access field of primitive type: %s", value);
            }
            this.obj = (ObjectReference)value;
            this.thread = thread;
            this.options = 0;
            ReferenceType refType = obj.referenceType();
            /*
             * Can't tell yet whether this LValue will be accessed as a
             * field or method, so we keep track of all the possibilities
             */
            matchingField = LValue.fieldByName(refType, memberName, 
                                               INSTANCE | STATIC);
            overloads = LValue.methodsByName(refType, memberName,
                                             INSTANCE | STATIC);
            if ((matchingField == null) && overloads.size() == 0) {
                throw ERROR("No instance field or method with the name %s in %s",
					  memberName, refType.name());
            }
        }
        
        /** A member named MEMBERNAME of the object mirrored by VALUE that 
         *  is visible in the type REFTYPE, which should be a supertype of the
         *  type of object mirrored by VALUE, all evaluated in THREAD. */
        LValueInstanceMember(ClassType refType,
                             ObjectReference value, 
                             String memberName, 
                             ThreadReference thread) {
            this.obj = value;
            this.thread = thread;
            this.options = ObjectReference.INVOKE_NONVIRTUAL;
            /*
             * Can't tell yet whether this LValue will be accessed as a
             * field or method, so we keep track of all the possibilities
             */
            matchingField = LValue.fieldByName(refType, memberName, 
                                               INSTANCE | STATIC);
            overloads = LValue.methodsByName(refType, memberName,
                                             INSTANCE | STATIC);
            if ((matchingField == null) && overloads.size() == 0) {
                throw ERROR("No instance field or method with the name %s in %s",
					  memberName, refType.name());
            }
        }
        
        Value getValue() throws InvocationException, CommandException,
                                ClassNotLoadedException, IncompatibleThreadStateException {
            if (methodArguments == null) {
                return obj.getValue(matchingField);
            } else {
                return 
                    this.invokeMethod (obj, thread, overloads, methodArguments,
                                       options);
            }
        }

        void setValue0(Value val) throws InvalidTypeException,
                                         ClassNotLoadedException {
            if (methodArguments != null) {
                throw ERROR("Cannot assign to a method invocation");
            }
            obj.setValue(matchingField, val);
        }

        void invokeWith(List arguments) {
            if (methodArguments != null) {
                throw ERROR("Invalid consecutive invocations");
            }
            methodArguments = arguments;
        }
    }

    /** Value of static member referenced as CLASS.name */
    private static class LValueStaticMember extends LValue {
        final ReferenceType refType;
        final ThreadReference thread;
        final Field matchingField;
        final List overloads;
        List methodArguments = null;

        LValueStaticMember(ReferenceType refType, 
                           String memberName,
                           ThreadReference thread) {
            this.refType = refType;
            this.thread = thread;
            /*
             * Can't tell yet whether this LValue will be accessed as a
             * field or method, so we keep track of all the possibilities
             */
            matchingField = LValue.fieldByName(refType, memberName, STATIC);
            overloads = LValue.methodsByName(refType, memberName, STATIC);
            if ((matchingField == null) && overloads.size() == 0) {
                throw ERROR("No static field or method with the name %s in %s",
					  memberName, refType.name());
            }
        }
        
        Value getValue() throws InvocationException, CommandException,
                                ClassNotLoadedException, IncompatibleThreadStateException {
            if (methodArguments == null) {
                return refType.getValue(matchingField);
            } else if (refType instanceof ClassType) {
                ClassType clazz = (ClassType)refType;
                return this.invokeMethod(clazz, thread, overloads, 
                                         methodArguments, 0);
            } else {
                throw ERROR ("Cannot invoke static method on %s", refType.name());
            }
        }

        void setValue0(Value val) 
            throws InvalidTypeException, ClassNotLoadedException {
            if (methodArguments != null) {
                throw ERROR("Cannot assign to a method invocation");
            }
            if (!(refType instanceof ClassType)) {
                throw ERROR("Cannot set interface field: %s", refType);
            }
            ((ClassType)refType).setValue(matchingField, val);
        }

        void invokeWith(List arguments) {
            if (methodArguments != null) {
                throw ERROR("Invalid consecutive invocations");
            }
            methodArguments = arguments;
        }
    }

    /** Value of ARRAY[INDEX] */
    private static class LValueArrayElement extends LValue {
        final ArrayReference array;
        final int index;

        LValueArrayElement(Value value, int index) {
            if (!(value instanceof ArrayReference)) {
                throw ERROR("Must be array type: %s", value);
            }
            this.array = (ArrayReference)value;
            this.index = index;
        }
        
        Value getValue() {
            return array.getValue(index);
        }

        void setValue0(Value val) throws InvalidTypeException, 
                                         ClassNotLoadedException  {
            array.setValue(index, val);
        }

        void invokeWith(List arguments) {
            throw ERROR("Array element is not a method");
        }
    }

    /** LValue formed from Value. */
    private static class LValueConstant extends LValue {
        final Value value;

        LValueConstant(Value value) {
            this.value = value;
        }
        
        Value getValue() {
            return value;
        }

        void setValue0(Value val) {
            throw ERROR("Cannot set constant: %s", value);
        }

        void invokeWith(List arguments) {
            throw ERROR("Constant is not a method");
        }
    }

    static LValue make(VirtualMachine vm, boolean val) {
        return new LValueConstant(vm.mirrorOf(val));
    }

    static LValue make(VirtualMachine vm, byte val) {
        return new LValueConstant(vm.mirrorOf(val));
    }

    static LValue make(VirtualMachine vm, char val) {
        return new LValueConstant(vm.mirrorOf(val));
    }

    static LValue make(VirtualMachine vm, short val) {
        return new LValueConstant(vm.mirrorOf(val));
    }

    static LValue make(VirtualMachine vm, int val) {
        return new LValueConstant(vm.mirrorOf(val));
    }

    static LValue make(VirtualMachine vm, long val) {
        return new LValueConstant(vm.mirrorOf(val));
    }

    static LValue make(VirtualMachine vm, float val) {
        return new LValueConstant(vm.mirrorOf(val));
    }

    static LValue make(VirtualMachine vm, double val) {
        return new LValueConstant(vm.mirrorOf(val));
    }

    static LValue make(VirtualMachine vm, String val) {
        return new LValueConstant(vm.mirrorOf(val));
    }

    static LValue makeBoolean(VirtualMachine vm, String token) {
        return make(vm, token.charAt(0) == 't');
    }

    static LValue makeCharacter(VirtualMachine vm, String token) {
        return make(vm, parseCharsToken (token).charAt(0));
    }

    static LValue makeFloat(VirtualMachine vm, String num) {
        if (num.endsWith ("f") || num.endsWith ("F"))
            return make(vm, Float.parseFloat(num));
        else
            return make(vm, Double.parseDouble(num));
    }

    static long decode (String numeral) {
        try {
            if ((numeral.startsWith ("0x") || numeral.startsWith ("0X"))
                && numeral.length () >= 18) {
                int k = Math.max (2, numeral.length () - 16);
                return ((Character.digit (numeral.charAt (k), 16) << 60)
                        | Long.parseLong (numeral.substring (k+1), 16));
            } else if (numeral.startsWith ("0") && numeral.length () >= 23) {
                int k = Math.max (0, numeral.length () - 22);
                return ((Character.digit (numeral.charAt (k), 8) << 63)
                        | Long.parseLong (numeral.substring (k+1), 8));
            } else
                return Long.decode (numeral);
        } catch (NumberFormatException e) {
            throw ERROR ("Numeric literal too large");
        }
    }

    static LValue makeInteger(VirtualMachine vm, String num) {
        if (num.endsWith ("l") || num.endsWith ("L"))
            return make(vm, decode (num.substring(0, num.length()-1)));
        else {
            long r = decode (num);
            if (r >= 0x100000000L | r < 0)
                throw ERROR ("Literal too large for int");
            if (num.charAt (0) != '0' && r > Integer.MAX_VALUE)
                throw ERROR ("Decimal literal too large");
            return make(vm, (int) r);
        }
    }

    static LValue makeShort(VirtualMachine vm, String token) {
        return make(vm, Short.parseShort(token));
    }

    static LValue makeByte(VirtualMachine vm, String token) {
        return make(vm, Byte.parseByte(token));
    }

    static LValue makeString(VirtualMachine vm, 
                             String token) {
        return make(vm, parseCharsToken (token));
    }

    static LValue makeNull(VirtualMachine vm, String token) {
        return new LValueConstant(null);
    }

    static LValue makeConstant (Value v) {
        return new LValueConstant (v);
    }

    static LValue makeThisObject(VirtualMachine vm, 
                                 GetFrame frameGetter, 
                                 String errString) {
        if (frameGetter == null) {
            throw ERROR("No current thread");
        } else {
            try {
                StackFrame frame = frameGetter.get();
                ObjectReference thisObject = frame.thisObject();
                if (thisObject == null) {
                    throw ERROR("No '%s' in native or static method", errString);
                } else {
                    return new LValueConstant(thisObject);
                }
            } catch (IncompatibleThreadStateException exc) {
                throw ERROR("Thread not suspended");
            }
        }
    }

    /** Matches an escape sequence within a character or string literal,
     *  or a maximal sequence of non-escape characters */
    private static final Pattern CHARS_LITERAL_BUNCH =
        Pattern.compile ("\\\\(?:([nrtbf\"'\\\\])|([0-3][0-7]{0,2}|[0-7]{1,2}))"
                         + "|([^\\\\]+)");

    /** The string RAWVALUE with all Java string- and character escape
     *  sequences replaced with the appropriate chars, and enclosing
     *  quotes removed. */
    static String parseCharsToken (String rawValue) {
        Matcher m = 
            CHARS_LITERAL_BUNCH
            .matcher (rawValue.substring (1, rawValue.length () - 1));

        StringBuffer result = new StringBuffer ();
        while (m.find ()) {
            if (m.group (1) != null) {
                switch (m.group (1).charAt (0)) {
                default:
                    result.append (m.group (1));
                    break;
                case 'b':
                    result.append ('\b'); break;
                case 'f':
                    result.append ('\f'); break;
                case 'n':
                    result.append ('\n'); break;
                case 'r':
                    result.append ('\r'); break;
                case 't':
                    result.append ('\t'); break;
                }
            } else if (m.group (2) != null)
                result.append ((char) Integer.parseInt (m.group (2), 8));
            else
                result.append (m.group (3));
        }
        return result.toString ();
    }

    static String JVM_typeName (String name, int dims) {
        StringBuffer type = new StringBuffer ("");

        for (int i = 0; i < dims; i += 1)
            type.append ('[');
        if (name.equals ("boolean"))
            type.append('Z');
        else if (name.equals ("int"))
            type.append('I');
        else if (name.equals ("short"))
            type.append('S');
        else if (name.equals ("char"))
            type.append('C');
        else if (name.equals ("byte"))
            type.append('B');
        else if (name.equals ("long"))
            type.append('J');
        else if (name.equals ("float"))
            type.append('F');
        else if (name.equals ("double"))
            type.append('D');
        else {
            type.append('L');
            type.append(name);
            type.append(';');
        }
        return type.toString ();
    }

    /** The full name of type NAME0.  The result is simply NAME0
     *  unless it is the name of a type in java.lang. */
    static String fullTypeName (VirtualMachine vm, String name0) {
        try {
            classByName (vm, name0);
            return name0;
        } catch (CommandException e0) {
            try {
                String name = "java.lang." + name0;
                classByName (vm, name);
                return name;
            } catch (CommandException e1) {
                return name0;
            }
        }
    }

    static ArrayType arrayClass (VirtualMachine vm, 
                                 GetFrame frameGetter, 
                                 String itemType, int dims) {
        StringBuffer name = new StringBuffer (itemType);
        for (int i = 0; i < dims; i += 1)
            name.append ("[]");
        try {
            return (ArrayType) classByName (vm, name.toString ());
        } catch (CommandException e) {
            if (dims > 0) {
                try {
                    /* Try to load the necessary array class.  No, I
                     * don't know why the extra .toString () is needed, but
                     * without it, vm.classByName is for some reason unaware
                     * of the newly loaded class. */
                    ExpressionParser.evaluate ("java.lang.Class.forName (\"" 
                                               + JVM_typeName (itemType, dims)
                                               + "\")", vm, frameGetter)
                        .toString ();
                } catch (Exception excp) { }
                return (ArrayType) classByName (vm, name.toString ());
            } 
            throw e;
        }
    }

    static ReferenceType classByName (VirtualMachine vm, String className) {

        List classes = vm.classesByName(className);
        if (classes.size() == 0) {
            throw ERROR("No class named: %s", className);
        }

        if (classes.size() > 1) {
            throw ERROR("More than one class named: %s", className);
        }
        return (ReferenceType) classes.get(0);
    }
    
    LValue instanceOf (VirtualMachine vm, 
                       GetFrame frameGetter, 
                       String internalTypeName) {
        Value thisVal = interiorGetValue ();
        if (thisVal == null)
            return make (vm, false);
        if (! (thisVal instanceof ObjectReference))
            throw ERROR ("Must apply instanceof to reference values only");
        try {
            LValue classVal;
            try {
                classVal =
                    makeConstant (ExpressionParser.evaluate ("java.lang.Class.forName (\""
                                                             + internalTypeName + "\")",
                                                             vm, frameGetter));
            } catch (InvocationException e) {
                if (! internalTypeName.startsWith ("["))
                    classVal = 
                        makeConstant (ExpressionParser.evaluate ("java.lang.Class.forName (\""
                                                                 + "java.lang." + internalTypeName + "\")",
                                                                 vm, frameGetter));
                else
                    throw e;
            }
            LValue instanceOfCall = 
                classVal.memberLValue(frameGetter, "isInstance");
            List args = new ArrayList (1);
            args.add (thisVal);
            instanceOfCall.invokeWith (args);
            return makeConstant (instanceOfCall.interiorGetValue ());
        } catch (InvocationException e) {
            throw ERROR ("Unknown type for instanceof");
        } catch (Exception e) {
            throw ERROR ("instanceof failed: %s", e);
        }
    } 

    static LValue makeNewObject(VirtualMachine vm, 
                                GetFrame frameGetter, 
                                String className, List arguments) {
        ReferenceType refType = classByName (vm, className);

        if (!(refType instanceof ClassType)) {
            throw ERROR("Cannot create instance of interface %s", className);
        }

        ClassType classType = (ClassType)refType;
        List methods = new ArrayList(classType.methods()); // writable
        Iterator iter = methods.iterator();
        while (iter.hasNext()) {
            Method method = (Method)iter.next();
            if (!method.isConstructor()) {
                iter.remove();
            }
        }

        ObjectReference newObject;
        try {
            ThreadReference thread = frameGetter.get().thread();
            newObject = newInstance(classType, thread, methods, arguments);
        } catch (InvocationException ie) {
            throw ERROR("Exception in %s constructor: %s", className,
                  ie.exception().referenceType().name());
        } catch (IncompatibleThreadStateException exc) {
            throw ERROR("Thread not suspended");
        } catch (Exception e) {
            /*
             * TO DO: Better throw ERROR handling
             */
            throw ERROR("Unable to create %s instance", className);
        }
        return new LValueConstant(newObject);
    }

    /** A new array value on VM with component type ELTTYPENAME 
     *  ("int", "boolean", etc., or class name) and dimensions 
     *  ARGUMENTS, ....  ARGUMENTS is a list of integer Values and
     *  nulls; empty dimensions are indicated by null. */   
    static LValue makeArray (VirtualMachine vm,
                             String eltTypeName, 
                             GetFrame frameGetter, 
                             List arguments) {
        return makeConstant (makeArray (vm, eltTypeName, frameGetter,
                                        arguments, 0));
    }

    /** A new array value on VM with component type ELTTYPENAME 
     *  ("int", "boolean", etc., or class name) and dimensions 
     *  ARGUMENTS.get(K), ARGUMENTS.get(K+1), ....  ARGUMENTS is a
     *  list of integer Values and nulls; empty dimensions 
     *  are indicated by null. */   
    static ArrayReference makeArray (VirtualMachine vm,
                                     String eltTypeName0, 
                                     GetFrame frameGetter,
                                     List arguments, int k) {
        String eltTypeName = fullTypeName (vm, eltTypeName0);
        Value first = (Value) arguments.get (k);
        if (! (first instanceof IntegerValue
               || first instanceof ShortValue
               || first instanceof ByteValue
               || first instanceof LongValue))
            throw ERROR ("Invalid array dimension: %s", first);
        try {
            int len = ((PrimitiveValue) first).intValue ();
            if (len < 0)
                throw ERROR ("Negative array dimension");

            ArrayType arrType = 
                arrayClass (vm, frameGetter, eltTypeName, arguments.size() - k);
            ArrayReference result = arrType.newInstance (len);
            if (k < arguments.size ()-1 && arguments.get (k+1) != null) {
                for (int i = 0; i < len; i += 1) {
                    result.setValue (i, 
                                     makeArray (vm, eltTypeName, frameGetter, 
                                                arguments, k+1));
                }
            }
            return result;
        } catch (Exception e) {
            if (e instanceof CommandException)
                throw (CommandException) e;
            else
                throw ERROR ("Could not create array: %s", e);
        }
    }

    /** A new array value on VM with component type ELTTYPENAME 
     *  ("int", "boolean", etc., or class name) and dimensions 
     *  [LEN] [] [] ..., for a total of DIMS>0 dimensions. */
    static ArrayReference makeSimpleArray (VirtualMachine vm,
                                           String eltTypeName0, 
                                           GetFrame frameGetter,
                                           int dims, int len) {
        String eltTypeName = fullTypeName (vm, eltTypeName0);
        try {
            if (len < 0)
                throw ERROR ("Negative array dimension");

            ArrayType arrType = 
                arrayClass (vm, frameGetter, eltTypeName, dims);
            return arrType.newInstance (len);
        } catch (Exception e) {
            if (e instanceof CommandException)
                throw (CommandException) e;
            else
                throw ERROR ("Could not create array: %s", e);
        }
    }

    private static LValue nFields(LValue lval, 
                                  String[] ids, int k,
                                  ThreadReference thread) {
		for (; k < ids.length; k += 1)
			lval = lval.memberLValue (ids[k], thread);
		return lval;
    }

    static LValue makeName(VirtualMachine vm, 
                           GetFrame frameGetter, 
                           String name) {
		
		String[] ids = name.trim ().split ("\\.");
		int k;

        String first = ids[0];
		k = 1;
        if (frameGetter != null) {
            try {
                StackFrame frame = frameGetter.get();
                ThreadReference thread = frame.thread();
                LocalVariable var;
                /* Check local variables */
                try {
                    var = frame.visibleVariableByName(first);
                } catch (AbsentInformationException e) {
                    var = null;
                }
                if (var != null) {
                    return nFields(new LValueLocal(frame, var), 
                                   ids, k, thread);
                } 
                ObjectReference thisObject = frame.thisObject();
                if (thisObject != null) {
                    /* Check if it is a field of 'this' */
                    LValue thisLValue = new LValueConstant(thisObject);
                    LValue fv;
                    try {
                        fv = thisLValue.memberLValue(first, thread);
                    } catch (CommandException exc) {
                        fv = null;
                    }
                    if (fv != null) {
                        return nFields(fv, ids, k, thread);
                    }
                } else {
                    /* Check if it is a static field of current class. */
                    try {
                        LValue fld;
                        ReferenceType where = frame.location().declaringType();
                        fld = null;
                        if (where != null)
                            fld = new LValueStaticMember(where, first, thread);
                        if (fld != null)
                            return nFields (fld, ids, k, thread);
                    } catch (CommandException exc) {
                    } catch (NullPointerException exc) {
                        /* frame.location () was null. */
                    }
                }
                /* check for class name */
                boolean qualified;
                qualified = false;
				while (k < ids.length) {
                    List<ReferenceType> classes;
                    classes = vm.classesByName(first);
                    if (classes.size () == 0 && !qualified)
                        classes = vm.classesByName ("java.lang." + first);
                    if (classes.size() > 0) {
                        if (classes.size() > 1) {
                            throw ERROR("More than one class named: %s", first);
                        } else {
                            ReferenceType refType = classes.get(0);
                            try {
                                LValue lval = 
                                    new LValueStaticMember(refType, ids[k],
														   thread);
                                return nFields(lval, ids, k+1, thread);
                            } catch (CommandException exc) {
                            }
                            qualified = true;
                            first += '$' + ids[k];
                        }
                    } else {
                        qualified = true;
                        first += '.' + ids[k];
                    }
					k += 1;
                }
            } catch (IncompatibleThreadStateException exc) {
                throw ERROR("Thread not suspended");
            }
        }
        throw ERROR("Name unknown: %s", name);
    }

    static String stringValue(VirtualMachine vm, 
                              GetFrame frameGetter, 
                              Value val) {
        SpecialCases:
        try {
            if (val instanceof StringReference) {
                return ((StringReference) val).value();
            } else if (val instanceof ObjectReference && 
                       frameGetter != null) {
                ObjectReference obj = (ObjectReference) val;
                List toStrings =
                    obj.referenceType ()
                    .methodsByName ("toString", 
                                    "()Ljava/lang/String;");
                if (toStrings.size () != 1)
                    break SpecialCases;
                Value str = 
                    invokeMethod (obj, frameGetter.get ().thread (),
                                  toStrings, Collections.EMPTY_LIST, 0);
                if (str == null)
                    return "null";
                else if (str instanceof StringReference)
                    return ((StringReference) str).value ();
                else /* Don't see how this can happen, but harmless. */
                    return str.toString ();         
            } else if (val == null) {
                return "null";  
            } else
                return val.toString ();
        } catch (InvocationException e) {
        } catch (ClassNotLoadedException e) {
        } catch (IncompatibleThreadStateException e) {
        } catch (CommandException e) {
        }
        return "<Exception raised in toString on " + val.toString () + ">";
    } 

    /** Perform the assignment operation indicated by OPTOK (=, +=, ...) on
     *  THIS and RIGHTL, returning the value of RIGHTL. */
    LValue doAssign (VirtualMachine vm, String op, LValue rightL) {
        if (op.equals ("=")) {
            /* Compute RHS only once. */
            Value v = rightL.interiorGetValue ();
            setValue (v);
            return makeConstant (v);
        }
    
        LValue lv = operation (vm, op.substring (0, op.length() - 1), 
                               this, rightL, null);
        Value thisVal = interiorGetValue ();
        if (thisVal instanceof PrimitiveValue)
            lv = castPrimitive (vm, thisVal.type ().name (), lv);
        setValue (lv);
        return lv;
    }

    static LValue booleanOperation(VirtualMachine vm, String op, 
                                   LValue leftL, 
                                   LValue rightL) {
        Value right = rightL.interiorGetValue();
        Value left = leftL.interiorGetValue();
        if (left == null || right == null)
            return make (vm, op.equals ("==") == (left == right));
        if ( !(right instanceof PrimitiveValue) || 
             !(left instanceof PrimitiveValue) ) {
            if (op.equals("==")) {
                return make(vm, right.equals(left));
            } else if (op.equals("!=")) {
                return make(vm, !right.equals(left));
            } else {
                throw ERROR("Operands of '%s' must be primitive", op);
            }
        }
        // can compare any numeric doubles
        double rr = ((PrimitiveValue)right).doubleValue();
        double ll = ((PrimitiveValue)left).doubleValue();
        boolean res;
        if (op.equals("<")) {
            res = ll < rr;
        } else if (op.equals(">")) {
            res = ll > rr;
        } else if (op.equals("<=")) {
            res = ll <= rr;
        } else if (op.equals(">=")) {
            res = ll >= rr;
        } else if (op.equals("==")) {
            res = ll == rr;
        } else if (op.equals("!=")) {
            res = ll != rr;
        } else {
            throw ERROR("Unknown operation: %s", op);
        }
        return make(vm, res);
    }                                

    static LValue castPrimitive (VirtualMachine vm, String op,
                                 LValue rightL) {
        Value right = rightL.interiorGetValue ();
        if (right instanceof ObjectReference) {
            throw ERROR ("Invalid cast operation on an Object");
        }
        if (right instanceof BooleanValue) {
            if (!op.equals ("boolean")) {
                throw ERROR ("Invalid cast of boolean");
            } else
                return rightL;
        }
        PrimitiveValue primRight = (PrimitiveValue) right;
        if (op.equals ("int")) {
            return make (vm, primRight.intValue ());
        } else if (op.equals ("long")) {
            return make (vm, primRight.longValue ());
        } else if (op.equals ("float")) {
            return make (vm, primRight.floatValue ());
        } else if (op.equals ("double")) {
            return make (vm, primRight.doubleValue ());
        } else if (op.equals ("short")) {
            return make (vm, primRight.shortValue ());
        } else if (op.equals ("byte")) {
            return make (vm, primRight.byteValue ());
        } else if (op.equals ("char")) {
            return make (vm, primRight.charValue ());
        } else {
            throw ERROR ("Don't know how to cast to %s", op);
        }
    }

    static LValue operation(VirtualMachine vm, String op, LValue rightL) {
        Value right = rightL.interiorGetValue();
        if (right instanceof ObjectReference) {
            throw ERROR ("Invalid operation: '%s' on an Object", op);
        }
        if (right instanceof ObjectReference) {
            throw ERROR ("Invalid operation: '%s' on an Object", op);
        }
        PrimitiveValue primRight = (PrimitiveValue) right;
        if (primRight instanceof BooleanValue) {
            boolean rr = primRight.booleanValue ();
            if (op.equals("!")) {
                return make (vm, !rr);
            } else {
                throw ERROR("Invalid operation '%s' on a boolean", op);
            }
        } else if (primRight instanceof LongValue) {
            if (op.equals ("+"))
                return rightL;
            long rr = primRight.longValue ();
            long res;
            if (op.equals("-")) {
                res = -rr;
            } else if (op.equals("~")) {
                res = ~rr;
            } else {
                throw ERROR("Invalid operation '%s' on a long", op);
            }
            return make(vm, res);
        } else if (primRight instanceof DoubleValue) {
            double rr = primRight.doubleValue ();
            double res;
            if (op.equals ("+"))
                res = rr;
            else if (op.equals("-")) {
                res = -rr;
            } else {
                throw ERROR("Invalid operation '%s' on a double", op);
            }
            return make(vm, res);
        } else if (primRight instanceof FloatValue) {
            float rr = primRight.floatValue ();
            float res;
            if (op.equals ("+"))
                res = rr;
            else if (op.equals("-")) {
                res = -rr;
            } else {
                throw ERROR("Invalid operation '%s' on a float", op);
            }
            return make(vm, res);
        } else {
            int rr = primRight.intValue ();
            int res;
            if (op.equals ("+"))
                res = rr;
            else if (op.equals("-")) {
                res = -rr;
            } else if (op.equals("~")) {
                res = ~rr;
            } else {
                throw ERROR("Invalid operation '%s' on an int", op);
            }
            return make(vm, res);
		}
    }

	static LValue operation(VirtualMachine vm, String op, 
                            LValue leftL, 
                            LValue rightL) {
        return operation (vm, op, leftL, rightL, null);
    }


    static LValue operation(VirtualMachine vm, String op, 
                            LValue leftL, 
                            LValue rightL,
                            GetFrame frameGetter) {
        try {
            Value right = rightL.interiorGetValue();
            Value left = leftL.interiorGetValue();
            if ((right instanceof StringReference) ||
                (left instanceof StringReference)) {
                if (op.equals("+")) {
                    return make(vm, 
                                stringValue(vm, frameGetter, left) 
                                + stringValue(vm, frameGetter, right));
                }
            }
            if ((right instanceof ObjectReference) ||
                (left instanceof ObjectReference)) {
                if (op.equals("==")) {
                    return make(vm, left.equals(right));
                } else if (op.equals("!=")) {
                    return make(vm, !left.equals(right));
                } else {
                    throw ERROR("Invalid operation '%s' on an Object", op);
                }
            }
            // from here on, we know it is a primitive type
            PrimitiveValue primRight = (PrimitiveValue) right;
            PrimitiveValue primLeft = (PrimitiveValue) left;
            if ((primRight instanceof BooleanValue) !=
                (primLeft instanceof BooleanValue)) {
                throw ERROR("Invalid boolean '%s' expression", op);
            } 
            if ((primRight instanceof BooleanValue) ||
                (primLeft instanceof BooleanValue)) {
                boolean rr = primRight.booleanValue ();
                boolean ll = primLeft.booleanValue ();
                boolean res;
                if (op.equals("&")) {
                    res = ll & rr;
                } else if (op.equals("|")) {
                    res = ll | rr;
                } else if (op.equals("^")) {
                    res = ll ^ rr;
                } else
                    throw ERROR("Invalid operation '%s' on a Boolean", op);
                return make(vm, res);
            }
            // from here on, we know it is a numeric type
            if ((primRight instanceof DoubleValue) ||
                (primLeft instanceof DoubleValue)) {
                double rr = primRight.doubleValue();
                double ll = primLeft.doubleValue();
                double res;
                if (op.equals("+")) {
                    res = ll + rr;
                } else if (op.equals("-")) {
                    res = ll - rr;
                } else if (op.equals("*")) {
                    res = ll * rr;
                } else if (op.equals("/")) {
                    res = ll / rr;
                } else if (op.equals("%")) {
                    res = ll % rr;
                } else {
                    throw ERROR("Unknown operation: %s", op);
                }
                return make(vm, res);
            }
            if ((primRight instanceof FloatValue) ||
                (primLeft instanceof FloatValue)) {
                float rr = primRight.floatValue();
                float ll = primLeft.floatValue();
                float res;
                if (op.equals("+")) {
                    res = ll + rr;
                } else if (op.equals("-")) {
                    res = ll - rr;
                } else if (op.equals("*")) {
                    res = ll * rr;
                } else if (op.equals("/")) {
                    res = ll / rr;
                } else if (op.equals("%")) {
                    res = ll % rr;
                } else {
                    throw ERROR("Unknown operation: %s", op);
                }
                return make(vm, res);
            }

            // from here on, we know it is an integer type
            if (op.equals ("<<") || op.equals (">>") || op.equals (">>>")) {
                int s = primRight.intValue ();
                if (primLeft instanceof LongValue) {
                    long ll = primLeft.longValue();
                    long res;
                    res = 0;
                    if (op.equals ("<<")) {
                        res = ll << s;
                    } else if (op.equals (">>")) {
                        res = ll >> s;
                    } else if (op.equals (">>>")) {
                        res = ll >>> s;
                    }
                    return make(vm, res);
                } else {
                    int ll = primLeft.intValue();
                    int res;
                    res = 0;
                    if (op.equals ("<<")) {
                        res = ll << s;
                    } else if (op.equals (">>")) {
                        res = ll >> s;
                    } else if (op.equals (">>>")) {
                        res = ll >>> s;
                    }
                    return make(vm, res);
                }
            }

            if ((primRight instanceof LongValue) ||
                (primLeft instanceof LongValue)) {
                long rr = primRight.longValue();
                long ll = primLeft.longValue();
                long res;
                if (op.equals("+")) {
                    res = ll + rr;
                } else if (op.equals("-")) {
                    res = ll - rr;
                } else if (op.equals("*")) {
                    res = ll * rr;
                } else if (op.equals("/")) {
                    res = ll / rr;
                } else if (op.equals("%")) {
                    res = ll % rr;
                } else if (op.equals("&")) {
                    res = ll & rr;
                } else if (op.equals("|")) {
                    res = ll | rr;
                } else if (op.equals("^")) {
                    res = ll ^ rr;
                } else if (op.equals("<<")) {
                    res = ll << rr;
                } else {
                    throw ERROR("Unknown operation: %s", op);
                }
                return make(vm, res);
            } else {
                int rr = primRight.intValue();
                int ll = primLeft.intValue();
                int res;
                if (op.equals("+")) {
                    res = ll + rr;
                } else if (op.equals("-")) {
                    res = ll - rr;
                } else if (op.equals("*")) {
                    res = ll * rr;
                } else if (op.equals("/")) {
                    res = ll / rr;
                } else if (op.equals("%")) {
                    res = ll % rr;
                } else if (op.equals("&")) {
                    res = ll & rr;
                } else if (op.equals("|")) {
                    res = ll | rr;
                } else if (op.equals("^")) {
                    res = ll ^ rr;
                } else {
                    throw ERROR("Unknown operation: %s", op);
                }
                return make(vm, res);
            }
        } catch (ArithmeticException e) {
            throw ERROR ("Division by 0");
        }
    }   

    static String excpMessage (Throwable exc) {
        String msg = exc.getMessage ();
        if (msg == null)
            return "";
        else
            return " " + msg;
    }

}
