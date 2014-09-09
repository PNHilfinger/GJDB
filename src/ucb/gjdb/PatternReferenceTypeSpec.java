/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000-2004 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import com.sun.jdi.*;
import java.util.StringTokenizer;
import java.util.regex.*;

class PatternReferenceTypeSpec implements ReferenceTypeSpec {
    final String classId, transClassId;
    boolean anonymous;
    boolean checkJavaLang;
    String stem;
    static final Pattern 
        ANONYMOUS_TAIL = Pattern.compile ("[.$]\\d+$"),
        ANONYMOUS_SEGMENT = Pattern.compile ("^\\d+$");

    PatternReferenceTypeSpec(String classId, boolean checkJavaLang) 
        throws ClassNotFoundException {
        if (classId.endsWith (".0")) {
            classId = classId.substring (0, classId.length () - 2);
            anonymous = true;
        } else
            anonymous = false;
        this.classId = classId;

        stem = transClassId = classId.replace ('$', '.');
        if (classId.startsWith("*")) {
            stem = stem.substring(1);
            checkJavaLang = false;
        } else if (classId.endsWith("*")) {
            stem = stem.substring(0, classId.length() - 1);
            checkJavaLang = false;
        }
        checkClassName(stem);
        this.checkJavaLang = checkJavaLang && stem.indexOf ('.') == -1;
    }

    PatternReferenceTypeSpec(String classId) throws ClassNotFoundException {
        this (classId, false);
    }

    /**
     * Does the specified ReferenceType match this spec.
     */
    public boolean matches(ReferenceType refType) {
        String refName = refType.name ().replace ('$', '.');
        String compName;
        compName = refName;
        if (anonymous) {
            String anonymousBase = anonymousBaseName (refName);
            if (anonymousBase != null)
                compName = anonymousBase;
            else
                return false;
        }
        if (classId.startsWith("*")) {
            return compName.endsWith(stem);
        } else if (classId.endsWith("*")) {
            return compName.startsWith(stem);
        } else if (checkJavaLang && compName.startsWith ("java.lang.")
                   && compName.substring (10).equals (stem)) {
            return true;
        } else {
            return compName.equals(transClassId);
        }
    }

    public boolean isAnyAnonymous () {
        return anonymous;
    }

    public int hashCode() {
        return classId.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof PatternReferenceTypeSpec) {
            PatternReferenceTypeSpec spec = (PatternReferenceTypeSpec)obj;

            return transClassId.equals(spec.transClassId);
        } else {
            return false;
        }
    }

    private void checkClassName(String className) throws ClassNotFoundException {
        // Do stricter checking of class name validity on deferred
        //  because if the name is invalid, it will
        // never match a future loaded class, and we'll be silent
        // about it.
        StringTokenizer tokenizer = new StringTokenizer(className, ".");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            // Each dot-separated piece must be a valid identifier
            // and the first token can also be "*".
            if (!isJavaIdentifier(token)
                && (tokenizer.hasMoreTokens () 
                    || !isAnonymousClassSuffix (token))) {
                throw new ClassNotFoundException();
            }
        }
        if (! classIsPlausible ())
            Env.noticeln ("Warning: class %s does not seem to exist.",
                          classId);
    }

    private boolean isJavaIdentifier(String s) {
        if (s.length() == 0) {                              
            return false;
        }

        if (! Character.isJavaIdentifierStart(s.charAt(0))) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {
            if (! Character.isJavaIdentifierPart(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean isAnonymousClassSuffix (String suffix) {
        return ANONYMOUS_SEGMENT.matcher (suffix).find ();
    }

    private String anonymousBaseName (String name) {
        Matcher mat = ANONYMOUS_TAIL.matcher (name);
        if (mat.find ())
            return name.substring (0, mat.start ());
        else
            return null;
    }

    public String toString() {
        return classId + (isAnyAnonymous () ? ".0" : "");
    }

    /** False iff there is some evidence that no class described by this 
     *  pattern exists in the classpath.  Conservatively returns true
     *  for patterns containing "*", for cases where the virtual machine
     *  is not a PathSearchingVirtualMachine, and for anonymous classes for
     *  a parent class exists. */
    boolean classIsPlausible () {
        if (classId.startsWith ("*") || classId.endsWith ("*") ||
            ! (Env.vm () instanceof PathSearchingVirtualMachine))
            return true;
        else
            return Env.classMayExist (transClassId);
    }
}
