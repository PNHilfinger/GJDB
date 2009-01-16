/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

//package com.sun.tools.example.debug.tty;
package ucb.gjdb;

import com.sun.jdi.Location;
import com.sun.jdi.AbsentInformationException;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;

class SourceMapper {

    private final String[] dirs;

    SourceMapper(String sourcepath) {
        StringTokenizer st = new StringTokenizer(sourcepath, File.pathSeparator);
        List dlist = new ArrayList();

        String homePrefix = "~" + File.separator;
        String homeDir;
        try {
            homeDir = System.getProperty ("user.home");
        } catch (SecurityException e) { 
            homeDir = "~";
        }

        while (st.hasMoreTokens()) {
            String dir = st.nextToken ();
            if (dir.startsWith (homePrefix) || dir.equals ("~"))
                dir = homeDir + dir.substring (1);
            dlist.add(dir);
        }
        dirs = (String[])dlist.toArray(new String[0]);
    }

    /** The source path used to construct this SourceMapper. */
    String getSourcePath () {
        StringBuffer r = new StringBuffer ();
        for (int i = 0; i < dirs.length; i += 1)
            r.append (':' + dirs[i]);
        return r.toString ().substring (1);
    }

    /**
     * Return a File cooresponding to the source of this location.
     * Return null if not available.
     */
    File sourceFile(Location loc) {
        try {
            String filename = loc.sourceName();
            String refName = loc.declaringType().name();
            int iDot = refName.lastIndexOf('.');
            String pkgName = (iDot >= 0)? refName.substring(0, iDot+1) : "";
            String full = pkgName.replace('.', File.separatorChar) + filename;
            for (int i= 0; i < dirs.length; ++i) {
                File path = new File(dirs[i], full);
                if (path.exists()) {
                    return path;
                }
            }
            return null;
        } catch (AbsentInformationException e) {
            return null;
        }
    }

    /**
     * Return a BufferedReader cooresponding to the source 
     * of this location.
     * Return null if not available.
     * Note: returned reader must be closed.
     */
    BufferedReader sourceReader(Location loc) {
        File sourceFile = sourceFile(loc);
        if (sourceFile == null) {
            return null;
        }
        try {
            return new BufferedReader(new FileReader(sourceFile));
        } catch(IOException exc) {
        }
        return null;
    }
}
        
