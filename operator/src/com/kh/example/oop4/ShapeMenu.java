package com.kh.example.oop4;

import java.util.Scanner;
/*
 	- **필드**
    - `sc` : `Scanner` 객체
    - `scr` : `SquareController` 객체
    - `tc` : `TriangleController` 객체
	- **메서드**
    - `inputMenu()` : `void`
        
        → 메인 메뉴 출력 (삼각형, 사각형, 종료 선택)
        
    - `triangleMenu()` : `void`
        
        → 삼각형 메뉴 출력 (면적 계산, 색칠, 정보 보기, 메인으로)
        
    - `squareMenu()` : `void`
        
        → 사각형 메뉴 출력 (둘레 계산, 면적 계산, 색칠, 정보 보기, 메인으로)
        
    - `inputSize(int type, int menuNum)` : `void`
        
        → 높이·너비 또는 색상을 입력받아 Controller에 요청
        
    - `printInformation(int type)` : `void`
        
        → 해당 도형의 정보를 출력
 */

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	
	public void inputMenu() {
		while(true) {
			System.out.println("=======도형 프로그램======");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();
				switch(num){
				case 3: triangleMenu(); break;
				case 4 : squareMenu(); break;
				case 9 : 
					System.out.println("프로그램을 종료합니다.");
					return;
					default : System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				}
			}
	}
	public void triangleMenu() {
		while(true) {
			System.out.println("=======삼각형======");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();
			
				switch(num) {
				case 1 : 
					System.out.println("높이 : ");
					System.out.println("너비 : ");
					int height= sc.nextInt();
					int width = sc.nextInt();
					tc.calcArea(height, width);
					break;
				case 2 : 
					System.out.println("색깔을 입력하세요.");
					String color = sc.next();
					tc.paintColor(color);
					break;
				case 3 :
					tc.print();
					break;
				case 9 :
					return;
				}
		}
	}
	public void squareMenu() {
		while(true) {
			System.out.println("1. 사각형 둘레 계산");
			System.out.println("2. 사각형 면적 계산");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();
				switch(num){
				case 1: 
						//scr.calcPerimeter(num1, num2); break;
				case 2 : //scr.calcArea(num1, num2); break;
				case 3 : scr.paintColor(null);
				case 4 : scr.print();
				default : System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				}
			}
	}
	public void inputSize(int type, int menuNum) {
		if(type==3) {
			//tc.calcArea(type);
		}
	}
}

