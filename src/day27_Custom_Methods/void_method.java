package day27_Custom_Methods;


public class void_method {
	/*
	  declaration of methods:
	  access-modifier specifier return-type  methodname() {
	                               statements;
	                               }
	 */
	public static void main(String[] args) {
        myFirstMethods();
		mySecondMethods();
		Even1to100();

	   
	}
	public static void myFirstMethods() {
		//public static void main(String[] args) {} not gonna run
		System.out.println("Hello Word");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Aibek");
	}
	
	public static void mySecondMethods() {
		System.out.println("Abeke salem ");
	}
	
	public static void Even1to100() {
		for(int i=0; i<100; i++) {
			if(i%2!=0) {
				continue;
			}
			   System.out.print(i+" ");
		   }
	}
	
	
	
}

