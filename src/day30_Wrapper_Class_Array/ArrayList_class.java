package day30_Wrapper_Class_Array;
import java.util.ArrayList;
public class ArrayList_class {
public static void main(String[] args) {
	/*
  ArrayList class:
    1. presented in "java.util" package
	                   import java.util.ArrayList;
    2. ArrayList does not support primitives
    3.  similar to Array in ArrayList we store Objects ONLY, all the values in 
    ArrayList are objects (none primitives)	          
    4. ArrayList's size is automatically adjusted, dynamic         
	5. ArrayList is ordered(index number)
	 
	Decleration of ArrayList:
	       ArrayList<ClassType> variableName = new ArrayList<>(); 
	       
	methods of ArrayList:
	     1. add(value): adds values to ArrayList. If the value is primitive, will
	        converts to wrapper class
	     2. get(index): gets the specific values from ArrayList
	     3. size(): returns the length (total number of values) from the ArrayList
	     4. clear(): clears the array, removes all the values out from the ArrayList   
	     5. sorting Array: to sort ArrayList
	        needs to call java.util.Collections         
	              
	  ArrayList vs Array:
	     1. Array's size fixed, ArrayList's size is dynamic
	     2. Array supports primitive and non-primitives
	        ArrayList does not support primitives
	                  
	 */
	ArrayList<Integer> list = new ArrayList<>();//often used
	ArrayList<Integer> list2 = new ArrayList<Integer>();//sometimes
	        list2.add(10);// auto-boxing
	        list2.add(20);
	        list2.add(30);
    System.out.println(list2);
    System.out.println(list2.get(2));//30
    System.out.println(list2.get(0));//10
    
    System.out.println(list2.size());//3 size of Arraylist
    
	
	
	
}
}
