package day49_Recap;

public abstract class Abstraction {
	
	public abstract void startTheCar(); 
    
	}
	class Toyota extends Abstraction{
	    
	    // public abstract void startTheCar();
	    
	    @Override
	    public void startTheCar() {
	        System.out.println("Brake");
	        System.out.println("push the start button");
	        System.out.println("Release the brake");
	    }
	    
	    public static void main(String[] args) {
	        //Abstraction  obj = new Abstraction ();
	        
	    }
	}
	class Tesla extends Abstraction{
	        // regular class MUST implement the abstract methods from the abstract class
	    
	    public void startTheCar() {
	        System.out.println("voice constrol");
	        System.out.println("driver");
	    }

}
