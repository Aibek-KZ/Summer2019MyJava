package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Practice { 
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(12,45,74,89,58,63,21));
        System.out.println(nums);
                
        List<Integer> numsL = new LinkedList<Integer>(Arrays.asList(45,69,85,77,54));
        System.out.println(numsL);        
        System.out.println(numsL.get(2));
        
        List<Integer> numV = new Vector<Integer>(Arrays.asList(14,85,74,89,100,23,45,127));
        System.out.println(numV.get(0));
        
        System.out.println("=============================================");
        
        
        Set<Integer> numH = new HashSet<Integer>(Arrays.asList(10,10,10,42,15,58,77,41,21,99,55));
        System.out.println(numH);
        System.out.println(numH.size());
              
        Set<Integer> numLi = new LinkedHashSet<Integer>(Arrays.asList(10,10,10,42,15,58,77,41,21,99,55));
        System.out.println(numLi);
        System.out.println(numLi.size());
        
        SortedSet<Integer> numS = new TreeSet(Arrays.asList(10,10,10,42,15,58,77,41,21,99,55)); 
        System.out.println(numS);
        System.out.println(numS.tailSet(5));
        
        
	}

}
