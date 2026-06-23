package com.kh.review.baisc;

import java.util.Scanner;

/*
 *N개의 정수가 주어질 때, 이들 중 **최솟값과 최댓값**을 찾는 프로그램을 작성하세요

---

### 입력 조건

- 첫째 줄: 정수의 개수 N (1 ≤ N ≤ 1,000,000)
- 둘째 줄: N개의 정수가 공백으로 구분되어 주어집니다. 각 정수는 −1,000,000 이상, 1,000,000 이하

---

### 출력 조건

- 첫째 줄에 **최솟값과 최댓값을 공백으로 구분하여 출력**합니다.
 */
public class Array_practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수의 개수  : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int max = 0;
		int min = 10000000;
		for(int i=0; i<num; i++) {
			System.out.print("정수 입력 :");
			int a = sc.nextInt();
			arr[i] = a;
		}
		for(int a : arr) {
			if(max<a) {
				max=a;
			}
			if(min>a) {
				min=a;
			}
			
		}
		
		
		System.out.println("최대값 : "+max + "최소값 :"+min);
		
	}

}
