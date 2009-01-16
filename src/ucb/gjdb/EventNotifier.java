/* Copyright (c) 1997-1999 by Sun Microsystems, Inc.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 1, which must
 * accompany any redistribution of this file. */

/* Copyright (c) 2000, 2001, 2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

import java.util.Collection;
import com.sun.jdi.event.*;

interface EventNotifier {
    void vmStartEvent(VMStartEvent se);
    void breakpointEvent(BreakpointEvent be);
    void fieldWatchEvent(WatchpointEvent fwe);
    void stepEvent(StepEvent se);
    void exceptionEvent(ExceptionEvent ee);
    void otherEvent(Event event);
    void vmInterrupted(EventSet set, Collection<EventRequestSpec> specs);
    void methodEntryEvent(MethodEntryEvent me);
    void methodExitEvent(MethodExitEvent me);
}

