package replit_assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsArrayListRepeatAll {
/*
 Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its ArrayList values.  
For example, if the parameter is 
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)	
 */
//	public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){ 
   public static ArrayList<Boolean> repeatAL(ArrayList<Boolean> al) {
	  	int j=0;
	  	int max=al.size()*2-1;
	   for(int i=al.size()-1; i<max; i++) {
	  		al.add(i+1, al.get(j));
	  		j++;
	  	}	   
		return al;
   }

	 
	public static void main(String[] args) {
		ArrayList<Boolean> al=new ArrayList<>(Arrays.asList(true, false, false, true)); 
		System.out.println(repeatAL(al));
		
		
}
	

}
















		
 
