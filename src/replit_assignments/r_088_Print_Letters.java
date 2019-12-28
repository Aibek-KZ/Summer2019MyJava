package replit_assignments;

import java.util.Scanner;

public class r_088_Print_Letters {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    char start = scan.next().charAt(0);
    char end = scan.next().charAt(0);
     
    
    for(int i=start; i<end+1; i++) {
    	System.out.print((char)i+" ");    	
    }
    
    }
    
}

