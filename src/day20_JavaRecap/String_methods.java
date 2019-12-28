package day20_JavaRecap;

import java.util.Scanner;

public class String_methods {
	public static void main(String[] args) {
		/*
		 methods: substring, indexOf, lastIndexOf, replace, replaceFirst, equals,
		          equalIgnoreCase, contains, startsWith, endsWith, charAt, trim,
		          length, concat, isEmpty, toUpperCase, toLowerCase 
		*/
		
		//substring: creating the sub value of the String
		String str="Cybertek school";
		str=str.substring(0, str.indexOf(" "));
		System.out.println(str);
		
		String str2="Cybertek school";
		str2=str2.substring(str2.indexOf("s"));
		System.out.println(str2);
		
		//indexOf: returns the first accured value's index number
		String s1="Java is a fun language, I Love java";
		System.out.println(s1.indexOf("ag"));//19
		
		//lastIndexOf: returns the last occured char's index num
		System.out.println(s1.lastIndexOf("ava"));//34
		System.out.println(s1.indexOf("ava,"));
		
		//replace: replaces old value with thr new one
		String name="Cybertek School Batch 12";
		int length=name.length();
		System.out.println(length);
		name=name.replace(" ", "");
		System.out.println(name);
		
		name =name.replace("School", "Family");
		System.out.println(name);
		
		// replaceFirst: replaces the first occured old character with the new one
		String A1="Java is Fun, Java is object oriented";
		A1=A1.replaceFirst("Java", "C++");
		System.out.println(A1);
		
		// ==, equals, equalIgnoreCase
		String R1="Cybertek";//String pool
		String R2=new String("Cybertek");//String Heap
		String R3=new String("cybertek");//Heap
		System.out.println(R1==R2);//false, because not in same memory location. HEAP vs Pool
		System.out.println(R1.equals(R2));// true, visible text are same
		System.out.println(R1.equals(R3));//false, case sensitivity
		System.out.println(R1.equalsIgnoreCase(R3));// true
		
		//trim: remove the unused spaces
		String spaces="           m        ";
		spaces=spaces.trim();//m
		System.out.println(spaces);
		
		String N1="     ";
		N1=N1.trim();
		System.out.println(N1.isEmpty());// true
		
		
		// charAt(index): returns a specific character from the String
		String C1="Cybertek";
		//         01234567 indexes
		char ch=C1.charAt(4);// 'r'
		System.out.println(ch);
		
		String C2=" please do more and more practices tomorrow";
		char ch2=C2.charAt(C2.lastIndexOf("w"));
		System.out.println(ch2);
		
		String sentences="ABGDFGDJFHGDSHFGMN";
		System.out.println(sentences.charAt(0));
		System.out.println(sentences.charAt(sentences.length()-1));
		String result=""+sentences.charAt(0)+sentences.charAt(sentences.length()-1);
		System.out.println(result);
		
		//startsWith & endsWith: returns boolean, checks the starting and ending values
		
		String email="cybertekSchool@gmail.com";
		boolean R=email.endsWith("@gmail.com");
		System.out.println(R);
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter email ");
		String email1=input.nextLine();
		  if(email1.endsWith("@gmail.com")) {
			  System.out.println("Valid email");
			   } else {System.out.println("Invalid email");}
		
		
		//contains: checks if given value is contained in the String or not then returns boolean
		  String salary="10$00";
		  boolean result2=salary.contains("$");// true
		  System.out.println(result2);
		
		  //concat: concates two String values
		  String Name="Cybertek";
		  Name=Name.concat(" School");//only String value!!!!
		 System.out.println(Name);
		 
		 
		 
		 
		 
	}

}
