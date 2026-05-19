package com.kh.array.practice;

import java.util.Scanner;

public class Practice2D1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		

		System.out.println("행 : ");
		int n = sc.nextInt();
		System.out.println("열 : ");
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		int[][] A = new int[n][m];
		int[][] B = new int[n][m];
		int num = 0;
		
			for(int i =0; i<arr.length; i++) {
					System.out.println();
				for(int j =0; j<arr[i].length; j++) {
					A [i][j] = sc.nextInt();
				}
			}
			
			for(int i =0; i<arr.length; i++) {
				System.out.println();
				for(int j =0; j<arr[i].length; j++) {
					B [i][j] = sc.nextInt();
				}
			}
			
			
			for(int i =0; i<arr.length; i++) {
				System.out.println();
				for(int j =0; j<arr[i].length; j++) {
					arr[i][j] = B[i][j] + A[i][j];
				}

			}
			for(int i =0; i<arr.length; i++) {
				System.out.println();
				for(int j =0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
		
			
				
	}
}
