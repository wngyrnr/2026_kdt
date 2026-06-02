package com.kh.example.oop5;

import java.util.Scanner;

/*
 	- **필드**
    - `sc:Scanner = new Scanner(System.in)`
    - `scr:SnackController = new SnackController()`
- **메서드**
    - `menu():void`
        - 사용자로부터 **종류/이름/맛/개수/가격**을 순서대로 입력받아 `saveData(...)` 호출
        - `"저장 완료되었습니다."` 메시지를 출력
        - 이어서 `"저장한 정보를 확인하시겠습니까?(y/n) : "` 질의
            - `y`(또는 `Y`)면 `confirmData()` 결과 문자열을 출력
            - `n`(또는 `N`)이면 아무 정보도 출력하지 않고 종료(또는 상위로 복귀)
 */
public class SnackMenu {
		private Scanner sc = new Scanner(System.in);
		private SnackController scr = new SnackController();
		
		
		
		public void menu() {
			System.out.println("종류 : ");
			String kind = sc.next();
			
			System.out.println("이름 : ");
			String name = sc.next();
			
			System.out.println("맛 : ");
			String Flavor = sc.next();
			
			System.out.println("개수 : ");
			int numOf = sc.nextInt();
			
			System.out.println("가격 : ");
			int price  = sc.nextInt();
			String result = scr.saveData(kind, name, Flavor, numOf, price);
			System.out.println(result);
			
			System.out.println("저장한 정보를 확인하시겠습니까?(Y/N) : ");
			String or = sc.next();
			if(or.equals("y")||or.equals("Y")) {
				System.out.println(scr.confirmData());  
			}else {
				return;
			}
			
		}
}
