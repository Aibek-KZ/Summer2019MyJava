package javaAssignments;
import java.util.Scanner;
public class sale_based {

	public static void main(String[] args) {
		float total=0f;
		float discount=0f;
		Scanner enter=new Scanner(System.in);
		System.out.println("Enter unit price: ");
		int price=enter.nextInt();
		System.out.println("Enter unit quantity: ");
		int quantity=enter.nextInt();
	if (quantity<100 && quantity>0) {
		total=price*quantity;
		System.out.println("Grand total: $"+total);
		System.out.println("Discount 0%");
		System.out.println("Discount applied: $0");
		System.out.println("Total: "+total);
	} 
	else if (quantity>100 && quantity<=120) {
		total=price*quantity;
		discount=total*10/100;
		System.out.println("Grand total: $"+total);
		System.out.println("Discount 10%");
		System.out.println("Discount applied: $"+discount);
		System.out.println("Total: "+(total-discount));
		}	
	else if (quantity>120) {
		total=price*quantity;
		discount=total*15/100;
		System.out.println("Grand total: $"+total);
		System.out.println("Discount 15%");
		System.out.println("Discount applied: $"+discount);
		System.out.println("Total: "+(total-discount));
		}	
	else {
		System.out.println("Please enter correct price and quantity");
	}
		
		
	}
	
}
