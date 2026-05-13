package operator;

import java.util.Scanner;

public class practice2 {
	
	/*
	키보드로 정수 두개를 입력받아 두 수의 합, 차 곱, 나누기, 나머지 값을 출력
	
	첫번째 정수 : (키보드입력)
	두번째 정수 : (키보드입력)
	
	더하기 : ~
	빼기 : ~
	곱하기 : ~
	나누기 : ~
	나머지 : ~
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		if(num2 < num1) {
			System.out.println(num1 / num2);
			}else {
				System.out.println(num2 / num1);
			}
		
		if(num2 < num1) {
		System.out.println(num1 % num2);
		}
		else {
			System.out.println(num2 % num1);
		}
	}

}
