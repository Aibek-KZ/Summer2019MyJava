package replit_assignments;

import java.util.Scanner;

public class r_148Methods10 {
/*
 Create a method called next3 . This method gets an int argument and prints the next 
 3 numbers after that number. Call the method from main method and pass num to it.
     enter number   1
        next 3 are:
                    2 3 4
(put a space between numbers)
 */
	 public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	     next3(num);	  
	  }
	 
	 public static int next3(int a) {
		 for(int i=1; i<4; i++) {
			 System.out.print((a+i)+" ");			 
		 }
		 return a;
	 }

}
