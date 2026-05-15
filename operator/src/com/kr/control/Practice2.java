package com.kr.control;

import java.util.Scanner;

public class Practice2 {
		
	/*
	 * 성별을 m/f(대소문자 상관x)로 입력받아 남학생인지 여학생인지 출력하는 프로그램
	 * 
	 * [console]
	 * 성별 (m/f) : x
	 * 여학생입니다 / 남학생입니다 / 잘못입력하셨습니다.
	 * 
	 * 문자열.charAt(n) -> 문자열에서 n번째 글자만 추출(char)
	 * 문자열.toLowerCase() -> 모든 문자열을 소문자로 변환
	 * 문자열.toUppperCase() ->모든 문자열을 대문자로 변환 
	 */
	
	public static void main(String[] args) {
		
		String gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("성별 (m/f) :");
		gender = sc.next();
		
//		if(gender.equals('m')) {
//			System.out.println("남학생입니다");
//		}else if(gender.equals('f')) {
//			System.out.println("여학생입니다");
//
//		}else {
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		
		switch(gender) {
			case "m","M":
				gender = "남학생";
				break;
			
			case "f","F":
				gender = "여학생";
				break;
				
			default:
				System.out.println("잘못입력하셨습니다.");
					
		}
		System.out.printf("%s입니다.",gender);
		
	}

}
