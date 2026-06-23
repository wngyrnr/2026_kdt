package com.kh.review.baisc;

import java.util.Scanner;

/*
 * ### 문제 설명

정수 N개로 이루어진 수열 A와 정수 X가 주어집니다. 이때, 수열 A에서 X보다 작은 수를 모두 **입력된 순서대로 공백 한 칸으로 구분하여 출력**하는 프로그램을 작성하세요. 

---

### 입력 조건

- 첫째 줄: 정수 N과 X (1 ≤ N, X ≤ 10,000)
- 둘째 줄: 수열 A를 이루는 정수 N개 (각 원소는 1 이상 10,000 이하)
 */
public class Array_practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 갯수입력 : ");
		int num = sc.nextInt();
		System.out.println("정수 : ");
		int x = sc.nextInt();
		
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("정수 입력 :");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<x) {
				System.out.println(arr[i]+" ");
			}
		}

	}

}
