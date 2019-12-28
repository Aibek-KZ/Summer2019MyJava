package day15_Sc;
import java.util.Scanner;
public class Task02 {

	public static void main(String[] args) {
		
		System.out.println("Enter the first number ");
		Scanner input=new Scanner(System.in);
		double n1=input.nextDouble();
		System.out.println("Enter second number");
		double n2=input.nextDouble();
		System.out.println("Enter third number");
		double n3=input.nextDouble();
		
		double largest=(n1>n2 && n1>n2)? n1
				:(n2>n1 && n2>n3)? n2
						: n3;
		System.out.println("Largest number is "+largest);
		
	}
}
