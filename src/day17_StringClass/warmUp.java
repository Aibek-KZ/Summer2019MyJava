package day17_StringClass;
import java.util.Scanner;
public class warmUp {
 public static void main(String[] args) {
	
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter your first and last name");
	 String first=input.next();
	 String last=input.next();
	String initials=first.substring(0, 1).concat(".")+last.substring(0, 1).concat(".");
	System.out.println("initial is: "+initials.toUpperCase());
	 
	//next solution
	char c1=first.charAt(0);
	char c2=last.charAt(0);
	System.out.println(c1+"."+c2+".");
	
	// last letters
	String lastletters=""+first.charAt(first.length()-1)+"."+last.charAt(last.length()-1);
	System.out.println("Last letters: "+lastletters.toLowerCase());
	
	
}
}
