package day16_Recap;
import java.util.Scanner;
public class nextLine2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your zip code");
		int zip=input.nextInt();
		System.out.println("Enter your city name ");
		input.nextLine();
		String city=input.nextLine();
		System.out.println("Enter address");
		String address=input.nextLine();
		System.out.println("Enter phone number ");
		int phone=input.nextInt();
		System.out.println("Enter your name ");
		input.nextLine();
		String name=input.nextLine();
		System.out.println("Your addres is "+city+", "+zip+", "+address+". Your name is "+name+". Your phone number is "+phone);
		
	}
}
