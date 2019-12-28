package day19_ForLoop;

public class For_Loop {
public static void main(String[] args) {
	/*Loop: used for reapeted action, reapeats multiple times
	 *for loop: 
	            for( initialization; condition; iterator ) {
	            statements ==> that we wanna repeat
	             }
	   initialization: usually the times of the number that we wanna execute the loop
	                   starting point
	                   Ex: int i=0; 
	   condition: condition is created based on the initialization
	             Ex: i<10;
	   iterator: co+related to the condition, runs long enough and either increases or 
	             decreases the value of initialization, then eventually condition ...          
	    
	    for(int i=1; i<=10; i++) {
		System.out.println("Hello Word "+i);
	}
		
*/
	//Task 1:
	
	for(int i=0; i<=10; i++) {
		System.out.println("the square of "+i+" is: "+(i*i));
	}
	
	
		
	}
	
	
}

