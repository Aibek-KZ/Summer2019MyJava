package day64_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	
	public static void main(String[] args) {
        Queue<Integer>  q1 = new PriorityQueue<>() ;
            q1.add(10);
            q1.add(20);
            q1.add(30);
            q1.add(10);
        
        //  System.out.println( q1.get(0) ); does not have index numbers
        System.out.println(q1);
            int a = q1.poll();  // unboxing
            
        System.out.println(q1);
        
            Integer b = q1.poll();   
        System.out.println(q1);
        
            q1.poll();
        System.out.println(q1);
        
        
        Queue<String>  q2 = new PriorityQueue<>() ;
        
        q2.add("Madina");
        q2.add("Erhan");
        q2.add("Mahriban");
        q2.add("Alla");
        
        
        System.out.println(q2);
        
        q2.poll();
        System.out.println(q2);
        
        q2.poll();
        System.out.println(q2);
        
        
        Queue<Integer> q3 = new PriorityQueue<>();
            q3.add(40);
            q3.add(30);
            q3.add(20);
            q3.add(10);
        
            System.out.println(q3);
        //Collections.sort(): sorts any collection type in ascending order
            
        Deque<Integer> DQ = new ArrayDeque<Integer>(); //[]
                DQ.addFirst(10); // [10]
                DQ.addFirst(20); // [20,10]
                DQ.addFirst(30); // [30, 20, 10]
                
                DQ.addFirst(40);  // [40, 30, 20, 10, 20]
        
                System.out.println(DQ);
            DQ.addLast(5);
            DQ.addLast(4);
            DQ.addLast(3);
            DQ.addLast(1);
            
            
            System.out.println(DQ);
                
            DQ.removeFirst();
            System.out.println(DQ);         
            
            DQ.removeLast();
            System.out.println(DQ);
                
            System.out.println(DQ.getFirst());  // retrives the first object from Deque
            
            System.out.println(DQ.getLast());
            
            
            
    }
}