package com.kr.control.practice;

import java.util.Scanner;

public class Practice4 {

	/*
	 * 1~6까지 눈이 있는 세 개의 주사위를 던졌을 때, 아래 규칙에 따라 상금을 계산하는 프로그램
	 * 1. 같은 눈이 세개 모두 같을 때 10,000원 + (같은 눈)x1,000원
	 * 2. 같은 눈이 두개 모두 같을 때 10,00원 + (같은 눈)x100원
	 * 3. 같은 눈이 모두 다 다를 때 (최댓값) x 100;
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,num,max;	// 객체 지정
		num=0;					// 초기값 설정
		max=0;					// 초기값 설정
		
		System.out.print("숫자 입력 : "); //입력받기위해 출력
		n1 = sc.nextInt(); //첫번째 주사위 입력 받기
		n2 = sc.nextInt(); //두번째 주사위 입력 받기
		n3 = sc.nextInt(); //세번째 주사위 입력 받기
		
		if(n1==n2 && n2==n3) { 	//첫번째 조건 and연산자 사용
								//눈이 세개가 모두 같을 때 조건
			num = 10000+n1*1000;//10,000원 + (같은 눈) * 1,000원 조건
			
		}else if(n1==n2 || n2==n3 ) {	//두번째 조건, or 연산자 사용
										//눈이 두개만 같을 때 조건
			num = 1000+n2*1000;			//1,000원 + (같은 눈) * 100원 조건
		}else if(n1==n3) {				//눈이 두개만 같을 때 조건
			num = 1000+n2*1000;			//1,000원 + (같은 눈) * 100원 조건
		}
		else {							//세번째 조건
										//모든 눈의 값이 다를 때
			max = n1 > n2 ? n1:n2;		//삼항연산자로 최대 눈 값 구하기
			max = n2 > n3 ? n2:n3;		//삼항연산자로 최대 눈 값 구하기
			max = max*100;				// (최대값) * 100
		}
		System.out.println(num+max);	//num이 충족할 때 max=0; max가 충족할 때 num=0;
	}

}
