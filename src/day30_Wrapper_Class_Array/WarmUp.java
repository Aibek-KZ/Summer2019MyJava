package day30_Wrapper_Class_Array;

public class WarmUp {
	/*
	 * MuhtarMahmut
	 * 
    1. write a return method that accepts a String and removes duplicate values from the String
   Ex:
       RemoveDuplicate("aaabbbccc") ==> "abc"
   2. write a return method that accepts String and returns the unique values from the String
   Ex: 
           Unique("AABBCDEEE")  ==> "CD"
    */
	public static void main(String[] args) {
		
		System.out.println(RevDup("AAAAAAABBCCCCDDDDDDDCC"));
		
		
		String unique=UniqueValues("aaaaannnnnfbbbbbblttttty");
		System.out.println(unique);
		
	}
	
	//task 1
	public static String RevDup(String words) {
		String duplicate="";
		for(int i=0; i<words.length(); i++) {
			if(!duplicate.contains(words.substring(i, i+1)) ) {
				duplicate+=words.substring(i, i+1);
			}
		}
		return duplicate;
	}
	
	//task 2
	public static String UniqueValues(String str) {
		String result="";//to store unique characters
		
	for(int j=0; j<str.length(); j++) {	
		
		int count=0; // to count number of appearances
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		if(count==1) result+=""+str.charAt(j);
	}
	return result;
	}
	
	
	
	
	
	
	
	
	
}
