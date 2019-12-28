package MyPractice;

public class USA extends Countries{

	public USA(String Name, String CapitalCity, double Population, String Language, String Religion, double SquareKm) {
		super(Name, CapitalCity, Population, Language, Religion,SquareKm);
	}  
	
	public void Exports() {
		System.out.println(Name+" exports IT technology");
	}
	public void Import() {
		System.out.println(Name+" imports phone system devices");
	}
	public void Economy() {
		System.out.println(Name+" economy really big");
	}
	public void Currency() {
		System.out.println(Name+" used US dollar");
	}
		public void getInfo() {
			System.out.println("Country is "+Name);
			System.out.println("Capital is "+CapitalCity);
			System.out.println("Population is "+Population);
			System.out.println("Goverment language is "+Language);
			System.out.println("Main religion is "+Religion);
	        System.out.println("Territory occupies "+SquareKm+" square km");
			
		}
	}

		

