package replit_assignments;

import java.util.Scanner;

public class r_099_Count_triples {
public static void main(String[] args) {
	/* We'll say that a "triple" in a string is a char appearing three times in a row.
	  Print out the number of triples in the given string. The triples may overlap.
	 Example:
      input: abcXXXabc     xxxabyyyycd     java
      output: 1                3             0 
	 */
	Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int count = 0 ;
  
    //WRITE YOUR CODE HERE
        
    	for(int i=0; i<str.length()-2; i++) {
    	     if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i+1)==str.charAt(i+2)) {
    	    	  count++;
    	     }	      
        }
    	System.out.println(count); 
   
        
}
  
}















