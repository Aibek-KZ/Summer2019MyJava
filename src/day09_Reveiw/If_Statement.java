package day09_Reveiw;

public class If_Statement {
	/* if statements:
	      single if statement:
	          if(boolean expression){
	             some codes to run
	          }
	            if block only gets executed if the condition is true
	    
	 */
	
	public static void main(String[] args) {
		if(9<10) {
		System.out.println("Hello");
		System.out.println("Friday");
		System.out.println("Tomorrow");
		}
		
		int a=1000;
		if(a++ ==1001) {
		a=200;
		System.out.println("a is increased");
		}
		System.out.println(a);
		
		int X=987654321;
		if(X%2==0) {
			System.out.println(X+" is an even number");
		}
		if(X%2!=0) {
			System.out.println(X+" is an odd number");
		}
		
		
		int Y=0;
		if (Y%5==0) {
			System.out.println(Y+" can be devided by 5");
		}
		if (Y%5!=0) {
			System.out.println(Y+" can't be devided by 5");
		}
		
		String CEO="Main Boss";
		String Kuzzat="Main Boss";
		System.out.println(CEO==Kuzzat);//true
		if (Kuzzat==CEO) {
		System.out.println("Great person in the World");
		}
		if(Kuzzat !=CEO) {
			System.out.println("Second block");
		}
		
		double TotalNumber=100;
		boolean Cybertek=true;
		boolean BestSchool=true;
		if (Cybertek==BestSchool) {
			TotalNumber+=500;
		}
		if (Cybertek != BestSchool) {
			TotalNumber -=50;
		}
		System.out.println(TotalNumber);
		
		byte age = 18;
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}
		if (age<18) {
			System.out.println("Sorry, You are not eligible to vote yet");
			
			
			
			
	}
	}
}
