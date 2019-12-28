package replit_assignments;

import java.util.Scanner;

public class r_114Arrays_find_non_duplicate {
public static void main(String[] args) {
	/*
	 Given an array nums with 7 integers every element is repeated 
	 twice - except one. Find that element and print it to console
	 ex. 9, 1, 1, 2, 4, 5, 4, 5, 9   output is 2
	 */
	Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    int count=0;
    //TODO: write your code below
    for(int j=0; j<nums.length; j++) {
      for(int i=0; i<nums.length; i++) {
    	if(nums[i]==nums[j]) {
    		count++;
    	}
    	if(count==1) {
    	System.out.println(nums[i]);
    }
    
    }  
    }
    
	
}
}
