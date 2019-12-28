
package day18_StringClassContinue;

public class StringMethods {
	public static void main(String[] args) {
		
		/* indexOf(str): returns th index number of the first occured character in the given
		  String as an int value
		 */
		String A1="Batch12 is a great batch";
		int num=A1.indexOf("B");
		System.out.println(num);
		int num2=A1.indexOf("eat"+2);// negative number means the str is not exist in the string
		System.out.println(num2);
		
		String B="today is tuesday, today we have class in the afternoon";
		int n1=B.indexOf("on");
		System.out.println(n1);
		
		String address=" 7925 Jones Branch Dr, McLean, VA 22003";
		int beginIndex=address.indexOf(",")+2;
		int endingIndex=address.indexOf(", VA");
		String cityName=address.substring(beginIndex, endingIndex);
		System.out.println(cityName);
		
		String email="Randommail@gmail.com";
		int begin2=email.indexOf("@")+1;
		int end2=email.indexOf(".com");
		String type=email.substring(begin2, end2);
		System.out.println(type);
		
		//lastIndexOf(): returns the last occured character index number as and Int value
		String str="asbddasdsdbsd".toUpperCase();
		int n2=str.indexOf('B');//2
		System.out.println(n2);
		int n3=str.lastIndexOf('B');//10
		System.out.println(n3);
	
		/*
		String myemail="myemailschiooola@gmail.com";
		int Begin1=myemail.indexOf("@")+1;
		int End1=myemail.lastIndexOf(".");
		String myemail=myemail.substring(Begin1, End1);
		System.out.println(myemail);
		*/
		
		
		
	}

}
