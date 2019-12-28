package replit_assignments;
import java.util.Scanner;
public class r_064_Middle_one {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a word ");
	String word=scan.nextLine();
	int len=word.length();  
	int middle=0;
	    
	      if(len%2==1 && len>=3) {
	    	 middle=len/2;
	    	 word=""+word.charAt(middle);
	    	 System.out.println("Middle character is "+word);
	     } else if(len==1) {
	    	 for(int i=1; i<=3; i++) {
	    		 System.out.print(word);
	    		 } 
	    } else if(len%2==0 && len>=4) {
	    	 middle=len/2;
	    	 word=word.substring(middle-1, middle+1);
	    	 System.out.print(word);
	    } else if(len==2) {
	    	 for(int i=1; i<=2; i++) {
	    		 System.out.print(word);
	    	 } 
   	     } 
	
	
	
}
}
