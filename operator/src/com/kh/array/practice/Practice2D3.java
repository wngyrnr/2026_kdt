package com.kh.array.practice;

import java.util.Scanner;

public class Practice2D3 {

	
	/*
	 	도화지의 크기는 100x100의 2차원 배열
	 	첫째 줄에 색종이의 수가 주어짐
	 	둘째 줄부터 색종이를 붙일 위치가 주어짐.
	 	첫번째 자연수는 색종이의 왼쪽변과의 도화지사이의 거리
	 	두번째 자연수는 색종이의 아래변과 도화지사이의 거리
	 	
	 	도화지를 100x100의 2차원 배열로 표현(boolean or 0/1)
	 	각 생종이에 대해 x<= i <=x+10 , y <= j <= y+10 칸을 표시
	 	모든 색종이 처리 후 , 표시된 칸의 개수 (넓이) 합산
	 	겸친 칸은 한번만 카운트
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[][] squre = new int[100][100]; //도화지의 넓이

		System.out.print("색종이 수 입력 : ");
		int num = sc.nextInt();//색종이 수
		
			for(int i = 0 ; i < num; i++) {
				System.out.print("1. ");
				int x = sc.nextInt();
				System.out.print("2. ");
				int y = sc.nextInt();
				
				for(int j = x ; j<x+10; j++) {
					
					for(int k = y; k<y+10; k++) {
						squre[j][k] = 1;
						
					}
				}
				
				
			}
			int num1=0;
			for(int i = 0; i<99; i++) {
				for(int j =0; j<99;j++) {
					int a  = squre[i][j];
					if(a>=1) {
						num1+=1;
					}
			}
			
		}
		System.out.println(num1);
		
		
			
		

	}

}
