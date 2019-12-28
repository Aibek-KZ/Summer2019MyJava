package day57_Exceptions;

public class ExceptionClasses {
	//Unwanted or unexpected event
	
 // exception
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        
        System.out.println( arr[0] );  // unchecked
        
        
    //      Thread.sleep(1000);   // chekced exception
        
        System.out.println("Done");
        
        int[] nums = {1,2,3};
        try {
        	System.out.println(nums[10]);
        	System.out.println("My notes");
        }catch(Exception e) {
        	System.out.println("My exceptions");
        }
    }
}
