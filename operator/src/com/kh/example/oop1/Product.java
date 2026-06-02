package com.kh.example.oop1;

public class Product {
	String pName;
	int price;
	String brand;
	
	//생성자
	//기본 생성자는 생성자 작성 안될시 자동 생성됨.
	
	public Product() {
		
	}
	
	void information() {
		System.out.printf("상품명 : %s 가격 : %d 브랜드명 : %s",this.pName,price,brand);
	}

}
