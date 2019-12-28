package replit_assignments;

import java.util.Scanner;

public class r_057_findUser {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter full name:");
	String name=input.nextLine();
	
	if(name.equalsIgnoreCase("Max Payne") || name.equalsIgnoreCase("Alan Wake")) {
		System.out.println("User found!");
	} else {
		System.out.println("User not found!");
	}
	
	
}
}
