package com.kh.array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		//1. 크기가 10인 정수형 배열 numArr를 하나 생성.
		
		//2. 반복문을 통해서 numArr의 모든값을 10으로 초기화.
		
		//3. for-each를 통해서 모든 배열의 요소를 출력.
		
		
		int []numArr = new int[10];
		
		for(int i =0; i<numArr.length; i++) {
			numArr[i] = 10;
		}
		
		for(int num:numArr) {
			System.out.print(num + " ");
		}
		
		//4. 사용자에게 배열의 길이를 입력받아, 입력받은 크기의 문자열 배열 nameArr를 생성.
		
		//5. 사용하에게 이름을 하나 입력받아 nameArr에 할당, nameArr의 모든 요소에 이름이 들어갈 수 있도록 반복
		// ->nameArr의 모든 요소에 이름이 들어갈 수 있도록 반복
		// [console]
		// 배열의 길이 : 3
		// 이름입력 : xxx
		// 이름입력 : xxx
		// 이름입력 : xxx
		//===입력완료===
		//xxx xxx xxx
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이 :");
		int Arrlength = sc.nextInt();//배열의 길이를 입력받음
		String name1 = null;
		
		
		
		String[] nameArr = new String[Arrlength];//입력받은 길이로 문자배열생성
		
		
		
		for(int i =0; i<nameArr.length; i++) {//0~입력받은 배열까지 갚을 넣어주기 위한 for문
			System.out.print("이름입력 :");
			nameArr[i] = sc.next();
			
		}
		for(String name: nameArr) {
			
			System.out.println(name + " ");
			
		}
		//6. 사용자에게 이름을 하나 입력받아, nameArr에 동일한 이름이 있다면
		//동일한 이름이 존재합니다. / 동일한 이름이 존재하지 않습니다.
		
		
		for(int i=0; i<nameArr.length; i++) {
			
			System.out.println("동일한 이름이 있나요 : ");
			name1 = sc.next();
			
			if(nameArr[i].equals(name1)) {//문자열 비교
				System.out.println("동일한 이름이 존재합니다.");//동일한 이름이 존재
				break;
			}else if(i == (nameArr.length-1)){
				System.out.println("동일한 이름이 존재하지 않습니다.");//동일한 이름 x
				
			}
			
		}
		
	}

}
