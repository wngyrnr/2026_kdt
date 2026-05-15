package com.kr.control;

import java.util.Scanner;

public class If {

	//특정 코드를 선택적으로 실해시키고 싶을 때 -> 조건문
	//조건문 : 조건식을 통해 true 또는 false를 판단하고 true일 경우 그에 해당하는 코드를 실행
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 if(조건식){
		 	...조건이 참일 때 실행할 코드
		 }
		 */
		System.out.println("정수를 입력 :");
		int num = sc.nextInt();
		
		
		if (num>0) {
			System.out.println("양수입니다.");
		}
		else if (num == 0) {
			System.out.println("0입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}

	}

}
