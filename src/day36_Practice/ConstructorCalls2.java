package day36_Practice;

public class ConstructorCalls2 {
	/*
	 1. only constructor call another constructor
	 2. constructor can not be called constructor name
	 3. to call the constructor use "this()"
	 4. constructor call must be the first step in a constructor
	 5. one constructor can call only one constructor 
	 6. constructor cannot call itself
	 7. constructor cannot contain itself	 
	 */
	public ConstructorCalls2() {
	//	this();  constructor cannot call itself
	//	this(true); constructor cannot contain itself
	}
	
	public ConstructorCalls2(boolean a) {
	//	this(true);  constructor cannot call itself
		this();		
	}
	
	public ConstructorCalls2(String d) {
	//	this("Hi"); constructor cannot call itself
	}
	
	
	
	
	
}
