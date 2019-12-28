package javaAssignments;

import java.util.Scanner;

public class NumbersToWord {

public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 99: ");
        int number = scan.nextInt();
        
        
        if (number < 10)
            System.out.println(numberInWord(number));
        else if (number >= 10 && number < 20)
            System.out.println(teens(number%10));
        else if (number%10 == 0)
            System.out.print(tensDigit(number/10));
        else {  
            System.out.print(tensDigit(number/10) + " ");
            System.out.println(numberInWord(number%10));    
        }   
        
    }
    
    public static String numberInWord(int number) {
        
        String output = "";
        switch (number) {
        case 0: output = "Zero"; break;
        case 1: output = "One"; break;
        case 2: output = "Two"; break;
        case 3: output = "Three"; break;
        case 4: output = "Four"; break;
        case 5: output = "Five"; break;
        case 6: output = "Six"; break;
        case 7: output = "Seven"; break;
        case 8: output = "Eight"; break;
        case 9: output = "Nine"; break;
        default: break;
        }
        
        return output;
        
    }
    public static String tensDigit(int number) {
        
        String output = "";
        switch (number) {
        case 2: output = "Twenty"; break;
        case 3: output = "Thirty"; break;
        case 4: output = "Forty"; break;
        case 5: output = "Fifty"; break;
        case 6: output = "Sixty"; break;
        case 7: output = "Seventy"; break;
        case 8: output = "Eighty"; break;
        case 9: output = "Ninety"; break;
        default: break;
        }
        
        return output;
        
    }
    
    public static String teens(int number) {
        
        String output = "";
        switch (number) {
        case 0: output = "Ten"; break;
        case 1: output = "Eleven"; break;
        case 2: output = "Twelve"; break;
        case 3: output = "Thirteen"; break;
        case 4: output = "Forteen"; break;
        case 5: output = "Fifteen"; break;
        case 6: output = "Sixteen"; break;
        case 7: output = "Seventeen"; break;
        case 8: output = "Eighteen"; break;
        case 9: output = "Nineteen"; break;
        default: break;
        }
        
        return output;
        
    }

}
