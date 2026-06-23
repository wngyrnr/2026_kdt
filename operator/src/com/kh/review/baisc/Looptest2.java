package com.kh.review.baisc;

import java.util.Scanner;

public class Looptest2 {

	
	/*
	 * 영수증에 적힌 **총 구매 금액**이 실제 구매한 각 물건의 **가격 × 개수 합계**와 일치하는지 확인하는 프로그램을 작성하세요.

		총액이 정확하면 `"Yes"`, 그렇지 않으면 `"No"`를 출력합니다.
		
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print
		("총 구매 금액 : ");
		int price = sc.nextInt();
		System.out.print("물건 갯수 : ");
		int num1 = sc.nextInt();
		
		int sum = 0;
		
		for(int i= 1; i<=num1; i++) {
		System.out.println(i+". 가격 : ");
			int num2 = sc.nextInt();
		System.out.println(i+". 갯수 : ");
			int num3 = sc.nextInt();
			
			sum += num2*num3;
		}
		
		if(price== sum) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
