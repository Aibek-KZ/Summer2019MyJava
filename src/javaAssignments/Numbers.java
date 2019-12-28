package javaAssignments;
import java.util.Scanner;
public class Numbers {
	public static void main(String[] args) {
		
		Scanner number=new Scanner(System.in);
		System.out.println("Enter a number between 0 to 9 ");
		int num=number.nextInt();
		
		switch(num) {
		case 0: System.out.println("You have entered zero");
		break;
		case 1: System.out.println("You have entered one");
		break;
		case 2: System.out.println("You have entered two");
		break;
		case 3: System.out.println("You have entered three");
		break;
		case 4: System.out.println("You have entered four");
		break;
		case 5: System.out.println("You have entered five");
		break;
		case 6: System.out.println("You have entered six");
		break;
		case 7: System.out.println("You have entered seven");
		break;
		case 8: System.out.println("You have entered eight");
		break;
		case 9: System.out.println("You have entered nine");
        default: System.out.println("You have entered invalid number");
	

		
		
	}
	}
}
