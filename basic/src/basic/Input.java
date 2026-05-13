package basic;

import java.util.Scanner;

public class Input {

	/*
	 입력 : 외부에서 데이터를 코드로 가져오는 것 
	 
	 Scanner를 사용하면, 키보드 입력값을 가져올 수 있다.
	 (java.util.Scanner 클래스를 이용함.)
	 
	 객체로 먼저 선언 후 사용.
	 Scanner 변수명 = new Scanner (System.in);
	 */
	
	public static void main(String[] args) {
		
		//scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("입력 : ");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		*/
		// .nextLine() -> 문자열 입력받는 함수( 공백을 포함한 한줄! 개형문자까지)
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		sc.nextLine(); //버퍼에 남아있는 개행을 제거하기 위해 작성한 코드
		
		System.out.println("나이 : ");
		String age = sc.nextLine();
		
		System.out.printf("%s(%s세)", name,age);
		
		//.next타입() -> nextInt(), nextDouble(), nextBoolean() ...
		sc.close();// Scanner자원을 반납 -> 한번 반납시 재사용 불가
		//sc = new Scanner(System.in);
	}

}
