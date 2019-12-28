package replit_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class r_105_Arrays_print_first_last_char {
public static void main(String[] args) {
	/*
	 Given a String array words, iterate through each word and print first
	  and last letter of each element in the format below.
	  "hello"-ho, "why"-wy, apple-ae 
	 */
	Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
   
    //TODO: Write your code below
	
    for(int i=0; i<words.length; i++) {
    	words[i]=words[i].substring(0, 1)+words[i].substring(words[i].length()-1, words[i].length());
    }
    System.out.println(Arrays.toString(words));
    
	
	
}
}
