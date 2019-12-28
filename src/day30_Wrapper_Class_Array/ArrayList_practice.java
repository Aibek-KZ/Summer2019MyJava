package day30_Wrapper_Class_Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayList_practice {
public static void main(String[] args) {
	/*
	ArrayList<String> nameList=new ArrayList<>();
	nameList.add("Happy"); //add method to add string
	nameList.add("Greatful");
	nameList.add("Thankful"); 
	System.out.println(nameList);
	
	ArrayList<Integer> numbers=new ArrayList<>();
	numbers.add(128000);
	numbers.add(127000);
	System.out.println(numbers);
	
	*/
	Scanner scan=new Scanner(System.in);
	ArrayList<String> studentNames=new ArrayList<>();
	  while(true) {  
	    System.out.println("Enter your name");
	    String name=scan.nextLine();
	    studentNames.add(name);
	    System.out.println("Do you want add another name?");
	    String answer=scan.nextLine().toLowerCase();
	    if(!(answer.equals("yes") || answer.equals("no"))) { 
	    	System.out.println("Invalid");
	    	break;
	    } 
	    if(answer.equals("no")) {
	    	   break;
	       }
	  }    
	     System.out.println(studentNames);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
