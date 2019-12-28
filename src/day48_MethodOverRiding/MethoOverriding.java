package day48_MethodOverRiding;

class student {
	public void printName() {
		System.out.println("Hakan");
	}
}

public class MethoOverriding extends student{
//               sub                  super    	
	public void print(String str) {
		
	}
	public void print(double a) {
		
	} 
	public void printName() {
		System.out.println("Sukran");
	}
//    public void print(String str) {	} overriding cannot happen in the same class
	
	public static void main(String[] args) {
		MethoOverriding obj = new MethoOverriding();
		obj.printName();
		
		student obj2=new student();
		obj2.printName();
	}
	

}
