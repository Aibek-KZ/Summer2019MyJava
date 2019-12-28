package javaAssignments;
import java.util.Scanner;
public class Same_or_not2 {
public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter first word");
	  String word1=input.nextLine();
	  System.out.println("Enter second word");
	  String word2=input.nextLine();
	  int num2=word2.length();
	  String first=word1.substring(0, 2);
	  String second=word2.substring(num2-2, num2);
	  boolean result=first.equals(second);
	  System.out.println(first+" and "+second+" are same");
	  System.out.println(result);
	  
	  
	  
	  
	  
	
	  
	  
	  
}
}
