package replit_assignments;

import java.util.Scanner;

public class r_075_Without_Xor_x {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
	int len=word.length();

    if(word.startsWith("X") || word.startsWith("x")) {
    	   if(word.endsWith("x")||word.endsWith("X")) {
    		word=word.substring(1, len-1);  
    		System.out.println(word);
    	   } else {
    	   word=word.substring(1);
    	   System.out.println(word);
    	   }
    } else if(word.endsWith("X") || word.endsWith("x")) {
    	word=word.substring(0, len-1);
    	System.out.println(word);
    } else {
    	System.out.println(word);
    } 
}
}
