package replit_assignments;

import java.util.Scanner;

public class r_095_Get_Sandwich {
public static void main(String[] args) {
	/*
	 A sandwich is two pieces of bread with something in between. Print the string 
	 that is between the first and last appearance of "bread" in the given string, or 
	 return string "nothing" if there are not two pieces of bread.
    Example:
     input: breadjambread     xxbreadjambreadyy      xxbreadapple      breadbutterbread
     output: jam                    jam                 nothing            butter
	 */
	Scanner scan = new Scanner(System.in);
    String str = scan.next();
    String text=""; 
    int count=0;
    
      for(int i=0; i<str.length()-4; i++) {
    	  if(str.substring(i, i+5).equals("bread")) {
          		  count++;
    	  }
    	 }
     	  if(count>=2) {
       text= str.substring(str.indexOf("bread"));
    	text=text.substring(0, text.lastIndexOf("bread"));	
    	text=text.replaceFirst("bread", "");
    		  }
    	  else {
    			  System.out.println("nothing");
     	  }
    		 System.out.println(text);
}
}
    
    
         


