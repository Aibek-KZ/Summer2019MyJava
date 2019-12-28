package MyPractice2;

public class ToyotaHybird implements Cars, ElectricVehicles{

	@Override
	public void Charge() {
		System.out.println("Toyota is ready to charge now");		
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Toyota is ready to self drive");		
		
	}

	@Override
	public void Start() {
		System.out.println("Toyota is ready to start");		
		
	}
	

}
