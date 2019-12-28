package replit_assignments;

import java.util.Scanner;

public class r_069_print_half_twice {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
    int len=word.length();
    len=len/2;
    String twice="";
       for(int i=1; i<=2; i++) {
    	   twice=twice+word.substring(0, len);
       }
       System.out.println(twice);
    
    
}
}
