package com.kh.object.ex1;

public class Run {

	/*
	 * 해당클래스는 객체를 생성하기 위한 클래스가 아니라 
	 * 실행을 위한 main문을 포함한 클래스
	 */
	
	public static void main(String[] args) {
		
		//객체를 생성할 때
		//class명 객체이름ㅣ -> class타입의 참조변수 생성
		Student choi;
		//객체이름 = new class명() -> 새로운 class 타입의 메모리가 생성 -> 객체생성
		choi = new Student();
		
		//choi가 가진 주소값의 메모리에 있는 name에 "최지원"대입
		choi.name = "최지원";
		choi.age = 18;
		choi.myInfo();
		
		Student kim = new Student();
		kim.name = "김민수";
		kim.age = 19;
		kim.myInfo();
		
		
	}

}
