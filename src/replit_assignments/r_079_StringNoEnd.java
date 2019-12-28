package replit_assignments;

import java.util.Scanner;

public class r_079_StringNoEnd {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	String word=input.nextLine();
	int len=word.length();
	word=word.substring(0, len-1);
	System.out.println(word);
	
}
}
