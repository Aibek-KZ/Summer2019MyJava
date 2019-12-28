package day18_StringClassContinue;
import java.util.Scanner;
public class warmUp {
public static void main(String[] args) {
	//mUHtaR  cYbeTEk
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your first name");
	String first=input.nextLine();
	first=first.substring(0, 1).toUpperCase()+first.substring(1).toLowerCase();
	System.out.println(first);
	
	System.out.println("Enter your last name");
	String last=input.nextLine();
	last=last.substring(0, 1).toUpperCase()+last.substring(1).toLowerCase();
	System.out.println(last);
	
	//char value
	
	
}
}
