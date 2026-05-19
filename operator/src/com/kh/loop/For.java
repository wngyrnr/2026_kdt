package com.kh.loop;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 1 ; i<6; i++) { // n번반복 -> for(int i = 0; i>n; i++)
			System.out.print(i + " ");	
		}
		
		
		/*
		 * 블록 scope -> {}
		 * 자바의 지역변수
		 * - 특정 매서드나 블록{{}}내부에서 선언하는 변수
		 * - 해당 블록이 종료되면 블록 내부의 변수도 사라짐.
		 */
		
//		for(int i = 6 ; i>0; i--) {
//			int  num = 10;
//			System.out.print(num - i + " ");
//		}
		//System.out.println(num); 블록 내부에서 선언된 변수로 외부사용 불가
		

		//정수 n을 입력받아 1부터 n까지 1씩 증가시키면서 출력해라
		//[console]
		//정수입력 : n
		// 1 2 3 4 5 ...n
		
	
		System.out.println("정수 입력 : ");
		
		int num1 = sc.nextInt();
		for(int i = 1; i<=num1; i++) {
			System.out.print(i+ " ");
		}
	}
	
}