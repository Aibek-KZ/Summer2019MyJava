package javaAssignments;
import java.util.Scanner;
public class numbers37 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your first name ");
	String name=input.nextLine();
	System.out.println("Enter your last name ");
	String last=input.nextLine();
	String fullname=name.concat(" "+last);
	int num=fullname.length()-1;
	System.out.println(fullname+" contains "+num+" caracters");
	System.out.println(fullname.length()+" caracters");
	System.out.println(fullname.charAt(5));
	
	
	
	}
	
    }

