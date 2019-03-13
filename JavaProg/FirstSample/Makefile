SRC=*.java
JC=javac
NAME=FirstSample
all: 
	$(JC) -encoding ISO8859_1 $(SRC)
	mkdir -p bin/
	mv *.class bin/
clean:
	rm -rf bin/

run:
	java   -classpath bin/ $(NAME)

