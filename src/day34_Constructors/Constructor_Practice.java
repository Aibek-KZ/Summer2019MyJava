package day34_Constructors;

public class Constructor_Practice {
    //default constructor is given by default, when is no constructor
	public Constructor_Practice(int a) {//the method name MUST be same with the class name
		method1();
		System.out.println("With int parameters "+a);
	}
	
	public static void main(String[] args) {
		
		Constructor_Practice obj = new Constructor_Practice(10);
	}
	
	public static void method1() {
		System.out.println("Method 1");
	}
}
