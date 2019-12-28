package day29_ReturnMethods;

public class ReturnMethods {
     /*
      return methods:
          access-modifier specifier   return type  name(parameter) {}
              public       static         void
      
      return-Type: void or other data types (int, String)
      
      if the type is void, the method does not return any value
      
       if the return type is not void: the method MUST return a value
              
      */
	// public static void methods { }
	//return statement: its used for exiting 
	
	//return method: 
	//     1. does not have "void" as return Type
	//     2. MUST return a value
	//     3. the returning value MUST match with the return type of the method
	//     4. the method body must be closed with "return" statement
	
	public static void main(String[] args) {
		name();//this is a String value
		System.out.println(name());
		String str=name();
		System.out.println(str);
		System.out.println(numbers());
		System.out.println(ch());
	}
	
	public static char ch() {
		return 'A';
	}
	
	public static int numbers() {
		return 120;
	}
	
	public static boolean result() {
		return 12>5;//can be true, false...
	}
	
	
	//if the return type is not void:
	public static String name() {
		return "Batch12";
		}
	
}
