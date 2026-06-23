package com.kh.review.baisc;

import java.util.Scanner;

public class Looptest3 {
/*
 	### 문제 설명

1부터 100 사이의 숫자 중에서 **7의 배수만 출력하는 프로그램**을 작성하세요.

단, **짝수인 7의 배수는 건너뛰고**, 출력에서 제외하세요.

---

### 입력 조건

- 입력 없음

---

### 출력 조건

- 1부터 100까지의 수 중에서 **7의 배수이면서 홀수인 숫자**만 출력하세요
 */
	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if(i%7==0) {
				if(i%2==0) {
					continue;
					
				}
				System.out.print(i +" ");
			}
		}
		
	}

}
