package javaAssignments;
import java.util.Scanner;
public class SchoolGrades027 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	Scanner input1=new Scanner(System.in);
	double average=0;
	String summary="";
	
	System.out.println("Welcome to the Grader!");
	System.out.println("Please enter subject name number 1 and score for this subject");
	String subject1=input.nextLine();
	double grade1=input1.nextDouble();
	System.out.println("Please enter subject name number 2 and score for this subject");
	String subject2=input.nextLine();
	Double grade2=input1.nextDouble();
	System.out.println("Please enter subject name number 3 and score for this subject");
	String subject3=input.nextLine();
	Double grade3=input1.nextDouble();
	System.out.println("Please enter subject name number 4 and score for this subject");
	String subject4=input.nextLine();
	Double grade4=input1.nextDouble();
	System.out.println("Please enter subject name number 5 and score for this subject");
	String subject5=input.nextLine();
	Double grade5=input1.nextDouble();
	
	summary=subject1.concat(" - "+grade1+", "+subject2+" - "+grade2+", "+subject3+" - "+grade3+" - "+subject4+" - "+grade4+", "+subject5+" - "+grade5);
	average=(grade1+grade2+grade3+grade4+grade5)/5;

	System.out.println("Summary: "+summary);
	System.out.println("Your average score is: "+average);
	System.out.println("Thank you for using grader!");
	System.out.println("Goodbye!");

 
}
}
