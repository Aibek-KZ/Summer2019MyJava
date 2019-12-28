package day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class practice {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(7,3,9,7,6,7,4,7,8,7,7,2,1,9,7));
		Iterator<Integer> it = numbers.iterator();
		    while(it.hasNext()) {
		    	int num=it.next();
		    	if(num==7) {
		    		it.remove();
		    	}
		    }
		    System.out.println(numbers);
		    
		List<String> names = new ArrayList<String>(Arrays.asList("a","a","b","b","a","c","a"));
		System.out.println(names);
		Iterator<String> itNames = names.iterator();
		     while(itNames.hasNext()) {
		    	 String s = itNames.next();
		    	 if(s.equals("a")) {
		    		 itNames.remove();
		    	 }
		     }
		     System.out.println(names);
		     
		List<Integer> nums1 = new ArrayList<Integer>(Arrays.asList(8,8,9,7,5,2,1,4,5,5,8,8,8,8,8,8,8));     
		System.out.println(nums1);
		Iterator<Integer> itNums1 = nums1.iterator();
		while(itNums1.hasNext()) {
			int ss = itNums1.next();
			if(ss==8) {
				itNums1.remove();
			}
		}
		System.out.println(nums1);		
		
		List<Integer> nums2 = new ArrayList<>(Arrays.asList(1,7,3,9,7,6,7,4,7,8,7,7,2,1,9,7));
        System.out.println(nums2);
		Iterator<Integer> it4 = nums2.iterator(); 
		while(it4.hasNext()) {
			int f=it4.next();
			if(f==7) {
				it4.remove();
			}
		}
		System.out.println(nums2);
		
		System.out.println("Text");
	}

}
