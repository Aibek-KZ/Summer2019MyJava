package day06_ArithmaticOperators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a = 100;
		int b=a-400; //-300
		
		int length = 100, weidth = 10, area = length/weidth;
		System.out.println(area);
		
		System.out.println(3+5+4-7);
		
		//double resultNum = 9/0;// denominator cannot be zero
		
		
		double Number1 = 10/3.0; //3.333
		double Number2 = 10/3.0; //3
		System.out.println(Number1);
		
		int output = 12+6/3; //6/3+12=14
		System.out.println(output);
		
		System.out.println(5+2*4);//13
		System.out.println(10/2-3);//2
		System.out.println(8+12*2);//32
		
		/* 10/3 ==> 3 with remainder of 1, 10-3*3=1
		 * 12/5 ==> 2 with remainder, 12-5*2=2 
		 * 20/3 ==> 20-6*3=2
		 *  
		 */
		System.out.println(10%3);
		System.out.println(12%5);
		
		/* 
		 * even: can be devided by 2 without a remainder
		 * odd: devided by 2, will have remainder
		 * 
		 */
		
		int Num20 = 20%2; //even
		int Num45 = 45%2; //odd 45-
		int Num65 = 65%2; //odd 65-32*2=1
		System.out.println(Num65);
		
		System.out.println(4+17%2-1); // 4+1-1=4
		System.out.println(6-3*2+7-1);
		System.out.println(6*3/2);//9
		
		double percentage = 125.0/100;
		System.out.println(percentage);
		
		
	}
	
	
}
