package com.kr.control.practice;

import java.util.Scanner;

public class Practice1 {

	
	/*
	 * 0~100점 사이의 정수를 입력받아 아래 조건에따라 등급을 출력하는 프로그램
	 */
	public static void main(String[] args) {
		int score;
		String grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		score = sc.nextInt();
		grade = (null);
		
		
		if(score>100||score<0) {
			System.out.println("다시 입력해주세요");
		}else if(score>=90){
			grade = "A";
		}else if(score>=80){
			grade = "B";
		}else if(score>=70){
			grade = "C";
		}else if(score>=60){
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.printf("당신의 성적은 %s입니다.",grade);
		
		sc.close();
	}

}
