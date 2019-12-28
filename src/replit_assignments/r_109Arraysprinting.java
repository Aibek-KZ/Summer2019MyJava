package replit_assignments;

import java.util.Scanner;

public class r_109Arraysprinting {
public static void main(String[] args) {
	/*
	 The code provided in your main method will take in five 
	 Strings and save them into an array called arr.  Print 
	 out the first three letter of each element of arr, one
	  per line.  You can assume that every element of arr is 
	  at least 3 letters long.
	 */
	Scanner input = new Scanner(System.in);
	String[] arr = new String[5];
	for (int i=0;i<5;i++)
	{
		arr[i] = input.nextLine();
	}
	//leave above alone!  write your code below
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length()-1; j++) {
		arr[i]=arr[i].substring(0,3);
		}
		System.out.println(arr[i]);
	}
	
	
}
}

