package com.kh.object.ex2;

public class BankAccount {
		
	//필드
	int balance;
	String accountnumber;
	
	/*
	 	기본생성자 : 매개변수가 없는 생성자
	 	- 개발자가 생성자를 정의하지 않으면 컴파일과정에서 자동으로 생성됨
	 	- 생성자를 하나라도 정의하면 기본생성자는 생성되지 않는다.
	 */
	
	public BankAccount(int bal,String acc) {
		balance = bal;
		accountnumber = acc;
	}
	public BankAccount() {
	
	}
		
	
	//메서드
	
	//입금
	void deposit(int amount) {
		balance += amount;
	}
	//출금
	void withdraw(int amount) {
		balance -= amount;
	}
	//잔액조회
	void checkMyBlance(){
		System.out.println("잔액: "+balance);
	}
}
