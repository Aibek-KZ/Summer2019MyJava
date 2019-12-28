package day10_IfStatement;

public class Multi_branch_ifStatement {
	
	public static void main(String[] args) {
		/*
		 if-else if-else:
		 if (condition1){
		 A block
		 }
		 else if(codition2) {
		 B block
		 }
		 else {
		 C block
		 }
		 */
				
		if (true) {
			System.out.println("Good morning");
		}
		if (false) {
			System.out.println("Good night");
		}
		else {
			System.out.println("Fine");
		}
			
		int grade=98;
		if (grade>=90 ) {
			System.out.println("You have made A");
		}
		else if (grade>=80 && grade<90) {
			System.out.println("You made B");
			}
		else if (grade<80 &&grade>=70) {
			System.out.println("You have made C");
		}
		else if (grade<70 && grade>=60) {
			System.out.println("You made D");
			}
		else {
			System.out.println("You made F");
		}
		
		// Task03:
		int time=2;
		if (time>=0 && time<12) {
			System.out.println("Good morning");
		} 
		else if (time>12 && time<=15) {
			System.out.println("Good afternoon");
		}
		else if (time>15 && time<=23) {
			System.out.println("Good night");
		}
		else if (time==24) {
			System.out.println("Good noon");
		}
		else {
			System.out.println("Please enter valid time");
		}
	}
 
	
	
}
