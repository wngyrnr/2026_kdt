package basic;

public class Variable {

	public static void main(String[] args) {
		
		//정수형 변수
		int num;
		
		// 정수형 변수 num에 10이라는 값을 대
		num = 10;
		
		System.out.println(num);
		//syso + controll + space => 엔터 자동완성
		
		
		//참과 거짓을 표현하는 자료형으로 isTure라는 이름의 변수를 선언
		boolean isTrue = false; //선언과 동시에 값을 대입
	
		isTrue = true;
		System.out.println(isTrue);
		
		
		//실수형(소수점 6자리까지 사용)으로 num2라는 이름의 변수를 선언 
		float num2;
		num2 = 3.1412344445456161f;
		System.out.println(num2);
		System.out.printf("%.6f",num2);
		
		
		//정수 자료형  
		int in = 10; 	// 기본값 4바이트
		byte by = 10;	// 1바이트 
		short sh = 10;	// 2바이트 
		long lo = 10;	// 8바이트
		
		//실수 자료형 
		float f1 = 4.24f;	// 4바이트 
		double dou = 4.24;	// 8바이트
		
		System.out.println(f1);
		System.out.println(dou);
		
		//문자 자료형 
		char ch1 = '최';
		char ch2 = '지';
		char ch3 = '원';
				//기본적으로 char는 연산시 int로 형변환된다. 
		System.out.println(ch1 + ch2 + ch3);
		
		//논리자료형
		boolean b1 = false;
		boolean b2 = 10>0;
		boolean b3 = 20==10;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		/*
		 * 윈서타입 : 가장 기본적인 데이터타입, 값 자체를 저장하며 추가적인 속성이 없다.
		 * 
		 * 문자열
		 *String
		 *문자열은 할당 메모리크기가 가변적이므로 원시타입 아닌 객체타입으로 변수를 만든다.
		 *
		 *원래 객체를 만드는 방식
		 *String 변수명 = new String(초기값);
		 *
		 *문자열은 특별히 자주사용하기 때문에 원시타입과 동일하게 생성, 사용이 가능함.
		 */
		String strl = "안녕하세요. 김아무개입니다.    저";
		System.out.println(strl);
		
		//문자열에는 이스케이프 시퀸스가 있다.
		//문자열내에서 탭, 백슬러시, 작은따옴표등을 사용하기위한 방식 
		
		// \t 	: 탭
		System.out.println("이름\t나이\t주소");
		// \\ 	: 백슬러
		System.out.println("이름\\t나이\\t주소");
		// \ 	: 쌍따옴표
		System.out.println("이름\"t나이\"t주소");
		// \n	: 개
		System.out.println("이름\nt나이\n주소");
		
		
		
		/*
		 * 
		 */
		
		final int MY_AGE;
		MY_AGE = 10;
		/*
		 * 프로그래밍에서 이름 짓는 방식
		 * 1. 카멜케이스 : 단어를 나열할 때 두번째 단어부터는 단어의 첫글자를 대문자로 시작.
		 * ex) userName, totalCount
		 *  -> 자바에서 모든 함수명, 변수명 
		 * 
		 * 2. 파스탈케이스 : 카멜케이스에서 첫글자까지 대문자로 작성 
		 * ex) UserName, TotalCount
		 * -> 자바에서 클래스명에 사용 
		 * 
		 * 
		 * 3. 스네이크케이스 : 문자와 문자사이를 _를 통해서 이어주는 것
		 *  ex) user_name, total_count
		 * ->파이썬, 자바스크립트에서 많이 사용
		 * 
		 * 4. 대문자스네이크케이스
		 * ex) USER_NAME
		 * ->대부분 언어에서 상수명
		 * 
		 * 5. 케밥케이스 : 단어는 소문자로 작성하되 문자와 문자사이를 하이픈으로 구성
		 *  ex) user-name, total-count
		 *  -> html에서 속성, url, 설정파일
		 *  
		 */
		
		
		
	}
	 
}

