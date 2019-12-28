package javaAssignments;
import java.util.Scanner;
public class seconds030 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter seconds: ");
	int inputSecond=input.nextInt();
	int hours=1, minutes=1, seconds=1;
	
	hours=inputSecond/3600;
	minutes=(inputSecond-hours*3600)/60;
	seconds=((inputSecond-hours*3600)-minutes*60);
	System.out.println(hours+" hours, "+ minutes+" minutes, and "+seconds+" seconds");
	
	
	
	}
	}


