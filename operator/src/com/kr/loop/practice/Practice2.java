package com.kr.loop.practice;

import java.util.Scanner;

public class Practice2 {

	/*
	 	영수증에 적힌 **총 구매 금액**이 실제 구매한 각 물건의 **가격 × 개수 합계**와 일치하는지 확인하는 프로그램을 작성하세요.

		총액이 정확하면 `"Yes"`, 그렇지 않으면 `"No"`를 출력합니다.
		
		1. 첫째 줄: 영수증에 적힌 총 금액 `X` (정수)
 		2. 둘째 줄: 구매한 물건의 **종류 수** `N` (정수)
		3. 이후 `N`줄: 각 줄마다 두 정수 `a`, `b`가 주어집니다.
		    - `a`: 물건의 가격
		    - `b`: 해당 물건의 구매 개수
		
		**제약 조건**
		
		- `1 ≤ N ≤ 100`
		- 금액과 개수는 모두 `1,000,000` 이하의 자연수 (정수)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, i=0;		//a * b 의 합 / 물건의 개
		
		
		System.out.print("영수증에 적힌 총 금액 :");
		int x = sc.nextInt();
		
		System.out.print("영수증에 적힌 총 개수 :");
		int n = sc.nextInt();
		
			while(i<n) {
				
			System.out.print("물건 가격 : ");
			int a = sc.nextInt();	//물건의 가격 받기
			
			System.out.print("해당 물건의 개수 : ");
			int b = sc.nextInt();		//물건의 개수 
			sum += a * b ;
			i++;
			
			}
			
			if( i==n && sum==x ) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			sc.close();
		
	}
/*260000  4
	20000 5
	30000 2
	10000 6
	5000 8
	*/
}
