package day29_ReturnMethods;

public class DeletePrctice {

	 public static void main(String[] args) {
	 
		 totalNum(3.25, 2.65, 4.24);
		 
		 
}

	 public static int totalNum(int a, int b, int c) {
		 int total=a+c+b;
		 System.out.println("total is "+total); 
		 return total;
	 }
	 
	 public static String totalNum(String a, String b, String c) {
		 String total=a+b+c;
		 System.out.println("Your name is "+total); 
		 return total;
	 } 
	 
	 public static double totalNum(double a, double b, double c) {
		 double total=a+c+b;
		 System.out.println("total is "+total); 
		 return total;
	 }
	 
	 public static long totalNum(long a, long b, long c) {
		 long total=a+b+c;
		 System.out.println("total is "+total);
		 return total;
	 
	 }
	 
}
