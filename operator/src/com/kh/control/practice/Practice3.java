package com.kh.control.practice;

import java.util.Scanner;

public class Practice3 {

	/*
	 * 어린이, 청소년, 성인의 구분에 따라 입장료가 다르게 부과되는 놀이공원 요금 계산기 
	 * 주말에는 20% 할인 적용
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age,price;
		String week,grade;
		
		
		System.out.print("나이를 입력해주세요 :");
		age = sc.nextInt();
		System.out.print("요일를 입력해주세요 :");
		week = sc.next();
		
		switch(week) {
			case "토","일" :
			
				if(age<=12) {
					grade = "어린이";
					price=5000;
				}else if(age<=18) {
					grade = "청소년";
					price = 7000;
				}else {
					grade = "성인";
					price = 10000;
				}
			System.out.println(grade+"요금입니다.(주말할인적용)");
			System.out.println("최종요금"+(price*0.8)+"원입니다.");
		break;
		
			default:
				if(age<=12) {
					grade = "어린이";
					price=5000;
				}else if(age<=18) {
					grade = "청소년";
					price = 7000;
				}else {
					grade = "성인";
					price = 10000;
				}
				
				System.out.println(grade+"요금입니다.");
				System.out.println("최종요금"+price+"원입니다.");
				break;
			
		}
	}

}
