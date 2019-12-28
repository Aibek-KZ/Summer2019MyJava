package day30_Wrapper_Class_Array;

public class ValueOf_methods {
public static void main(String[] args) {
	/*
	 ValueOf method: converts String value to Wrapper class values, returns wrapper class value
	 */
	int z=Integer.valueOf("1234");//unboxing
	Integer z1=Integer.valueOf("1234");//none
	Integer z2=(int)Integer.valueOf("1234");//auto-boxing
	System.out.println(z2);

	boolean R=Boolean.valueOf("TruE");//unboxing
	System.out.println(R);//true
	
	
	
	int totalNumber=100;
	String str1=""+totalNumber;//none of the boxing
	System.out.println(str1);
	
	
}
}
