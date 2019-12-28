package replit_assignments;

public class r_082_div_3 {
public static void main(String[] args) {
	/*Write for and while loops so that they print those numbers between 1 and 20 and 
	 divisible by 3.
       Expected Output:  3 6 9 12 15 18
    */
	for(int i=1; i<=20; i++) {
		if(i%3==0) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	int j=1;  
	while(j<=20) {
		if(j%3==0) {
			System.out.print(j+" ");
		} 
		j++;
 	  }

	
	
}
}
