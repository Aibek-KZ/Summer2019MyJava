package javaAssignments;
import java.util.Scanner; 
public class ignore_first_one {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a word");
	String word1=input.nextLine();
	System.out.println("Enter a second word");
	String word2=input.nextLine();
	word1=word1.substring(1);
	word2=word2.substring(1);
	System.out.println(word1+word2);
	
	
	
	
	
}
}
