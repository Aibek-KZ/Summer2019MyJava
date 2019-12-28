package day42_OOP_Encapsulation;

public class Test {

	  public static void main(String[] args) {
	        
	        TestData obj = new TestData();
	        //  System.out.println( obj.Name ); // the data was private
	            
	        System.out.println( obj.getName() );  
	        
	        String str = obj.getName(); 
	        
	        // System.out.println( obj.ID );  // private data
	        System.out.println( obj.getID() );  //
	            int a = obj.getID();
	            
	        
	        
	        
	    }

}
