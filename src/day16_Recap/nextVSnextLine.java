package day16_Recap;
import java.util.Scanner;
public class nextVSnextLine {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your first name ");
	String name=input.nextLine();
	System.out.println("Enter your last name ");
	String last=input.nextLine();
	System.out.println("First name is "+name.toUpperCase());
	System.out.println("Last name is "+last.toUpperCase());
}
	
}
