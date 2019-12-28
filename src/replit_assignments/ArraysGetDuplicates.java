package replit_assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysGetDuplicates {
 /*
  getDup accepts an array and returns an int.
  If there is any element is duplicated, method counts how many of those present in the array.
  For example :
  getDup(["1","2","aa"',"1"])
  returns:2 ("1" is duplicated and there are two "1"s so return is 2)
  getDup(["1","2","aa"',"1", "aa"])
  returns:4 ("1" is duplicated and there are two "1"s 
           and 2 "aa"s so return is 4)
  getDup(["1","g","aabb',"7","7","2","aa"',"7"])
  returns:3
  */
	public static void main(String[] args) {
	  String[] r= {"1","2","aa","1"};
	  System.out.println(getDup(r));
	}
	
	public static int getDup(String[] r) {
	   String s = Arrays.toString( r );
	   int count=0;
	    for(String each: r){
	     String[] r1 = s.split(each);
	     s=s.replaceAll(each,"");
	     if(r1.length>2)
	     count+=r1.length-1;
	   }
	   return count;
	  }

	
}
