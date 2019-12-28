package day03_variables;

public class Primitive_Data_Types {
    /* byte: we can assign only whole numbers, between -128 and 128
     * short: we can assign only whole numbers, between -32768 and 32767
     * int: we can assign only whole numbers, must be between -2147483648 and 2147483648
     * long: we can assign only whole numbers, musr be between 
     * float: we can assign decimals
     * 
     
     */
	
	public static void main(String[] args) {
		
		byte length = 3;
		System.out.println(length);
		byte width = 4;
		 short age = 32767;
		 System.out.println(age);
		short num3 = -11000;
		int num4 = 5000000;
		
		long longNumber = 10l;
		int intNumber = 10;
		
		float example = 10.58F;
		System.out.println(example);
		
		double doubleNumber = 148.3957;
		double doubleNumber2 = example;
		System.out.println(doubleNumber2);
		
	}
}
