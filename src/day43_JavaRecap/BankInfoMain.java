package day43_JavaRecap;

public class BankInfoMain {
	
	public void depositing() {
		BankInfo obj1 = new BankInfo();
		System.out.println("Your balance is: "+obj1.getBalance());
		double bal=obj1.getBalance()+7000;
		System.out.println("Your deposit is $7000");
		obj1.setBalance(bal);
		System.out.println("Your new balance is: "+obj1.getBalance());
	}	
		public void withdrawing() {
		BankInfo obj2 = new BankInfo();
		System.out.println("Your balance is: "+obj2.getBalance());
		obj2.setBalance(obj2.getBalance()-5000);
		System.out.println("Your new balance is: "+obj2.getBalance());
		
	}			
		public static void main(String[] args) {
		
		BankInfo obj=new BankInfo();				
		System.out.println(obj.getAccountHolder());	
		System.out.println(obj.getAccountNumber());
		System.out.println(obj.getBalance());
		
		obj.setBalance(1355000);
		System.out.println(obj.getBalance());
		obj.setAccountHolder("Saya");
		
		System.out.println(obj.getAccountHolder());	
		System.out.println(obj.getAccountNumber());
		System.out.println(obj.getBalance());
		
		BankInfoMain obj2 = new BankInfoMain();
		obj2.depositing();
		
		obj2.withdrawing();
		

	}

}
