package javaAssignments;

public class Practice {
public static void main(String[] args) {
	
	double km=60;
	double miles=km/1.6;
    System.out.println(miles);	
    
	int a=10, b=20;
	String operator="-";
	if(operator.equals("*")) {
		System.out.println(a+", "+b+operator +(a*b));
	} else if(operator.equals("/")) {
		System.out.println(a+", "+b+ operator +(a/b));
	} else if(operator.equals("-")) {
		System.out.println(a+", "+b+ operator +(a-b));
	} else if(operator.equals("+")) {
		System.out.println(a+", "+b+ operator +(a+b));
	} else if(operator.equals("%")) {
		System.out.println(a+", "+b+ operator +(a%b));
	} else {
		System.out.println("Invalid Operator");
	}
	
}
}
