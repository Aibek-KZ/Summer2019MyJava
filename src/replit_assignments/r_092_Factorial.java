package replit_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class r_092_Factorial {
public static void main(String[] args) {
	/* In mathematics, the factorial of a positive integer n, denoted by n!, is the
	   product of all positive integers less than or equal to n.  Calculate factorial
	   and output result to the console. 
	 Example:
              input: 5
              output: 120     
              8!=8*7*6*5*4*3*2*1= 40,320   
	 */
	
	Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long n1=n;
    long factorial=1;
         for(int i=1; i<=n1; i++) {
            	factorial=factorial*i;
    	        
    }
    System.out.println(factorial);
    
	
    
	
    
}
}
