package day06_ArithmaticOperators;

public class Exercises {
	
	public static void main(String[] args) {
		
		System.out.println(5+2*4);//13
		System.out.println(10/2-3); //2
		System.out.println(8+12*2-4); //28
		System.out.println(4+17%2-1); //4
		System.out.println(6-3*2+7-1); //6
		System.out.println(21%2+17%3+33%4+11%2);// 1+2+1+1=5
		System.out.println(31%4+22%3+19%6+45%8);// 3+1+1+5=10
		System.out.println();
		System.out.println((5+2)*4);//28
		System.out.println(10/(5-3));//5
		System.out.println(8+12*2-1);//31
		System.out.println((4+17)%2-1);//0
		System.out.println((6-3)*(2+7)/3);//9
		System.out.println();
		System.out.println();
		int num1=46, num2=90;
		int sum=num1+num2;
		System.out.println("46+90="+sum);
		
		//New task
		int C=42;
		double Fahrenheit=9*C/5+32;
		System.out.println("Fahrenheit "+Fahrenheit);
		
		//New task
		double mile=25;
		System.out.println("You entered "+mile+" miles");
		double km=mile*1.609344;
		System.out.println(mile+" miles equal to "+km);
		
		//New task
		double radius=5.5;
		double Pi=3.14;
		double perimeter=2*radius*Pi;
		double area=radius*radius*Pi;
		System.out.println("\n Perimeter of a circle is "+perimeter);
		System.out.println("Area of a circle is "+area);
		System.out.println();
		
		//New task
		float width=4.5f;
		float height=7.9f;
		float area1=width*height;
		System.out.println("Area of rectangle is "+area1);
		
		//New task
		double Num1=98, Num2=104, Num3=101;
		double average=(Num1+Num2+Num3)/3; 
		System.out.println("Average of 3 numbers "+average);
		
		//New task
		int pies=10, people=4;
		double piesPerson;
		piesPerson=pies/people;
		System.out.println(piesPerson);
		
		//New task
		int pies1=10, people1=4;
		double piesPerson1;
		piesPerson1=(double)pies1/people1;
		System.out.println(piesPerson1);
		
		//New task
		int pies2=10, people2=4;
		double piesPerson2;
		piesPerson2=pies1/(double)people1;
		System.out.println(piesPerson2);
		
		//New task
		float a=7.9f, b=6.7f;
		int c=(int)a, d=(int)b;
		System.out.println(c+d);
		
		//New task
		int intNum=17;
		double dNum=(double)intNum;
		System.out.println(dNum);
		
	}

}
