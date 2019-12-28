package day37_ClassAndObject;

public class EmployeeObject {
public static void main(String[] args) {
	
	Employee info = new Employee();
	
	
	info.EmployeeName="Aibek Rysbek";
	info.EmployeeID=111;
	info.Gender='M';
	info.JobTitle="Software Developer Engeneer in test";
	info.Salary=127000;
	info.SSN=1263694587;
	
	
	info.GeneralInfo();
	info.NameAndID();
	info.JobTitle();
	info.SSN();
	
	Employee info2 = new Employee();
	info2.EmployeeName = "Saya";
	info2.EmployeeID = 112;
	info2.Gender = 'F';
	info2.JobTitle = "SDET";
	info2.Salary = 90000;
	info2.SSN = 1869285236;
	System.out.println("*****************************************************");
	info2.GeneralInfo();
	info2.NameAndID();
	info2.JobTitle();
	info2.SSN();

	
	
	
	
}
}
