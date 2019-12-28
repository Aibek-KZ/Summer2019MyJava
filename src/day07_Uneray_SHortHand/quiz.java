package day07_Uneray_SHortHand;

public class quiz {

	public static void main(String[] args) {
		// Kahoot questions
		// Question 1
		int a=30;
		int b=(byte)a;
		System.out.println(b);
		
		//Question 2
		//System.out.println(a1); will give compiles error
		//int a1=52
		
		//Question 3
		System.out.println("Result A"+0+1); //"Result A0"+1==>Result A01
		System.out.println("Result B"+(1)+(2));//Result B12
		System.out.println("Result B"+(1+2));//Result B3
		System.out.println("Result A"+0+1+10+21);//Result A011021
		
		//Question 4
		System.out.println("5+2="+3+4);//5+2=34
		System.out.println("5+2="+(3+4));//5+2=7
		
		//question 5
		float floatNum=100.9875648f;//float is larger than short
		short shortNum=(byte)floatNum;
		System.out.println(shortNum);
		
		double dNum=211.658;
		
		
		//Question 6
		//byte BNum=200; byte maximum capacity is 127
		
		//Question 7
		System.out.println((3+2)*2/3%2);//5*2/3%2==>10/3%2==>3%2==>1
		
		//Question 8
		//int num1=9, num2=0, num3=num1/num2;// dominator can not be 0, will give error
		//System.out.println(num3);
		
		//Question 9
		long Lnum=3_000l;
		double Dnum=(float)Lnum; //narrowing
		int Inum=(int)Dnum;//int, short
		System.out.println(Dnum);
		System.out.println(Inum%1000);//0
		
		//Question 10
		double result1=10/3;//3
		System.out.println(result1);//3.0
		
		//Question 12
		//String str="10.5";//string of text
		//int num=(int)str;//String is not a primitive
		
		//Question 13
		int I1=10, I2=20, I3=30;
		I1=I1%5;//10%5=0
		I2=I2%5;//20%5=0
		I3=I1*I2;
		System.out.println(I1+"\t"+I2+"\t"+I3+"\t");
		
		
		
		
		
		
		
		
		
		
		
	}
}
