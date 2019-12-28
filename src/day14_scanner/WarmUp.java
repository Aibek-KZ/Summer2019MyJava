package day14_scanner;

public class WarmUp {
	
	/*
	 write a programm that can display the days
	    if the day is Monday or Tuesday:  Java class days
	    if the 
	 */
	//boolean, float, double, long not acceptable
 
	public static void main(String[] args) {
	
 
	String day="Saturday";
	
	switch (day) {
	case "Monday":
	case "Tuesday":
		System.out.println("Java class days");
		break;
	case "Wednesday":
	case "Thursday":
	case "Saturday":
		System.out.println("SQL");
		break;
	case "Friday":
		System.out.println("Selenium");
		break;
	case "Sunday":
		System.out.println("Off day");
		break;
	default: 
			System.out.println("please enter correct day!");
	} 
	
}
}
