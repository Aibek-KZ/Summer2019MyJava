package replit_assignments;

import java.util.Arrays;

public class ArraysCopyCertainValues {

	public static void main(String[] args) {
/*
 Given a String array arr with the following elements
["zero", "one", "two","three","four"]
Create another array fewValues and copy words that have letter "e" in them
You need to know how many element contain "e" and create array accordingly
Values in fewValues array need to be["zero", "one","three"]
Examples:
           arr -> ["aa", "be", "lol", "lel", "oreo"] 
     fewValues -> ["be",  "lel", "oreo"] 
                          arr -> ["e", "hey", "bye", "furey", "spoon"] 
                     fewValues ->["e", "hey", "bye", "furey"] 		
 */
		String[] arr= {"e", "hey", "bye", "furey", "spoon"};
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contains("e")) {
				count++;
			}
		}
		String[] fewValues=new String[count];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contains("e")) {
				fewValues[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.asList(arr));
		System.out.println(Arrays.asList(fewValues));
		
	}
}
