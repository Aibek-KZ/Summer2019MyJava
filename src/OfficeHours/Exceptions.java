package OfficeHours;

public class Exceptions {
	public static void main(String[] args) {
		
		String name = "Aibek";
		
		try {
	//	Thread.sleep(100);	
		System.out.println(name.charAt(8));
		System.out.println("try block");		
		}catch(IndexOutOfBoundsException e) {
		System.out.println("catch block");		
		}finally {
			System.out.println("finally block");
		}
	}

}
