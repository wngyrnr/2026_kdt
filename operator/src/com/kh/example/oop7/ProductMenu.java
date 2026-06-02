package com.kh.example.oop7;

import java.util.Scanner;

public class ProductMenu {
	private Scanner sc = new Scanner(System.in);
	private ProductController pc = new ProductController();
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("====== 상품 관리 메뉴 ======");
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 :");
			
			int select = sc.nextInt();
			switch(select){
				case 1:{ 
					System.out.println("추가할 상품명 :");
					String pName = sc.next();
					
					System.out.println("추가할 가격 :");
					int price = sc.nextInt();
					
					System.out.println("추가할 브랜드 :");
					int brand = sc.nextInt();
					
					pc.insertProduct(pName, price, pName);
				}break;
				case 2:{
					Product[] proArr = pc.selectProduct();
					for(Product p : proArr) {
						if(p ==null) {
							break;
						}
						System.out.println(p.inform());
					}
				}
					
				case 9:{
					System.out.println("프로그램을 종료합니다.");
					return;//return은 반환, 함수종료를 의미함.
				}
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				
			}
		}
	}
	
	
	
	
	
	

}
