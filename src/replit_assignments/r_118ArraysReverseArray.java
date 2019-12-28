package replit_assignments;

import java.util.*;

public class r_118ArraysReverseArray {
public static void main(String[] args) {
	/*
	 Given an array nums with 7 integers already assigned, write code to reverse it.
     Do not use any additional arrays or Strings.
     [5, 8, 9, 1, 3]===> [3, 1, 9, 8, 5]
	 */
	Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO: write your code below
           
            for (int i = 0; i<nums.length/2; i++){
        int temp = nums [i];
        nums[i] = nums[nums.length-(i+1)];
        nums[nums.length-(i+1)] = temp;
    }
    
    //Do not change below statement:
    System.out.println(Arrays.toString(nums));
}
}
