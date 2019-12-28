package day42_OOP_Encapsulation;

public class TestData {

	/*
    Name
    ID
    */

   private String Name = "Bekir";  // the data is not visible to any other classes
   private int ID = 200;

   
   public String getName() {  // read the private data only
       return Name;
   }
   
   public int getID() {
       return ID;
   }

}
