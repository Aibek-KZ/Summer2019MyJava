package day42_OOP_Encapsulation;

public class EmployeeInfo {

	  /*
    Name
    SSN
    Age
    Salary
    */

   private String Name;
   private long SSN;
   private byte Age;
   private double Salary;
   
   // name:
   public void setName(String Name) {
       this.Name = Name;
   }

   public String getName() {
       return Name;
   }
   
// ssn:
   public long getSSN() {
       return SSN;
   }
   
   public void setSSN(long SSN) {
       this.SSN = SSN;
   }

}
