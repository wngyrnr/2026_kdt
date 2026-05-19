package com.kh.array;

import java.util.Scanner;

public class Array2DTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 	사용자에게 행(n) 과(m)열을 입력받아
		 	m행 n열의 빙고판을 만들어라.
		 	행과 열의 들어갈 문자를 각각 입력받아 저장한 뒤
		 	출력해라
		 	
		 	[console]
		 	
		 	행 : ~
		 	열 : ~
		 	
		 	1행 1열 : 바나나
		 	1행 2열 : 배
		 	...
		 	2행 3열 : 키위
		 	
		 	바나나 배 딸기
			귤 수박 키위
		 */
		/*System.out.print("행 :");
		int n = sc.nextInt();	//행을 입력받음
		
		System.out.print("열 :");
		int m = sc.nextInt();	//열을 입력받음
		
		String[][] arr = new String[n][m];// arr라는 변수에 행열 생성
		
		for(int i = 0; i<arr.length; i++) {//행을 담당
			System.out.println();
			for(int j =0; j<arr[i].length; j++) {//열을 담당
				System.out.printf("%d행% d열 :",i+1,j+1); 
				arr[i][j] = sc.next();//배열안에 값을 받음
			}
		}
		
		for(int i = 0; i<arr.length; i++) {//행
			System.out.println();
			for(int j =0; j<arr[i].length; j++) {//열
				System.out.print(arr[i][j]+ " "); 
			}
		}
		*/
		/*
		 	사용자에게 좌석의 행과 열을 임력받아 좌석을 생성한다.
		 	각 좌석에 들어갈 관객의 이름을 입력받아 저장한 뒤
		 	모두 입력받았으면 좌석표를 출력하라.
		 	
		 	[console]
		 	행 : 2
		 	열 : 2
		 	1행 1열 : 철수
		 	1행 2열 : 민수
		 	...
		 	
		 	=======좌석표=======
		 	철수 민수 ...
		
		 */
		System.out.print("행 : ");
		int n = sc.nextInt();
		
		System.out.print("열 : ");
		int m = sc.nextInt();
		
		String[][] arr = new String[n][m];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%d행 %d열 입력 : ",i + 1 , j + 1);
				String str = sc.next();
				arr[i][j] = str;
			}
		}
			for(int i = 0; i<arr.length; i++) {
				System.out.println();
			
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
					}
			}	
	}

}
