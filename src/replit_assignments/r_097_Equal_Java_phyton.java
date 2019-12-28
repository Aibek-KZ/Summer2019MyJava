package replit_assignments;

import java.util.Scanner;

public class r_097_Equal_Java_phyton {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your sentences");
    String sentence = scan.nextLine();
        
        int countJ=0;
        int countP=0;
        int len=sentence.length();
                
        for(int i = 0; i < len; i++) {  
           if(sentence.contains("java")) {
               sentence=sentence.replaceFirst("java", "JAVA");
               countJ+=1;
           }        
           }  
        for(int i = 0; i < len; i++) {  
            if(sentence.contains("python")) {
               sentence=sentence.replaceFirst("python", "PYTHON");
            	countP+=1;
            }        
         }    
             System.out.println(countJ==countP);
        
    
    
    /*
      if (sentence.contains("java") && sentence.contains("python")) {
    	  sentence=sentence.replaceFirst("java", "JAVA");
    	  sentence=sentence.replaceFirst("python", "PHYTHON");
    	   	  if (sentence.contains("java") && sentence.contains("python")) {
    		  System.out.println("true");
    	  } else if(sentence.contains("JAVA") && sentence.contains("PYTHON")) {
    		  System.out.println("true");
    	  }
      } else {
    	  System.out.println("false");
      }
    
    */
}
}
