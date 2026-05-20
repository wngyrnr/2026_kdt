package com.kh.array.practice;

import java.util.Scanner;

public class Practice123 {

	// n개의 바구니(1~n번)가 있고, m개의 공 넣기 작업이 주어집니다. 각 작업은 i번 바구니부터 j번 바구니까지 숫자k가 적힌 공을 넣는 것을 의미
		// 그 후 각 바구니에 어떤 공이 들어 있는지 출력하세요. 공이 없는 경우 0으로 출력합니다
		
		/*
		 	입력조건
			첫째줄 : N(1<= N <=100), M(1<= M <= 100)
			다음 M줄 : i j k (1<=i<=j<=k,1<=k<=n)
		 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt(); 		//바구니 수 
		int[] basket = new int[q];	//바구니 수만큼 배열생성
		int m = sc.nextInt();		//공 개수받기
		
		
		for(int h = 0; h<m; h++) { //공을 다 넣을 때까지반복 
			
			int i = sc.nextInt();	//공을 넣을 첫번째 바구니부터 j번바구니까지
			int j = sc.nextInt();
			int k = sc.nextInt();	//바구니에 넣을 공 값 받기
			
			for(int n = i; n+1 <= j+1; n++) { 	//공을 넣을 첫번째 바구니부터 마지막 바구니까지	
				basket[n] = k;			//바구니에 
				
			}
		}
			for(int a : basket) {
				System.out.println(a +" ");
			}
		
	/*
	 	5 4
		1 2 3
		3 4 4
		1 4 1
		2 2 2
	 */
			
			
			
		
	}	
	
}