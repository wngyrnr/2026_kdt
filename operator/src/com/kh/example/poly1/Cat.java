package com.kh.example.poly1;


/*
 * - **필드**
    - `color : String` — 털 색상
- **생성자**
    - `Cat()` — 기본 생성자
    - `Cat(String name, int age, String color)` — 필드 초기화 생성자
- **메서드**
    - 각 필드별 **getter / setter** 직접 구현
    - `speak(): void` → `"야옹!"` 출력
 */

public class Cat extends Animal{
	private String color;

	
	
	public Cat() {
		super();
	}



	public Cat(String name, int age, String color) {
		super(name,age);
		this.color = color;
	}



	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public void speak() {
		System.out.println("야옹!");
	}
	
	
}
