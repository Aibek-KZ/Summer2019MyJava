package replit_assignments;

import java.util.Scanner;

public class r_104_Arrays_has55 {
	 
public static void main(String[] args) {
	/*
	 Given an array of ints, print true if the array 
	 contains a 5 next to a 5 anywhere in the array. If no 
	 consecutive 5s or no 5s are detected in your code then print false.
	 
	 */
	
	Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    int count=0;    
    for(int i=0; i<nums.length-1; i++) {
    	if(nums[i]==5 && nums[i+1]==5) {
    		count++;
        }    	 
  }
      if(count>=1) {
     System.out.println("True");
      } else System.out.println("False");
    }
    
    
    
    
	
	
}

