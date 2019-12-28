package day36_Practice;

public class Constructor_review {

	/*
	 Constructor: special method, used when we create an object of a class
	 Every class must have a constructor
	 
	 */
	public Constructor_review() { //default constructor, no argument
		System.out.println("This one is default constructor");
	}
	
	public Constructor_review(String a) {
		System.out.println("This is String constructor "+a);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Constructor_review obj = new Constructor_review();
		Constructor_review obj2 = new Constructor_review("apple");
		
	}
	
	
}
