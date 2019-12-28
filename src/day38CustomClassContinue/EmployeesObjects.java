package day38CustomClassContinue;

import day37_ClassAndObject.EmployeeObject;

public class EmployeesObjects {
	public static void main(String[] args) {
		
	Employee obj1 = new Employee("Aibek", "777", 37, 1268547, "SDET", 127000);
	  obj1.getInfo();
	  
	  System.out.println("----------------------------------------------");
	Employee obj2 = new Employee("Saya", "555", 32, 25874, "Developer", 100000);
	obj2.getInfo();
	obj2.bonus();
	
	}
}
