package javaAssignments;
import java.util.Scanner;
public class Declare_var024 {
public static void main(String[] args) {
	String contacts="";
	String fullName="";
	String address="";
	Scanner input=new Scanner(System.in);
	System.out.println("Welcome to the patient portal!");
	System.out.println("Please enter your personal information");
	System.out.println("Enter your first name");
	String name=input.nextLine();
	System.out.println("Enter your last name");
	String last=input.nextLine();
	System.out.println("Enter your email");
	String email=input.nextLine();
	System.out.println("Enter your street");
	String street=input.nextLine();
	System.out.println("Enter your city");
	String city=input.next();
	System.out.println("Enter your state");
	String state=input.next();
	System.out.println("Enter your zip code");
	int zip=input.nextInt();
	System.out.println("Enter your work phone number");
	long phone=input.nextLong();
	System.out.println("Enter your personal phone number");
	long personal=input.nextLong();
	System.out.println("Enter your age");
	int age=input.nextInt();
	System.out.println("Enter your height");
	double height=input.nextDouble();
	System.out.println("Enter your weight");
	double weight=input.nextDouble();
	System.out.println("Are you married?");
	boolean married=input.nextBoolean();
	
	fullName=last.concat(", "+name);
	address=street.concat(", "+city+", "+state+" "+zip);
	contacts="work phone number - "+phone+", "+"personal phone number - "+personal+", "+"email: "+email;

	System.out.println("Patient personal information");
	System.out.println("Full name: "+fullName);
	System.out.println("Address: "+address);
	System.out.println("Contacts: "+contacts);
	System.out.println("Age: "+age);
	System.out.println("Height: "+height);
	System.out.println("Weight: "+weight+" pounds");
	System.out.println("Married?: "+married);
	
}
}
