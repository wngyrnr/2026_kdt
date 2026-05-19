package com.kh.control;

import java.util.Scanner;

public class Switch {

	/*
	 * 
	 * Switch
	 *  : 값이 정확하게 일칭(동등비교)하는 경우 특정 코드를 실행.
	 *  비교값으로 사용할 수 있는 타입은 문자, 문자열, 정수
	 *  
	 *  + break : switch문 실행도중 break발생시 탈출. 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * 정수를 입력받아
		 * 1일경우, 5일경우 -> 빨간색입니다.
		 * 2일경우 - > 파란색입니다.
		 * 3일경우 -> 초록색입니다.
		 * 나머지는 잘못입력하셨습니다.
		 * 를 출력해라.
		 */
/*
		System.out.print("정수를 입력 :");
		int  num = sc.nextInt();
		
		switch(num){
			case 1:
			case 5:
				System.out.println("빨간색입니다.");
				break;
			case 2:
				System.out.println("파란색입니다.");
				break;
			case 3:
				System.out.println("초록색입니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
*/
		
	/*과일을 구매하는 프로그램
	 * 구매하려는 과일 입력시
	 * 그에 맞는 가격이 출력되게 해보자.
	 * 
	 * [console]
	 * 구매가능한 과일[사과(2000원),바나나(3000원), 수박 (8000원)]
	 * 선택 : (과일 이름 입력)
	 * 
	 * xxx의 가격은 xxx입니다. / 잘못입력하셨습니다.
	 */
		/*System.out.println("구매가능한 과일[사과(2000원),바나나(3000원), 수박 (8000원)]");
		System.out.print("선택 : ");
		String fruit = sc.next();
		int frice = 0;
		
		switch(fruit){
			
			case"사과":
				frice = 2000;
				break;
			case"바나나":
				frice = 3000; 
				break;
			case"수박":
				frice = 8000;
				break;
				}
			if(frice==0){
				System.out.println("잘못입력하셨습니다.");
			}else {
				System.out.printf("%s의 가격은 %d원입니다.",fruit,frice);		
		}
		*/
		/*
		 * 	월을 입력받아 해당월의 마지막 날이 며칠인지 출력하는 프로그램
		 * 
		 * [console]
		 * 월 입력 : xx
		 * xx월은 xx일까지 있습니다.
		 * 
		 * 1,3,4,5,7,8,10,12 -> 31일
		 * 2 -> 28일
		 * 4,6,9,11 -> 30일
		 * 
		 */
		System.out.print("월 입력 :");
		int month = sc.nextInt();
		int day = 31;
		switch(month) {
			case 2 : 
				day = 28;
				break;
			case 4,6,9,11:
				day = 30;
		}if(month>=13||month<=0) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			System.out.printf("%d월은 %d일까지 있습니다.",month,day);
		}
			
	
	}
}


