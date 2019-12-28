package replit_assignments;

import java.util.Scanner;

public class r_115ArraysFindingMaxLength {
public static void main(String[] args) {
	/*
	 Given the array words, it will print the word with the largest length. 
	 Assume that there are no 2 words with longest length
	 */
	Scanner input = new Scanner(System.in);
	String[] words = new String[5];
	for(int i = 0; i < 5;  i++) {
	  words[i] = input.nextLine();
   }
	  int length=0;
	  String longWord="";
	  for(int i=0; i<5; i++) {
		  if(words[i].length()>=length) {
			  length=words[i].length();
			  longWord=words[i];
		  }
	  } 
	System.out.println(longWord);
}
}