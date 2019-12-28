package replit_assignments;

public class r_166MethodsWithStringMerge {
  /*
   When gears merge and work together, one teeth from each one goes in order.
   Write a method mergeStrings hat will return the strings merged, one letter at a 
   time, starting with one.   Please note one and two can be of different lengths. 
   Please look at below examples:
    s1 ==> "12345"
    s2 ==> "abcde"
    mergeStrings(s1,s2) ==> "1a2b3c4d5e"
                 mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
                                 mergeStrings("java", "selenium") ==> "jsaevlaenium"
   */
	public static void main(String[] args) {
		mergeStrings("apple", "facebook");
	}
	
	public static String mergeStrings(String one, String two) {
	    String shorterWord="";
	    if(one.length()<=two.length()) {
	    	shorterWord=one;
	    } else shorterWord=two;
	    
	    String longerWord="";
	    if(one.length()>=two.length()) {
	    	longerWord=one;
	    } else longerWord=two;
	    
			    
	    String newWord="";
	    for(int i=0; i<shorterWord.length(); i++) {
	    	newWord+=""+one.charAt(i);
	    	newWord+=""+two.charAt(i);
	    }
	    String difference=longerWord.substring(shorterWord.length(), longerWord.length());

	    newWord+=difference;
	    
	    return newWord;
	  }
}
