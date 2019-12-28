package day28_Java_Recap;

import java.util.Arrays;

public class Arrays_Reveiw {
public static void main(String[] args) {
	
	/* Single dimensional array: int[] arr1D = {1, 2, 3, 4}; or 
                               	int arr1D[] = {1, 2, 3, 4};  or
	                            int arr1D[] = new int[] {1, 2, 3, 4};
	*/ 
	int[] arr1D= {1, 2, 3, 4};
	//index:      0  1  2  3
	System.out.println(Arrays.toString(arr1D));
	
	//initialized the size of 1D array
	int[] arr=new int[3]; //can contain three values
	arr[1]=10; //[0, 10, 0]
	arr[0]=30; //[30, 10, 0]
	arr[2]=40; //[30, 10, 40]
	System.out.println(Arrays.toString(arr));
	
	int[] numbers= {10, 20, 30, 40};
	  for(int eachValues : numbers) {
		  if(eachValues==20) {
		    continue;//skips every single statements after this continue, result 10 30 40
		  }
		  System.out.print(eachValues+" ");
		  break;// exits the loop immediately, result is 10
	  }
	  System.out.println();
	  
	int[] nums= {100, 200, 300, 400};
	  for(int i=0; i<nums.length; i++) {
		  if(nums[i]==300) { //100, 200
			  break; //if "continue" statement 100, 200, 400
		  }
		  
		  System.out.print(nums[i] +" ");
	  }
	System.out.println();
	
	/*
	 toString: converting single demansional array to String 
	 sort: sorting single dimensional array in ascending order
	 deepToString: converting multi dimensional array to String
	 */
	
	  // sort:
	  long[] larr= {20, 400, 500, 90, 21, 74, 8, 77, 55};
	  System.out.println(Arrays.toString(larr));
	  Arrays.sort(larr);
	  System.out.println(Arrays.toString(larr));
	  
	  
	  //deepToString():
	        int[][] arr2D={ {1, 2, 3}, {4, 5, 6} };
	        //index             0          1
	        System.out.println(Arrays.toString(arr2D));// hash codes
	        System.out.println(Arrays.deepToString(arr2D));
	 // in 2D array: [index number of 1D arrays] [index number of values] 
	       //print [4, 5, 6]
	        System.out.println(Arrays.toString(arr2D[1])); 
	       //print 4
	        System.out.println(arr2D[1][0]);
	  
	        
	    // int[][] arr2D={ {1, 2, 3}, {4, 5, 6} };
	        for(int[] each1Array : arr2D) {
	        	for(int eachValue : each1Array) {
	        		System.out.print(eachValue);
	        	}
	        //	System.out.println(Arrays.toString(each1Array));
	        }
	  
	  
	  
	  
	  
}
	
}
