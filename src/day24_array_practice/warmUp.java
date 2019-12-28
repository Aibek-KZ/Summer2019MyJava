package day24_array_practice;

public class warmUp {
public static void main(String[] args) {
	
	//first maximum number
			int[] arr= {20, 200, 30, 50, 5000, 800};
			int maximum=0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>maximum) {
					maximum=arr[i];
				}
			}
			System.out.println("Maximum number is: "+maximum);
			
		//Second maximum number
			int secondMax=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]> secondMax && arr[j] !=maximum) {
					secondMax=arr[j];
				}
			}
			System.out.println("Second maximum number is: "+secondMax);
			
		//Minimum number
			int minimum=999999999;
			for(int k=0; k<arr.length; k++) {
				if(arr[k]<minimum) {
					minimum=arr[k];
				}
			}
			System.out.println("Minimum number is "+minimum);
			
			//Second minimum number
			int secondMin=999999999;
			for(int h=0; h<arr.length; h++) {
				if(arr[h]<secondMin && arr[h]>minimum) {
					secondMin=arr[h];
				}
	        	}
			System.out.println("Second minimum number is:"+secondMin);
}
}
