package com.kr.loop.practice;

import java.util.Scanner;

public class Practice5 {
	
	/*
	 	사용자에게 정수를 반복 입력받아 **총합을 누적 계산**하는 프로그램을 작성하세요.

		단, **음수를 입력하면 입력을 종료**하고, 마지막에 누적된 총합을 출력하세요.
		
		---
		
		### 입력 조건
		
		- 사용자로부터 정수를 반복 입력 (음수 입력 시 종료)
		
		---
		
		### 출력 조건
		
		- 최종적으로 입력된 수들의 **합계를 출력**하세요 (음수는 포함되지 않음)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, num = 0;
		
		while(true) {
		System.out.print("정수를 입력 (음수 입력 시 종료) : ");
		num = sc.nextInt();
			if(num<0) {break;}
		sum +=num;
		
		}
		
		System.out.println("정수의 합 :"+sum);
		sc.close();
	}

}
