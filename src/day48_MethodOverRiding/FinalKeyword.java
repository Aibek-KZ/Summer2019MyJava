package day48_MethodOverRiding;

class Credentials {
	
	private final String UserName="Cybertek";
	private final String Password="Batch12";
}

class Holly {
	final public void printName() {
		System.out.println("Erhan");
	}
	
}

public class FinalKeyword extends Holly{
      final int AGE=37; //Instance and static variable must be assigned immediately
     /*
      public void printName() {
  		System.out.println("Madina");
  	}  final methods cannot be override
	*/
	public static void main(String[] args) {
		final String SSN = "123456";//local variables needs to assign before use it 
//		SSN = "54654654"; final variables are constant and cannot be reassigned
		final String DateOfBirth;
				
		System.out.println(SSN);
	//	System.out.println(DateOfBirth);
		
		FinalKeyword obj=new FinalKeyword();
		System.out.println(obj.AGE);
	}
	
	public final static void add(int a, int b) {//final methods can be overload
		System.out.println(a+b);          //final methods cannot override
	}
	final public static double add(double a, double b) {
		return a+b;
	}

}
