package replit_assignments;

public class r_157MethodsWithReturn {
   /*
    max function gets two ints, x and max.
    x is the test case, max is what we test against.
    if  x is bigger then max return max
    in any other case return x.
         for example:
                     max(1,10)
                     returns 1
          max(11,5)
          returns 5
    */
	public static void main(String[] args) {
		
		max(10, 25);
		
		
	}
	
	public static int max(int x, int  max)	  {
	    int ret=0;
		if(x>max) {
	    	ret=max;
	    } else {
	    	ret=x;
	    }
	    return ret;
	  }
	
	
}
