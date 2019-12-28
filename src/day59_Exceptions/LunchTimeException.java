package day59_Exceptions;

public class LunchTimeException extends Exception{
    
    public LunchTimeException() {
        super("It's Lunch Time");
        System.err.println("Time to Stop the class, lets go home");
    }
    
    
}
