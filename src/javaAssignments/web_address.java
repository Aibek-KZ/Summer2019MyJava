package javaAssignments;
import java.util.Scanner;
public class web_address {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your URL address");
	String url=input.nextLine();
	 
	if(url.contains(".com")||url.contentEquals(".net")||url.contains(".edu")||url.contains(".org")||url.contains(".gov")) {
	    if(url.contains("www")) {
		  if(url.contains(".")) {
			  int dot=url.lastIndexOf(".");
			  int dom=url.indexOf("w.");
			  String domain=url.substring(dom+2, dot);
			  String extension=url.substring(dot+1);
			  System.out.println("Domain is "+domain);
			  System.out.println("Extension is "+extension);
		  } else {System.out.println("Please enter \".\" sign ");}
		  
	  } else { System.out.println("Please enter correct URL with \"www.\" ");}
		  
	} else {System.out.println("Invalid extension, Please enter correct extension!");}
	
	
	
	
}
	
	
	
}
