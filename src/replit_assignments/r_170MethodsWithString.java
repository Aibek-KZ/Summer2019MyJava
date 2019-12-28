package replit_assignments;

import java.util.Arrays;

public class r_170MethodsWithString {
	/*
	 This method gets two strings (text and badWord)  and returns a string.
     basicly what it dose is take out all the occurrences of badWord in text.
      for example:
                    clean ("one two three","two")
            returns "one three"
                                clean ("foo bar","foo")
                        returns "bar"
                                      clean ("he said bla bla bla","bla")
                                       returns "he said "
	 */
public static void main(String[] args) {
	
	clean("he said bla bla bla", "bla");
}
public static String clean (String text, String badWord) {
	if(text.contains(badWord)) {
	text=text.replace(badWord, "");	
	}
	return text;
	}
}
