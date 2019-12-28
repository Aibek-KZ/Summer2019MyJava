package day08_ShortHandOperators;

public class Shorhand {
	public static void main(String[] args) {
		/* +=: addition assignment
		 * -=: substraction assignment 
		 * 
		 */
		int a=9;
		a+=3;//a=a+3
		System.out.println("a="+a);//12
		
		int b=a+=5;//b=a+5   
		System.out.println(b);
		
		int c=a+=b;//c=a=a+b    // 17+=17=34, a=34,  c=34, b=17
		System.out.println(c);
		
		int d=a+=c; //a=68, d=68 c=34, b=17
		System.out.println(d);
		
		int e=(d+=b)*2;// d-85, b=17, e=170, c=34
		System.out.println(e);
				
		
		// -=: substraction
		int g=101;
		int h=g-=1;//101-=1==>100, g=100, h=100
		System.out.println(h);
		
		int i=g+=h+5;//g=205, i=205, h=100
		System.out.println(i);//205
		
		int j=h+=g%i;//100+=205%205==>100+=0    //h=100, j=100 
		System.out.println(j);
		
		int k=j-=h*2%5;
		//      j-=200%5 //100-=0 //100
		System.out.println(k);
		
		
		// *=: Multiplication assignment x*=y==> x=x*y
		int A=100;
		A*=200;//A=A*200==>A=20000
		System.out.println(A);
		
		int B=100;
		B*=100/10;//B=B*100/10==>B=10000/10==> B=100
		System.out.println(B);
		
		B*=B-=1000;
		
		// /=: Division assignment
		int C=1000;
		C/=5;
		System.out.println(C);
		
		// %=: Remainder assignment: x%=y ==> x=x%=y
		int z=10%3;
		System.out.println(z);
		
		int E=10;
		E%=2; //E=10%2
		System.out.println(E);
		
		int F=100;
		F%=2; //F=F%2; ==>0
		System.out.println(F); //if it's 0 it's mean even number
		
		System.out.println(-100%3);// -1
		System.out.println(10.5%3);// 1.5
		System.out.println(10.8%3);// 1.8
		
		int J=300;
		int K=10;
		J+=J%=K; 
		//300%10=>0
		System.out.println(J);
		
		
		
		
		
		
		
		
		
	}

}
