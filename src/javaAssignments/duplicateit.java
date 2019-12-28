package javaAssignments;
import java.util.Scanner;
public class duplicateit {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter word");
	String word1=input.nextLine();
	System.out.println("Enter second word");
	String word2=input.nextLine();
	System.out.println(word1.concat(word2.concat(word2.concat(word1))));
	
	
	
}
		
}
