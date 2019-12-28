package day27_Custom_Methods;

public class Void_Method_with_Argument {
    /* methods with argument:
                acces-modifier  specifier   return-type  name(parameter) { }
   parameter: can be any data type
    */
	public static void main(String[] args) {
		//method was designed to take an argument.(a number)
		              //the method needs the argument in order to perform its task 
		ODDorEVEN(11);// need to provide only int, than can be assigned to the parameter
		int z=50;
		ODDorEVEN(z);//variable z value will be assigned to parameter variable
		SUMofTwoNumbers(50, 40);
		
	}
	
	public static void SUMofTwoNumbers(int a, int b) {

		System.out.println("Sum of "+ a +" and "+ b +" is "+( a + b));
	}
	
	
	public static void ODDorEVEN(int a) {
		if(a%2==0) {
			System.out.println(a+" is Even number");
		} else {
			System.out.println(a+" is Odd number");
		}
		
	}
	
	
	
	
	
	
}
