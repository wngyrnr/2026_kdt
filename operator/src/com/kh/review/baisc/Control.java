package com.kh.review.baisc;

import java.util.Scanner;

public class Control {

	/*
	 * 0점부터 100점 사이의 정수를 입력받아 아래 조건에 따라 등급(학점)을 출력하는 프로그램을 작성하세요.

		---
		
		### 입력 조건
		
		- 시험 점수 (정수형, 0 이상 100 이하)
		
		---
		
		### 성적 기준표
	 */
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num>=90) {
			System.out.println("A");
		}
		else if(num>=80) {
			System.out.println("B");
		}
		else if(num>=70) {
			System.out.println("C");
		}
		else if(num>=60) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}
}

