 package com.kh.example.inherit;

public class Circle extends Point{
	
	private int radius; //반지름  

	
	//`Circle()` — 기본 생성자
	//`Circle(int x, int y, int radius)` — 좌표·반지름 초기화 생성자
	public Circle() {
		super();
	}
	
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	/*
	 	- **메서드**
    - 각 필드별 **getter / setter** 직접 구현
    - `toString(): String` → `"x, y, radius"` 형식의 문자열 반환
	 */
	public String toString() {
		return getX()+" , "+getY()+" , "+radius;
	}

}
