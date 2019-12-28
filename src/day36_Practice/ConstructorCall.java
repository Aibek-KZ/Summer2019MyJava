package day36_Practice;

public class ConstructorCall {

	/*
	 1. only constructor call another constructor
	 2. constructor can not be called constructor name
	 3. to call the constructor use "this()"
	 4. constructor call must be the first step in a constructor
	 5. one constructor can call only one constructor 
	 */
public ConstructorCall() {
		
		System.out.println("A");
		
	}
	
	public ConstructorCall(int a){
		//ConstructorCalls();
		
	//	System.out.println("B"); // constructor call has to be the first step in a constructor
		this();  // A
		System.out.println("B");
		
	}
	
	public ConstructorCall(double a) {
		
		this(10);  // A B
		//this();    // one constructor can only call one constructor
		System.out.println("C"); // C
		
	}
	
	
	
	public static void main(String[] args) {
		method1();
	//	ConstructorCalls();
		
		ConstructorCall obj  = new ConstructorCall( 10.5 );  // A B
		
		
		
		
		
	}
	
	public static void method1() {
		
		
	}
	
	public static void method2() {
		method1();
	}
	

	
}
