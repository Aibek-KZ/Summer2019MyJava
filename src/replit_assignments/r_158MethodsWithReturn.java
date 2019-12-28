package replit_assignments;

public class r_158MethodsWithReturn {
   /*
    isEven method gets a number(int) if its even (2,4,8...) returns true.
    if its odd return false.
       for example:
                      isEven(1) --> false
                      isEven(8) --> true
    */
	public static void main(String[] args) {
		System.out.println(isEven(24));
	}
	
	public static boolean isEven(int n)  {
	    if(n%2==0) {
	    	return true;
	    } else {
            return false; 
	    }
	  }
	
}
