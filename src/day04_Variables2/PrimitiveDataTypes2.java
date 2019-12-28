package day04_Variables2;

public class PrimitiveDataTypes2 {

	/* Primitives  byte, short, int, long, float, double we are know
	 *  boolean: takes either True or False boolean expression
	 *  ASCII table: 
	 *  char: 
	 */
	public static void main(String[] args) {
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 < 3;
		// boolean result4 = Ears is Flat; wrong!!!
		 		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'a';
		char char2 = '/';
		char char3 = 123;
		char char4 = '{';
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		System.out.println(char4);
		
		
		//init
		char MyChar1 = 'b';
		int MyInt1 = MyChar1;
		int MyInt = 'b'; //the number that represents b is initialized to the int
		System.out.println(MyInt);
		
		byte MyByte = 'b';
		//byte MyByte1 = MyChar1; wrong
		
		//short ShortNum = MyChar1; char's memory is could be bigger than short
		short ShortNum = 'b';
		System.out.println(ShortNum);
		
		long longNum = MyChar1;
		long longNum1 = 'b';
		System.out.println(longNum);
		System.out.println(longNum1);
		
		float floatNum = MyChar1;
		float floatNum2 = 'b';
		System.out.println(floatNum2);
		
		double doubleNum = MyChar1;
		double doubleNum2 = 'b';
		System.out.println(doubleNum);
		System.out.println(doubleNum2);
		
		
		char mycharvalue = 63500;
		System.out.println(mycharvalue);
		
		
	}
}
