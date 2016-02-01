import java.io.*;
import java.util.*;

class Unique {
      public static boolean allUnique(String string) {
      	     if (string == null) return false;
	
	     HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
	     for (Character c : string.toCharArray()) {
	     	 if (characterMap.get(c) == null) {
		    characterMap.put(c, 1);
		 } else {
		    return false;
		 }
             }
	     return true;
      }
}

public class Main {
       public static void main(String[] args) {
       	      System.out.println("Test All Unique:");

	      String s1 = null,
	      	     s2 = "",
	      	     s3 = "asdf",
		     s4 = "aasdf";
		     	  
	      System.out.println(Unique.allUnique(s1));
	      System.out.println(Unique.allUnique(s2));
	      System.out.println(Unique.allUnique(s3));
	      System.out.println(Unique.allUnique(s4));
       }
}
