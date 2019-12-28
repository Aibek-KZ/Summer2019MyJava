package day37_ClassAndObject;

public class Car {
	
	/*
	 data/attribute
        model, Year, brand, color, price, milage,VIN....
    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..	 
	 */
	//Attributes of car class
	String Model;
	int Year;
	String Color;
	double Price;
	long Milage;
	String Brand;
	
	
	public void drive() {
		System.out.println("Driving "+Brand);
	}
	
	public void start() {
		System.out.println(Brand+" "+Model+" is started");
	}
	
	public void getInfo() {
		System.out.println(Year+" "+Brand+" "+Model+" "+Color+" "+" "+Milage+" miles "+"$"+Price);
		
	}
	

}
