package com.kh.object.ex2;

public class Run {

	public static void main(String[] args) {
		BankAccount ac1 = new BankAccount();
		ac1.accountnumber = "ac1111";
		BankAccount ac2 = new BankAccount();
		ac2.accountnumber = "ac1112";
		
		ac1.deposit(5000);
		ac2.deposit(2000);
		
		ac1.withdraw(1000);
		ac2.withdraw(500);

		ac1.checkMyBlance();
		ac2.checkMyBlance();
		
		BankAccount ac3 = new BankAccount(5000, "ac1113");
		
	}

}
