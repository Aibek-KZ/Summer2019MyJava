package day34_Constructors;

public class ConstructorMethods {
/*
  In Java 3 methods:
      1. void methods
      2. return methods
      3. Constructor(Special method)
 *****************************
 Constructor method can be overload
 if we want to have more than one Constructor we MUST overload the constructor
 
  regular method: 
         acces-modifier specifier return-type methodname(parameter) {
         }
         
  Constructor: it is very special method, every single must have constructor
  if we didn't give constructor , than the compiler will give the default(no argument)
  constructor
    Constructor can not have return type and specifier
    Constructor' name must be same with the class name
    
    Constructor' execution depends on the creation object
    
    Constructor calls:
    only a Constructor can call another Constructor
  
  decleration of constructor:
      default  constructor (constructor without argument):  compiler will create aut
      acces-modifier className() {
      }
  
     access-modifier className(parameter) {

     
   create an object from a class:
      className referenceName = new existingConstructor
 */
	public ConstructorMethods() {
		System.out.println("Empty");
		System.out.println("I am a happy and greatful");
	}
	
	public ConstructorMethods(int num) {    // Constructor method can be overload
		System.out.println("Using int "+num);
	}
	
	public ConstructorMethods(double num ) {
		System.out.println("Using a double "+num);
	}
	
	public ConstructorMethods(boolean z) {
		System.out.println("Boolean type "+z);
	}
	
	public static void main(String[] args) {
	//	Constructor obj = new Constructor();
	//	ConstructorMethods obj=new ConstructorMethods("A");
		//object was not created with existing constructor
		ConstructorMethods obj2=new ConstructorMethods();
		
	}
}
