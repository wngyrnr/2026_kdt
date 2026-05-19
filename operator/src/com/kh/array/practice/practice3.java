package com.kh.array.practice;

import java.util.Scanner;

public class practice3 {

	
	// n개의 바구니(1~n번)가 있고, m개의 공 넣기 작업이 주어집니다. 각 작업은 i번 바구니부터 j번 바구니까지 숫자k가 적힌 공을 넣는 것을 의미
	// 그 후 각 바구니에 어떤 공이 들어 있는지 출력하세요. 공이 없는 경우 0으로 출력합니다
	
	/*
	 	입력조건
		첫째줄 : N(1<= N <=100), M(1<= M <= 100)
		다음 M줄 : i j k (1<=i<=j<=k,1<=k<=n)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] basket = new int[n];
		int m = sc.nextInt();
		
			for(int h =1; h<m; h++) {
				int k = sc.nextInt();
			}
		
		
	}

}
