package javaAssignments;

public class Task03_BiggerNumber {
	public static void main(String[] args) {
		
		//Solution0
		int x=-56, y=100, z=99, t=0;
		if(x>=y&&x>=z) {
			t=x;
		} 
		else if(y>=x&&y>=z) {
			t=y;
		}
		else {
			t=z;
		}
		System.out.println(t+" is the bigger number");
		
		
		
		
		//Solution 1
		int num1=33;
		int num2=58;
		int num3=79;
		boolean bigger1=num1>num2 && num1>num3;
		boolean bigger2=num2>num1 && num2>num3;
		boolean bigger3=num3>num1 && num3>num2;
		if (bigger1==true){
			System.out.println(num1+" is bigger");
		}
		if (bigger2==true) {
			System.out.println(num2+" is bigger");
		}
		if (bigger3==true) {
			System.out.println(num3+" is bigger");
		}
		
		//Solution 2
		int n1=400, n2=888, n3=999, max=0;
		String Number="Maximum number between "+n1+","+n2+" and "+n3+" is ";
		
		if (n1>n2 && n1>n3) {
			max=n1;
		}
		if (n2>n1&&n2>n3) {
			max=n2;
		}
		if (n3>n1&&n3>n2) {
			max=n3;
		}
		System.out.println(Number+max);
		
		
		//Solution 3
		if (n1>n2&&n1>n3) {
			System.out.println("Maximum nuber is "+n1);
		}
		if (n2>n1&&n2>n3) {
			System.out.println("Maximum nuber is "+n2);
		}
		if (n3>n1&&n3>n2)
			System.out.println("Maximum nuber is "+n3);
		}
	

}
