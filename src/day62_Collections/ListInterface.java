package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		
	//	List<Integer> list1 = new List<>(); interface we can not create object
		List<Integer> list2 = new ArrayList<>();
		List<String> list3 = new LinkedList<>();
		List<Double> list4 = new Vector<Double>();
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		        arraylist.add(10);
		        arraylist.add(20);
		        arraylist.add(30);
		        arraylist.remove(1);
		        System.out.println(arraylist);
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		        linkedlist.add(50);
		        linkedlist.add(60);
		        linkedlist.add(70);
		        linkedlist.remove(1);
		        System.out.println(linkedlist);
		        System.out.println("=====================================");
		
		String[] arr = {"A", "B", "B"};
		List<String> NotLinked = new ArrayList<>(Arrays.asList(arr)); 
		
		LinkedList<String> linked = new LinkedList<>(Arrays.asList(arr));//shouldn't compile in old version
		
		Vector<Integer> vt = new Vector<>();
		vt.add(1);
		
		System.out.println("===========================");
		
		Stack<Integer> st =new Stack<>();
	     	st.add(1);
		    st.add(2);
		    st.add(3);
		    st.add(4);
		    System.out.println(st);//[1, 2, 3, 4]
		    System.out.println(st.pop());//removes last given object
		    System.out.println(st);//[1, 2, 3]
		    System.out.println(st.pop());
		
		
	}
	// arraylist:
    public void add1(int a) {
        
    }
    
    // vector
    public synchronized void add2() {
        
    }

}
