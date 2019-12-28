package replit_assignments;

import java.util.Scanner;

public class r_141MethodsFindCube {
	/*
	 Given method called cube. Write all required code inside this method in order 
	 to asks the user for a number and then prints the cubed value of that number:
	 Example:

     input: 5
     output: 125
	 */
	public static void cube()
	  {
	    //your code here
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		System.out.println(number*number*number);
		
		
	  }//end cube
	  
	  public static void main(String[] args) {
	    
	    cube();
	   
	  }
	
}

