package replit_assignments;

import java.util.*;

public class r_195MethodsWithAnagram {
 /*
  Anagram is a word, phrase, or name formed by rearranging the letters
  of another, such as cinema, formed from iceman.
  
  isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.
  each letter in word1 should appear in word2 exact number of times
  ignore empty spaces
  make your code case insensitive
Examples:
  isAnagram("listen", "Silent") ==> true
  isAnagram("earth", "heart") ==> true
  isAnagram("star", "rats") ==> true
  isAnagram("hi", "bye") ==> false
  isAnagram("java", "cava") ==> false
  */
	public static boolean isAnagram(String word1, String word2) {
         word1= word1.toLowerCase();
         word2= word2.toLowerCase();
            
            String [] arr=word1.split("");
             Arrays.sort( arr );
             String str=Arrays.toString(arr);
            
            String[]arr2=word2.split("");
             Arrays.sort( arr2 );
             String str2=Arrays.toString(arr2);
            
             if(str.equals(str2)) {
                
                 System.out.println(true);
                 return true;
             }
                    
             else {
                 System.out.println(false);
                 return false;
             }
             }
        
    public static void main(String[] args) {
            
      isAnagram("listen", "Silent");
	        
}
}