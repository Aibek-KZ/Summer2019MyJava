package day15_Sc;
import java.util.Scanner; //imports Scanner classes only from java.util, *imports all the classes 
/*    package name: java.util
      class name: Scanner
Scanner class is presented in "java.util" package
in oreder to use scanner, we MUST import it from its package:
      import java.util.Scanner
  
  package A;
  import java.util.Scanner
  public class B{}      
  
  import java.util.*; imports all the classes within "java.util" package 
  
  Declaration of Scanner class:  Scanner variableName = new Scanner(System.in)
  variableName: can reference an object of scanner class 
   
   variableName.nextByte
   variableName.nextShort
   
 */
public class Scanner_class {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Byte value: ");
		byte num=input.nextByte(); //returns user input to Byte value
		System.out.println(num);
		
		Scanner input2=new Scanner(System.in);
		System.out.println("Enter short number: ");
		Short num2=input2.nextShort();
		System.out.println(num2);
		
		Scanner input3=new Scanner(System.in);
		System.out.println("Enter Int number: ");
		int num3=input3.nextInt();
		System.out.println(num3);
		
		Scanner input4=new Scanner(System.in);
		System.out.println("Enter long number ");
		long num4=input4.nextLong();
		System.out.println(num4);
		
		Scanner input5=new Scanner(System.in);
		System.out.println("Enter boolean value: ");
		boolean result=input5.hasNextBoolean();
		System.out.println(result);
		
		Scanner input6=new Scanner(System.in);
		System.out.println("Enter float number:");
		float num6=input6.nextFloat();
		System.out.println(num6);
		
		Scanner input7= new Scanner(System.in);
		System.out.println("Enter double number");
		double num7=input7.nextDouble();
		System.out.println(num7);
		
		Scanner input8=new Scanner(System.in);
		System.out.println("Enter your name ");
		String str=input8.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
