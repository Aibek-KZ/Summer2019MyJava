package day26_For_Each;

import java.util.Arrays;

public class For_Each_Loop {
public static void main(String[] args) {
	
	/* For each loop: used to access the value in a collection of values, 
	 it's a loop that's already been iterated. For each can never be infinite loop
	 
	 Syntax of for each loop:
	           for( DataType each : ArrayName ) {
	                         }
	when do we use it: when we don't need to create the index variables
	we don't provide index numbers                         
	                         
	*/
	    int[] arr= {1,2,3,4,5};
	       for(int i=0; i<arr.length; i++) {
	    	   System.out.print(arr[i]+" ");
	       }
	       System.out.println();
	System.out.println("=======================================");
	
	 for(int each : arr) {
		 System.out.print(each+" ");
	 }
	System.out.println();
	 
	String[] str1= { "A","B", "C", "D", "E", "F"};
	for(String each : str1) {
		System.out.print(each+" ");
	}
	System.out.println();
	 // name of Data can be 
	String[] str2= { "A","B", "C", "D", "E", "F"};
	for(String Aibek : str2) {
		System.out.print(Aibek+" ");
	}
	System.out.println();
	
	char[] ch= {'z', 'x', 'y', 'c', 'a', 'b'};
	Arrays.sort(ch);
	for(char name : ch) {
		System.out.print(name);
	}
	System.out.println();
	
	// print all even numbers
	int[] arr1= {1,2,3,4,5,6,7,8,9,10};
	  for(int varname : arr1) {
		  if(varname%2==0) {
		  System.out.print(varname+" ");
	  }
		  
	  }
	  System.out.println();
	   for(int varname : arr1) {
	  if(varname%2!=0) {
			  System.out.print(varname+" ");
		  }  
	   }
	// print out 1-1000; we can not use for each loop
	
}
}
