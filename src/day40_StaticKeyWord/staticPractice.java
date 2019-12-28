package day40_StaticKeyWord;

public class staticPractice {
	static long num1;
	       long num2;
	
	public static void main(String[] args) {
		
		System.out.println(num1);
		System.out.println(staticPractice.num1);
	//	System.out.println(num2); instead variable
		
		staticPractice.method1();
	//	staticPractice.method2(); we can't call non static method, insteans

		staticPractice obj = new staticPractice();
		obj.method2();
	}
	
	public static void method1() {
		System.out.println("A");
	}
	
	public void method2() {
		System.out.println("B");
	}

}
