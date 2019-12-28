package day25_Arrays_Continue;

import java.util.Arrays;

public class String_methods {
public static void main(String[] args) {
	/*
	 split(str): splits the string by the given value, and returns it as a String array
	 
	 toCharArray:
	 */
	
	String sentence="Today is a great day, Good day to learn Java";
	String[] arr=sentence.split(" ");
	System.out.println(Arrays.toString(arr));
	System.out.println(arr.length);
	
	String email="FirstName_LastName";
	String[] arr2=email.split("_");
	String str=Arrays.toString(arr2);
	System.out.println(str.replace("[", "").replace("]", "").replace(",", ""));
	
	
	String fullname="Cybertek School Batch12";
	String[] arr1=fullname.split(" ");
	System.out.println(Arrays.toString(arr1));
	
	String Java="I love Java and Java is fun, I love Java ";
	String[] arr3=Java.split("Java");
	System.out.println(Arrays.toString(arr3));
	System.out.println(arr3.length-1); //Java is accured 3 times
	
	
	String Python=" Python is good, I love  Python, Python is life ";
	//                [ |  is good, I love  , | ,      |  is life ] 
	String[] arr4=Python.split("Python");
	System.out.println(Arrays.toString(arr4));
	System.out.println(arr4.length-1);
	
	String word="ABCFGHJD";
	String[] allcharacters=word.split("");
	System.out.println(Arrays.toString(allcharacters));
	
	String emailAddress="Cybertek.school.batch12@gmail.com";
	   String fullname1=emailAddress.substring(0, emailAddress.indexOf("@"));
	   System.out.println(fullname1);
	   String[] allnames=fullname1.split("\\.");
	   System.out.println("First name: "+allnames[0]);
	   System.out.println("Middle name: "+allnames[1]);
	   System.out.println("Last name: "+allnames[2]);
	
	
	/*
	 toCharArray(): returns a char array from the String
	 */
	   String Str="Java";
	     char[] ch=Str.toCharArray();
	     System.out.println(Arrays.toString(ch));
	   
	   
	   
	   
	   
}
}
