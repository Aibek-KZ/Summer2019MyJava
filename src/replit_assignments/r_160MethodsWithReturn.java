package replit_assignments;

public class r_160MethodsWithReturn {
  /*
   The danish prince most famous quote is "to be or not to be". thats a classic 
   example of boolean logic.
   the hamletQuote method only returns true if one of  or both of the boolean
    parameters is true.
       example:
              hamletQuote(true, false)
              returns true
                             hamletQuote(false,true)
                             returns true
                                               hamletQuote(true,true)
                                               returns true
          hamletQuote(false,false)
          returns false
   */
	public static void main(String[] args) {
		boolean result=hamletQuote(false, false);
		System.out.println(result);
	}
	
	public static boolean hamletQuote(boolean toBe,boolean notToBe) {
	      if(toBe==true && notToBe==false) {
	    	  return true;
	      } else if(toBe==false && notToBe==true) {
	    	  return true;
	      } else if(toBe==true && notToBe==true) {
	    	  return true;
	      } else return false;
	    
	  }
}
