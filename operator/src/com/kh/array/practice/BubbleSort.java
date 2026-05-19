package com.kh.array.practice;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
		
	
	//학생 30명이 있고, 28명이 과제를 제출했습니다. 제출하지 않은 2명의 출석번호를 오름차순으로 출력하는 프로그램을 작성하세요.
	//28개의 줄에 서로 다른 출석번호(1~30)이 주어집니다.
	//과제를 제출하지 않은 학생 2명의 출석번호를 오름차순으로 한 줄에 하나씩 출력합니다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			/*
				학생 번호를 1~30까지 입력받기
				배열로 나열
				인덱스 번호에 맞게 학생번호 넣고 해당번호에 없으면 0값
				
				
			 */
		
		int[] stu = new int[30];
		int a = 0;
		System.out.println("학생들의 출석번호를 입력하세요 : ");
		for(int i =0; i<28; i++) {//학생들 번호 받기
			a = sc.nextInt();
			stu[i] = a;
		}
		
		
		for(int i = 0; i<stu.length -1; i++) {		//인덱스 1 ~ 28-1까지 비교
			for(int j = 0; j<stu.length-1-i;  j++) { //stu.length에 -i를 하는 이유는 반복문이 처음 돌 때 가장 큰 값
				if(stu[j]>stu[j+1] ) {				//가장 끝으로 밀리기 때문.
					int tmp = stu[j];				// 왼쪽 값이 크기때문에 변수 tmp에 넣음.
					stu[j] = stu[j+1];				// 더 작은 오른쪽 값을 왼쪽으로 옮김.
					stu[j+1] = tmp;					// 변수 tmp에 넣었던 왼쪽값을 오른쪽으로 옮김.
				}
			}
		}
			for(int num : stu) {					// stu의 값을 순서대로 num변수에 넣
				System.out.print(num+" ");			// stu값을 하나씩 출력
			
					
				}
			
			for(int i = 0; i<stu.length; i++) {		
				if(stu[i]==0) {
					System.out.print("결석"+i+" ");
				}
			}
				
		
	}
}
			


//27 12 5 19 8 3 22 14 30 1 17 9 24 4 11 28 6 15 20 2 29 10 23 7 18 26 13 21 16 25


