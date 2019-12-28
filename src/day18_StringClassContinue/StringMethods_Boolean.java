package day18_StringClassContinue;

public class StringMethods_Boolean {
	public static void main(String[] args) {
		
		// isEmpty(): checks if the String is empty returns boolean expression
	String str="Cybertek";
	boolean R1=str.isEmpty();
	System.out.println(R1);//false
	
	String str2="";
	if (str2.isEmpty()) {
		System.out.println("its empty");
	} else {
		System.out.println("its not empty");
	}
	
	// equals(str): checks if the two Strings face values are equal or not, then returns boolean
	// expression      
	String A1="Cybertek";
	String A2=new String("Cybertek");
	System.out.println(A1==A2); //false
	boolean R2=A1.equals(A2);//true
	System.out.println(R2);
	
	// equalsIgnoreCase(str): case sensitive does not matter
	String s1="JAVA";
	String s2=new String("java");
	System.out.println(s1==s2);// false
	System.out.println(s1.equals(s2));//false
	System.out.println(s1.equalsIgnoreCase(s2));// true
	
	// Contains(str): checks if the str is conained in the String or not, then returns 
	//boolean expression
	//contained==> true     !contained==>false
	String name="Muhtar";
	boolean result=name.contains("ABC");//false
	System.out.println(result);
	String name2="Marufjon";
	System.out.println(name2.contains("m"));//false, case sensitive
	
	// startsWith(str): checks if the String is started with the given str or not, then
	//returns boolean expression 
	  String today="Java";
	  boolean R3=today.startsWith("Java");
	 System.out.println(R3);//true
	 	 String names="Cybertek school is a great place to learn Java";
	 System.out.println(names.startsWith("Cybertek"));//true
	
	// endsWith(str): checks if the string is ended with given str or not, then returns
	 //boolean expression
	 String B1="Muhtar";
	 System.out.println(B1.endsWith("R"));//false
	 System.out.println(B1.endsWith("r"));//true
	 

	}

}
