package day15_Sc;

public class StringClass {

	public static void main(String[] args) {
		/* String class: 
		 1. String is an object, there are two ways to create objects from
		 String class:
		    1) String literals  String s1="Cat"; String s2="Cat"; in one value
		    when the string objects is created by String literals, that object will be saved at String pool.
		    (String pool does not take dulicates)
		    2) by using "new" keyword  String s2=new String("Cybertek");
		    the object will be saved at Java Heap memory(not withing the string pool)
		    	heap memory: the place where all the objects are located.	  
		 
		 String str="Cybertek"
    	 index number: 01234567
		 */
		String str="Cybertek";
		String A="Cybertek";
		String B="Cybertek";
        System.out.println(A==B); //true, they are in same memory location in string pool
        
        String str2=new String ("Cybertek");
        System.out.println(str==str2); //false, different memory location, outside of string pool
        String str3=new String("Cybertek");
        System.out.println(str2==str3);// false, because out of pool, new creation
        
	}
}
