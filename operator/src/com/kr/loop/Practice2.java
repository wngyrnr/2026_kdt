package com.kr.loop;

public class Practice2 {

	//1~100까지의 수 중에서 짝수의 합을 구해라.
	//[console]
	// 1~100까지의 짝수의 합 : xxx
	
	
	
	
	public static void main(String[] args) {
		int sum;
		sum=0;
		
		//짝수 == 2의 배수 -> 2로 나누면 나머지 0
		for (int i = 2; i<101; i+=2) {
			sum+=i;
		}
			System.out.println("1~100까지의 짝수의 합 :" + sum);
	}

}
