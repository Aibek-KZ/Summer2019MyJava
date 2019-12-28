package day10_IfStatement;

public class Nested_if {
	public static void main(String[] args) {
		/* Nested if: Single if  
		 
		 if (condition) {
		     if (condition2){
		          Some code
		  }
		 }
		 		 
		 
		 */
		
		if(true) {
			System.out.println("Hello Cybertek");
			    if(true) {
			    	System.out.println("Hello World");
			    }
			    else {
			    	System.out.println("Hello Team");
			    }
		// practice	    
		int grade=200;
		if (grade>=60 && grade<=100) {
			System.out.print("Passed");
			if(grade>=90 && grade<=100){
			System.out.print("\t with an A");
			}
			else if(grade<90 && grade>=80) {
				System.out.print("\t with B");
			}
			else if(grade>=70 && grade<80) {
				System.out.print("\t with C");
			} 
			else {
				System.out.print("\t with D");
			}
		}
		else {
			if (grade<60) {
			System.out.println("Failed");
			}
			else 
				System.out.println("Invalid score, error 404");
		}
		}
	}

}
