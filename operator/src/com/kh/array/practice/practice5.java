package com.kh.array.practice;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] basket = new int[n]; //바구니 생성
		
		int  m = sc.nextInt();//작업량 설정
		
		for(int i = 0; i<n; i++) {
			basket[i] = i+1;
		}
		
		for(int h = 0; h<m; h++) {	//m번 뒤집기
			
			int i = sc.nextInt() -1 ; 	//첫번째 바구니
			int j = sc.nextInt() -1 ;	//마지막 바구니
				
			while(i<j) {
			int tmp = basket[i];
			basket[i] = basket[j];
			basket[j] = tmp;
			i++;
			j--;
			}
			
			}
		for(int num : basket) {
			System.out.println(num);
			
		}

		sc.close();
	}
	

}
