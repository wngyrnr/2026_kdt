package operator;

import java.util.Scanner;

public class Operator {

	/*
	 논리연산자
	 두개의 논리값을 연산해주는 연산자
	 
	 논리값 && 논리값 : 왼쪽 , 오른쪽 두 조건이 모두 true일 경우 true
	 논리값 || 논리값 : 왼쪽 , 오른쪽 두 조건 중 하나라도 true일 경우 true
	 */
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		//사용자에게 1~100의 숫자를 입력받아
		//정상적으로 입력했는지 알아보고 싶다.
		System.out.print("1 ~ 100사이 입력 : ");
		int num = sc.nextInt();
		boolean result = (num>=1 && num<=100);
		System.out.println("사용자가 입력한 값은 1~100 사이 값이다 : "+ num);
		
		//사용자에게 알파벳 하나 입력받아서 대소문자를 확인하라.
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		
		//sc.next()로 문자열, charAt(0) -> 0번째 글자 하나만 추출
		
		//System.out.println((int)'a' + " " + (int)'z');
		//System.out.println((int)'A' + " " + (int)'Z');
		
		boolean res1 = (ch>='A' && ch <= 'Z'); //대문자이면 ture가 나오도록
		boolean res2 = (ch>='a' && ch <= 'z'); //소문자이면 ture가 나오도록
		System.out.println("사용자가 입력값이 알파벳이다 : " + (res1||res2));
		
		
		
	}

}
