package day10_IfStatement;

public class ifSt_without_CurlyBrace {
	public static void main(String[] args) {
		/*
		 single if statement
		 if(condition) {
		 some codes
		 }
		 
		 */
		
		if(false) {
			System.out.println("Today is Friday");
			System.out.println("Tomorrow is off day");
			System.out.println("Cybertek student");
			
		}
		if(false)// without curly braces only a single of statement
			System.out.println("Today is Friday");//
		System.out.println("Tomorrow is off day");//will work
		System.out.println("Cybertek student");//will work
		
		
		if (true)
			System.out.println("if block");
		else if(true)
			System.out.println("else-if block");
		else
			System.out.println("else block");
			
	}

}
