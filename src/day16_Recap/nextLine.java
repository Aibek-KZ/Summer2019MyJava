package day16_Recap;
import java.util.Scanner;
public class nextLine {
	public static void main(String[] args) {
		
		//nextLine method will take everything in scanner' memory up to the new Line
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your phone number ");
		int phone=scan.nextInt();
		scan.nextLine();//this will take out Enter
		System.out.println("Enter your name");
		String name=scan.nextLine();//will take everything in scanners's memory up to the new line
		System.out.println(name+" "+phone);
	}

}
