package day28_Java_Recap;

import java.util.*;


public class WarmUp1 {
	/*
	warm Up:  
	    1. write a method that can convert km to miles, 1km=0.612 miles
	    2. write a method that can convert gallons to litters, 1G=3.75L
	    3. write method 
  */
	public static void main(String[] args) {
		//KmToMiles(); not enough info for the method to perform its tasks
		KmToMiles(250.55); 
		GallonToLiter(45.5);
		int[] array={10,50,60,1,25,3,-9};
		SortDes(array);
	}
	
	//task 1
	public static void KmToMiles(double KM) {
		double Miles=KM*0.612;
		System.out.println(KM+" km equals to "+Miles+" miles");
	}
	
	//task 2
	public static void GallonToLiter(double Gallon) {
		double Liters=Gallon*3.75;
		System.out.println(Gallon+" gallons equal to "+Liters+" liters");
	}
	
	//task 3
	public static void SortDes(int[] array) {//if array={10,8,99,0,-1};
		Arrays.sort(array); // array={-1,0,8,10,99}
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
	}

	
	
	
	
	
}

