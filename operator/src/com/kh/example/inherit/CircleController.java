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
public class CircleController {
	
	private Circle c = new Circle();
	
	
	public String calcArea(int x , int y , int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = Math.PI * c.getRadius() * c.getRadius();
		return c.toString() + " / " + area;
	}
		
	
	public String calcCircum(int x , int y , int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum = Math.PI * c.getRadius() * 2;
		return c.toString() + " / " + circum;

}
	
}
