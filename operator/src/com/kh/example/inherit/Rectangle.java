package com.kh.example.inherit;


/*
 	- **상속**
    - **Point**
- **필드**
    - `width : int` — 너비
    - `height : int` — 높이
- **생성자**
    - `Rectangle()` — 기본 생성자
    - `Rectangle(int x, int y, int width, int height)` — 좌표·너비·높이 초기화 생성자
- **메서드**
    - 각 필드별 **getter / setter** 직접 구현
    - `toString(): String` → `"x, y, width, height"` 형식의 문자열 반환
 */
public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(int x, int y,int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [x = " + getX() + ", Y = " + getY() +  ", getHeight()="+ getHeight() +", getWidth()=" + getWidth() + "]";
	}
	//`toString(): String` → `"x, y, width, height"` 형식의 문자열 반환
	
	
	
	
	
	

}
