package replit_assignments;

public class r_172MethodsWithString {
  /*
   at3 gets two strings and returns a string.
   the first string is the one that will be manipulated. at the 3rd char
   position of target you will insert the word argument.
     example use:
              at3("longword","foo")
              will return: "lonfoogword"
                                    at3("blabla","a")
                                    will return: "blaabla"
   */
	public static String at3(String target,String word)	  {
	    String target1=target.substring(0, 3);
	    String target2=target.substring(3, target.length());
	    target=target1+word+target2;
		return target;
	  }
	public static void main(String[] args) {
		System.out.println(at3("longword","foo"));
	}
}
