package com.kh.object.ex2;

public class Run {

	public static void main(String[] args) {
		BankAccount ac1 = new BankAccount();
		BankAccount ac2 = new BankAccount();
		
		ac1.deposit(5000);
		ac2.deposit(2000);
		
		ac1.withdraw(1000);
		ac2.withdraw(500);

		ac1.checkMyBlance();
		ac2.checkMyBlance();
	}

}
