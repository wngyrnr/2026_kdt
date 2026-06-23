package com.kh.review.baisc;

/*
 	배열
	같은 타입의 데이터를 여러개 묶어서 저장하는 방법
	
	- 변수는 하나에 값에 하나만 담을 수 있다
	 => 값이 100개면 변수도 100개 만들어야하는 비효율 발생
	 => 배열을 활용하면 같은타입의 변수 100개를 한번에 만들어서 관리가능.
	 
	 특징 
	크기가 한번 정해지면 바꿀 수 없다.
	index로 점슨하며 index 0부터 시작한다.
 */
public class Array {

	public static void main(String[] args) {
		//1. 배열 선언 / 생성
		// 		타입[] 이름; => 선언
		//		이름 = new 타입[크기]; -> 크기만큼 저장공간을 만듬(생성)
		// 		타입[] 이름 = new 타입[크기];
		int [] arr = new int[5]; // int 5칸짜리 배열 생성
		// 값을 넣지 ㅇ낳으면 초기값으로 기본값이 들어있음
		//int -> 0 double -> 0 boolean -> false , String -> null ...
		
		//배열의 각 요소를 사용하기 위해서는 index를 통해서 가능.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//arr[5] = 60; 크기를 벗어난 index값은 사용불가.
		System.out.println(arr[2]);
		
		//배열 초기화 방법
		//중괄호 {}로 한번에 값을 넣어서 생성가능
		int[] score = {90,85,70,100,60};
		
		//배열의 길이 : 배열.length
		System.out.println("배열의 길이 :"+ score.length);
		
		System.out.println("---------------------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"]"+score[i]);
		}
		//for-each
		//인덱스가 필요없고 값만 순서대로 꺼내서 사용할 때
		//for(요소타입 변수 :배열){}
		//배열에 있는 값을 하나씩 꺼내서 앞의 변수에 담아 반복문을 순차적으로 진행
		for(int s: score) {
			System.out.println(s);
		}
		
		//-------------자주 사용하는 패턴---------------------
		//1. 합계/평균
		// 합계를 저장할 변수를 따로 만들어서 누적
		int sum = 0;
		for(int i=0; i< score.length; i++) {
			sum+=score[i];
		}
		double avg = (double)sum/score.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		//2. 최솟값 / 최댓값
		// 최소값, 최대값을 저장한느 변수를 만들어준 뒤
		//처음값은 임의로 배열의 첫번째 값을 넣어줌.
		int max = score[0];
		int min = score[0];
		for(int i=0; i< score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
			}
			
		}
		System.out.println("최소값 : "+ min);
		System.out.println("최대값 : "+ max);
		
		//특정값 찾기(검색)
		// 찾으면 인덱스를 저장하고 break, 못찾으면 -1
		int target =100;
		int foundIndex = -1;
		
		for(int i=0; i< score.length; i++) {
			if(score[i]==target) {
				foundIndex = i;
				break; //찾으면 더이상 반복 불필요
			}
		}
		if(foundIndex == -1) {
			System.out.println(target +"은 배열에 존재하지 않습니다.");
		}else {
			System.out.println(target+"은 인덱스"+ foundIndex+"번에 존재합니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
