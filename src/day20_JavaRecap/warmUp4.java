package day20_JavaRecap;

import java.util.Scanner;

public class warmUp4 {
	public static void main(String[] args) {
		/*write a programm that asks user to enter a number 10 times
		 * 1. find the minimum number and maximum number
		 */
		Scanner input=new Scanner(System.in);
		int min=999999999;
		int max=-999999999;
		
		for(int i=1; i<=5; i++) {
		System.out.println("Enter a number");
		int number=input.nextInt();
		    if(number>=max) {
		    	max=number;
		    }
		    
		}
		System.out.println("Max number is "+max);
		
		
		
		
		
		
		
		/*
		for(int i=1; i<=5; i++) {
			System.out.println("Enter a number ");
			int number=input.nextInt();
			if(number<=min) {
				min=number;
			}
		}
		System.out.println("Min number is "+min);
		*/
	}

}
