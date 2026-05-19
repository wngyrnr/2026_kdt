package com.kr.loop.practice;

import java.util.Scanner;

public class Practice6 {
/*
 	### 문제 설명

	사용자로부터 10개의 정수를 입력받아, **짝수일 경우에만 제곱을 출력**하는 프로그램을 작성하세요.
	
	홀수는 건너뛰고 출력하지 않습니다.
	
	---
	
	### 입력 조건
	
	- 사용자로부터 **정수 10개**를 입력받습니다.
	
	---
	
	### 출력 조건
	
	- 입력된 정수 중 짝수인 수만 `제곱` 형태로 출력하세요.
	    
	    출력 형식은 `"짝수 X의 제곱은 Y입니다."`
 */
	public static void main(String[] args) {
		int sum = 0, num = 0;
		Scanner sc = new Scanner(System.in);
			
		for(int i = 1; i<11; i++) {
			System.out.print(i+".정수를 입력해주세요. :");
			num = sc.nextInt();
				
				if(num%2==1) {continue;}//홀수인경우
		
			System.out.printf("숫자 %d의 제곱은 %d입니다.\n",num,num*num);
				
			
			sc.close();
		}

	}

}
