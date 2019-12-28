package day35_Constractors;

import java.util.ArrayList;
import java.util.Arrays;

import day33_ArrayList.ArrayList1;

public class WarmUp {
   /*
    Warm Up: 
    1. write a return method that accepts an int array and returns it as an ArrayList
    2. write a return method that accepts an Integer arrayList and returns the maximum number
            DO NOT USE SORT METHOD
    3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
    4. write a return method that accepts an Integer array and returns the minimum number
            DO NOT USE SORT METHOD
    5. write a return method that accepts an Integer arrayList and returns the second minimum number
            DO NOT USE SORT METHOD
    */
	public static void main(String[] args) {
        // task01:
            int[] arr = {1,2,3,4,5};
        
            ArrayList<Integer> list    =  ArrayToArrayList(arr);
            
            System.out.println(list);
            
            System.out.println( ArrayToArrayList(arr) );
            
            
            double[] arr2 = {1.5, 2.5, 3.5};
            ArrayList<Double> list2 = ArrayToArrayList(arr2 );
            
            System.out.println(list2);
            
        // task02:
    ArrayList<Integer> list3 = new ArrayList<>( Arrays.asList(1,2,3,4,5,6) );
            int max = MaxNum(list3);
        
            System.out.println(max);
            
     // task03: 
            
ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList( 10, 20, 35, 30, 35));
            
        int secondMaximum  = SecondMax(list4);  // 30
            
            System.out.println( secondMaximum );
            
    
            
    // task04:
        int[] Numbers = {1,2,3,4,5,6,7,8, -100};
        
        ArrayList<Integer> list5 = ArrayToArrayList(Numbers); 
            
            int minimum =   MinNum(list5);  // 1
            System.out.println( minimum );
        
            
    // task05:
        int[] numbers2 = {100, 9, 8, 700, 18, 9, 0, 0, 0};
        ArrayList<Integer> list6 = ArrayToArrayList(numbers2);
        
            int secondminimum  = SecondMin(list6); //8
            System.out.println(secondminimum);
        
            
            
            
            
        
    }
    
    // Task01
    public static ArrayList<Integer>  ArrayToArrayList(int[] arr){
            ArrayList<Integer> list = new ArrayList<>();
            
            for( Integer each : arr ) {  // auto boxing
                list.add(each);  
            }
        
        return list;
    }
    
    public static ArrayList<Double>  ArrayToArrayList(double[] arr){
        
        ArrayList<Double> list = new ArrayList<>();
        
        for( Double each : arr ) {  // auto boxing
            list.add(each);  
        }
        
    
        return list;
        
    }
    
    
    // task02
    public static int MaxNum(ArrayList<Integer> list) {
        int max  =  Integer.MIN_VALUE;
        
            for( int each : list ) {  // unboxing
                if( each > max ) {
                    max = each;
                }
            }
        
        return max;
    }
    
    // task03
    public static int SecondMax ( ArrayList<Integer> list) {
                                    //  [90, 95, 100, 100]
        Integer max = MaxNum( list ); // 100,   auto boxing
        
            list.removeAll( Arrays.asList(max) );   // [90, 95]
            
        int secondMax = MaxNum(list);  //95
        
        
        return secondMax;
        
    }
    
    
    // task04:
    public static int MinNum (ArrayList<Integer> list) {
        int min  =  Integer.MAX_VALUE;
        
        for( int each : list ) {  // unboxing
            if( each < min ) {
                min = each;
            }
        }
    
    return min;
        
    }
    
    
    // task05:
    public static int SecondMin (ArrayList<Integer> list) {
        Integer firstMin = MinNum(list);
            list.removeAll( Arrays.asList( firstMin) );
            
            return MinNum(list);
        
    }
    
    
    

	
}
