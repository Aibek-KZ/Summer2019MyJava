package replit_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class r_106ArraysSplitSentence {
public static void main(String[] args) {
	/*
	 Given a String variable sentence, write code to type each word in 
	 separate lines.
	 sentence -> "Java is fun"
	 Java
	 is
	 fun
	 */
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    //type your code below
    String[] text=sentence.split(" ");
    for(int i=0; i<text.length; i++) {
    	System.out.println(text[i]+" ");
    }
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
