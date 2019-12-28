package javaAssignments;
import java.util.Scanner;
public class make_sandwich {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a word");
	String word1=input.nextLine();
	System.out.println("Enter a second word");
	String word2=input.nextLine();
	int length1=word1.length();
    int length2=length1/2;
  
    if(length1%2==0) {
	String half1=word1.substring(0, length2);
	String half2=word1.substring(length2);
	System.out.println(half1.concat(word2.concat(half2)));
		   
	   }else {
		   System.out.println("Please enter even character word");
	   }
	
}
}
