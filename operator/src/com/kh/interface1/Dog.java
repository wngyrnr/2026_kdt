package com.kh.interface1;

public class Dog implements Animal{

	@Override
	public void speak() {
		System.out.println("멍멍");
		
	}
	public void move() {
		System.out.println("강아지가 일합니다");
	}
	public void eat() {
		System.out.println("냠냠");
	}

}
