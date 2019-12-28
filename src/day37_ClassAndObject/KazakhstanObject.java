package day37_ClassAndObject;

public class KazakhstanObject {
	public static void main(String[] args) {
		
		Kazakhstan KZ = new Kazakhstan();
		
		KZ.Country = "Kazakhstan";
		KZ.Capital = "Astana";
		KZ.Language = "Kazakh";
		KZ.Money = "Tenge";
		KZ.Population = 18000000;
		KZ.Territory = 2724900;
		
		KZ.aboutKZ();
	
	
	Kazakhstan turkey = new Kazakhstan();
	turkey.Capital="Ankara";
	turkey.Country="Turkiye";
	turkey.Language="Turkish";
	turkey.Population =80000000;
	turkey.Territory = 1358124;
	turkey.Money="lira";
	
	turkey.aboutKZ();
			
			
	
	}
}
