TEST_SRCS = $(wildcard test-[0-9][0-9])

SCRIPTS = $(TEST_SRCS:%=%.script)

JAVA_SRCS = $(wildcard *.java)

.PHONY: default compile check clean regen

default: compile check

compile: sentinel

sentinel: $(JAVA_SRCS)
	javac -g $(JAVA_SRCS)
	touch sentinel

check: compile $(SCRIPTS)
	for f in $(SCRIPTS); do \
	    python runscript.py $$f; \
	done

regen: compile
	@for f in test-[0-9][0-9]; do \
	    rm -f $$f.script.tmp; \
	    echo python makescript.py -o $$f.script.tmp $$f; \
	    python makescript.py -o $$f.script.tmp $$f; \
	    if [ -f $$f.script ]; then \
		if cmp $$f.script $$f.script.tmp > /dev/null; then \
	            echo "$$f.script unchanged."; rm $$f.script.tmp; \
	        else \
	            echo "$$f.script changed.  Previous version in $$f.script.0"; \
		    rm -f $$f.script.0; mv $$f.script $$f.script.0; \
		    mv $$f.script.tmp $$f.script; \
	        fi; \
	    else \
		mv $$f.script.tmp $$f.script; \
	    fi; \
	done
   
clean:
	rm -rf *~ *.class sentinel *.0 *.tmp


