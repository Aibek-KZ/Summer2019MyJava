
package javaAssignments;
import java.util.Scanner;
public class Check_words {
public static void main(String[] args) {
	/*
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a first word");
	String first=input.nextLine();
	System.out.println("Enter a second word");
	String second=input.nextLine();
	System.out.println("Enter a third word");
	String third=input.nextLine();
	int num1=first.length();
	int num2=second.length();
	int num3=second.length();
	     if(num1==num2 && num1==num3) {
	    	 System.out.println("All words are same length");
	     } else if(num1==num2 && num2>num3) {
	    	 System.out.println("Not same or different length");
	     } else if(num1==num3 && num1>num2) {
	    	 System.out.println("Not same or different length");
	     } else if(num1==num2 && num2<num3) {
	    	 System.out.println("Not same or different length");
	     }
	    	 else {
	    		 System.out.println("All different length");
	    	 }
*/
// first and last characters of String are same
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter any word");
	     String text=scan.nextLine();
	     String c1=""+text.charAt(0);
	     // String c1=text.substring(0, 1);
	     int i1=text.length();
	     String c2=""+text.charAt(i1-1);
	     boolean result=c1.equals(c2);
	     System.out.println(result);
	     
	     
	     
	     }
	
	
}

