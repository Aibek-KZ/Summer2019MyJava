package day21_while_loops;

import java.util.Scanner;

public class warm_up {
public static void main(String[] args) {
	
	//count how many times use word "book"
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a word");
	String word=input.nextLine();
	int count=0;
		
	for(int i=0; i<word.length()-3; i++) {
	if(word.substring(i, i+4).equals("book")) {
		word=word.replaceFirst("book", "");
		count++;
	}
	}
	System.out.println(count);
		
	// other
	String words="Cybertek is school, Cybertek sfgdg dfgfgdg dfgdg fdgdfgd Cybertek";
	int times=0;
	    for (int i=0; i<words.length()-7; i++) {
		  if(words.substring(i, i+8).equals("Cybertek")) {
			  times++;
		  }
	}
	System.out.println(times);
	
	
	// remove duplicated values from String
	
	String s1="aabbccccc ddddddfgh";
	String result="";//abc
	   for(int i=0; i<s1.length(); i++) {
		   if(!result.contains(s1.substring(i, i+1))) {
			   //              (""+s1.charAt(i))
			   result+=s1.substring(i, i+1);
		   }
	   }
	System.out.println("duplicated values "+result);
	
	
	
	
}
}
