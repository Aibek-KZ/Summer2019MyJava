package replit_assignments;

import java.util.Scanner;

public class r_90_Count_java {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
    String word = scan.next();
    int countJava=0;
    int len=word.length();
    
    for (int i=0; i<len; i++) {
    	if(word.contains("java")) {
    		word=word.replaceFirst("java", " ");
    		countJava+=1;
    	}
    }
    System.out.println(countJava);
    
    
    
}
}
