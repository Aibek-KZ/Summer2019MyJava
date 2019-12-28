package javaAssignments;
import java.util.Scanner;
public class middle_character {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the word ");
	String word=input.nextLine();
	int num1=word.length();
	int num2=0;
	//System.out.println(num1);
	if(num1%2==0) {
		num1=num1/2-1;
		num2=num1+2;
		word=word.substring(num1, num2);
		System.out.println(word);
	} else {
		num1=num1/2;
		num2=num1+1;
		word=word.substring(num1, num2);
		System.out.println(word);
		
		// next assignment
		//Ignore the fist characters
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first word");
		String text1=scan.nextLine();
		System.out.println("Enter a second word");
		String text2=scan.nextLine();
		text1=text1.substring(1);
		text2=text2.substring(1);
		System.out.println(text1.concat(text2));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	
}
