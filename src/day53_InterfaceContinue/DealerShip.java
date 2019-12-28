package day53_InterfaceContinue;

public class DealerShip {
    
    public static void main(String[] args) {
        
        Tesla_Model3  obj1 = new Tesla_Model3();
                
            obj1.start();
            
        Jeep_Wrangler obj2 = new Jeep_Wrangler();
                    obj2.start();
                    obj2.PumpGas();
                    
                    
        ToyotaHybrid obj3 = new ToyotaHybrid();
                    obj3.PumpGas();
                    obj3.Charge();
        
        
    }
}