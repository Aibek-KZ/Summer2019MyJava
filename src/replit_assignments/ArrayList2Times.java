package replit_assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2Times {
 /*
  Create a method that:
  is called twoTimes
  returns a new ArrayList of Integers
  takes in a single parameter - an ArrayList of Integers
  This method should create a new ArrayList of Integers that contains 
  every value of the ArrayList parameter repeated twice.
    For example, if the parameter is
       (1,5,3,7)
  The method should return a new ArrayList of Integers with
        (1,1,5,5,3,3,7,7)
  */
	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(1,5,3,7));
		ArrayList<Integer> arr2=new ArrayList<>();
		System.out.println(twoTimes(arr1));
		
	}
	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr1) {
		ArrayList<Integer> arr2=new ArrayList<>();
		int j=0;
		for(int i=0; i<arr1.size(); i++) {
			arr2.add(j, arr1.get(i));
			arr2.add(j+1, arr1.get(i));
            j+=2;  
		}
		return arr2;
	}
}


