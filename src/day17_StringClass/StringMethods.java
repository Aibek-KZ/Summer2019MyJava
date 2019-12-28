package day17_StringClass;
import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		String str1="Public pool";
		String str2="Public pool";
		boolean result=str1==str2;//true
		System.out.println(result);
		
		String str3=new String("Public pool");
		String str4=new String("Public pool");
		boolean result1=str3==str4;
		System.out.println(result1);
		
		boolean result3=str1==str4;//false
		System.out.println(result3);
		
		//concat(), length(), charAt(), toUpperCase, toLowerCase
		String a="Cybertek";
		a.concat(" School"); // String is immutable
		System.out.println(a);//Cybertek
		a=a.concat(" school");
		System.out.println(a);
		
		//length(): total number of caracters
		String longName="Cybertek students";
		int num=longName.length();
		System.out.println(longName+" has "+num+ " caracters");
		
		// charAt: 
		System.out.println("first letter is "+longName.charAt(0));
		char c=longName.charAt(5);
		char d=longName.charAt(2);
		System.out.println(c);
		
		//toUpperCase:
		System.out.println(longName);
		String s=longName.toUpperCase();
		System.out.println(s);
		
		//toLowerCase:
		System.out.println(s);
		String ss=s.toLowerCase();
		System.out.println(ss);
		
		
	}
}
