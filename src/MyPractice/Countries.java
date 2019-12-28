package MyPractice;

public abstract class Countries {
	String Name;
	String CapitalCity;
	double Population;
	String Language;
	String Religion;
	double SquareKm;
	
	public Countries(String Name, String CapitalCity, double Population, String Language, String Religion, double SquareKm) {
		this.Name=Name;
		this.CapitalCity=CapitalCity;
		this.Population=Population;
		this.Language=Language;
		this.Religion=Religion;
		this.SquareKm=SquareKm;
	}
		public abstract void Exports(); 
		public abstract void Import();
		public abstract void Economy();
		public abstract void Currency();		
		public abstract void getInfo();
}
