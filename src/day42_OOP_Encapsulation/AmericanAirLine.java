package day42_OOP_Encapsulation;

public class AmericanAirLine {

public static void main(String[] args) {
        
        EmployeeInfo emrah = new EmployeeInfo();
            //  emrah.Name = "Emrah";   // private data is not visible outside the class
            emrah.setName("Emrah");
            
        //  System.out.println( emrah.Name );  //  // private data is not visible outside the class
        
            System.out.println( emrah.getName() ); // Emrah
        
            emrah.setSSN(1234546);
            System.out.println(emrah.getSSN()); 
            
            
            
        
    }

}
