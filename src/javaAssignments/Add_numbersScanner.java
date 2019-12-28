package javaAssignments;
import java.util.Scanner;
public class Add_numbersScanner {

	public static void main(String[] args) {
		
		Scanner enter=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num1=enter.nextInt();
		System.out.println("Enter a next number ");
		int num2=enter.nextInt();
		System.out.println("Enter a next number ");
		int num3=enter.nextInt();
		System.out.println("Sum of numbers "+(num1+num2+num3));
		
	}
}
