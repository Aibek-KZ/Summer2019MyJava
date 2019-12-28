package day58_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/*
1. Write a method called "wait" that causes the current executing thread to sleep 
   
   for the specific number of seconds
        parameters: double seconds
        return-type: void
        Thread.sleep();
    Note: Exceptions MUST be handled within the methods
2. write a method called "getData" that can retrieve the data from properties files
        parameters: String Key, String FilePath
        return-type: String
    Note: Exceptions MUST be handled within the methods
*/
public class WarmpUp {
    public static void main(String[] args) {
        
        Wait( 1 );
        System.out.println( "Batch 12");
        
        Properties property = new Properties();
        
        String path = "C:\\Users\\Aibek\\Desktop\\Data.properties";
        
        try {
            FileInputStream file = new FileInputStream(path);
            property.load( file);
            
        }catch(Exception e) {
            
        }
        
        String Name =   property.getProperty("ID");
        System.out.println(Name);
        
        
    System.out.println(   getData("Name", "C:\\Users\\Aibek\\Desktop\\Data.properties")  );
    System.out.println(property.getProperty("URL")); 
    
    String age1 = getData("Age", "TestData.properties");
        System.out.println(age1);
        
        String Salary = getData("Salary", "files\\TestData2.properties");
        System.out.println(Salary);
    }
    
    public static void Wait(double seconds) {
        
        try {
          Thread.sleep( (long)(seconds*1000) );  // 1 seconds = 1000 milliseconds
        } catch(Exception e) {  }
        
    }
    
    
    
    public static String getData(String Key, String Path) {
        String data ="";
        Properties property = new Properties();
                
        try {
            FileInputStream file = new FileInputStream(Path);
            property.load( file);
            
        }catch(Exception e) {
            
        }
        
        data = property.getProperty(Key);
        
        return property.getProperty(Key);
    }
    
    
    
    
}





