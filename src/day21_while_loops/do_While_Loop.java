package day21_while_loops;

import java.util.Scanner;

public class do_While_Loop {
public static void main(String[] args) {
	
	boolean A=false;
	while(A) {
		System.out.println("Hello");
	}
	
	
	/*
	 do - while:
	            do {
	                  statements;
	                } while(condition);
	 compiler executes the do block first, and then check the condition, if the 
	 condition is true keep executes, other wise exits the loop
	  
	while vs do-while  
	   do-while loops body gets executed at least once, regardless of condition
	   while never gets executed if the condition is false
	 
	 */
	int x=1;
	do {
		if(x%2==0) {
			System.out.print(x+" ");
		}
		x++;
	} while(x<=100);
	
	
	
	
	
	}
}
