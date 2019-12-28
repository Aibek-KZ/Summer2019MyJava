package replit_assignments;

public class r_173MethodsBiggerString {
	/*
	 the method gets two strings and return the longest one
     biggerS("apple","orange") ==> "orange"
	 */
	
public static void main(String[] args) {
	biggerS("apple", "orange");
}
  public static String biggerS(String a ,String b){
  String biggerS1="";
	  if(a.length()>=b.length()) {
	  biggerS1=a;
  } else {
	  biggerS1=b;
  }
  return biggerS1;
}
}
