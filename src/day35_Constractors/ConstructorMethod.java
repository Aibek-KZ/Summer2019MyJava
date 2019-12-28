package day35_Constractors;

public class ConstructorMethod {
	
	/*
  Constructor:
	       1. every single class MUST have Constructor
	       2. if don't give the constructer, then compiler will give the default constructor
	       3. execution depends on the creation of the object
	       4. Constructor' name MUST be same with class' name
	       5. Constructor can be overload
	 
	create object froma class:
	     ClassName obj = new existingConstructor();
	            
	 decleration of constructor:
	    default (no argument)   
	       access-modifier  className() {
	       
	       }       
	       
	constructor call:
	 1. only a constructor can call another constructor        
	 2. Constructors cannot be called by their name, we MUST use this
	 3. Constructor call has to be the first statement in the constructor
	 4. Constructor can not call more than one  
	 
	 
	*/
	public ConstructorMethod(double a) { //same with the class name
		System.out.println("Default constructor "+a);
	}
	
	public ConstructorMethod(int a) { //same with the class name
		this(2.35);
		System.out.println("Default constructor "+a);
	}
	
	public ConstructorMethod(boolean a) {
		this(100);// constructor call must be first
	//	this(10.5); one constructor can only call one constructor 
	//  this(true); constructor can not call itself	or contain itself
		System.out.println("with argument "+a);
	}
	
	public static void main(String[] args) {
//		ConstructorMethod obj = new ConstructorMethod("Hello"); error, 
		                             //the constructor is not exist
//		ConstructorMethod obj = new ConstructorMethod();
		                             //the constructor is not exist
		ConstructorMethod obj = new ConstructorMethod(100);
		
		ConstructorMethod obj1 = new ConstructorMethod(true);
	}
	
	
	
	
	
	
	

}
