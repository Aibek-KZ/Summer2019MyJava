package javaAssignments;
import java.util.Scanner;
public class Ternary052 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter number: ");
	int x=input.nextInt();
	
	x=(x>=5)? x : -x;
	System.out.println("x= "+x);
	
}
}
