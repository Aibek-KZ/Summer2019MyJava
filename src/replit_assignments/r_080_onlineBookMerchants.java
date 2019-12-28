package replit_assignments;

import java.util.Scanner;

public class r_080_onlineBookMerchants {
public static void main(String[] args) {
	
	int freeBooks = 0;
    Scanner scan = new Scanner(System.in);
    boolean isPremiumCustomer = scan.nextBoolean();
    int nbooksPurchased = scan.nextInt();
    
       if(isPremiumCustomer) {
    	   if(nbooksPurchased>=5 && nbooksPurchased<=8) {
    		   freeBooks=1;
    	   } else if (nbooksPurchased>8) {
    		   freeBooks=2;
    	   }	   else {
    			 freeBooks=0;  
    		   }
    	   }
    	    else {
    	         if(nbooksPurchased>=7 && nbooksPurchased<=11) {
    	    	 freeBooks=1;
    	    } else if(nbooksPurchased>=12) {
    	    	freeBooks=2;
    	    } else {
    	    	freeBooks=0;
    	    }
     }
    System.out.println(freeBooks);
    
    
}
}
