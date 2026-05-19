package com.kh.loop.practice;

public class Practice4 {
/*
 	1부터 100 사이의 숫자 중에서 **7의 배수만 출력하는 프로그램**을 작성하세요.

	단, **짝수인 7의 배수는 건너뛰고**, 출력에서 제외하세요.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<101; i++) {//내가 풀었던 방법
			
			if(i%7==0) {
			
				if(i%2==0) {continue;}
				
			System.out.print(i+" ");
			}
		
		}
		for(int i=1; i<101; i++) {//강사님 방법
					
			if(i%7!=0||i%2==0) { 
					
				continue;}
						
			System.out.print(i+" ");
		}

	}
}
