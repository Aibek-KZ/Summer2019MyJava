package day41_initializerBlocks;

public class staticVSinsVSCons {
	
	static {
        System.out.println("static block");    
        // static block execution does not depend on the object
                // executed as soon as the class is loaded, ONLY ONCE
    }
    
    {
        System.out.println("instance block");
        // instance block' execution depends on the object
        // when object is created, instance block runs first, then constructor
    }
    
    public staticVSinsVSCons() {
        System.out.println("Constructor");
        // instance block' execution depends on the object
        // when object is created, constructor runs after the instance block
    }
    
    public static void main(String[] args) {
        
    	staticVSinsVSCons obj = new staticVSinsVSCons();
    	staticVSinsVSCons obj2 = new staticVSinsVSCons();
    	staticVSinsVSCons obj3 = new staticVSinsVSCons();
        
        // constructor and instance block' execution depends on the creation of object
    }

}
