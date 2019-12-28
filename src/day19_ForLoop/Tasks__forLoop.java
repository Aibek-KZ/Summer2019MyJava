package day19_ForLoop;

public class Tasks__forLoop {
public static void main(String[] args) {
	
	//Task 1:
			for(int a=1; a<=10; a++) {
			System.out.print("the square of "+a+" is: "+(a*a));
		}
	System.out.println();
	
	//Task 2
	      for(int i=1; i<33; i++) {
	    	  if(i%2==0) {
	    	  System.out.print(i+" "); }
	      }
	
	      System.out.println();
	//Task 3
	      for(int b=1; b<=32; b++) {
	    	  if(b%2==1) {
	    		  System.out.print(b+" ");
	    	  }
	    	  
	      }
			System.out.println();
	// Task4
	      String str="Java";
	      String rev=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	      System.out.println(rev);
	      
	 String rev2="";
	 String reversed="";
	 for(int c=3; c>=0; c--) {
		 reversed+=" "+str.charAt(c);
		 System.out.print(reversed);
		 
	 }		
			
			
			
			
			
}
}
