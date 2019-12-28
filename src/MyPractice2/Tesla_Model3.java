package MyPractice2;

public class Tesla_Model3 implements Cars, ElectricVehicles {

	@Override
	public void Charge() {
		System.out.println("Tesla is ready to charge now");		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Tesla is ready to self drive");		
	}

	@Override
	public void Start() {
		System.out.println("Tesla is ready to start");		
	}

}
