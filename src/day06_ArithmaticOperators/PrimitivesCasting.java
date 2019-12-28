package day06_ArithmaticOperators;

public class PrimitivesCasting {

	/* Casting: converting larger primitive to smaller size
	    datatype variablename = (datatype) value
	    castings: Explisit&implicit
	    
	 * Primitives: byte, short, int, longe, float, double
	 * 
	 */
	public static void main(String[] args) {
		int a = 124;
		byte b = (byte) a; //explicit casting
		System.out.println(b);
		
		double DecNumber = 10.5;
		float FloatNumber = (int)DecNumber; //double>float
		System.out.println(FloatNumber);
		
		long LongNumber = 300l;
		//int intNumber = (int)LongNumber;
		int intNumber = (short)LongNumber;
		System.out.println(intNumber);
		
		// Implicit casting:
		byte ByteNum = 100;
		int IntNum = ByteNum;
		long LongNum1 = ByteNum;
		System.out.println(LongNum1);
		
		//explicit casting practices:
		double LargestNumber = 111.8759;
		byte ByteValue = (byte)LargestNumber;
		System.out.println(ByteValue);
		
	}
}
