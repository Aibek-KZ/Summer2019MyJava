package day23_Arrays;
//Home work: needs to fix all bugs, if first number 0, if all numbers negative!!!
import java.util.Scanner;

public class warmUp1 {
	// Write a programm that can devide two numbers withaut using division operator
public static void main(String[] args) {
	int a=10, b=3;
	System.out.println("with division "+a/b);
	/*
	 10-3=7
	 7-3=4
	 4-3=1
	 */
	int count=0;
	while(a>=b) {
		a-=b;
		count+=1;
	}
	System.out.println("without "+count);
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two numbers ");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int count1=0;
	
	if(num2!=0) {
	while(num1>=num2) {
		num1-=num2;
		count1++;
		System.out.println("devision without / is: "+count1+" with a remainder of: "+num1);
	}
	} else {
		System.out.println("Invalid entry");
	}
	
	//Home work: needs to fix all bugs, if first number 0, if all numbers negative!!!
	/*
	 int A, B;  // A/B
        if(num1 > num2) {
            A =num1;
            B = num2;
        }
        if(num2 > num1) {
            A =num2;
            B =num1;
        }
        
        
        if(num2!=0) {
                //10       3    
            while(num1 >= num2) {
                num1 -= num2;
                result++;
            }

	 */
	
}
}
