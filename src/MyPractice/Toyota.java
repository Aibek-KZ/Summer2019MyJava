package MyPractice;

public class Toyota extends Cars{
	public Toyota(String Brand, String Model, int Year, double GasMilage) {
		super(Brand, Model, Year, GasMilage);
	} 
	public void reliable() {
		System.out.println(Brand+" is really reliable car");
	}
	@Override
	public void speed() {
		System.out.println(Brand+" can go 180mph");		
	}
	@Override
	public void price() {
		System.out.println(Brand+" is arount $35000");
	}
	@Override
	public void getInfo() {
        System.out.println("Car brand is "+Brand);  
        System.out.println("Car model is "+Model);
        System.out.println("Made year is "+Year);
        System.out.println("Gas milage is "+GasMilage);
	}
	

}
