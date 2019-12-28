package MyPractice;

public abstract class Cars {
	String Brand;
	String Model;
	int Year;
	double GasMilage;
	
	public Cars(String Brand, String Model, int Year, double GasMilage) {
		this.Brand=Brand;
		this.Model=Model;
		this.Year=Year;
		this.GasMilage=GasMilage;
	}
	
	public abstract void reliable();
	public abstract void speed();
	public abstract void price();
	public abstract void getInfo();

}
