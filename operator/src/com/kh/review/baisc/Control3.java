package com.kh.review.baisc;

import java.util.Scanner;

public class Control3 {

	/*
	 ### 문제 설명

어린이, 청소년, 성인의 구분에 따라 입장료가 다르게 부과되는 **놀이공원 요금 계산기**를 만들어보세요.

또한, 주말에는 20% 할인이 적용됩니다.

---

### 입력 조건

- 나이 (int)
- 요일 (문자열: "월", "화", ..., "일")

---

### 요금표
	 */
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num>=90) {
			System.out.println("A");
		}
		else if(num>=80) {
			System.out.println("B");
		}
		else if(num>=70) {
			System.out.println("C");
		}
		else if(num>=60) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}
}

