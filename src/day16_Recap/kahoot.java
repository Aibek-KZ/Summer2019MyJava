package day16_Recap;

public class kahoot {
	public static void main(String[] args) {
		//question 4
		int Batch=12;
		switch(Batch) {
		case 14: //can't be 014 or 036
			System.out.println("Hello");
			break;
		case 12: 
			System.out.println("Best");
		default:
			System.out.println("Buy");
		}
		
		// question 8
		 int sum=2, price=100;// price 200
		 sum*=price>=100? price*=2 :price;
		 //      true     price=price*2   :100
		 //  sum*=200==> sum=sum*200=400
		 System.out.println(sum+":"+price);
		
		 
		 
		 }
		
		 
		}


