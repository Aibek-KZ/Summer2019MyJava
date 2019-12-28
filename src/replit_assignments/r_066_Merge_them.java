package replit_assignments;

import java.util.Scanner;

public class r_066_Merge_them {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
    String word1 = scan.next();
    String word2 = scan.next();
    //YOUR CODE HERE
    int len1=word1.length();
    int len2=word2.length();
    String reverse="";
       if(len1==3 && len2==3) {
    	   for(int i=0; i<=2; i++) {
    		reverse=""+reverse+word1.charAt(i); 
    		reverse=""+reverse+word2.charAt(i);
    	   }
    	   System.out.println(reverse);
       } else {
    	   System.out.println("cannot merge");
       }
    
    
	
}
}
