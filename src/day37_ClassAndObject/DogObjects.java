package day37_ClassAndObject;
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

public class DogObjects {
	public static void main(String[] args) {
		
	
	Dog dog1=new Dog();
	dog1.Breed = "Husky";
	dog1.Size="Small";
	dog1.Color="gray and white";
	dog1.Gender='F';
	dog1.Age=5;
	dog1.Name="Holly";
	dog1.Food="Salmon";
	dog1.Toy="bones";
	
	
	dog1.getInfo();

	Dog dog2 = new Dog();
	dog2.Breed="Alabay";
	dog2.Name="Tarlan";
	dog2.Age=7;
	dog2.Gender='M';
	dog2.Color="White";
	dog2.Size="Large";
	dog2.Food="meat";
	dog2.Toy="ball";
	
	dog2.getInfo();
	
	dog1.eat();
	dog2.eat();
	
	dog2.play();	
	
	

}
}