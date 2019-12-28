package MyPractice;

public class CountriesCall {
	public static void main(String[] args) {
		
		Kazakhstan obj = new Kazakhstan("Kazakhstan", "Astana", 18500000, "kazakh", "islam", 2274000);
		obj.getInfo();
		obj.Exports();
		obj.Import();
		obj.Economy();
		obj.Currency();
	System.out.println("*******************************************************");	
		USA obj1 = new USA("USA", "Washington", 328000000, "english", "cristian", 3794500);
	    obj1.getInfo();
	    obj1.Economy();
	    obj1.Exports();
	    obj1.Import();
	    obj1.Currency();
	    System.out.println("****************************************************");
	}

	}
