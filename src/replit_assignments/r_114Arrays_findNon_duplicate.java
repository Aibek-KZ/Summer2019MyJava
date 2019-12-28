package replit_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class r_114Arrays_findNon_duplicate {
public static void main(String[] args) {
	/*
	 Given an array nums with 7 integers every element is repeated twice - 
	 except one. Find that element and print it to console.

Example: nums=[1,1,2,3,3,4,4,]   result 2
	 */
	Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO: write your code below
	
    for(int j=0; j<nums.length; j++) {
    	int count=0;
	     for(int i=0; i<nums.length; i++) {
		    if(nums[i]==nums[j]) {
               count++;
		}
	      
	     }
	      if(count==1) {
	       System.out.println(nums[j]);
	     }
	
    }

    
    
    
    
	
}
}
