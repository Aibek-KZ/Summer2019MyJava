package replit_assignments;

import java.util.Scanner;

public class r_086_Cats_and_Dogs {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int countOfCats = 0;
    int countOfDogs = 0;
    String word = scan.nextLine();
   
    int len=word.length();
    
    for(int i=0; i<len; i++) {
     if (word.contains("cat")) {
    	word=word.replaceFirst("cat", "kitten");
    	countOfCats+=1;
    }
    }
    
    for(int i=0; i<len; i++) {
    if (word.contains("dog")) {
       word=word.replaceFirst("dog", "puppy");
        countOfDogs+=1;
    }
    }
    System.out.println(countOfCats==countOfDogs);
    
}
}






