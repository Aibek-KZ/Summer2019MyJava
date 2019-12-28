package day63_JavaRecap;

import java.io.IOException;

class NoHolidaysException extends Exception{ // custom checked exception
    
}
class NoBreakException extends RuntimeException{
    
    public NoBreakException(String str) {
        super(str);
    }
    
}
public class Quiz {
    
    // Assessment quiz 16
    
    public static void main(String[] args){
        
        // throw new NoHolidaysException();
    //  throw new NoBreakException("There is no coffee break");
        
    //  throw new RuntimeException("There is no coffee break");
        
        
        
        
    //  throw new RuntimeException("This is an Exception ");  // explicitly
        
    //  System.out.println( 9/0  );  // implicitly
        
        
        int[] arr = {1,2,3};
        
        try {
            System.out.println(arr[100]);
        }catch(RuntimeException e) {
            System.out.println("runtime");
        }
        // catch (IndexOutOfBoundsException e) {}  // child exception type cannot be after parent exception type
        
    //  @Test methods: a Test case
        
        // @Test(testname="smoke")
        
        // Actions act = new Actions(driver);
        // act.moveToElement(WebElement).perform();
         
         
         
        
    }
    
    public static void method1() throws IOException{
        
    }
    
    /*
    @Test( timeOut = 1000 )  // gives time limit to the Test case
    public void Test1() throws Exception{ 
        Thread.sleep(2000);
        System.out.println("Test Completed");
    }
    
    */
    
    
    
}





