package day48_MethodOverRiding;

public class Bank {
	public void InterestRate() {
		System.out.println("9 percent");
		System.out.println("to check");
	}
	public static void main(String[] args) {
		BankOfAmerica BOfA=new BankOfAmerica();
		BOfA.InterestRate();
		
		Chase Chase=new Chase();
		Chase.InterestRate();
		
		CapitalOne CO=new CapitalOne();
		CO.InterestRate();
		
	}
}

class BankOfAmerica extends Bank{
	@Override //to verify override or not
	public void InterestRate() {
		System.out.println("5 percent");
	}	
}

class Chase extends Bank{	
	public void InterestRate() {
		System.out.println("6 percent");
	}
}

class CapitalOne extends Bank{
	@Override //to verify override or not
	public void InterestRate() {
		System.out.println("7 percent");
	}
}
