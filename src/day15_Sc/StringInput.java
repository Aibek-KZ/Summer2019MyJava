package day15_Sc;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		//next vs nextLine==> next can take only one word, nextLine can take entire text or sentence
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=scan.nextLine();
		System.out.println("Enter your last name");
		String lastName=scan.nextLine();
		System.out.println(name+" "+lastName);
		
		Scanner input=new Scanner(System.in);
		System.out.println("Car model: ");
		String car=input.nextLine();
		System.out.println(car);
		
		input.close();//gets rid of warning of the scanner class
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
