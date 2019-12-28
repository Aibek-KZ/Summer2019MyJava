package javaAssignments;
import java.util.Scanner;
public class substring01 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a word");
	String word1=input.nextLine();
	String first=word1.substring(0, 1);
	String second=word1.substring(1, 2);
	String third=word1.substring(0, 2);
			
	  if (third.equals("xx"))  {  
			  word1=word1.substring(2);
	  } else if (first.equals("x")) {
       word1=word1.substring(1);
	   } else if (second.equals("x")) {
		   String word2=word1.substring(2);
		   String word3=word1.substring(0, 1);
		   word1=word3.concat(word2);
	   }  else {System.out.println(word1);}
	   
	   System.out.println(word1);
	



}
}
