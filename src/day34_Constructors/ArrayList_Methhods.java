package day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methhods {

	/*
	  remaining methods:
	     indexOf(object): returns the index number from the array list
	   */
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add( 1 );// auto-boxing
		list.add(Integer.valueOf("33"));//none
		list.add(Integer.parseInt("100"));
		list.add(200);
		list.add(350);
		list.add(1);
		
		int a=list.indexOf(33); //auto
		System.out.println(a);
		int b =list.indexOf(200);
		System.out.println(b);
		
		
//	lastIndexOf(object): returns the last occured object' last index number as a int 	
		int d=list.lastIndexOf(1);
		System.out.println(d);
		int d1=list.indexOf(1);
		System.out.println(d1);
		int q=list.indexOf(Integer.parseInt("100"));
		System.out.println(q);
		
		
  //   Arrays.asList(Object Array): used for converting object arrays to List interface
		//converting array to arrayList
		Integer[] arr = {1,2,3,4,5};
		ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(arr));
		list2.add(100);
		System.out.println(list2);
		
		
		String[] arr2= {"Java", "Phyton", "C++", "C#"};
		ArrayList<String> list3=new ArrayList<>(Arrays.asList(arr2));
		list3.add("Pascal");
		list3.set(2, "QBasic");
		System.out.println(list3.size());
		System.out.println(list3.isEmpty());// isEmpty(): checks is ArryList is empty
		System.out.println(list3);
		
		
		int[] arr3= {1,2,3,4,5,6,7,8,9};//should be Integer
	//	ArrayList<Integer> list4=new ArrayList<>(Arrays.asList(arr3));
		   //only the object arrays can be converted
		
		
	// addAll(Interface): using to store multuple objects for array
		String[] allaNames= {"Saya", "Mekan", "Musa"};
		
		ArrayList<String> names=new ArrayList<>();
		names.addAll(Arrays.asList("Ali", "Alen", "Habib", "Hamza"));
		System.out.println(names);
		
		names.addAll(Arrays.asList(allaNames));
		System.out.println(names);
		
	
		//removeAll(Intarface): removes all the matching objects
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.addAll(Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,3,4));
	numbers.removeAll(Arrays.asList(1,2));
	System.out.println(numbers); //1 are gone
		
	//removed() method not designed to be used with in loop
	//Ex.
	ArrayList<Integer> lis=new ArrayList<>();
	lis.addAll(Arrays.asList(1,1,1,2,2,2,3,4,5,6,4,1,2,4));
	for(int i=0; i<lis.size(); i++) {
		if(lis.get(i)==1) {
			lis.remove(i);
		}
	}
	System.out.println(lis);
	
	//Sorting the array: Arrays.sort 
	// sorting the arrayList: sorts in ascending order
	   // Collections.sort(VariableName);
	Integer[] array = {1000,900,800,1500,200,500,7450,2580,74};
	ArrayList<Integer> price1=new ArrayList<>();
	price1.addAll(Arrays.asList(array));
	System.out.println(price1);
	Collections.sort(price1);
	System.out.println(price1);
	
	
	
	
	}
}
