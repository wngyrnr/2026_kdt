package com.kh.example.poly1;


/*
 *- **필드**
    - `breed : String` — 견종
- **생성자**
    - `Dog()` — 기본 생성자
    - `Dog(String name, int age, String breed)` — 필드 초기화 생성자
- **메서드**
    - 각 필드별 **getter / setter** 직접 구현
    - `speak(): void` → `"멍멍!"` 출력 
 */

public class Dog extends Animal{
	private String breed;

	
	
	
	public Dog() {
		super();
	}




	public Dog(String name, int age, String breed) {
		super(name,age);
		this.breed = breed;
	}




	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}




	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void speak() {
		System.out.println("멍멍!");
	}
	
	

}
