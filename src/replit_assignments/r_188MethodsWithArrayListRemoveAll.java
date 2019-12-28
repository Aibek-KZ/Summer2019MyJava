package replit_assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class r_188MethodsWithArrayListRemoveAll {
/*
 Create a static method that:
 is called removeAll,  returns nothing
 takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord
 This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.
 Example:
  ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
  removeAll(wordList,"hi");
  now wordList is ["hey","yo"]
 */
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi", "hey","hi","yo","hi", "hi"));	
		String targetWord="hi";
		removeAll(wordList, targetWord);
	}
	
		//create your method below
		public static void removeAll(ArrayList<String> wordlist, String targetWord) {
		
//		 wordlist.removeAll(Arrays.asList(targetWord));
			for(int i=0; i<wordlist.size(); i++) {
				if(wordlist.get(i).equals(targetWord)) {
					wordlist.remove(targetWord);
					--i;
					
				}
			}
		  		
		System.out.println(wordlist);
		
}
}
