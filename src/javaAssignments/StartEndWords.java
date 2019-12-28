package javaAssignments;
import java.util.Scanner;
public class StartEndWords {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a first word");
	String word1=input.nextLine();
	System.out.println("Enter a second word");
	String word2=input.nextLine();
	int num1=word1.length(); 
	int num2=word2.length(); 
	String first=""+word1.charAt(0);
	String second=""+word2.charAt(num2-1);
	
	if(num1==num2) {
		   if(first.equals(second)) {
			   System.out.println("Fizz");
		   } else  {
			   System.out.println("Buzz did not match");
		   }}
	     else {
		   System.out.println("need to be exacly 5 chars length");
	   } 
	
	
}
}
