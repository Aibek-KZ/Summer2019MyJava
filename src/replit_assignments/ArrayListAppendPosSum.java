package replit_assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAppendPosSum {

	public static void main(String[] args) {
/*
 Create a static method that:
 is called appendPosSum
 returns an ArrayList of Integers
 takes one parameter: an ArrayList of Integers
     This method should:
 Create a new ArrayList of Integers
 Add only the positive Integers to the new ArrayList
 Sum the positive Integers in the new ArrayList and add the Sum as the last element
 For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
 the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of
 (4,3,4,3).  The original ArrayList should remain unchanged.		
 */
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,-9,5,-6,0,-3,0,4));
		System.out.println(appendPosSum(arr));
	}
		public static ArrayList<Integer> appendPosSum(ArrayList<Integer> arr) {
			ArrayList<Integer> arr1 = new ArrayList<>();
			for(int i=0; i<arr.size(); i++) {
				if(arr.get(i)>0) {
					arr1.add(arr.get(i));
				}
			}
			int sum=0;
			for(int i=0; i<arr1.size(); i++) {
				sum+=arr1.get(i);
			}
			arr1.add(arr1.size(), sum);
			return arr1;
		} 
		
		
	
}
