package day23_Arrays;

public class Arrays {
public static void main(String[] args) {
	
	/*Arrays: a variable that we can store multiple values
	regular variable: int a=10; can only have one value
	
	Arrays: int[] arr = {10, 20, 30, 40};
	*/
	 int[]     arr=     {1,2};
// data type variable  value 	
	
	//each values (Elements) in array have their own index numbers
	int[] VariableName = {10, 20, 30, 40, 50};
	//inde num:    0   1   2   3   4
	
	//to retrive the data of the array:
	//VariableName[3]==>40,   VariableNumber[0]==>10
	
	String[] names= {"Nigar","Sumeyya","Madina","Juline"};
	//                  0        1         2        3
	System.out.println(names[0]+" "+names[3]); //Nigar Juline
	String str=names[2];
	String str1=names[1];
	System.out.println(str+" "+str1);
	
	//Arrey is immutable and Array's size is fixed
	
	double[] myArray= {1, 2, 3, 4, 5, 8, 0, 2};
	//     index:      0  1  2  3  4  6  7  8
	
	for(int i=0; i<8; i++) {
		System.out.print(myArray[i]+"  ");
	}
	System.out.println();
	
	int[] Numbers= {12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	//length of Array: 
	
	int len=Numbers.length;
	System.out.println(len);
	int HighestIndexNumber=Numbers.length-1;
	
	
	for(int i=0; i<Numbers.length; i++) {
		//System.out.print(Numbers[i]); we can use this way or that
		int s1=Numbers[i];
		System.out.print(s1+" ");
	}
	
	
	char[] myChar= {'A', 'B', 'C', 'D'};
	int HighestIndexNumber1=myChar.length-1;
	System.out.println(HighestIndexNumber);
	
	
	
}
}
