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
		int sum = 0;//아메리카노 값의 합을 구하기 위해 스코프를 메인으로 묶어줘야 반복문 밖에서 사용이 가능
		
		System.out.print("아메리카노 (1100원)을 몇잔 구매하시겠습니까? : ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i<=n; i++) {
		
			sum+=1100;
		
		}
		
		System.out.println(n+"잔");
		System.out.println("결제하실 금액은"+ sum +"원입니다");
		
//		for (int i = 1; i<10; i++) {
//			
//			for(int j = 1; j<10; j++) {
//				System.out.print(i+"x"+j+"="+i*j+" ");
//			}
//			System.out.println(" ");
//		}
	}
	
	

}
