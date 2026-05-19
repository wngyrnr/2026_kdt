package com.kh.loop;

public class Continue {

	
	/*
	 	continue : 	반복문 안에서 사용되는 키워드
	 				continue 실행시 즉시 다음 반복으로 이동함.
	 */
	
	public static void main(String[] args) {
			//1~50까지의 수 중에서 5의 배수만 출력
		for(int i =1; i<51; i++) {
			if(i%5 !=0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
