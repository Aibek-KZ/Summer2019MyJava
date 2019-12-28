package day22_Nested_Loop;

public class Nested_Loop {
public static void main(String[] args) {
	
	/*
	 Nested Loop: loop inside a loop
	        for() {
	               for(){
	                   "Hello"   will print 25 times   
	                           }
	                                }
	  when do we use nested loop: when we need to repeat some steps inside the loop   
	 */
	
	for(int z=0; z<5; z++) {
	    for(int i=1; i<=5; i++) {
		 System.out.print(i);
	}
	     System.out.println();
	}
	// next
	int z=5;
	while(z>0) {
	     int i=1;
	      while(i<=5) {
		  System.out.print("*");
		  i++;
	}
	      System.out.println();
	      z--;
	}
	//next
	System.out.println();
	for(int i=1; i<=7; i++) {
		 for(int j=1; j<=i; j++) {
		 System.out.print("*");
	  }
		 System.out.println();
	}
	
	int A=1;
	while(A<=7) {
		
		int b=1;
		while(b<=A) {
			System.out.print("*");
			b++;
		}
		System.out.println();
		A++;
	}
	
	for(int j=1; j<=10; j++) {
		
	    for(int i=1; i<=j; i++) {
		 System.out.print("*");
	}
	System.out.println();
	}
	
	System.out.println("\n\n");
	// ********************************************************
	for(int y=6; y>=0; y--) {
	   
		for (int x=1; x<=y; x++) {
		System.out.print("*");
	}
		System.out.println();
	}
	
	
	
	
	
	
}
}
