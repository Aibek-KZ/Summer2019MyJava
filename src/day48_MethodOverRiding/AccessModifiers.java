package day48_MethodOverRiding;

class Mahribana{
    
    void methodA() {   
        // the method we are going to override MUST be inheritable to the sub class
        System.out.println("Method A");
    }
    public String methodB(){
    	return "B";
    }
    protected double salary(double bonus) {
    	return bonus+100000;
    }
    
}
public class AccessModifiers extends Mahribana {
    /*
    @Override
    private void methodA() {
        System.out.println("Method A");
    }
        override method' access modifiers need to be same or more visible
    */  
    
    @Override
     void methodA() {
        System.out.println("Method A");
    }
    @Override
    public String methodB() {
    	return "B";
    }
    @Override
    protected double salary(double bonus) {
    	return bonus+100000;
    }
    
}
