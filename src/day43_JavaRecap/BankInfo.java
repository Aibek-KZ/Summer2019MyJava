package day43_JavaRecap;

public class BankInfo {
	
	private  String AccountHolder="Aibek Rysbek";
	private long AccountNumber=3692025478963l;
	private double Balance=985800.55;
	
	private int Cash = 350000;
	private String Car = "Lexus 570";
	private double HomeWorth = 850000;
	
	
	public String getAccountHolder() {
		return AccountHolder;
	}
    public double getBalance() {
		return Balance;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}	
	public void setAccountHolder(String AccountHolder) {
		this.AccountHolder=AccountHolder;
	}
	public void setBalance(double Balance) {
		this.Balance=Balance;
	}
	public void setAccountNumber(long AccountNumber) {
    	this.AccountNumber=AccountNumber;
    }
		
	
}
