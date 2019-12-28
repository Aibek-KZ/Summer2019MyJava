package replit_assignments;

import java.util.Arrays;

public class r_178MethodsWithArrays {
  /*
   mergR merges two arrays into one.
   it gets two int arrays and returns an int array
   for example:
            mergR([1,2,3],[4,5,6])
            returns [1,2,3,4,5,6]
                             mergR([1,2],[6,8])
                             returns [1,2,6,8]
   */
	public static int[] mergR(int[] a,int[] b) {
		int z=0;
	     int size=a.length+b.length;
		 int[] merge=new int[size];  
	  for(int i=0; i<=a.length-1; i++) {
		  merge[z]=a[i];
		  z++;
	  }
	  for(int j=0; j<b.length; j++) {
		  merge[z]=b[j];
		  z++;
	  }
	  
	  System.out.println(Arrays.toString(merge));
	 
	  return merge;
	  }//end mergR
	  
	  public static void main(String[] args) 	  {
	   int a[]= {1,2,3};
	   int b[]= {4,5,6}; 
		  mergR(a, b);
	  }
}
