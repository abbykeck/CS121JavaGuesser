JavaGuesser.class: JavaGuesser.java
	javac -g JavaGuesser.java

run: JavaGuesser.class
	java JavaGuesser

debug: JavaGuesser.class
	jdb JavaGuesser

clean:
	rm *.class
