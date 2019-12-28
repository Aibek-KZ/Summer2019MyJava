package javaAssignments;

public class Time {
	public static void main(String[] args) {
		
		int hour=9;
				
		if (hour>=1 && hour<=12) {
			System.out.println("Good morning!");
		}
		else if(hour>12&&hour<=15) {
			System.out.println("Good afternoon!");
		}
		else if (hour>15&&hour<=20) {
			System.out.println("Good evening!");
		}
		else if (hour>20&&hour<=24) {
			System.out.println("Good night!");
		}
		else
			System.out.println("Incorrect number, try again!");
		
	}

}
