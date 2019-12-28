package replit_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class r_146MethodsSplit {
	/*
	 he method person get a string with this format : "name,last name,age"
     for example: 
               person("jon,doe,30");
      the output is:
               person name: jon last name: doe age: 30
	 */
	
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String info) 
		{
		
			//your code here
			String[] name1=info.split(",");
			for(int i=0; i<name1.length; i++) {
				if(i==0) {
					System.out.print("person name: "+name1[i]);
				}
				if(i==1) {
					System.out.print(" last name: "+name1[i]);
				} if(i==2) {
					System.out.print(" age: "+name1[i]);
				}
			}
		   
		
		}//end person
	  
	
}

