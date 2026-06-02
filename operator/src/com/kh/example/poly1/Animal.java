package com.kh.example.poly1;


/*
 * - `name : String` — 이름
- `age : int` — 나이
- **생성자**
    - `Animal()` — 기본 생성자
    - `Animal(String name, int age)` — 필드 초기화 생성자
- **메서드**
    - 각 필드별 **getter / setter** 직접 구현
    - `speak(): void` → `"동물이 소리를 냅니다."` 출력 (오버라이딩 대상)
 */
public class Animal {
	private String name;
	private int age;
	
	
	public Animal() {
		super();
	}


	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	//- `speak(): void` → `"동물이 소리를 냅니다."` 출력 (오버라이딩 대상)
	public void speak() {
		System.out.println("동물이 소리를 냅니다.");
	}
	

}
