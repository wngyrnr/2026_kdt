package com.kr.control;

import java.util.Scanner;

public class Practice1 {

	/*
	 * 나이를 입력받아서 
	 * 13세 이하 : 어린이
	 * 14~19세 이하 : 청소년
	 * 20세 이상 : 성인
	 * 
	 * [console]
	 * 나이입력 : ~~
	 * ~~세는 ~~에 속합니다. 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("나이를 입력해주세요 :");
		int age = sc.nextInt();
		String grade = "성인";
		
		if(age<=13) {
			grade = "어린이";
		}else if(age>=14 && age<=19) {
			grade = "청소년";
		}else {
			
		}
		System.out.printf("%d세는 %s에 속합니다.",age,grade);

	}

}

