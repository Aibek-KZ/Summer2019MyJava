package replit_assignments;

public class r_169MethodsWthString {
  /*
   This method gets a string and returns the word count of that string.
   example:
          wordCount("foo bar")
          returns 2
                 wordCount("one two three")
                 returns 3
                         wordCount("bla")
                         returns 1
hint:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
   */
	public static void main(String[] args) {
		wordCount("I love Java, Java is easy for me");
	}
	
	public static int wordCount(String words) {
	    String[] wordsNum=words.split(" ");
	    int count=wordsNum.length;
	      return count;
	  }
	
}
