package day34_Constructors;

import java.util.ArrayList;

public class WarmUp {
  /*
   Warm up:
    1. write  a return method that can remove duplicates from a string
        Ex: RemoveDup("abcabc") ==> returns "abc";
    2. write a return method that accepts two parameter Strings a and b, and 
      returns the total numbers of apperence of b in String a
        Ex: count("abcaba")  ==> returns 3 ;
    3. use the above two methods to write a new method that can find the frequency of characters
        Ex: frequency("aabcabcabc") ==>a4b3c3
    4. write a return method that can find the maximum number from an Integer arrayList  
      (DO NOT use sort methods of Collections class)
    5. write a return method that can find the minimum number from an Integer
       arrayList     (DO NOT use sort methods of Collections class)
   */
	public static void main(String[] args) {
		String a=RemoveDup("aaaabbbbbcc");
		System.out.println(a);
		
		int b=AppearenceFOR("aaaaaaabbvg", "a");
		System.out.println(b);
		
		int c=AppearenceWhile("aaaaaaabbvg", "a");
		System.out.println(c);
		
		System.out.println(FrequencyTest("rrrrrkkkkkufffff"));
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(25);
		list.add(30);
		
		int max=maximum(list);
		System.out.println(max);
		
		int min=minimum(list);
		System.out.println(min);
		
		
		
	}
	
	//task 1
	public static String RemoveDup(String str) {
		String result="";
		for(int i=0; i<str.length(); i++) {
			if(!result.contains(str.substring(i, i+1))) {
				result+=str.substring(i, i+1);
			}
		}
		return result;
	}
	
	//task 2, For loop
	public static int AppearenceFOR(String a, String b) {
		int count=0;
		for(int i=0; i<a.length(); i++) {
			if(a.contains(b)) {
				count++;
				a=a.replaceFirst(b, "");
			}
		}
		return count+1;
	}
	
	//task 2, While loop
	public static int AppearenceWhile(String a, String b) {
		int count=0;
		while(a.contains(b)) {
			count++;
			a=a.replaceFirst(b, "");
			
		}
		return count;
	}
	
	//task 3
	public static String FrequencyTest(String str) {
		String result=""; //to store the expected result
		String nonDup=RemoveDup(str); //"abc"
		  for(int i=0; i<nonDup.length(); i++) {
		int count=AppearenceWhile(str, ""+nonDup.charAt(i));
		result+=""+nonDup.charAt(i)+count;
	}	
		return result;
	}
	
	//task 4
	public static int maximum(ArrayList<Integer> list) {
		int max=Integer.MIN_VALUE;
		for(int each : list) {
			if(each>max) {
				max=each;
			}
		}
		return max;
	}
	
	//task 5
	public static int minimum(ArrayList<Integer> list) {
		int min=Integer.MAX_VALUE;
		for(int each : list) {
			if(each<min) {
				min=each;
			}
		}
		return min;
	}
}
