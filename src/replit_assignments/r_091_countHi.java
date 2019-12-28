package replit_assignments;

import java.util.Scanner;

public class r_091_countHi {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int len=str.length();
    int count=0;
    
    for(int i=0; i<len; i++) {
    	if (str.contains("hi")) {
    		str=str.replaceFirst("hi", "");
    		count+=1;
    	}
    	  }
    System.out.println(count);
}
}
