package com.kr.loop;

public class LoopInLoop {

	public static void main(String[] args) {
		
		int sum=0 ;						// i * j 값을 저장하기 위한 코드
		for(int i =1; i<10; i++) {		// 99단에서 앞쪽을 받기위한 코드
			for(int j =1; j<10; j++) {	//99단에서 뒤쪽 숫자를 받기위한 코드
				sum = i*j;				// i * j 값을 위한 코드
				System.out.printf("%d x %d = %d",i,j,sum);// i * j = sum 출력문 
				
			}
		
			System.out.println();// 한 단이 끝날 때 줄을 바꿔주기 위한 코드

		}

	}

}
