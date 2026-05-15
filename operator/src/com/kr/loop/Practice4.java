package com.kr.loop;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		//"문자열".length() -> 문자열의 길이를 반
		//System.out.println("안녕하세요".length());
		
		//사용자에게 문자열을 입력받아 해당 문자열의 짝수자리 글자만 출력해라.
		//[console]
		//문자열 입력 : Hello
		//el
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오 : ");//문자열을 입력받기 위한 출력코드
		String str = sc.next();//문자열을 str변수에 입력받음
		int num1 = (str.length());// 문자열 str의 길이를 정수로 변수num1에 넣기 위한 코드
		
		
		System.out.println(str);//처음에 받은 문자열을 출력하기 위한 코드
		
			for(int i = 0; i<=num1; i++) {			//num의 최대크기까지 하나씩 받기 위한 코드
				if(i%2 != 0) {						//짝수자리를 위한 코드 (0부터 시작이기 때문에 나머지가 0이 아닐 때 짝)
				System.out.print(str.charAt(i)+" ");	//처음에 받은 문자열 str의 특정 위치의 문자를 출력하기 위한 코드
				}
			}
			
	}

}
