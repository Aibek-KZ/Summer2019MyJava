package replit_assignments;

import java.util.Scanner;

public class r_067_Reverse_it {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	String word=scan.next();
	String reverse="";
	
	int len=word.length();
	   if(len==5) {
		    for(int i=4; i>=0; i--) {
			   reverse=reverse+""+word.charAt(i);
		   }
		   System.out.println(reverse);
		
	   } else if(len<5) {
		   System.out.println("Too short!");
	   } else {
		   System.out.println("Too long!");
	   }
	
}
	
}
