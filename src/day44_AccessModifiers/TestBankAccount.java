package day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBankAccount {
	public static void main(String[] args) {
		
		BankAccount Aibek = new BankAccount();
		Aibek.setAccountHolder("Aibek Rysbek");
		Aibek.setAccountNumber(777788845828877l);
		Aibek.getAccountInfo();
		Aibek.Deposit(8000);
		Aibek.ShowBalance();
		Aibek.WithDraw(9000);
		Aibek.ShowBalance();
		Aibek.Deposit(1000000);
		Aibek.ShowBalance();
		
		BankAccount Saya = new BankAccount();
		Saya.setAccountHolder("Saya");
		Saya.setAccountNumber(66547895785l);
		Saya.Deposit(4500);
		Saya.getAccountInfo();

		BankAccount[] accounts = {Aibek, Saya};
		ArrayList<BankAccount> Accounts = new ArrayList<>();
		Accounts.add(Aibek);
		Accounts.add(Saya);
			
	}

}
