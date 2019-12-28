package replit_assignments;

import java.util.Scanner;

public class r_115ArraysFindingMax {
public static void main(String[] args) {
	/*
	 Given the array words, it will print the word with the largest length. 
	 Assume that there are no 2 words with longest length

      Example:
      words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
      prints jaaaaavvaaaaaaaaaa
	 */
	Scanner input = new Scanner(System.in);
	String[] words = new String[5];
	for(int i = 0; i < 5;  i++) {
	  
	  words[i] = input.nextLine();
	  
	}	
	//write your code below
	String longest="";
	int len=0;
	for(int i=0; i<5; i++) {
		if(words[i].length()>len) {
			longest=words[i];
			len=words[i].length();
		}
	}
	System.out.println(longest); 
	
	
}
}
