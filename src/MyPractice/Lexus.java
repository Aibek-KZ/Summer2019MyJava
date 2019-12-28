package MyPractice;

public class Lexus extends Cars{
	public Lexus(String Brand, String Model, int Year, double GasMilage) {
		super(Brand, Model, Year, GasMilage);
	}

	@Override
	public void reliable() {
		System.out.println(Brand+" is reliable car");
	}
	@Override
	public void speed() {
		System.out.println(Brand+" can get 195mph");		
	}
	@Override
	public void price() {
		System.out.println(Brand+" price is around $65000");
	}
	@Override
	public void getInfo() {
        System.out.println("Brand is "+Brand);
        System.out.println("Model is "+Model);
        System.out.println("Made in "+Year);
        System.out.println("Gas milage "+GasMilage);
	}

}
