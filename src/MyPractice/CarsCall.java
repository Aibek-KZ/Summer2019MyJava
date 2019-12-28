package MyPractice;

public class CarsCall {
	public static void main(String[] args) {
		
		Toyota obj = new Toyota("Toyota", "Highlander", 2019, 21.45);
		obj.getInfo();
		obj.reliable();
		obj.speed();
		obj.price();
		System.out.println("******************************************");
		
		Lexus obj1 = new Lexus("Lexus", "LX570", 2020, 15.60);
		obj1.getInfo();
		obj1.reliable();
		obj.speed();
		obj.price();
	}

}
