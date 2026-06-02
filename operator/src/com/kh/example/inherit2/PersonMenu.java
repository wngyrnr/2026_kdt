package com.kh.example.inherit2;

import java.util.Scanner;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	/*
	 * 학생은 최대 3명까지 저장할 수 있습니다.
현재 저장된 학생은 0명입니다.
사원은 최대 10명까지 저장할 수 있습니다.
현재 저장된 사원은 0명입니다.
	 */
	public void mainMenu() {
		Student[] arrst = pc.printStudent();
		Employee[] arrem = pc.printEmployee();
		int[] count = pc.personCount(); 
		
		
		while(true) {
		System.out.printf("학생은 최대 3명까지 저장할 수 있습니다.",arrst.length);
		System.out.printf("현재 저장된 학생은 %d 명입니다.",arrst);
		System.out.printf("사원은 최대 %d명까지 저장할 수 있습니다.",arrem.length);
		System.out.printf("현재 저장되느 사원은 %d 명입니다.",arrem);
		
		int num = sc.nextInt();
			switch(num) {
			case 1:
				studentMenu();
				break;
			case 2:
				EmployeeMenu();
				break;
			case 9:
				return;
			default:
				System.out.println("다시입력해주세요");
			
			}
		}
	}
	public void studentMenu() {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			
		case 2:
		case 9:
		default:
				
		}
		
	}
	public void EmployeeMenu() {
		
	}
}
