package MyPractice2;

public class Jeep_wrangler implements Cars, GasVehicles{
	
	@Override
	public void Start() {
		System.out.println("Jeep is ready to start");		
	}
	@Override
	public void PumpGas() {
		System.out.println("Jeep is pumping a gas");
	}

}
