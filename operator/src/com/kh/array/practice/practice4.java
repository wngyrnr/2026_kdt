package com.kh.array.practice;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class practice4 {
		
	
	//학생 30명이 있고, 28명이 과제를 제출했습니다. 제출하지 않은 2명의 출석번호를 오름차순으로 출력하는 프로그램을 작성하세요.
	//28개의 줄에 서로 다른 출석번호(1~30)이 주어집니다.
	//과제를 제출하지 않은 학생 2명의 출석번호를 오름차순으로 한 줄에 하나씩 출력합니다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			/*
				학생 번호를 1~30까지 입력받기
				배열로 나열
				인덱스 번호에 맞게 학생번호 넣고 해당번호에 없으면 0값
				
				
			 */
		
		int[] stu = new int[30];
		
		System.out.println("학생 번호 입력 :");
		for(int i = 0; i<28; i++) {
		int a = sc.nextInt();
		stu[a-1] = a;
		}
		
		for(int w : stu) {
			System.out.println(w);
		}
		
		System.out.print("출석을 안한 학생 : ");
		
		for(int i = 0; i<stu.length; i++) {
			if(stu[i] == 0) {
			System.out.println(i+1);
			}
		}
		
	}
}
		
		


//		int[] students = new int[30];
//		System.out.print("학생의 번호를 입력하세요 :");
//		
//		
//			for(int i = 0; i<28; i++) {		
//				int a = sc.nextInt();
//				students[a-1] = a;
//			}
//			
//		
//			System.out.println("출석을 안한 학생은?");
//			
//			for(int i = 0; i<students.length; i++) {
//				
//				if(students[i] == 0) {
//					System.out.println(i+1)	;
//					}
//				
//				
//			}
//			
//				
//	}
//}

/*
        int[] stu = new int[30];

        System.out.println("학생 번호 입력:");

        for(int i = 0; i < 28; i++) {

            int a = sc.nextInt();

            stu[a - 1] = a;
        }

        System.out.println("과제 안 낸 학생:");

        for(int i = 0; i < stu.length; i++) {

            if(stu[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
	
 */
			


//



