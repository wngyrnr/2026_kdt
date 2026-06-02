package com.kh.example.inherit;

/*
 	- **필드**
    - `c : Circle = new Circle()` — 원 객체
- **메서드**
    - `calcArea(int x, int y, int radius): String`
        - 필드 초기화 후 `"x, y, radius / 면적"` 문자열 반환
        - 면적 공식: `Math.PI * radius * radius`
    - `calcCircum(int x, int y, int radius): String`
        - 필드 초기화 후 `"x, y, radius / 둘레"` 문자열 반환
        - 둘레 공식: `Math.PI * radius * 2`
 */

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	
	
	
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		return r.toString()+" , "+ width*height;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		return r.toString()+" , "+ 2*(width+height);
	}
}
