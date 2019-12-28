package day25_Arrays_Continue;

import java.util.Arrays;

public class Arrays_methods {
public static void main(String[] args) {
	
	
	
	/* to print enire array as whole,  we need to convert the array to String
	 Arrays.toString(VariableName): used for converting single dimensional arrays to String
	
	           Arrays class: "java.util"
	*/
	int num1 = 10;
    System.out.println( num1 );
    
    int[] arr = {1, 2, 3};
    System.out.println( arr );
    
    /*
      to print entrire array as whole, we need to convert the array to String
                Arrays.toString( VairableName ): used for converting single
                     dimensional arrays to  String  value
                     
                Arrays class: Utility of all the arrays, 
                            Arrays class is presented in "Java.util"package
                     
                     
     */
    
    
        String str = Arrays.toString( arr );
        System.out.println(str);
        
    String[] names = { "Elvira" , "Bibish", "Tural" ,"Daulet", "Hakan" };
    
        System.out.println( names[0]);
        System.out.println( names );  // hash code
        System.out.println(  Arrays.toString( names )  );
        
        
        /*
         Arrays.sort(variableName): 
                    sorts the values of the array in acsending order (smallest to largest)
         
         */
        int[] Numbers = { 9, 8, 100, 3000, 4, 5, 6};
        
        System.out.println(  Arrays.toString(Numbers) );
        
            Arrays.sort(  Numbers );   // sort all the values of the array in acsending order
    
        // sort method does:    Numberds = [4, 5, 6, 8, 9, 100, 3000];
            
    System.out.println(  Arrays.toString(Numbers) );
    
    System.out.println("Maximum: " + Numbers[Numbers.length-1]);
    System.out.println("Minimum: "+ Numbers[0]);
        
        
    
String[] Namelists = { "Alma" ,"Enes", "Myra","Smith", "Sarah","Lexi" ,"ABC"};
    Arrays.sort(Namelists); // alphabetical order ( from AsCII table)
    
    System.out.println( Arrays.toString(Namelists) );
    
    char[] ch = {'0' , '9', '8', '5' ,'3', '2', '1' };
        Arrays.sort(ch);
         
        System.out.println( Arrays.toString(ch) );
    
    
        int[] nums  = {2000, 90, 89, 78, 65, 5555, 444, -5};
        
            Arrays.sort( nums );
            System.out.println(Arrays.toString(nums));
            System.out.println("Minimum number: " + nums[0] );
            System.out.println("Maximum Number: "+ nums [ nums.length-1 ]);
            System.out.println("Second Maximum Number: " + nums [ nums.length-2 ]);
            System.out.println("Second Minimum Number: "+ nums[1]);
        
/*
 write aprogram that can print the arrays in Decsending order (largest to smallest)
 
 */
int[]  MyNumbers = { 99,10,200, 3000, 40, 50, 5000};
    Arrays.sort(MyNumbers);
            // MyNumberw -> [10, 40, 50, 99, 200, 3000, 5000]
    //                        0   1   2   3   4    5      6
    
    System.out.println( Arrays.toString(MyNumbers) );

    String result ="[";
    for(int i = MyNumbers.length-1; i  >= 0; i--) {
        
         result += MyNumbers[i] +", " ;
        
    }
            System.out.println();
            
    result = result.substring(0, result.length()-2)+"]"; 
            
            System.out.println(result);

            
int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
    Arrays.sort(arr2);  //  array will be sorted in Acsending order
//  arr2 -> [10, 40, 50, 99, 200, 3000, 5000]
    //        0  1   2    3   4    5     6
    
    int[] Decedning = new int[arr2.length];
    /*
        Decedning[0] = arr2[6];
        Decedning[1] = arr2[5];
        Decedning[2] = arr2[4];
        Decedning[3] = arr2[3];
        Decedning[4] = arr2[2];
        Decedning[5] = arr2[1];
        Decedning[6] = arr2[0];
    */
    
    int z=0;
    for(int i = arr2.length-1; i >=0; i-- ) {
        Decedning[ z ] = arr2[i];
        z++;
    }
    
    System.out.println("Acsending order: "+Arrays.toString(arr2));

    System.out.println("Descending order: "+Arrays.toString(Decedning));
            
            


}
}
