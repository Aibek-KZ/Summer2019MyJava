package replit_assignments;

import java.util.Scanner;

public class r_120ArraysPrintShortest {
public static void main(String[] args) {
	/*
	 Write a program that will print the shortest word in the given array str. 
	 input: java, cable, red, vivid, remedy, grace
      output: red
	 */
	 Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	
	    String shortest="";
	    int len=999999999;
	    for(int i=0; i<str.length; i++) {
		   if(str[i].length()<len) {
			   shortest=str[i];
			   len=str[i].length();
		   }
	}
	System.out.println(shortest);
	
}
}
