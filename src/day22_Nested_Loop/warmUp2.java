package day22_Nested_Loop;

public class warmUp2 {
public static void main(String[] args) {
	
     /* 2. write a program that can check if the String is plaindrome. if it's print "true", 
      otherwise print "false"    DO NOT USE FOR LOOP
     Ex: input: level
     output: true,  (because reversed value is still "level")

	 abba==> abba==> palindrome
	 level==> level ==> palindrome
	*/
	String original="kazak";
	String reverse="";
	/*  for(int i=original.length()-1; i>=0; i--) {
		  reverse+=original.substring(i, i+1);
		  //reverse+=""+original.charAt(i); can use charAt method
	  }
	System.out.println(reverse);
	boolean result=original.equals(reverse);
	System.out.println(result);
	*/
	int i=original.length()-1;
	while (i>=0) {
		reverse+=original.substring(i, i+1);
		i--;
	}
	System.out.println(reverse);
	boolean result=original.equals(reverse);
	System.out.println(result);
	
	
	
	
	
	
}
}
