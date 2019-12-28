package javaAssignments;

public class Task05_number {
	public static void main(String[] args) {
		
		// Solution 1
		int num=47;
		if (num>0) {
			System.out.println(num+" is positive number");
		}
		else if (num<0) {
			System.out.println(num+" is negative number");
		}
		else {
			System.out.println(num+" is Zero");
		}
		
		
		//Solution 2
		int number=0;
		
		if(number>=1) {
			System.out.println("This number is Positive");
		}
		if(number<=-1) {
			System.out.println("This number is Negative");
		}
		if(number==0) {
			System.out.println("This number is Zero");
		}
		
		//Solution 3
		int number1=0;
		String str="Zero";
		if (number1>0) {
			str="Positive";
			System.out.println(number1+ " is "+str);
		}
		else if (number1<0 ) {
			str="Negative";
			System.out.println(number1+ " is "+str);
			}
		
		else 
			System.out.println(number1+" is "+str);
		
	}

}
