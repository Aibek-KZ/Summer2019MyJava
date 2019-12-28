package OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collections {
	public static void main(String[] args) {
		
		String[] s = {"a", "b","c"};
	//	List<String> s = new List<>(); can not create because it is Interface
		
		List<String> cars = new ArrayList<>();
		cars.addAll(Arrays.asList("Toyota","Lexus","Mazda"));
		cars.add("BMW"); 
		cars.add("Audi");
		System.out.println(cars.get(0));//BMW
		
		//first way
		System.out.println(cars);//[BMW, audi]	
		//second way
		for(String each:cars) {
			System.out.println(each);
		}
		//remove
		boolean a = cars.remove("BM");
		System.out.println("removed: "+a);
		System.out.println(cars);
		
		//reverse
		for(int i=cars.size()-1; i>=0; i--) {
			System.out.print(cars.get(i)+", ");
		}
		System.out.println();
		
		
		List<String> languages = new LinkedList<>();
		languages.addAll(Arrays.asList("Java","Python","Ruby","C++"));
		System.out.println(languages);
		System.out.println("======================================");
		   for(int i=0; i<languages.size(); i++) {
			   System.out.print(languages.get(i)+" ");
		   }
				
		
		List< String> books = new Vector<>();
		
		
	}

}
