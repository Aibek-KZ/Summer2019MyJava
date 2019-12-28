package day27_Custom_Methods;

import java.util.Arrays;

public class Warm_Up {
public static void main(String[] args) {
	
	 /*
    Warmup:
       1. create an int array called numbers that has length of 100
       2. assign 1~100 to the array' each indexes
       3. use for each loop to rpint out all the even numbers.
               MUst user continue statement
    */
   
           int[] numbers;
               numbers = new int[100];
               
               for(int i = 0; i < 100; i++) {
                   numbers[i] = i+1;   
                       // each value of "i" will be assigned to the index number of (i-1)
                   // numbers[0] = 1
                   // numbers[1] = 2;
                   
                   }
               
               System.out.println( Arrays.toString(numbers) );
               
               for(int each : numbers ) {
                   
                   if(each % 2 != 0) {   // 1 %2 != 0  ==true
                       continue;
                   }
                   
                   System.out.print(each+" ");
                   
                   /*
                   if(each % 2 != 0) {   // 1 %2 != 0  ==true
                       continue;
                   }
                   */
                   
               }

	
}
}
