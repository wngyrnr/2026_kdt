package com.kr.loop;

import java.util.Scanner;

public class Practice5 {
	
	/*
	 사용자가 0을 입력할 때까지 랜덤값 (1~100)을 하나씩 생성해서
	 모두 더한 값을 출력
	 
	 [console]
	 숫자 입력(0입력시 종료) : n
	 랜덤값누적 : ~~
	 ...
	 숫자 입력 (0입력시 종료) :0
	 랜덤값 누적 : ~~
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, sum = 0 ; //랜덤값을 저장하기 위한 j라는 변수
		System.out.println("숫자입력(0입력시 종료) : ");//입력받기위한 코드
		n = sc.nextInt();//입력받아 n이라는 변수에 넣어주는 코드
		
		while(n!=0) { //0이 아닐때 까지 반복해라
			 int j = (int)(Math.random() * 100) + 1; // j라는 변수에 랜덤한 값 넣기
			System.out.print("랜덤값 :" + j + " ");	// 랜덤값을 출력해주는 코드
				sum+=j;								// 랜덤값을 sum이라는 변수에 저장
				System.out.print("랜덤값 누적 :" + sum + " "); //랜덤값이 저장된 sum이라는 변수를 출
				System.out.print("숫자입력(0입력시 종료) : "); //종료를 위한 값을 받기위한 출력
				n = sc.nextInt();							//종료를 위한 n값을 받기위한 코드
		}
		System.out.println("랜덤값 누적 :" + sum);				//지금까지 누적된 랜덤값 출력
	}

}
