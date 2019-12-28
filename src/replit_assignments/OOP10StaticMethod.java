package replit_assignments;

public class OOP10StaticMethod {
	
/*
 A static method can be used without instantiating a class object.
like in the calculator class create a plus and minus. but this time make them 
static methods.
   plus: gets two ints and returns the addition of the to numbers as an int
       calc.plus(1,1)
       returns:2
                calc.plus(10,1)
                returns:11
minus:  the same as plus its also static, but it returns the substructed value of
        the two ints it gets
               calc.minus(1,1)
               returns:0
                                 calc.plus(10,1)
                                 returns:9	
 */
	public static int plus(int a, int b) {
		a=a+b;
		return a;
	}
	public static int minus(int a, int b) {
		a=a-b;
		return a;
	}
	
	
	public static void main(String[] args) {
		System.out.println("1+1 = "+OOP10StaticMethod.plus(1, 1) );
		  System.out.println("1-1 = "+OOP10StaticMethod.minus(10, 1) );
		  		
	}

}
