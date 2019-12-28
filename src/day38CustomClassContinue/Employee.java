package day38CustomClassContinue;

import java.util.Scanner;

public class Employee {
	
	String Name;
	String ID;
	int age;
	int SSN;
	String JobTitle;
	double salary;
	int Experience; 
	
	public Employee(String Name, String ID, int age, int SSN, String JobTitle, double salary) {
		this.Name=Name;
		this.ID=ID;
		this.age=age;
		this.SSN=SSN;
		this.JobTitle=JobTitle;
		this.salary=salary;
		
	}
	
	public void getInfo() {
		System.out.println("Name is: "+Name);
		System.out.println("ID is: "+ID);
		System.out.println("Age is: "+age);
		System.out.println("SSN is: "+SSN);
		System.out.println("Job title is: "+JobTitle);
		System.out.println("Salary is: $"+salary);
		
	} 

	public void bonus() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many years working in this company? ");
		int month=input.nextInt();
		if(month>=5&&month<10) {
			System.out.println("Your salary is: "+salary);
			System.out.println("You can get bonus $500, Total: $"+(salary+500));
		} else if(month<5) {
			System.out.println("Sorry, you don't have enaugh experience for bonus, your salary is: $"+salary);
		} else {
			System.out.println("Your salary is: $"+salary);
			System.out.println("Congratulations your bonus is $1000, your balance is: $"+(1000+salary));
		}
		
	}
}
