package day21_while_loops;

import java.util.Scanner;

public class practice {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	 while (true){
	System.out.println("Enter a first number");
	int num1=input.nextInt();
	System.out.println("Enter a second number");
	int num2=input.nextInt();
	
	System.out.println("addition is: "+(num1+num2));
	System.out.println("Do you wanna continue?");
	String answer=input.next();
	if(answer.equalsIgnoreCase("no")) {
		break;
	}  else {
		System.out.println("Completed");
	}
	 } 
		 
	
	
}
}
