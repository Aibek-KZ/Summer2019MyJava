package replit_assignments;

import java.util.*;

public class r_101ArraysFirstLastChar {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	String[] words = {input.nextLine(),input.nextLine(), input.nextLine()};
	 for(int i=0; i<words.length; i++) {
		 for(int j=0; j<words[i].length()-1; j++) {
			 words[i]=words[i].substring(0, 1)+words[i].substring(words[i].length()-1, words[i].length());
			 System.out.println(words[i]);
		 }
	 }		   

	
	
	
	
		
	}
}
