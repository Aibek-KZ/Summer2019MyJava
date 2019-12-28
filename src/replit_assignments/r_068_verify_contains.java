package replit_assignments;

import java.util.Scanner;

public class r_068_verify_contains {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    String sentence = scan.nextLine();
    //WRITE YOUR CODE HERE
    
    boolean result=sentence.contains(word);
    System.out.println(result);
        
       
}
}
