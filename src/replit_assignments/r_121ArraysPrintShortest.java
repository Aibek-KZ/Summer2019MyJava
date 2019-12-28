package replit_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class r_121ArraysPrintShortest {
public static void main(String[] args) {
	/*
	 Write a program that will find out shortest words in the given string str. If
	 there are few words that are evenly short, print them all. Use split method in 
	 order to split str string variable and create an array of strings.  Print array
	  with Arrays.toString() method. Sort array before printing
	  
	 input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
     output: [cat, old, ray]
	 */
	Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    
    String str1[]=str.split(", ");
        
    String shorter="";
    int len=999999;
    for(int i=0; i<str1.length; i++) {
    	  if(str1[i].length()<=len) {
    		  shorter=str1[i];
    		  len=str1[i].length();
    	  }  
      }
    String shorter1="";
     for(int j=0; j<str1.length; j++) {
    	 if(str1[j].length()==shorter.length()) {
    		 shorter1=shorter1+str1[j]+" ";
    	 }
     }
	String[] str2=shorter1.split(" ");
	Arrays.sort(str2);
     System.out.println(Arrays.toString(str2));
	
}
}
