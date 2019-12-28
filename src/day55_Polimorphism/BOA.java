package day55_Polimorphism;

import java.util.ArrayList;
import java.util.Arrays;

/*
WarmUp:         
   1. create an abstract class called ScrumTeam
           Data: Name
                 JobTitile
                 Salary
           Actions: DailyStandUp();
                    Demo();
   2. Create the following sub classes of ScrumTeam:
               1. Testers:
                       Actions: FindBug
               2. Developers:
                       Actions: FixBug
   3. Create a class called BOF
           create Array of Testers named sdets, at leats store two objects
           create array of Developers named dev, at least store three objects
           create ArrayList of ScrumTeam:
                   store all the developer' and testers' objects
*/
abstract class ScrumTeam{
    
    public String Name , JobTitle;
    public double Salary;
    
    public abstract void DailyStandUp();
    public abstract void Demo();
    
    public void getEmployeeInfo() {
        System.out.println("=====================================");
        System.out.println("Employee Name: "+Name);
        System.out.println("Job Title: "+JobTitle);
        System.out.println("Salary: $"+Salary);
        System.out.println("=====================================");
    }
}
class Testers extends ScrumTeam {
    /*
     Name, JobTitle, Salary
     */
    public Testers(String Name, String JobTitle, double Salary ) {
        this.Name = Name;
        this.JobTitle = JobTitle;
        this.Salary = Salary;
    }
    
    public void DailyStandUp() {
        System.out.println("Tester "+Name+" is talking");
    }
    
    public void Demo() {
        System.out.println("Tester "+Name+" is doing demo");
    }
}
class Developers extends ScrumTeam{
    /*
     Name, JobTitle, Salary
     */
    public Developers(String Name, String JobTitle, double Salary) {
        this.JobTitle =JobTitle;
        this.Name =Name;
        this.Salary = Salary;
    }
    
    
    public void DailyStandUp() {
        System.out.println("Developer "+Name+" is talking");
    }
    
    public void Demo() {
        System.out.println("Developer "+Name+" is doing demo");
    }
    
    
}
public class BOA {
    public static void main(String[] args) {
        ScrumTeam Madina = new Testers("Madina", "SDET", 130000);
        ScrumTeam Akerke = new Testers("Akerke", "Automation Tester", 100000);
        ScrumTeam Erhan = new Testers("Erhan Holly", "Manual Tester", 40000);
    
        ScrumTeam[] testers = {Madina,  Akerke, Erhan};
        /*
        for( ScrumTeam each: testers ) {
            each.getEmployeeInfo();
        }
        */
        
        ScrumTeam Nadire= new Developers("Nadire", "Senior Developer", 150000);
        ScrumTeam Mahir = new Developers("Mahir", "Junior Developer", 130000);
        ScrumTeam Parsa = new Developers("Parsa", "Medium Developer", 220000);
        ScrumTeam Delare = new Developers("Dilara", "Devloper", 200000);
        
        ScrumTeam[] dev = { Nadire, Mahir, Parsa, Delare};
        /*
        for( ScrumTeam each: dev ) {
            each.getEmployeeInfo();
        }
        */
        
        ArrayList<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(  Arrays.asList(testers) );
        scrum.addAll(  Arrays.asList(dev) );
        
        for(ScrumTeam each: scrum ) {
            each.getEmployeeInfo();
        }
        
        
        
    }
    
    
    
}




