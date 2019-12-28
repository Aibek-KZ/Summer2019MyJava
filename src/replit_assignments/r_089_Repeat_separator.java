package replit_assignments;

import java.util.Scanner;

public class r_089_Repeat_separator {
public static void main(String[] args) {
	/* Given two strings, word and a separator sep, return a big string made of count
	   occurrences of the word, separated by the separator string.
Example:
    input: Word                   This               This
    input: X                       And               And
    input: 3                       2                  1
    output: WordXWordXWord      ThisAndThis           This

	 */		
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    String separator = scan.next();
    int count = scan.nextInt();
    String text="";
   
    for(int i=1; i<count; i++) {
    	if(count>=1) {
    		text=text+word;
    	}
    	if(count>1) {
    		text=text+separator;
    	}
    }
    System.out.println(text+word);
    
	
}
}
