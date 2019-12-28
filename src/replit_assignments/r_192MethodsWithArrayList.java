package replit_assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class r_192MethodsWithArrayList {
	/*
  Create a method that:
  is called timesTwo
  returns nothing
  takes in a single parameter - an ArrayList of Integers called nums
  This method should take the ArrayList parameter and multiply every 
  value by two.
	 */
	public static void main(String[] args)	{
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		timesTwo(nums);
		//System.out.println(nums.size());
		
	}
	//create your method below
	public static void timesTwo(ArrayList<Integer> nums) {
		for(int i=0; i<nums.size(); i++) {
       int a=nums.get(i)*2;
			nums.remove(i);
			nums.add(i, a);
      
          
		}
		System.out.println(nums);
	}

}
