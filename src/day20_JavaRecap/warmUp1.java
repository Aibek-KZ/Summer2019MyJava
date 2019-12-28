package day20_JavaRecap;

public class warmUp1 {
public static void main(String[] args) {
	/*Warm up:
	    1. find the sum of all the numbers between 1 to 1000
	    2. find the sum of all even numbers between 1 to1000
	    3. find the sum of all odd numbers between 1 to 1000
	    4. write a program that asks user to enter number 10 times:
	                1. find the sum of those 10 inputs
	                1. find the maximum number and the minimum number
	    5. print all lower case and upper case alphabets from the ASCII table
*/
	//task1
	
	int sum1=0;
	for(int i=1; i<=1000; i++) { //i: 1-1000
		sum1+=i;
	}
	System.out.println("sum of all nums:"+sum1);

	//task2
	int sum2=0;
	for(int i=0; i<=1000; i++) {
		if(i%2==0) {
			sum2+=i;
		}
	}
	System.out.println("Total even numbers "+sum2);
	
	int Sum20=0;
	for(int i=2; i<=1000; i+=2) {
		Sum20+=i;
		} 
	System.out.println("Total even numbers "+Sum20);
	
	//odd numbers
	int sum25=0;
	for(int i=1; i<=1000; i+=2) {
		sum25=sum25+i;
	}
	System.out.println("sum off all odd numbers "+sum25);

	int sum26=0;
	for(int i=0; i<=1000; i++) {
		if(i%2!=0) {
			sum26+=i;
		}
	}
	System.out.println("sum off all odd numbers "+sum26);
	
	
	//task3
	int sum3=0;
	for(int i=1; i<1000; i++) {
		if(i%2==1) {
			sum3+=i;
		}
	}
		System.out.println("sum off all odd numbers "+sum3);
		
		int Sum3=0;
		for(int i=1; i<=1000; i+=2) {
			Sum3+=i;
		}
		System.out.println(Sum3);
		
}
}
