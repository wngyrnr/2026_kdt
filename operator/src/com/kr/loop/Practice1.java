package com.kr.loop;

import java.util.Scanner;

public class Practice1 {

	
	/*
	 * 커피주문 키오스크
	 * [출력]
	 * 
	 * 아메리카노 (1100원)을 몇잔 구매하시겠습니까? :n
	 * 
	 * 1잔 1100원
	 * 2잔 2200원
	 * 3잔 3300원
	 * 결제하실 금액은 xxxx원 입니다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;//아메리카노 값의 합을 구하기 위해 메인으로 묶어줘야  for문 밖에서 사용이 가능
		
		System.out.print("아메리카노 (1100원)을 몇잔 구매하시겠습니까? : "); //입력받기위한 출력문
		int n = sc.nextInt();	//입력받는 코드
		
		
		for(int i = 1; i<=n; i++) { //n잔까지 더해주기 위한 코드
		
			sum+=1100; //n잔까지의 합을 구하는 코드
		
		}
		
		System.out.println(n+"잔"); //총 몇잔인지 출력
		System.out.println("결제하실 금액은"+ sum +"원입니다");//n잔까지의 합 출력
		
//		for (int i = 1; i<10; i++) {
//			
//			for(int j = 1; j<10; j++) {
//				System.out.print(i+"x"+j+"="+i*j+" ");
//			}
//			System.out.println(" ");
//		}
	}
	
	

}
