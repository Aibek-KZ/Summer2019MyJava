package javaAssignments;

public class Task01_GreaterNumber {
	
	public static void main(String[] args) {
		// Solution 1
		int x=450, y=400, z=0;
		if (x>=y) {
			z=x;
		}
		else {
			z=y;
		}
		System.out.println(z+" is maximum number");
		
		//Solution 2		
		int num1=9009;
		int num2=9000;
		int max=0;
		
		if (num1>num2) {
			max=num1;
			
		}
		if (num2>num1) {
			max=num2;
		
		}
		if (num1==num2) {
			max=num1;
		}
		
		System.out.println("Larger number is "+max);
	}

}
