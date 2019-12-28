package javaAssignments;
import java.util.Scanner;
public class Last_two {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a word");
	String word1=input.nextLine();
	int num1=word1.length();
	
	
	  if(num1>=2) {
		 String last=word1.substring(num1-1, num1);
		String second=word1.substring(num1-2, num1-1);
		word1=word1.substring(0, num1-2);
		word1=word1.concat(last.concat(second));
		System.out.println(word1);
		
		  
	} else {
		System.out.println("Enter 2 or more characters");
	}
	
	
	
	
	
}
	
	
}
