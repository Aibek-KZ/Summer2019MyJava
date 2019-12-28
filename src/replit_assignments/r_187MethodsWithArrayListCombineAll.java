package replit_assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class r_187MethodsWithArrayListCombineAll {

	/*
	 Create a static method that:
  is called combineAL
  returns an ArrayList
  takes two parameters: an ArrayList of Strings called wordList1, and an
   ArrayList of Strings called wordList2
  This method should create a new ArrayList of Strings, add all the words
  (in order) from wordList1, then add all the words (in order) from wordList2. 
  In other words, it is combining all the elements from the two parameters.
	 */
   public static void main(String[] args) {
	   String[] str= {"Greatfull", "Happy", "Thankful"};
	   String[] str1= {"Wealthy", "rich", "moneyed"};
	   ArrayList<String> wordList1 = new ArrayList<>();
	   ArrayList<String> wordList2 = new ArrayList<>();
	   wordList1.addAll(Arrays.asList(str));
	   wordList2.addAll(Arrays.asList(str1));
	   
	System.out.println(combineAll(wordList1, wordList2));
}
	
	public static ArrayList<String> combineAll(ArrayList<String> wordList1, ArrayList<String> wordList2){
		ArrayList<String> combine = new ArrayList<>();
		combine.addAll(wordList1);
		combine.addAll(wordList2);
		return combine;
	}
}
