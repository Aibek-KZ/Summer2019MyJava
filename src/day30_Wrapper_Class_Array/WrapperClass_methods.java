package day30_Wrapper_Class_Array;

public class WrapperClass_methods {
public static void main(String[] args) {
	/*	
	useful methods of Wrapper class:
	   Max_Value: returns maximum value of the primitives, max range
       Min_Value: returns minimum value of the primitives, min range
       parse methods: converts String values to primitives, case sensitive
       ValueOfmethods: converts String values to Wrapper class values, case sensitive
		
	*/
	int maximum=Integer.MAX_VALUE;
	System.out.println(maximum);
	int minInt=Integer.MIN_VALUE;
	System.out.println(minInt);
	
	double maxDouble=Double.MAX_VALUE;
	System.out.println(maxDouble);
	double minDouble=Double.MIN_VALUE;
	System.out.println(minDouble);
	
	byte maxByte=Byte.MAX_VALUE;
	System.out.println(maxByte);
	byte minByte=Byte.MIN_VALUE;
	System.out.println(minByte);
	
	char maxChar=Character.MAX_VALUE;
	System.out.println(maxChar);
	char minChar=Character.MIN_VALUE;
	System.out.println(minChar);
	
	
	//parse methods: converts String values to primitives
	
	//parseInt("strValue"): takes the String and converts the String to Int
	Integer num1=Integer.parseInt("123");//auto-boxing
	System.out.println(num1+1);
	
	int num2=Integer.parseInt("125");//none
	System.out.println(num2);
	
	//parseByte("strValue"): takes the String and converts the String to Byte primitive
	int num3=Byte.parseByte("18");
	System.out.println(num3);
	byte num4=Byte.parseByte("119");//none
	System.out.println(num4);
	
	Byte num5=Byte.parseByte("28"); //none
	System.out.println(num5);
	
	//parseShort("strShort"): takes the String and converts the String to Short primitive
	short num6=Short.parseShort("200");//none
	System.out.println(num6);
	Short num7=Short.parseShort("200"); //auto-boxing
	
	
	//parseLong("strValue"): takes the String and converts the String to Long primitive
	long num8=Long.parseLong("1222");
	System.out.println(num8);
	int num9=(int)Long.parseLong("1223");
	System.out.println(num9);
	
	//parseFloat("strValue"): takes the String and converts the String to Float primitive
	float num10=Float.parseFloat("12.5f");//none
	System.out.println(num10);
	Float num11=Float.parseFloat("124.65");//auto-boxing
	System.out.println(num11);
	
	//parseDouble("strValue"): takes the String and converts the String to Double primitive
	float num12=(int)Double.parseDouble("425.55");//none
	System.out.println(num12);
	Double num13=Double.parseDouble("425.55");//auto-boxing
	System.out.println(num13);
	
	
	//parseBoolean("strValue"): takes the String and converts the String to boolean primitive
	boolean A=Boolean.parseBoolean("Cybertek");//any string value other than "true" will return false
	System.out.println(A);
	boolean B=Boolean.parseBoolean("TrUe");//method ignore the case sensitivity
	System.out.println(B);
	boolean C=Boolean.parseBoolean("10>9"); // "10>9" !="true" result is "false"
	System.out.println(C);
	Boolean D=Boolean.parseBoolean("Abeke");//auto-boxing
	System.out.println(D);
	
	//=============================================================
	int a=10;
	double b=a;
	//Double c = a; Double wrapper class is only Dedicated to double primitives
	Double c=(double)Integer.parseInt("25");
	System.out.println(c);
	
	int A1=28;
	//Float A2=A1; needs to cast
	Float A2=(float)A1;
}
}
