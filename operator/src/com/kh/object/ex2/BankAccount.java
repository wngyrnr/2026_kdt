package com.kh.object.ex2;

public class BankAccount {
		
	//필드
	int balance;
		
	
	//메서드
	
	//입금
	void deposit(int amount) {
		balance +=balance;
	}
	//출금
	void withdraw(int amount) {
		balance = amount;
	}
	//잔액조회
	void checkMyBlance(){
		System.out.println("잔액: "+balance);
	}
}
