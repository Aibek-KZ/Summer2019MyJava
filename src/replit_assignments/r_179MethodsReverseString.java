package replit_assignments;

public class r_179MethodsReverseString {
  /*
   reverse method reverse a string.
   it gets a string and returns it in reverse.
   for example:
               reverse("foo") ==> "oof"
               reverse("student") ==> "tnedust"
   */
	public static String reverse(String input)	{
	    String reverse="";
		for(int i=input.length()-1; i>=0; i--) {
		reverse+=input.substring(i, i+1);
	   }
		return reverse;
	}
	public static void main(String[] args) {
		System.out.println(reverse("student"));
	}
}
