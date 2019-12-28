package day25_Arrays_Continue;

import java.util.Arrays;

public class Multi_DimensionalArray {
public static void main(String[] args) {
	/*
	 n dimensional array (n-1) dimensional array
	 
	 2 dimmensional array: array that contains (2-1) dimensional array
	 */
	
	int[][] arr2D= { {1, 2, 3} , {4, 5, 6} };
	
	String[] arr= { "A", "B" };
	
	//                    0    1      0    1
	String[][] str2D= { {"A", "B"}, {"C", "D", "E"} };
	//                      0            1
//[represents the index number of 1 dimensional arrays][representse index number of the values]   
	
	
	System.out.println(str2D[0][1]);// print "A":
	System.out.println(str2D[1][1]);// print "D"
	System.out.println(str2D[0][1]);// print "B"
	System.out.println(str2D[1][2]);// print "E"
	
	System.out.println(Arrays.toString(str2D[0]));// [A, B]
	System.out.println(Arrays.toString(str2D[1]));// [C, D, E]
	
	
	//Arrays.deepToString(variableName): converts multi-Dimmension Arrays to String
	System.out.println(Arrays.toString(str2D));// hash codes, we should use
	System.out.println(Arrays.deepToString(str2D));
	
	
	//                    0  1    0  1    0  1
	int[][] numbers2D= { {1, 2}, {3, 4}, {5, 6, 7, 8, 9, 10} };
	//                      0       1       2
	System.out.println(numbers2D[2][1]);// 6
	System.out.println(numbers2D[2][5]);// 10
	
	System.out.println(Arrays.toString(numbers2D[2]));// [5, 6, 7, 8, 9, 10]
	System.out.println(Arrays.deepToString(numbers2D)); //[[1, 2], [3, 4], [5, 6, 7, 8, 9, 10]]
	
	int[][] Array2D= { {1,2}, {3,4} };
	// 
	//                       0      1           0      1
	int[][][] Array3D= { { {1,2}, {3,4} } , { {5,6}, {7,8} } };
	//                        0                    1
	System.out.println(Array3D[1][1][1]);// 8
	System.out.println(Arrays.toString(Array3D[1][0])); //[5, 6]
	System.out.println(Arrays.deepToString((Array3D[1])));// [[5, 6], [7, 8]]
	System.out.println(Arrays.deepToString(Array3D));// [[[1, 2], [3, 4]], [[5, 6], [7, 8]]]
	
	
	// 4 dimensional array
	int[][][][] numbers1= {     };
	
	
	
	
}
}
