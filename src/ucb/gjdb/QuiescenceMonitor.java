/* Copyright (c) 2000, 2001 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

/** A simple keep-alive monitor. When requested to waitForQuiet, returns
 *  when it has not been kick()'ed for a given period of time. */
class QuiescenceMonitor extends Thread {

    private int interval;
    private boolean quiet, kicked;

    /** A new monitor that becomes quiet after not being kicked for INTERVAL
     *  milliseconds. */
    QuiescenceMonitor (int interval) {
        quiet = true;
        kicked = false;
        this.interval = interval;
        this.start ();
    }

    /** A monitor with a default interval. */
    QuiescenceMonitor () {
        this (500);
    }

    /** Kick this monitor, so that waitForQuiet does not return for at least
     *  the given interval. */
    synchronized void kick () {
        quiet = false;
        kicked = true;
        notifyAll ();
    }
    
    /** Wait for absence of kicks for the given interval. */
    synchronized void waitForQuiet () throws InterruptedException {
        kick ();
        while (! quiet)
            wait ();
    }

    /** Shut down this monitor. */
    synchronized void done () {
        this.interrupt ();
    }

    public synchronized void run () {
        try {
            while (true) {
                if (! quiet) {
                    kicked = false;
                    wait (interval);
                    if (! kicked) { 
                        quiet = true;
                        notifyAll ();
                    }
                } else
                    wait ();
            }
        } catch (InterruptedException e) {
            quiet = true;
            notifyAll ();
        }
    }
}

