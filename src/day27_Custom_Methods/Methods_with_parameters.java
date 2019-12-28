package day27_Custom_Methods;

import java.util.Arrays;

public class Methods_with_parameters {
public static void main(String[] args) {
	
	int[] intarr= {15,30,45,60,75};
	intarr[2]=intarr[4];
	intarr[4]=90;
		
	System.out.println(Arrays.toString(intarr));
	
}
	/* methods with parameters: 
	  sometime method needs specific information to perform its task, then we need to 
	  declare the method with parameters.
	  Ex.: 
	     Arrays.sort(  array );
	     array is the argument, and sort method dunctionality is to sort the given array 
	 
	 */
	

	
	
	
}
