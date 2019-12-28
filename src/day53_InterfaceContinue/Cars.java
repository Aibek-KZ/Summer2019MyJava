package day53_InterfaceContinue;

public interface Cars {
/*
 Warmup:
    create an interface called Cars
            Actions: start()
    create an interface called ElectricVehicles
            Actions: Charge()
                     SelfDrive()
    create an interface called GasVehicles
            Actions: PumpGas()
    create classes:
            1. Tesla_Model3: 
                    implement Cars and  ElectricVehicles Interfaces
            2. Jeep_wrangler: 
                    implement Cars and GasVehicles Interfaces
            3. ToyotaHybird:
                    implement Cars, GasVehicles, and  ElectricVehicles Interfaces
 */
	
	public abstract void start();
	
}
