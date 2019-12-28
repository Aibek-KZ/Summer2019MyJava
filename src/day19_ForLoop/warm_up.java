package day19_ForLoop;

import java.util.Scanner;

public class warm_up {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your username: ");
		String user=input.nextLine().toLowerCase();
		System.out.println("Enter your password:");
		String pass=input.nextLine();
		String username="cybertek.batch12@gmail.com";
		String password="Javengers";
		 
		   if(user.endsWith("@gmail.com")) {
			   if(user.equalsIgnoreCase(username) && pass.equals(password)) {
				   System.out.println("Loged in successfully");
			   } else {
				if(!user.equalsIgnoreCase(username) && !pass.equals(password)) {
				   System.out.println("Both username and password are incorrect");}
				else if(!user.equalsIgnoreCase(username)){
					System.out.println("Invalid username");	}
				else {System.out.println("Invalid password");}
			   }
			   
		   } else {System.out.println("it's not a valid email address");}
		
		
		
	}

}
