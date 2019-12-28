package day11_ifStatementReview;

public class Review {
	public static void main(String[] args) {
		// Number of days in a month, assume that February has 28 days
		// 28 days: 2, 30days: 4,6,9,11 31days 1,3,5,7,8,10,12
		// even number of 30 day: 4,6
		// odd number of 30 days: 9&11
		int month=22;
		int year=2006;
		if (month>0&&month<13) { //if month 1~12 executed
	 	    if(month==2) {
	 	    	if(year%4==0) {
	 	    		System.out.println("29 days");
	 	    	} else {	 	    
	 	    	System.out.println("28 days");
	 	    	}}
	 	    else if (month==4||month==6) {
	 	    	System.out.println("30 days");
	 	    }
	 	    else if (month==9||month==11) {
	 	    	System.out.println("30 days");
	 	    }
	 	    else {
	 	    	System.out.println("31 days");
	 	    }
	 	   }
		else {
			System.out.println("Invalid entry");
		}
		
				
		//  Exersize
		int age=24;
		boolean GoodPerson=false;
		if (age>=18) {
			if(GoodPerson) {
			System.out.println("Alcohol is bad for your health");	
			}
			else {
				System.out.println("You can buy cigarettes");
				if(age>=21) {
					System.out.println("You can buy Hookah");
				}
				if(age>=25) {
					System.out.println("You can buy Alcohol");
				}
			}
		}
		else {
			System.out.println("You can buy milk");
		}
		
		
		//Grade calculator
		int grade=97;
		boolean A=grade>=90&&grade<=100;
		boolean B=grade>=80&&grade<=89;
		boolean C=grade>=70&&grade<=79;
		boolean D=grade>=69&&grade<=69;
		boolean ValidGrade=grade>=0 && grade<=100;
		
	if (ValidGrade) { //if order to multi-branch if gets
	    if (A) {
			System.out.println("You made A");
		}
		else if (B) {
			System.out.println("You made B");
		}
		else if (C) {
			System.out.println("You made C");
		}
		else if (D) {
			System.out.println("You made D");
		}
		else {
			System.out.println("You made F");
		} 
		} else {
			System.out.println("Invalid grade, try again");
		}
				
		  
		
		
		
		
		
		// Leap year 
		int year1=2011;
		boolean leap=year1%4==0;
			if (leap) {
				System.out.println(year1+" is leap year");
			}
			else {
				System.out.println(year+" is not a leap year");
			}
		}
	}
	
	


