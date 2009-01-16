import sys, os, re, getopt, popen2, signal

DFLT_TIMEOUT = 5

def destroyProcess ():
    global theProcess
    if theProcess != None:
        try:
            theProcess.fromchild.close ()
        except:
            pass
        try:
            theProcess.tochild.close ()
        except:
            pass
        try:
            theProcess.childerr.close ()
        except:
            pass
        os.kill (theProcess.pid, signal.SIGKILL)
        theProcess.wait ()
        theProcess = None

def runProcess (cmnd):
    global theProcess
    destroyProcess ()
    theProcess = popen2.Popen3 (cmnd, True, 1024)

def handleTimeout (sig, frame):
    global timedOut
    print >>sys.stderr, "Timed out waiting for input from process"
    timedOut = True
    destroyProcess ()

def fromProc (fromErr, len, timeout = DFLT_TIMEOUT):
    global timedOut
    timedOut = False
    signal.signal (signal.SIGALRM, handleTimeout)
    signal.alarm (timeout)
    try: 
        if verbose:
            if fromErr:
                print >>sys.stderr, "Received from stderr:",
            else:
                print >>sys.stderr, "Received from stdout:",
        if fromErr:
            if len <= 0:
                val = theProcess.childerr.readline ()
            else:
                val = theProcess.childerr.read (len)
        else:
            if len <= 0:
                val = theProcess.fromchild.readline ()
            else:
                val = theProcess.fromchild.read (len)
        if verbose:
            print >>sys.stderr, "'%s'" % val
    except IOError:
        if verbose and not timedOut:
            print >>sys.stderr, "IOError"
        val = None
    signal.signal (signal.SIGALRM, signal.SIG_IGN)
    signal.alarm (0)
    return val, timedOut

def sendInput (line):
    print >>theProcess.tochild, line
    theProcess.tochild.flush ()

def checkLiteralMatch (patn, fromErr):
    L, timedOut = fromProc (fromErr, len (patn), currentTimeout)
    return not timedOut and L == patn

def checkMatch (regex, fromErr):
    L, timedOut = fromProc (fromErr, 0, currentTimeout)
    return not timedOut and re.match (regex, L.rstrip ())

def sleep (n):
    signal.signal (signal.SIGALRM, lambda x, y: None)
    signal.alarm (n)
    signal.pause ()
    signal.signal (signal.SIGALRM, signal.SIG_IGN)

inp = sys.stdin

opts, extra = getopt.getopt (sys.argv[1:], 'vo:', ['output=', 'verbose'])

theProcess = None

if len (extra) > 0:
    inp = open (extra[0], "r")
else:
    inp = sys.stdin

out = sys.stdout
verbose = False
for opt, val in opts:
    if opt == '-o' or opt == '--output':
        out = open (val, "w")
    elif opt == '-v' or opt == '--verbose':
        verbose = True;

currentTimeout = DFLT_TIMEOUT
errs = False
checking = False

for L in inp:
    mat = re.match (r"\s*(?:>(.*)|(2?)(\*?)'(.*)|(2?)~(.*)|$|#.*|%(.*)"
                    r"|timeout\s*=\s*(\d+)$|(EOF>.*)|wait\s+(\d+))", L)
    if not mat:
        print >>sys.stderr, "** Error in line:", L
        sys.exit (1)
    if verbose:
        print >>sys.stderr, L,

    if checking and mat.group (1) != None:
        sendInput (mat.group (1))
    elif checking and mat.group (2) != None:
        target = mat.group (4)
        if not mat.group (3):
            target += "\n"
        if not checkLiteralMatch (target, mat.group(2)):
            print >>sys.stderr, "Output didn't literally match '%s'" % \
                  mat.group (4)
            errs = True
            checking = False
    elif checking and mat.group (5) != None:
        if not checkMatch (mat.group (6), mat.group (5)):
            print >>sys.stderr, "Output didn't match '%s'" % mat.group (7)
            errs = True
            checking = False
    elif mat.group (7) != None:
        runProcess (mat.group (7))
        checking = True
    elif checking and mat.group (8) != None:
        currentTimeout = int (mat.group (8))
    elif checking and mat.group (9) != None:
        theProcess.tochild.close ()
    elif checking and mat.group (10) != None:
        sleep (int (mat.group (10)))

if errs:
    sys.exit (1)
else:
    sys.exit (0)
