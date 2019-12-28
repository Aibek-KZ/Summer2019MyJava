package javaAssignments;

public class Swape {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		System.out.println("Before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("After swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	}
	
}
