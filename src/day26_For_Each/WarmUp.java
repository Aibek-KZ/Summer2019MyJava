package day26_For_Each;

import java.util.*;

public class WarmUp {
public static void main(String[] args) {
	/*
	Warm up:
	    1. write a program that can check if two Strings are build out of same letters
	    Ex: 
	        if str1 = "aabbbc";  str2 ="cab";
	        output: true
	        if str1 ="abcd";  str2 ="abc";
	        output: false
	*/
    	    String a="aabbbc", b="caaaabbbbb";
//remove duplicates    abc         cab
	String a1=""; //store all the non duplicated values from a
	
	for(int j=0; j<a.length(); j++) {
	   for(int i=0; i<a.length(); i++) {
		  if(!a1.contains(a.substring(j, j+1))) {
			a1+=a.substring(j, j+1);
		}
	}
	}
	System.out.println(a1);
	
	String b1="";
	   for(int i=0; i<b.length(); i++) {
		   if(!b1.contains(b.substring(i, i+1))) {
			//(!b1.contains(""+b.charAt(i)))   
			   b1+=b.substring(i, i+1);
			   // ""+b.charAt(i)
		   }
	   }
	   System.out.println(b1);
	   
	   // a1="abc"   b1="cab"
	   
	   char[] ch1=a1.toCharArray();
	   System.out.println(Arrays.toString(ch1));
	   
	   char[] ch2=b1.toCharArray();
	   System.out.println(Arrays.toString(ch2));
	   
	   Arrays.sort(ch1);
	   Arrays.sort(ch2);
	   
	   System.out.println("========================");
	   System.out.println(Arrays.toString(ch1));
       System.out.println(Arrays.toString(ch2));
       
       String str1=Arrays.toString(ch1);
       String str2=Arrays.toString(ch2);
       
       if(str1.equals(str2)) {
    	   System.out.println("True, they are build out of the same letters");
       } else {
    	   System.out.println("False, different letters");
       }

// solution 2: in future
       String Str1 = "cccccaaaabbbbcccd" , Str2 = "cccaaabbb";
       
       Str1 = new TreeSet<String>( Arrays.asList( Str1.split(""))).toString();
       Str2 = new TreeSet<String>( Arrays.asList( Str2.split(""))).toString();
       
       System.out.println(Str1.equals(Str2));
	
	
	
	
	
}
}
