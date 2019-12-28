package day29_ReturnMethods;

import java.util.Arrays;

public class MethodOverloading {

	/* overloading: same method name, different parameters 
	 Method overloading: 
	     it's a feature that allows us to have more than one method 
	     with same name, the methods MUST have different parameters
	 
	 why do we need overload method:
	     1. improves the usability
	     2. improves the readability
	     
	     return statement: it's used for exiting the current method, we can also use return statement to retun a vlue from the method


continue statement: skips the current iteration of the loop


break statement: exits from  loop or switch statement


System.exit(0): java stops all the execution


return method:
			1. does not have "void" as return Type
			2. MUSt return a Value
			3. the returning value MUST macth with the return-Type of the method
			4. the method body Must be closed with return statement

	 */
// overloading: same method name , different parameters
    
    public static void main(String[] args) {
        
        int result =  sum(10, 20);
        System.out.println(result);
        
        System.out.println(  sum(10, 20, 30) );
        
         System.out.println( sum(0.5, 10.5) )  ;
         
         // overload method example: the sort methods of Arrays class, it accepts all data type
         
         
         int[] arr = {1,2,3,4,5};
         Sort(arr);  //5 4 3 2 1
         
         char[] ch = {'a', 'b', 'c'};
            Sort(ch);
            
            
         String[] str = {"A", "B", "C", "D"};   //{D, C, B, A}
            Sort(str);
         
         
        
    }
    
    
    
    
    public static int sum (int a, int b) {
        return a+b;
    }
    
    public static int sum (int a, long b, int c) {
        return a + (int)b + c;
    }
    
    
    //public static double sum(int a, int b) {  // parameters MUST be different
    //  return a+b;}
    
    public static double sum(double a, double b) {
        return a+b;
    }
    
    // write method called sort, that can sort an int array in descending orther
    public static void Sort(int[] arr) {
                            // [ 1,2,3,4,5};
        Arrays.sort(arr);
        for(int i = arr.length-1; i >=0; i--) {
            System.out.print( arr[i]+ " " );
        }
        
        System.out.println();
        
    }
    
    public static void Sort(char[] arr) {
        
        Arrays.sort(arr);
        for(int i = arr.length-1; i >=0; i--) {
            System.out.print( arr[i]+ " " );
        }
        System.out.println();
    }
    
    public static void Sort( String[] arr) {
        Arrays.sort(arr);
        for(int i = arr.length-1; i >=0; i--) {
            System.out.print( arr[i]+ " " );
        }
        System.out.println();
    }
    

}
