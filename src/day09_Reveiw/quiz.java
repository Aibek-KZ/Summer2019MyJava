package day09_Reveiw;

public class quiz {
	public static void main(String[] args) {
		
		//Kahoot Question 1
		boolean a = !!!!!!false;//false
		System.out.println(a);
		
		//Question 2
		boolean result=!false !=("Batch"!="Batch12");// false
		System.out.println(result);
		
		//Question 3
		int x=100;//105
		int y = x+=100/20;
		System.out.println(x);
		
		//Question 5
		boolean A=128>'9'||128==127;
		     //    true  || false==> true
		System.out.println(A);
		
		//Question 6
		boolean StupidOperators=10>=20 && 'a'>'b';
		//                      false  && false==>false
		System.out.println(StupidOperators);
		
		//Question 7
		int num1=99999;
		int num2=10;
		System.out.println(num1*num2/10%num1);//0
		
		//Question 		
		
		int b=2;
		boolean res=++b==2||--b==2 && --b==2;//false
		//           false   true      false
		System.out.println("result="+res);
		
		//Next one
		boolean xx=true, zz=true;
		int yy=20;
		xx=(yy!=10)||(zz=false);
		//  true       false
		System.out.println(xx);//true
		
	
		
	}
	
	

}
