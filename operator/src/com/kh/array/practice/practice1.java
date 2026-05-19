package com.kh.array.practice; //프로그리머

import java.util.Scanner;

public class practice1 {
		
	/*
	 	정수n개로 이루어진 수열A와 정수x가 주어집니다. 이때, 수열 A에서 x보다 작은 수를 모두 입력된 순서대로 공백 한 칸
	 	으로 구분하여 출력하는 프로그램을 작성하세요.
	 	첫째 줄 : 정수n과x(1<=n, x<= 10,000)
	 	둘째 줄 : 수열A를 이루는 정수 N개 (각 원소는 1 이상 10,000이하)
	 	A에서 x보다 작은 수들을 입력된 순서대로 공백으로 구분해 출력합니다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//1.수열 A를 이루는 값 받기.
												//2.정수 x 값 받기.
	
		System.out.print("수열의 길이 : ");
		int A = sc.nextInt();
		int[] arr = new int[A];			//A길이의 arr배열 생성
		
		
		
		System.out.print("정수 값 : ");
		int x = sc.nextInt();			//정수 x값 받음
		
		
		
		
		for (int i =0; i<arr.length; i++) {//arr길이 만큼의 정수를 생성해서 입력값 받기
			System.out.print(i+ 1 + ". 인덱스 값 :  ");
			int j = sc.nextInt();
			arr[i] = j;
			
		}
		System.out.print("정수 x보다 작은 값 : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<x) {//arr 값과 x크기 비교해서 출력하기
				
				System.out.print( arr[i] + " " );
			}
			
		}
		

	}

}
