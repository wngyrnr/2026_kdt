package com.kr.loop;

import java.util.Scanner;

public class While {

	/*
	   	while문
	  
	  	while(조건문){
	  		반복할 코드
	  		+
	  		탈출조건
	  		
	  	}
	 
	 */	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 1; i<10; i++) {
//			System.out.println(i+ 1 +". 안녕하세요.");
//			
//		}
		
		//사용자가 0을 입력할 때 까지 반복해서 입력받아 그대로 출력
		
//		int n =1;
//		while(n != 0) {
//			n = sc.nextInt();
//			System.out.println(n);
//			
//		}
//		
//		for(int i =1; n!=0; n = sc.nextInt()) {
//			System.out.println(n);
//		}
//	}
		
		//문제
		//랜덤값 (1~100) 하나 생성
		// 1~랜덤값까지의 합을 while로 작성
		//[console]
		//랜덤값 : n
		//1~n까지의 합 : xxx
		
		//정답
		int i =0; 								//시작값 1 설정
		int sum = 0;							//1~n까지의 합을 위한 변수
		int n = (int)(Math.random() * 100) + 1;	//랜덤값 n생성
		System.out.println("랜덤값 :" +n);		//랜덤값 출력
		while (i<n) { 							//1이 n과 같아질 때 종료
			sum+=i;								//1~n까지의 합
			i++;								//증감식으로 1~n까지 1씩 증가
		}
		System.out.println("1~n까지의 합" + sum);	// 1~n까지의 합 출력
		
		
	}
}









