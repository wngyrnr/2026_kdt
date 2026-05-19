package com.kh.loop;
import java.math.*;

public class Practice3 {

	/*
	 * Math.random();
	 * java.lang.math 클래스에서 기본적으로 제공하는 함수
	 * 
	 * 
	 * math.random() -> 0.0~0.999999 사이의 랜덤값 반환
	 * 최소값 - 최대값 랜덤 수 : ((int)(Math.random()(최대값 + 1 - 최소값)) + 최대
	 */
	
	
	public static void main(String[] args) {

		//문제
		//radom(1~100)한 숫자 n을 생성한 다음 1부터 n까지의 합을 출력하자.
		//[console]
		//random 값 : n
		//1~n까지의 합 : xxx
		

		//정답
		int sum =0;
		int n = (int)(Math.random() * 100) + 1;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("random값 :"+n);
		System.out.println("1~n까지의 합 :"+ sum);
		
	}

}
