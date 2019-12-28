package replit_assignments;

import java.util.Scanner;

public class r_087Has_a_Java {
public static void main(String[] args) {
	/* Given a string word, print true if "java" appears starting at index 0 or 1 in 
	   the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may
	   be any length, including 0word = . 
    */
	
	boolean exists = false;
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    
    if(word.length()>4) {	
        if(word.substring(0, 1).equals("j")) {
    		System.out.println("true");
    	} else if(word.substring(1, 2).equals("j")) {
    		System.out.println("true");
    	} else {
    		System.out.println("false");
    	}
    } else {
    	System.out.println("false");
    }
     
	
	
	
}
}
