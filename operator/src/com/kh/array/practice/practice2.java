package com.kh.array.practice;

import java.util.Scanner;

public class practice2 {

	//n개의 정수가 주어질 때, 이들 중 최솟값과 최댓값을 찾는 프로그램을 작성하세요.
	//첫번째 정수의 개수 1<= n <= 1,000,000
	//둘째 n개의 정수가 공백으로 구분되어 주어집니다. 각정수는 -1,000,000 이상 1,000,000 이하
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = -1000000; //최솟값
		int j = 1000000;//최댓값
		System.out.print("정수의 개수를 입력하세요 :");//정수를 개수를 입력받아서 배열길이 설정
		int arr = sc.nextInt();
		int[] list = new int[arr];
		
		
		for(int i =0; i<list.length; i++) {//배열의 길이만큼 정수 개수 입력받음
			System.out.print(i+1+". 정수를 입력해주세요 : ");
			int num = sc.nextInt();
			list[i] = num;
		}
		
		for (int i =0; i<list.length; i++) {//첫번째 정수부터...n번째 정수까지 최솟값 최댓값 구분
			if(list[i]<j) {
				a = list[i];
			}
		}
			int max = a;

			for (int i = 0; i<list.length; i++) {//첫번째 정수부터...n번째 정수까지 최솟값 최댓값 구분
			
				if(list[i]>a) {
				
					a = list[i];
					
				}
					
			}
			int min = a;
			System.out.printf("최솟값 : %d  최댓값 : %d",max,min);
		}
		
	}


