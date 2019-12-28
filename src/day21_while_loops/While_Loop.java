package day21_while_loops;

import java.util.Scanner;

public class While_Loop {
public static void main(String[] args) {
	
	/*
	 for loop: for(initialization; condition; iterator)
	 while loop: 
	           while(condition) {
	                 statements;
	           }
	 loops gets executed as long as the condition is true.
	        a repeating if statement          
	        
	  compiler first checks the condition of the while loop, if it's true executes the loop,
	  other wisw stops executing      
	 */
	int a=10;
	while (a>=9) {
		System.out.println("Hello");
		a--;
	} 
	String sentence="I like book, books, booking and more booking";
	int count=0;
	int len=sentence.length()-3;
	for(int i=0; i<=len; i++) {
		if(sentence.substring(i, i+4).contains("book")) {
			count++;
		}
	}
	System.out.println(count);
	
	
	
	
	
	
	/*
	
	//how many times the word "book" is appered in String
	String sentence="I like book, books, booking and more booking";
	int count=0;
	while(sentence.contains("book")) {
		count++;
		sentence=sentence.replaceFirst("book", "");
	}
	System.out.println(count);
	
	while(true) {
		System.out.println("hello world!");
		break;//forcfully exits the loop
	}
	
	int i=0;
	while(true) {
		i++;
		System.out.print("Hello: "+i+", ");
		   if(i==5) {
			   break;
		   }
	}
	System.out.println();
	// even numbers 1-100
	for(int z=1; z<=100; z++) {
		if(z%2==0) {
			System.out.print(z+" ");
		}
	}
			
	/*converting for loop to while loop
	Initialization;
	   while(condition) {
		   ststements;
		   iterators;
	   } 
	*/
	int x=1;
	while(x<=100) {
		if(x%2==0) {
		System.out.println();
		}
		x++;
	}
	Scanner input=new Scanner(System.in);
	int start=input.nextInt();
	int end=input.nextInt();
	
	int j=start;
	while(j<=end) {
		if (j%2==0) {
			System.out.println(j+" ");
		}
		j++;
	}





}
}

     
