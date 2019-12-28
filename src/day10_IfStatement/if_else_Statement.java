package day10_IfStatement;

public class if_else_Statement {
	
	public static void main(String[] args) {
		
		/* if&else statement: when if statement failed, else will work
		if (condition) {
		A block only gets executed if the condition is true
		}
		else {
		B block only gets executed if the condition is false
		}
		
		*/
		int p=8;
		if (p>8) {
			System.out.println(p+" is greater than 8 ");
		}
		if (p==8) {
			System.out.println(p+" is equal to 8");
		}
		else {
			System.out.println(p+" is smaller than 8");
		}
		
		/*task01:
		 if score <60==> failed
		 score >=60 but <90==> pass
		 scor >60==> passed with Distriction
		 */
		int score=98;
		if (score>=60 && score<90) {
			System.out.println("Passed");
		}
		else {
			System.out.println("failed");
		}
		if (score>=90) {
			System.out.println(" A+ Good job");
		}
		
		
		// Task02:
		int angle1=75, angle2=86, angle3=58;
		boolean valid=(angle1+angle2+angle3)==180;
		if(valid) {
		System.out.println("Triangle is valid");
		}
		else {
			System.out.println("Invalid triangle");
		}
		
		
		
		
		}
		
		
		
	}


