package day16_Recap;
import java.util.Scanner;
public class WarmUp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=input.nextLine().toUpperCase();
		System.out.println("Enter your last name");
		String last=input.next().toUpperCase();
		
		name=name.concat(" "+last).toUpperCase();
		System.out.println(name);
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		
	}

}
