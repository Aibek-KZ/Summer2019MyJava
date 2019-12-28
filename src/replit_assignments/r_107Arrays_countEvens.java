package replit_assignments;

import java.util.Scanner;

public class r_107Arrays_countEvens {
public static void main(String[] args) {
	/*
	 Given an array nums, calculate count of even numbers in nums and
	  print out to console
	  nums->2, 1, 2, 3, 4->3
	 */
	 Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    int count=0;
	    //TODO: Write your code below
	    for(int i=0; i<nums.length; i++) {
	    	if(nums[i]%2==0) {
	    		count++;
	    	}
	    	
	    }
	    System.out.println(count);
	
	
	
	
}
}
