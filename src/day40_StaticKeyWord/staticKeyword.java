package day40_StaticKeyWord;

public class staticKeyword {
	int a;
    static int b ;

public static void main(String[] args) {
    
    staticKeyword obj1 = new staticKeyword();
        obj1.a = 100;   
        
    staticKeyword obj2 = new staticKeyword();
        obj2.a = 200;
        
        System.out.println( obj1.a );  // 100
            // each object has its own copy of instance variables
        
        System.out.println( obj2.a ); //  200
        
    double num = 100.5;
    
    System.out.println( staticKeyword.b );
    System.out.println( obj1.b );
    System.out.println( obj2.b );
    
    System.out.println("=======================");
    
    staticKeyword obj3 = new staticKeyword();
            obj3.a = 100;
            System.out.println(obj3.a);    // 100
            
            
    staticKeyword obj4 = new staticKeyword();       
    System.out.println(  obj4.a );   //  0
    
    
    obj3.b = 400;
    System.out.println( obj3.b ); // 400  
    
    System.out.println( obj4.b );
    
    
    
}

public static void method1(){
//  System.out.println( num );  local variables only visible within the methods
    
}

}
