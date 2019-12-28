package javaAssignments;
import java.util.Scanner;
public class ShoppingList028 {
public static void main(String[] args) {
	
	String report="";
	double totalPrice=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Item1, count and its price:");
	String item1=input.next();
	int count1=input.nextInt();
	double price1=input.nextDouble();
	price1=price1*count1;
	System.out.println("Enter Item2, count and its price:");
	String item2=input.next();
	int count2=input.nextInt();
	double price2=input.nextDouble();
	price2=count2*price2;
	System.out.println("Enter Item3, count and its price:");
    String item3=input.next();
    int count3=input.nextInt();
    double price3=input.nextDouble();
    price3=count3*price3;
    
	   totalPrice=price1+price2+price3;
    if(count1>0 && count2>0 && count3>0) {
   	    report="Item1: "+item1+" Price: "+price1+" Item2: "+item2+" Price: "+price2+" Item3: "+item3+" Price: "+price3;
        System.out.println(report);
    } else if(count1>0 && count2>0 && count3==0) {
   	    report="Item1: "+item1+" Price: "+price1+" Item2: "+item2+" Price: "+price2;
      System.out.println(report);
    } else if(count1>0 && count2==0 && count3>0) {
   	    report="Item1: "+item1+" Price: "+price1+" Item3: "+item3+" Price: "+price3;
       System.out.println(report);
    } else {
   	    report=" Item2: "+item2+" Price: "+price2+" Item3: "+item3+" Price: "+price3;
       System.out.println(report);

    }   

	System.out.println("Total price: "+totalPrice);
	
}
}
