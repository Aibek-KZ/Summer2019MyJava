package day14_scanner;

import java.util.Scanner;
public class ScannerClass {
	
	public static void main(String[] args) {
		
//Scanner: it's a class that provides the methods to get user inputs
//Scanner class presented in package "java.util"
// in order to use scanner class, the scanner class MUST be imported: import java.util.Scanner;
// the import statement MUST be placed between package and class name
	// Scanner VariableName=new Scanner(System.in);
		//VariableName: can reference an object of the scanner class
		//new Scanner(System.in): creates the object of the scanner class
		//methods of scanner class: 
		// VariableName.nextByte():   allows user to enter Byte value
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Byte value");
		byte byteNum=input.nextByte();
		System.out.println("You have entered "+byteNum);
		System.out.println("Enter a Byte value2");
		byte byteNum2=input.nextByte();
		System.out.println("You have entered: "+byteNum2);
		
		System.out.println("Addition is: "+(byteNum+byteNum2));
		
		
	}

}
