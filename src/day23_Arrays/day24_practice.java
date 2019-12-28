package day23_Arrays;

public class day24_practice {
public static void main(String[] args) {
	//first maximum number
	int[] arr= {20, 200, 30, 50, 500, 800};
	int maximum=0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>maximum) {
			maximum=arr[i];
		}
	}
	System.out.println("Maximum number is: "+maximum);
	
	
	
	
}
}
