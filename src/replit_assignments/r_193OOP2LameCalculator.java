package replit_assignments;

public class r_193OOP2LameCalculator {
/*
 The LameCalculator class has instance methods that can do simple math operations on two numbers.
the methods are: plus, minus, multiply and divide .
all the methods get two ints then the method does the required math operation and returns the result as an int.
for example:
LameCalculator lc = new LameCalculator();
lc.plus(1,1)
returns:2
         lc.minus(1,1)
         returns:0
                  lc.multiply(2,1)
                  returns:2
       lc.divide(10,2)
       returns:5
 */
	private int X=0;
	private int Y=0;
	private int result =0;
	
	public void setX(int X) {
		this.X=X;
	}
	public void setY(int Y) {
		this.Y=Y;		
	}
	public int getX() {
		return X;
	}
    public int getY() {
    	return Y;
    }
	
	public int minus(int X, int Y) {
		X=X-Y;
		return X; 
	}
	public int plus(int X, int Y) {
		X=X+Y;
		return X;
	}
	
	public static void main(String[] args) {
		   
		r_193OOP2LameCalculator a = new r_193OOP2LameCalculator();
	      a.setX(1);
		  a.setY(1);
		  System.out.println("1+1 = "+ a.plus(1, 1));//1+1 = 2
		  System.out.println(a.minus(1, 1));
		  a.setX(127000);
		  System.out.println(a.getX());
		  System.out.println(a.getY());
		  a.setY(127500);
		  System.out.println("I got offer "+a.getY());
		  
		  
		  }	
}

