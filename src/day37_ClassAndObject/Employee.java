package day37_ClassAndObject;

public class Employee {
	/*
	 Assignment:
	        create a custom class for Employees
	            
	                attributes: EmployeeName
	                            EmployeeID
	                            JobTitle
	                            SSN
	                            Gender
	                            Salary
	                            
	                actions:
	                        getInfo

	 */
	String EmployeeName;
	int EmployeeID;
	String JobTitle;
	int SSN;
	char Gender;
	double Salary;
	
	public void GeneralInfo() {
	System.out.println(EmployeeID+" "+EmployeeName+" "+JobTitle+" SSN: "+SSN+" Gender: "+Gender+" Salary: "+Salary);
	
	}
	
	public void NameAndID() {
		System.out.println("Name is: "+EmployeeName+" Id is: "+EmployeeID);
	}
	
	public void JobTitle() {
		System.out.println("Job title: "+JobTitle+", Salary: "+Salary);
	}
	
	public void SSN() {
		System.out.println("SSN: "+SSN);
	}
}
