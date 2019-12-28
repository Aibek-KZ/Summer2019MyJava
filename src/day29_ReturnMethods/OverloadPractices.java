package day29_ReturnMethods;

public class OverloadPractices {

	  public static void main(String[] args) {
	
	System.out.println("String Array");
	
	boolean[] array1= {true, false};
	main(array1);
	
	double[] array2 = {1, 1.3, 3};
	main(array2);
	
}
     
	  public static void main(int[] args) {
    	 System.out.println("Int Array");
     }
     
	  public static void main(double[] b) {
	    	 System.out.println("double Array");
	     }
	  
	  public static void main(boolean[] kfc) {
	    	 System.out.println("Boolean Array");
	     }
}
