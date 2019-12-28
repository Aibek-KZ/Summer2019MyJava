package day17_StringClass;

public class new1StringMethods {
public static void main(String[] args) {
	
	//replace()old char, new char: replaces all the old char valuess with the given new 
	//charvalue in the String and returns it is a new value
	String str1="Java is fun Programming language";
	String str=str1.replace('a', 'e');
	System.out.println(str1);
	System.out.println(str);
	
	//replace(old str, new str): replace all the old str values with the given new str values
	//in the string and returns it as a New value
	String str2="Today is gonna be a great day to learn Java";
    String str0=str2.replace("Today", "Tomorrow");	
	System.out.println(str2);
	System.out.println(str0);
	System.out.println(str2.replace("Java", "")); 
	
	// replaceFirst(old str, new str): it replaces first occured old str with the new str
	//in the String and returns it as a New String value
	String s1="Java is fun, Java is good";
	String s0=s1.replaceFirst("Java", "Python");//only first "Java" has replaced
	System.out.println(s1);
    System.out.println(s0);	
}
}
