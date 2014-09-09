/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

/** A set of command-line arguments and file redirections to be passed to 
 *  an inferior process. */
class CommandLineSpec {
    /** Command-line arguments */
    String cmdArgs;
    /** Input file, or null if not redirected */
    String inFile;
    /** Output file, or null if not redirected */
    String outFile;
    /** Error file, or null if not redirected */
    String errFile;

    CommandLineSpec () {
        cmdArgs = "";
        inFile = outFile = errFile = null;
    }

    public String toString () {
        String result;
        result = cmdArgs;
        if (inFile != null)
            result += " <" + inFile;
        if (outFile != null && outFile.equals (errFile))
            result += " >" + outFile + " 2>&1";
        else {
            if (outFile != null) 
                result += " >" + outFile;
            if (errFile != null)
                result += " 2>" + errFile;
        }
        return result;
    }

}

	
