package day24_array_practice;

public class quiz {
public static void main(String[] args) {
	// question
	int i=5;
	do {
		i--;// starts from 4, because i-- before the print statement
		System.out.print(i+" ");//4 3 2 1 0
	}while(i>0);
	
	System.out.println();
	//question
	int x=10;
	for(int j=0; j<=5; j++) {
		x+=j;
	}
	System.out.println(x);
	
	//question
	int a=0; //
	while(a<=6) {
		a+=2;
	}
	
	//question
	int I=0;
	int J=7;
	for(I=0; I<J-1; I+=2) {
		System.out.println(I+" ");//0 2 4 
	}
	
	
	
}
}
