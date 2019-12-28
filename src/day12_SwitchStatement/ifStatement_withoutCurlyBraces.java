package day12_SwitchStatement;

public class ifStatement_withoutCurlyBraces {

	public static void main(String[] args) {
		
		if(true) {
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
      //without curly braces: a single line of statement
			if(true)
				System.out.println("Hello World");
			//System.out.println("Hello"); without curly brace if block can not hold more than one statement

			else 
				System.out.println("Hello");

			//multi-branch if:
			int grade=80;
			if (grade<=100&&grade>=0) {
			if (grade>=90 ) {
				System.out.println("A");
			} else if(grade>=80) {
				System.out.println("B");
			} else if (grade>=70) {
				System.out.println("C");
			} 
			} else {
				System.out.println("invalid number");
			}
		
			
			if (grade<=100&&grade>=0)
				if(grade>=90)
					System.out.println("A");
				else if (grade>=80)
					System.out.println("B");
				else if (grade>=70)
					System.out.println("C");
				else System.out.println("");
			else System.out.println("Invalid number"); 
			
		}
	}

