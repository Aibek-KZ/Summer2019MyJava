package javaAssignments;
import java.util.Scanner;
public class Seriously {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=input.nextLine();
		if(word.endsWith("ly")) {
			System.out.println("Really");
		} else {
			System.out.println("never mind");
		}
		
		
	}

}
