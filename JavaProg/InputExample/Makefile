JFLAGS = -g -encoding ISO8859_1
JC = javac
JVM= java  # Added by Agust�n Gonz�lez
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = InputExample.java

MAIN = InputExample

default: classes

classes: $(CLASSES:.java=.class)

run: 
	$(JVM) $(MAIN)

clean:
	$(RM) *.class
