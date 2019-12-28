package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {
public static void main(String[] args) {
	
	List<Integer> list1 = new ArrayList<>(Arrays.asList(100,100,100));
	              System.out.println(list1); // [100, 100, 100]
	
	Set<Integer> st1 = new HashSet<>();
	             st1.add(100);
	             st1.add(100);
	             st1.add(100);
                 System.out.println(st1);// only one [100]
         //  System.out.println(st1.get(0)); Set does not have index number
                 System.out.println("=======================================");
    
        Set<Integer> hashset = new HashSet<Integer>();
                     hashset.add(100);
                     hashset.add(10);
                     hashset.add(5);
                     hashset.add(100);
                     hashset.add(4);
                System.out.println(hashset);//[100, 4, 5, 10] randomly
                                       // HashSet does not keep the objects order as it is
                
       Set<Integer> linkedhashset = new LinkedHashSet<>();  
                    linkedhashset.add(100); 
                    linkedhashset.add(10);
                    linkedhashset.add(5);
                    linkedhashset.add(4); 
                    System.out.println(linkedhashset);//[100, 10, 5, 4]
                                    //LinkedHashSet keeps the order as it is
                    // doubly-linked: add() & remove() are faster than HashSet

      SortedSet<String> treeset = new TreeSet<>();
                       treeset.add("Z");
                       treeset.add("Y");
                       treeset.add("X");
                       treeset.add("W");
                System.out.println(treeset); //[W, X, Y, Z]
     //Task: remove duplicates fro ArrayList, and sorted
             List<Integer> list = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4)); 
             System.out.println(list);//[10, 9, 8, 7, 6, 5, 4]
                       
             Collections.sort(list);
             System.out.println(list);// [4, 5, 6, 7, 8, 9, 10]
             
             List<String> list2 = new ArrayList<>(Arrays.asList("B","C","A","D"));
             TreeSet<String> list3 = new TreeSet<>(list2); 
             System.out.println(list3); //[A, B, C, D]
             
   /*
    String="AAAAAABBBBBCCCCCDDDDD"
    remove duplicates          
    */
             String str = "ZZZZZZZYYYYYYYYYAAAAAAAAAAABBBBBBBBCCCCCCCDDDDDDDD";
             String[] arr = str.split("");
             System.out.println(Arrays.deepToString(arr));
             LinkedHashSet<String> restroom = new LinkedHashSet<>(Arrays.asList(arr));
             System.out.println(restroom);
             String result = restroom.toString().replace("[", "").replace("]", "").replace(", ", "");
                   System.out.println(result);
                   
             //second solution
                String str2 = new LinkedHashSet<String>(Arrays.asList(arr)).toString();   
               System.out.println(str2);

    
}
}
