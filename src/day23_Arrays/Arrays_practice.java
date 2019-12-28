package day23_Arrays;

import java.util.Scanner;

public class Arrays_practice {
public static void main(String[] args) {
	String sudent1="Aibek";
	String student2="Saya";
	String student3="Akosh";
	
	String[] AllStudents= {"Aibek", "Saya", "Akosh"};
	//                       1         2        3
	//AllStudents[3]="Adosh"; //Array size is fixed
	
	// initialize the size only without giving value:
	int[] array=new int[4]; // we have not given values to the array
	//this array can contain four values, its length is 4
	System.out.println(array.length);
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	
	array[1]=100;
	System.out.println(array[1]);
	array[0]=200;
	System.out.println(array[0]);
	//array[5]=500; error
	//System.out.println(array[5]); Array's size is fixed
	
	int[] array2;
	//System.out.println(array2[0]); Array's size MUST be initialized
	
	
	Scanner scan=new Scanner(System.in);
	int[] inputs=new int[10];//in this array we can store 10 elements, highest number is 9
	for(int i=0; i<inputs.length; i++) {
	System.out.println("Enter a number");
	inputs[i]=scan.nextInt();
	}
	for(int i=0; i<inputs.length; i++) {
		System.out.println(inputs[i]+" ");
	}
	
	String[] AllStudentsNames=new String[358];
	//this new keyboard in Array is used to give the size of the array 
	
}
}
