package day37_ClassAndObject;

public class CarObjects {
	
	public static void main(String[] args) {
		
	Car car1 = new Car(); //Car        car1     =    new        Car();
//                       classname	  objName	    keyword  constructor 
		
	car1.Brand = "BMW";	
	car1.Color = "White";
	car1.Milage = 25000;
	car1.Model = "X6";
	car1.Price = 15500.5;
	car1.Year = 2005;
	
	System.out.println(car1.Brand);
	System.out.println(car1.Color);
	System.out.println(car1.Model);
	System.out.println(car1.Milage);
	System.out.println(car1.Year);
	System.out.println(car1.Price);
	System.out.println("***************************************************");
	
	Car car2 = new Car();
	car2.Brand = "Lexus";
	car2.Model = "LX570";
	car2.Color = "Green";
	car2.Year = 2015;
	car2.Milage = 95000;
	car2.Price = 42000;
	
	System.out.println(car2.Brand);
	System.out.println(car2.Model);
	System.out.println(car2.Color);
	System.out.println(car2.Milage);
	System.out.println(car2.Price);
	System.out.println(car2.Year);

	
	car1.drive(); //Driving BMW
	car2.drive(); //Driving Lexus
	
	car1.start();
	car2.start();
    System.out.println("*******************************************************");
	car1.getInfo();	//2005 BMW X6 White  25000 miles $15500.5
	car2.getInfo();//2015 Lexus LX570 Green  95000 miles $42000.0
	
	
	Car car3 = new Car();// didn't initialized yet
	car3.getInfo(); //0 null null null  0 miles $0.0
	car3.Brand="Toyota";
	car3.Model="Highlander";
	car3.Year=2015;
	car3.Color="Silver";
	car3.Price=15500;
	car3.Milage=79000;
	car3.getInfo(); //2015 Toyota Highlander Silver  79000 miles $15500.0
	
	




	
	
	}

}
