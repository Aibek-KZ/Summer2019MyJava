package day30_Wrapper_Class_Array;

import java.util.Arrays;

public class WrapperClass {
/*
 Wrapper classes: 
 every primitive in java has a class thats disigned to it
     primitives: byte, short, int, long, float, double, boolean, char
     
 Wrapper classes: Byte, Short, Integer, Long, Float, Double, Boolean, Character
 all wrapper class presented in "java.lang" package,
 String class is also presented in "java.lang" package
 
    All classes in package "java.lang" imported by default
    
    primitives             wrapper-class
      byte                 Byte
      short                Short
      int  auto-boxing     Integer
      long    ======>      Long
      float    unboxing    Float
      double  <=======     Double
      boolean              Boolean
      char                 Character
 
 default values of primitives:          default value of wrapper classes:
     byte, short, int, long ===> 0;          null
     double, float  ===> 0.0;                null
     boolean==> false;                       null
     char===>'';                             null 
     
 default value of wrapper classes: null;
 if we do not give any objects to class null will be given by default    
 */
	public static void main(String[] args) {
		int numInt=10;//primitive data
		Integer numInteger=10;//wrapper class
		
		double numdouble=5.5;
		Double numDouble=5.5;
		
		long numlong=20l;
		Long numLong=numlong;//auto-boxing: converting primitive to wrapper class,  
		System.out.println(numLong);
		System.out.println(numlong);
		
		Boolean Booleanresult=false;
		boolean booleanresult=Booleanresult;//Unboxing: converting wrapper class value to primitives
	
		int[] arr=new int[3]; //[0, 0, 0] primitive
		
		Integer[] arr1=new Integer[3]; //
		System.out.println(Arrays.toString(arr1));//[null, null, null] wrapper class
		
		int num1=10;
		//num1.method(); primitives does not have methods
		
		Integer num2=20;
		int num3= num2.SIZE;//yes
		
	
	}
	
	
	
	
}
