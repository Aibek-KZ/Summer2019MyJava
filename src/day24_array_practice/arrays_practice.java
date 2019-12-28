package day24_array_practice;

import java.util.Scanner;

public class arrays_practice {
public static void main(String[] args) {
	
	/*
	// enter five numbers, then find the sum of them
	int[] numbers=new int[5];
	Scanner scan=new Scanner(System.in);
	
	for(int i=0; i<numbers.length; i++) {
		System.out.println("Enter a number");
		    numbers[i]=scan.nextInt();
	}
	int sum=0;
	for(int i=0; i<numbers.length; i++) {
	   sum+=numbers[i];
	}
	System.out.println("sum of the numbers "+sum);
	
	
	/*from back to front
	for(int i=numbers.length; i<0; i--) {
		System.out.println("Enter a number");
		    numbers[i]=scan.nextInt();
	*/
	
	// enter 5 names and return longest name
	String[] names= {"Seyfo", "Asiya", "Daulet", "Amina", "Adiya", "Zhansaya"};
	int max=0;
	String longestName="";
	     for(int i=0; i<names.length; i++) {
	    	 if(names[i].length()>max) {
	    		max=names[i].length(); 
	    		longestName=names[i];
	    	 }
	     }
	System.out.println(max);
	System.out.println(longestName);
}
}
