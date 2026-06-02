package com.kh.example.oop4;

/*
 	- **필드**
    - `s` : `Shape` 객체 (기본 생성자로 생성)
- **메서드**
    - `calcArea(double height, double width)` : `double`
        
        → `s`를 매개변수 있는 생성자로 초기화한 후, **넓이**(`width * height / 2`) 반환
        
    - `paintColor(String color)` : `void`
        
        → `s`의 색상을 setter로 변경
        
    - `print()` : `String`
        
        → `"삼각형 " + s.information()` 반환
 */


public class TriangleController {
	Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s = new Shape(3,height,width);
		return height*width/2;
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		return "삼각형" + s.information();
	}
	
}
