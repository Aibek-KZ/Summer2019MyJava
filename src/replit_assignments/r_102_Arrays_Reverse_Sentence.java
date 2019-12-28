package replit_assignments;

import java.util.Scanner;

public class r_102_Arrays_Reverse_Sentence {
public static void main(String[] args) {
	/*
	 Given a String variable sentence, write code to type
	  each word in separate lines in a reverse order.
   Example: 
   sentence -> "Java is fun"
    fun
     is
       Java
	 */
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
   String[] arr=sentence.split(" ");
 
 
    //TODO: Type your code below
	for(int i=arr.length-1; i>=0; i--) {
   	System.out.println(arr[i]+" ");

  }
}	
}

