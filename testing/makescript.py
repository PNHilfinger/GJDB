import os, sys, re, popen2, signal, getopt, fcntl
from select import select

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
    fcntl.fcntl (theProcess.fromchild, fcntl.F_SETFL, os.O_NDELAY)
    fcntl.fcntl (theProcess.childerr, fcntl.F_SETFL, os.O_NDELAY)

def getOutput (out, expected = None):
    global warnings
    files = [theProcess.fromchild, theProcess.childerr]
    ready, d1, d2 = select (files, [], [], 3.0)
    reg = err = ""
    while ready:
        for f in ready:
            if f == theProcess.fromchild:
               reg += f.read ()
               if reg == "":
                   del files[0]
            else:
               err += f.read ()
               if err == "":
                   del files[-1]
        if files:
            ready, d1, d2 = select (files, [], [], 0.5)
        else:
            ready = []

    if expected != None:
        if not re.search (expected, reg + err):
            print >>out, "#**WARNING: Unexpected output**"
            print >>out, expected
            warnings += 1

    for v, prefix in (reg, ""), (err, "2"):
        while v:
            mat = re.match (r'(.*)(\n?)', v)
            if mat.group (2):
                print >>out, prefix + "'" + mat.group (1)
            else:
                print >>out, prefix + "*'" + mat.group (1)
            v = v[len (mat.group (0)):]
    out.flush ()    

def sendInput (line):
    print >>theProcess.tochild, line
    theProcess.tochild.flush ()

def sleep (n):
    signal.signal (signal.SIGALRM, lambda x, y: None)
    signal.alarm (n)
    signal.pause ()
    signal.signal (signal.SIGALRM, signal.SIG_IGN)

inp = sys.stdin

opts, extra = getopt.getopt (sys.argv[1:], 'vo:', ['output=', 'verbose'])

theProcess = None
defaultOutputExpected = None
warnings = 0

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

patn = re.compile (r"\s*(?:>(.*?)\s*(?://\s*\?\?.*)?$|(2?)(\*?)'(.*)|(2?)~(.*)|%(.*)"
                   r"|timeout\s*=\s*(\d+)$|(EOF>.*)|wait\s+(\d+)"
                   r"|#(.*)|($)|\?\?\?\s*(.*))")

for L in inp:
    mat = patn.match (L)
    if not mat:
        print >>sys.stderr, "** Error in line:", L
        sys.exit (1)

    if mat.group (1) != None:
        mat2 = re.match (r'(.*?)\s*//.*\?\?\s*(.*)', L)
        if mat2:
            print >>out, mat2.group (1)
        else:
            print >>out, L,
        sendInput (mat.group (1))
        if mat2:
            getOutput (out, mat2.group (2))
        else:
            getOutput (out, defaultOutputExpected)
    elif mat.group (4) != None or mat.group (6) != None:
        pass
    elif mat.group (7) != None:
        print >>out, L,
        runProcess (mat.group (7))
        getOutput (out)
    elif mat.group (8) != None or mat.group (11) != None \
         or mat.group (12) != None:
        print >>out, L,
    elif mat.group (9) != None:
        print >>out, L,
        theProcess.tochild.close ()
    elif mat.group (10) != None:
        print >>out, L,
        sleep (int (mat.group (10)))
        getOutput (out)
    elif mat.group (13) != None:
        defaultOutputExpected = mat.group (13)

if warnings:
    print >>sys.stderr, "%d warnings issued." % warnings
