package replit_assignments;

public class r_081_Evens {
public static void main(String[] args) {
	
	int even=0;
	for(int i=2; i<=100; i+=2) {
		System.out.print(i+", ");
	}
	System.out.println();
	for(int i=2; i<=100; i++) {
		if(i%2==0) {
			System.out.print(i+", ");
		}
	}
}
}
