import java.io.*;
import java.util.*;

class Reverse {
    public static String reverseSentence(String sentence) {
	if (sentence == null) return sentence;

	StringBuilder builder = new StringBuilder();
	String[] words = sentence.split(" ");
	for (int i = words.length - 1; i > 0; --i) {
	    builder.append(words[i]);
	    builder.append(" ");
	}

	builder.append(words[0]);
	
	return builder.toString();
    }
}

public class Main {
    public static void main(String[] args) {
	System.out.println("Test Reverse:");

	String sentence1 = null,
	    sentence2 = "asdf",
	    sentence3 = "This is a sentence";

	sentence1 = Reverse.reverseSentence(sentence1);
	System.out.println(sentence1);
	
	sentence2 = Reverse.reverseSentence(sentence2);
	System.out.println(sentence2);
	
	sentence3 = Reverse.reverseSentence(sentence3);
	System.out.println(sentence3);
    }
}
