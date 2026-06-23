package com.kh.review.baisc;

public class Loops {
	/*
	 * 
	 * 반복문 
	 * 같은 일을 여러번 시키는 방법
	 * 종류가 여러개 있지만 기준은 단순함.
	 * 
	 * - 횟수가 정해진 반복 : for
	 * - 조건이 참인 동안만 반복  while
	 * +일단 한번 실행하고 저건에 따라 반복 : do ~ while
	 */
	
	
	public static void main(String[] args) {
		//for문 - 횟수가 정해진 반복에 사용
		//for(시작 ; 조건 ; 변화 ){반복할 코드}
		// 1. 시작값 -> 2. 조건검사 -> 3. 반복할 코드 -> 4. 변화 -> 2...
		for(int i = 1; i<=5; i++) {
			System.out.println(i+" ");
		}
		System.out.println();
		
		/*
	 	for문에서 많이 사용하는 공식
	 	
	 	for(int i = 0; i<n; i++) {
		
		}
		for(int i = 0; i<문자열.length(); i++) {
		
		}
		for(int i = 0; i<배열.length; i++) {
		
		}
	 */
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		int count = 5;
		while(count>0) {
			System.out.println(count + " ");
			count--;//count를 1씩 줄이면서 반복조건탈출을 만들어 줌.
		}
		
		
		count =5;
		do {
			System.out.println(count + " ");
			count--;
		}while(count>0);
		
		//모든코드는 중첩이 가능하다.
		// 반복문이 중첩되면 바깥쪽 반복이 한번 돌 때
		// 안쪽 반복은 통째로 다 한번 돈다.
		// 5번 반복 하면서 각 9번 반복 -> 1~5단
		
		for(int i=2; i<=9; i++) {
			System.out.println(" ");
			for(int j =1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		// break / continue - 반복에 흐름을 조절
		// break : 반복을 즉시 중단
		// continue : 즉시 다음 반복으로 진행
		for(int i = 1; i<100; i++) {
			if(i%2==0) {
				continue;
			}
		}
		
		for(int i = 1; i<100; i++) {
			if(i == 15) {
				break;
			}
		}
		
		int[] score = {10,20,30,40,50 };
		for(int i =1; i<score.length; i++) {
			System.out.println(score[i]);
			
			
			
		}
		for(int i : score) {
			System.out.println(i);
		}
			
		
		
		
	}
	
	
}
