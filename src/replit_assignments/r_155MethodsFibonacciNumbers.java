package replit_assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class r_155MethodsFibonacciNumbers {
	/*
  Complete a method fib() that will compute Fibonacci numbers
  In fibonacci series, next number is the sum of previous two numbers
  for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... 
  The first two numbers of fibonacci series are 0 and 1.
  Given a number num, print n-th Fibonacci Number.
    Input  : 2
    Output : 1
             Input  : 9
             Output : 21
	*/ 
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
    //WRITE YOUR CODE HERE
    
    int a = 0;
    int b = 1;
    for (int i=0; i<num-1; i++){
        b = a + (a = b);
    }
    System.out.println(b);
  }

}
