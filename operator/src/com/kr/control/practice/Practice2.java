package com.kr.control.practice;

import java.util.Scanner;

public class Practice2 {
/*
 * 1~6까지 눈이 있는 세 개의 주사위를 던졌을 때, 아래 규칙에 따라 상금을 계산하는 프로그램
 * 1. 같은 눈이 세개 모두 같을 때 10,000원 + (같은 눈)x1,000원
 * 2. 같은 눈이 두개 모두 같을 때 10,00원 + (같은 눈)x100원
 * 3. 같은 눈이 모두 다 다를 때 (최댓값) x 100;
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char n1, n2, n3;
		
		System.out.println("숫자를 순서대로 입력해주세요 :");
		n1 = sc.next().charAt(0);
		n2 = sc.next().charAt(0);
		n3 = sc.next().charAt(0);
		
		if(n1 == n2 && n2==n3) { //눈금 3개가 전부 같을 때
			System.out.println(10000+(n3*1000)+"원");
		}else if (n1==n2 || n1==n3) {//눈금이 2개만 같을 때 
			System.out.println(10000+(n1*100)+"원");
			
		}else if (n2==n3) {//눈금이 2개만 같을 때 마지막 경우의 수
			System.out.println(10000+(n1*100)+"원");
		}else {// 눈금이 전부 다를 때
			int max = n1>n2 ? n1 : n2;  //눈금 n1 > n2 비교해서 max변수에 값을 저장
			max = max > n3 ? max : n3;	//위에서 비교했던 max값이 n3랑 비교하는 코드
		}
		
		/*if(one==two) {
			if(two==three) {
				System.out.println(10000+(three*1000)+"원");
			}else if(two!=three) {
				System.out.println(1000+(one*100)+"원");
			}	
		}
		else if(two==three) {
			System.out.println(10000+(three*1000)+"원");
		}else if(one==three) {
			System.out.println(1000+(three*100)+"원");
			}else {
				if(one>two) {
					if(one>three) {
						System.out.println((one*100)+"원");
					}else if(one<three) {
						if(three>two) {
							System.out.println((three*100)+"원");
						}else
							System.out.println((two*100)+"원");
					}
				}
			}
		*/
		
		
		}

}
