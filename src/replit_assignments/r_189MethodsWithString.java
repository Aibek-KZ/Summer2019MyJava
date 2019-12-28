package replit_assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class r_189MethodsWithString {
	/*
	 isError method checks if the line of string it gets has the word 
	 error at the start of it.
  it gets a string and returns a boolean.
  true if it found the word 'error' an the start of the line string
  example use:
          isError("foo bar")
          returns : false
                       isError("error foo bar")
                       returns : true
                                     isError("error one two")
                                     returns : true
          isError("three four error")
          returns : false
	 */
	public static void main(String[] args) {
		String line = "error foo bar";
		System.out.println(isError(line));
	}	
	 public static boolean isError(String line)   {
	    boolean result = line.startsWith("error");
	    return result;
	  }

	}
		 

