package com.kh.array.practice;

import java.util.Scanner;

public class Practice2D2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print(" 행 :");
		int n = sc.nextInt();
		System.out.print(" 열 :");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int max =Integer.MIN_VALUE;
		
		
		for(int i =0; i<arr.length; i++) {//행,열 입력받기
			System.out.println();
			for(int j =0; j<arr[i].length; j++) {
				System.out.printf("%d행%d열 : ",i+1,j+1);
				arr[i][j] = sc.nextInt();
			}
		}
			
		int x = 0;
			int y = 0;
		for(int i =0; i<arr.length; i++) {
			System.out.println();
			for(int j =0; j<arr[i].length; j++) {
					if(max<arr[i][j]) {
						max = arr[i][j];
						x = i ;
						y = j ;
					}
					
			}
			
		
		}
		System.out.printf("최대값 : %d \n 위치 :%d %d",max,x+1,y+1);
		sc.close();
	}

}
