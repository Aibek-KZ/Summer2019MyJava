package day25_Arrays_Continue;

import java.util.Arrays;

public class practice_2DArray {
public static void main(String[] args) {
	
	int[][] arr2D= { {1,2}, {3,4,5,6,7}, {8,9} };
	//length method:
	    int length=arr2D.length;// 2
	    
	    for(int i=0; i<arr2D.length; i++) {
	    	System.out.println(Arrays.toString(arr2D[i]));
	    }
	
	    for(int i=0; i<arr2D.length; i++) {// checks each index of 1D array
	    	for(int j=0; j<arr2D[i].length; j++)//checks each index of 2D array
	    	System.out.print(arr2D[i][j]+" ");
	    	
	    


	    	 char[][] ch2D = {  {'A','B', 'G'} ,  {'C', 'D','E','F' }  };
	            
	            for( int l = 0; l < ch2D.length; l++) {
	                
	                for( int j =0; j < ch2D[l].length; j++) {
	                    System.out.print( ch2D[l][j] +" " );
	                }
	                
	            }
	            
	            System.out.println();

	
	
	    }	
}
}
