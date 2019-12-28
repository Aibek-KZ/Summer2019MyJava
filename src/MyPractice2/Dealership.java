package MyPractice2;

public class Dealership {
	
	public static void main(String[] args) {
		Tesla_Model3 obj=new Tesla_Model3();
		obj.Charge();
		obj.SelfDrive();
		obj.Start();
		
		Jeep_wrangler obj1=new Jeep_wrangler();
		obj1.Start();
		obj1.PumpGas();
		
		ToyotaHybird obj2=new ToyotaHybird();
		obj2.Start();
		obj2.SelfDrive();
		obj2.Charge();
		
	}

}
