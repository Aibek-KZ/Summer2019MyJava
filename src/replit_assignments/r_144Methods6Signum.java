package replit_assignments;

import java.util.Scanner;

public class r_144Methods6Signum {
	/*
	 a sign function is simple, its gets a number and tells you if its positive, 
	 negative or zero
	 sign(5)  => 1
     sign(-30)=> -1
     sign(0)  => 0
	 */
	
	public static void sign(int n)
	  {
	    //your code here
		if(n>0) {
			System.out.println("1");
	   } else if(n==0) {
		   System.out.println("0");
	   } else {
		   System.out.println("-1");
	   }
		
	  }//end sign
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
	  }
	
	
	
}

