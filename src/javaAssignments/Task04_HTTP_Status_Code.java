package javaAssignments;

public class Task04_HTTP_Status_Code {

	public static void main(String[] args) {
		
		
		//Situation 2
		int statusCode=5021;
		String finalResult="Invalid code";
		
		if (statusCode==200) {
			finalResult="OK";
		}
		else if (statusCode==201) {
			finalResult="Created";
		}
		else if(statusCode==202) {
			finalResult="Accepted";
		}
		else if(statusCode==301) {
			finalResult="Moved Permanently";
		}
		else if (statusCode==303) {
			finalResult="See Other";
		}
		else if (statusCode==304) {
			finalResult="Not Modified";
		}
		else if (statusCode==307) {
			finalResult="Temporary Redirect";
		}
		else if (statusCode==400) {
			finalResult="Bad Request";
		}
		else if (statusCode==401) {
			finalResult="Unauthorized";
		}
		else if (statusCode==403) {
		    finalResult="Forbidden";
		}
		else if (statusCode==404) {
			finalResult="Not Found";
		}
		else if (statusCode==410) {
			finalResult="Gone";
		}
		else if (statusCode==500) {
			finalResult="Internal Server Error";
		}
		else if (statusCode==503) {
			finalResult="Service Unavailable";
		}
		else {
			finalResult="Invalid code";
		}
		
		System.out.println(finalResult);
		
		
		//Situation 2
		int StatusCode=800;
		
		if (StatusCode==200) { 
			System.out.println("OK");
		}
		if (StatusCode==201) {
			System.out.println("Created");
		}
		if (StatusCode==202) {
			System.out.println("Accepted");
		}
		if (StatusCode==301) {
				System.out.println("Moved Permanently");
			
		}
		if (StatusCode==303) {
			System.out.println("See Other");
		}
		if (StatusCode==304) {
			System.out.println("Not Modified");
		}
		if (StatusCode==307) {
			System.out.println("Temporary Redirect");
		}
		if (StatusCode==400) {
			System.out.println("Bad Request");
		}
		if (StatusCode==401) {
			System.out.println("Unauthorized");
		}
		if (StatusCode==403) {
			System.out.println("Forbidden");
		}
		if (StatusCode==404) {
			System.out.println("Not Found");
		}
		if (StatusCode==410) {
			System.out.println("Gone");
		}
		if (StatusCode==500) {
			System.out.println("Internal Server Error");
		}
		if (StatusCode==503) {
			System.out.println("Service Unavailable");
		}
		else {
			System.out.println("Incorrect code! Please try to enter correct code");
		}
		
	}
}
