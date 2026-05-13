package operator;

import java.util.Scanner;

public class Operator6 {

	/*
	삼항연산자
	
	(조건식) ? (조건식이 true인 경우) : (조건식이 false인 경우)
	
	조건식은 반드리 true 또는 false를 반환해야함.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = ((3 > 10) ? 10 : 20);
		System.out.println(num);
		
		//입력받은 정수값이 양수인지 안니지 판별해서 출력
		// 정수값 입력 : 
		// 양수 / 음수
		
		System.out.println(" 정수값 입력 : ");
		int number = sc.nextInt();
		
		String result = ((number > 0) ? "양수" : "음수");
		System.out.println(result);

	}

}
