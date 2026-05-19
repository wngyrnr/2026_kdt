package com.kh.loop.practice;

import java.util.Scanner;

public class Practice3 {
	
	/*
	 	테스트 케이스(`T`)만큼 **두 정수 `A`와 `B`를 입력받아, 각각의 합을 출력**하는 프로그램을 작성하세요.

		단, 출력 형식은 `"Case #x: "` 뒤에 합을 붙여 출력해야 하며, `x`는 1부터 시작하는 **테스트 케이스 번호**입니다.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = 0, a=0, b=0 ,sum=0;
		
		
		System.out.print("테스트 총 횟수: ");
		T = sc.nextInt();
		
		
		for(int i = 1; i<=T; i++) {
		
			System.out.print("1. 정수입력 :");
			a = sc.nextInt();
			System.out.print("2. 정수입력 :");
			b = sc.nextInt();
			
			sum = a + b;
			System.out.printf("case #%d : %d \n",i,sum);
			sum=0;
			
		}
		

	}

}
