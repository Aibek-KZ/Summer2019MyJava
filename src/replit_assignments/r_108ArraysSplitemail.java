package replit_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class r_108ArraysSplitemail {
public static void main(String[] args) {
	/*
	 Given a String variable email, write code using split method to print email
	  id and domain in separate lines.
	  email -> info@cybertekschool.com
      Print:  
      Email id: info
      Email domain: cybertekschool.com
      
      email -> hello-gmail.com
       print:  
        invalid email

         email -> my@fancy@email.com
          print:  
        invalid email
	 */
	Scanner input = new Scanner(System.in);
    String email = input.nextLine();
    
    //Write your code below
    int count=0;
    for(int i=0; i<email.length(); i++) {
    	if(email.substring(i, i+1).equals("@")) {
    		count++;    		
      } 	else if(email.substring(i, i+1).equals("-")) {
    		System.out.println("Invalid email");
    	} else if (email.substring(i, i+1).equals("+")) {
    	   System.out.println("Invalid email");
    	}	else if (email.substring(i, i+1).equals("_")) {
         	System.out.println("Invalid email");
    }
    }
    if(count==1) {
    	String[] id=email.split("@", 2);
	System.out.println("Email id: "+id[0]);
	System.out.println("Email domain: "+id[1]);
    } else if(count>1||count==0) {
     	System.out.println("Invalid email");

    }

    }
}

