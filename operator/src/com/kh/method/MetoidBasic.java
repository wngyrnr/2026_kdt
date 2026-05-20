package com.kh.method;

public class MetoidBasic {

	
	/*
	 	매서드란
	 	- class내부에 정의된 함수 method라고 부름.
	 	- 특정 기능을 수행하는 코드블럭을 정의하고, 필요한 때 호출해서 재사용 가능.
	 	- 중복 코드 제거와 가독성, 유지보수성이 향상됨.
	 	
	 	[기본구조]
	 	
	 	[접근제한자][static] 반환형 매서드 이름[매개변수]{
	 		//함수에서 실행할 코드
	 		[return 값];
	 	}
	 	
	 */
	
	//main매서드 : 프로그램을 시작할 때 사용되는 매서드
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
//		hiEveryone(12);
//		hiEveryone(20);
		System.out.println(adder(123,222));
		System.out.println(adder(500,242));
		
		System.out.println(squre (500,242));
		System.out.println(squre(500,242));
		System.out.println("프로그램 끝");
		
	}
	
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는"+age+"입니다.");
	}
	
	public static int adder(int num1 ,int num2) {
		//System.out.printf("%d+%d=%d \n",num1,num2,(num1+num2));
		return (num1 + num2);
	}
	
	public static double squre(double num1 ,double num2) {
		
		return (num1 + num2);
		
	}
}
