package day20_JavaRecap;
import java.util.Scanner;
public class warmUp2 {
	public static void main(String[] args) {
		/* write a programm that asks user to enter a number 5 times
		 * 1. find the sum of those 5 inputs
		*/
		Scanner input=new Scanner(System.in);
		int sum=0; 
		for(int i=1; i<=5; i++) {
		System.out.println("Enter a number ");
		int number=input.nextInt();
		sum=sum+number;
		}
		System.out.println("sum is "+sum);
		
		
		
		
	}

}
