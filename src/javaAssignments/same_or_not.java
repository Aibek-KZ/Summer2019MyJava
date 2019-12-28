package javaAssignments;
import java.util.Scanner;
public class same_or_not {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a word");
	String word1=input.nextLine();
	int l=word1.length();
	String first=word1.substring(0, 1);
	String second=word1.substring(l-1, l);
	boolean result=first.equals(second);
	System.out.println(result);
	
}
}
