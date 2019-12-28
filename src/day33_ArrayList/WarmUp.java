package day33_ArrayList;

import java.util.Arrays;
/*
 Warm up:
    write a return method that accepts an int array and sorts it in descending order
    write a return method that accepts a double array and sorts it in descending order
    write a return method that accepts a char array and sorts it in descending order
    write a return method that accepts a String array and sorts it in descending order
        Hint: method overloading is prefered here
 */

public class WarmUp {
public static void main(String[] args) {
	int arrI[]= {1, 58, 14, 23, 99, 74, 11, 13, 7, 25};
    arrI=SortDe(arrI);
	System.out.println(Arrays.toString(SortDe(arrI)));
	
	double[] arrD= {10.5, 87.36, 45.25, 12.55, 44.23, 10.32};
	arrD=SortDe(arrD);
	System.out.println(Arrays.toString(SortDe(arrD)));
	
	char[] arrCh= {'c', 'f', 's', 'u', 'l'};
	arrCh=SortDe(arrCh);
	System.out.println(Arrays.toString(arrCh));
	
	String[] arrS= {"happy", "greatful", "thankful", "rich", "monay", "gold"};
	arrS=SortDe(arrS);
	System.out.println(Arrays.toString(arrS));
	
	Integer[] arrInteger= {45, 88, 47, 12, 30, 240, 200, 800, 11, 32, 41};
	arrInteger=SortDe(arrInteger);
	System.out.println(Arrays.toString(arrInteger));
 }
   
   public static int[] SortDe(int[] arr) {
	   Arrays.sort(arr);//ascending order
	   int[] arr2=new int[arr.length];
	   int j=0;
	   for(int i=arr.length-1; i>=0; i--) {
		   arr2[j]=arr[i];
           j++;	   
	   }
	   return arr2;
   }

   public static double[] SortDe(double[] arr) {
	   Arrays.sort(arr);//ascending order
	   double[] arr2=new double[arr.length];
	   int j=0;
	   for(int i=arr.length-1; i>=0; i--) {
		   arr2[j]=arr[i];
           j++;	   
	   }
	   return arr2;
   }
   
   public static char[] SortDe(char[] arr) {
	   Arrays.sort(arr);//ascending order
	   char[] arr2=new char[arr.length];
	   int j=0;
	   for(int i=arr.length-1; i>=0; i--) {
		   arr2[j]=arr[i];
           j++;	   
	   }
	   return arr2;
   }
   
   public static String[] SortDe(String[] arr) {
	   Arrays.sort(arr);//ascending order
	   String[] arr2=new String[arr.length];
	   int j=0;
	   for(int i=arr.length-1; i>=0; i--) {
		   arr2[j]=arr[i];
           j++;	   
	   }
	   return arr2;
   }

   public static Integer[] SortDe(Integer[] arr) {
	   Arrays.sort(arr);//ascending order
	   Integer[] arr2=new Integer[arr.length];
	   int j=0;
	   for(int i=arr.length-1; i>=0; i--) {
		   arr2[j]=arr[i];
           j++;	   
	   }
	   return arr2;
   }
}