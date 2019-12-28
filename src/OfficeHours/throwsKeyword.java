package OfficeHours;

public class throwsKeyword {
	
	public static void main(String[] args) {
		
	
	//Exception : 2     
    
    //compile time / checked --> syntax  
    String a = "java";
              //0123
    System.out.println(a.charAt(4)); //runtime exception / uncheked 
    
//  System.out.println(a);
    
    //looks good, no syntax error , but I got the exception after running thr code
    
    //run time exception / unchecked 
//  System.out.println(a.charAt(8));
//  
//  System.out.println("Asiya");
//  
    //3 ways of handeling exception 
    //try catch 
    
    try {
        String s = "java";
        System.out.println(s.charAt(8));
    }catch(ArithmeticException e)  {
        System.out.println("Check your String's index");
        e.printStackTrace();
    }catch (Exception e) {
        System.out.println("This is Exception fro mom");
    }
    
    System.out.println("Asiya");
    
	}
}