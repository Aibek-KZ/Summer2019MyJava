package javaAssignments;
import java.util.Scanner;
public class JAST_PRACTICE_DELETE {
public static void main(String[] args) {
	
	// 10/3=3 reminder 1, or 10-3-3-3
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a first number");
	int num1=input.nextInt();
	System.out.println("Enter a second number");
	int num2=input.nextInt();
	int devision=0;
	
	if(num2>0) {
	for(int i=0; num1>=num2;) {
		num1=num1-num2;
		devision+=1;
	}
	System.out.println(devision);
	} else {
		System.out.println("Enter correct numbers");
	}

	int count=0;
	while(num1>=num2) {
		num1=num1-num2;
		count+=1;     	
	}
	System.out.println(count);
}
}
