package replit_assignments;

public class r_171MethodsWithString {
   /*
    This method gets a string and an int, it returns a string.
    what it dose is limit the inputted string to a cretin number of characters.
    for example:
             limit("abcd",2)
             returns "ab"
                          limit("bla bla",3)
                          returns "bla"

    */
	public static String limit(String text, int maxLength)  {
	    text=text.substring(0, maxLength);
		return text;
	  }
	public static void main(String[] args) {
		System.out.println(limit("abcd", 2));
	}
}
