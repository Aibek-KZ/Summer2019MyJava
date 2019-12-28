package day58_Exceptions;

public class Exception_handling {
	public static void main(String[] args) {
		
		try {
			System.out.println(9/0);
			System.out.println("Try block");
		}catch(RuntimeException e) {
			System.out.println("Catch block");
		}finally {
			System.out.println("finally block");
			System.out.println("===================================");
		}
		
		try {
			Thread.sleep(2000);
			System.out.println("try block");
		}catch(Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		} 
	}

}
