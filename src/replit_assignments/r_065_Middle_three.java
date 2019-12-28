package replit_assignments;

import java.util.Scanner;

public class r_065_Middle_three {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //YOUR CODE HERE
    int len=word.length();
       if(len>=5 && len%2==1) {
    	   len=len/2;
    	   word=word.substring(len-1, len+2);
    	   System.out.println(word);
       } else {
    	   System.out.println("invalid");
       }
    
    
}
}
