package day24_array_practice;

public class ArraysClass {
public static void main(String[] args) {
	/*
	 Array Decraration:
	       DataType[] VariableName={Value1, Value2....};
	 */
	int[] arr= {10, 20, 30, 40, 80};
	int arr2[]= {10, 20, 30};
	
	char[] arr3= {'A', 'B', 'C'};
	
	String[] arr4= {"Akosh", "Adosh", "Saya"};
	//                 0        1        2 
	System.out.println(arr4[2]+" "+arr3[0]+" "+arr[2]);
	
	String name=arr4[0];
	System.out.println(name);
	
	/*Array's size fixed, Arrays's size MUST be initialized. There are two ways:
	
	1. By giving value:
	                   int[] arr={1, 2, 3};
	2. By new keyword: 
	                   int[] arr=new int[size number];
	                   
	   initialize size of array:
	                            int[] arr=new[size];
	*/
	   int[] myNumbers=new int[5];
	   for(int i=0; i<myNumbers.length; i++) {
		   System.out.print(myNumbers[i]);
	   }
	/*
	 default values: 
	               byte, int, short, long ==> 0
	               double, float ==> 0.0
	               boolean ==> false
	               char ==> space or going to be empty!!
	               
	               String ==> null
	 */
	System.out.println();
	// Assign values:   
	   int ch[]=new int[3];
	   ch[0]=10;
	   ch[1]=20;
	   ch[2]=30;
	   	   System.out.println(ch[2]);
	   
	   	   for(int j=0; j<ch.length; j++) {
	   		   System.out.print(ch[j]+" ");
	   	   }System.out.println();
	   	   
	   	   ch=new int[4]; //reinitialized size, and preveious values of array are lost
	   	   for(int i=0; i<ch.length; i++) {
	   		   System.out.print(ch[i]+" ");// 0 0 0 0 
	   	   }
	   	   System.out.println();
	   	   
	   	   int[] array1= {1, 2, 3};
	   	   int[] array2= {4, 5, 6};
	   	   int[] array3=new int[array1.length+arr2.length];
	   	 /*  
	   	for(int f=0; f<array3.length; f++) {
  	    	 System.out.print(array3[f]+" ");
  	     }System.out.println();//all values 0 0 0 0 0 0 
	   	   */
  	     //to get values
	   	   for(int i=0; i<array1.length; i++) {
	   		   array3[i]=array1[i];
	   	   } 
	   	   for(int i=0; i<array2.length; i++) {
	   		   array3[i+array1.length]=array2[i];
	   		   } 
	   	   
	   	     for(int i=0; i<array3.length; i++) {
	   	     
	   	    	 System.out.print(array3[i]+" ");
	   	     }
	   	     
}
}
 