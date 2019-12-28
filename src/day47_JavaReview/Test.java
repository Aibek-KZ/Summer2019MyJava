package day47_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	//continue to skip current iteration
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(10,55,21,99,45,99,78,99)); 
		System.out.println(numbers);
		int count =0;
		for(int i=0; i<numbers.size(); i++) {
			if(numbers.get(i)==99) {
				continue;				
			}
			System.out.print(numbers.get(i)+" ");
		}
		System.out.println();
		for(int i=0; i<numbers.size(); i++) {
			if(numbers.get(i)==99) {
				System.out.println("We have a 99");
			}
		}
	}
}
