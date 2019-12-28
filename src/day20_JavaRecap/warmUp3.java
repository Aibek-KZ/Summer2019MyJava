package day20_JavaRecap;

import java.util.Scanner;

public class warmUp3 {
	public static void main(String[] args) {
		/*write a programm that asks user to enter a number 10 times
		 * 1. find the maximum number, greater number
		 */
		Scanner input=new Scanner(System.in);
		int max=0;
		
		for(int i=1; i<=5; i++) {
		System.out.println("Enter a number");
		int number=input.nextInt();
		   if(max<number) {
			   max=number;
		   }
		}
		System.out.println("Max number is "+max);
		

		
		
	}

}
