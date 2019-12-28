package OCA_praparation;

import java.util.Arrays;

public class OCA_questions {	
	public static void main(String[] args) {

		//Q1
		int[][] arr=new int[][] {{1,2},{3,4}};
		arr[1]=arr[0];
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[0]));
//Q2
int[][] arr1=new int[2][];
int[][] arr2= {{'A', 'B'}, {'C', 'D'}};
double [][] arr3=new double[][] {{1,2},{3,4}};
//double [][] arr4=new double[2][] {{1,2},{3,4}};

//Q3
int[][] arr4= {{1,2,3},{3,4}};
for(int i=0; i<2; i++) {
	for(int j=0; j<2; j++) {
		System.out.print(arr[i][j]+" ");
	}
}
//Q4
int arr7[]=new int[2]; 






		
	}

}
