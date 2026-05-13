package testproject;

public class Conversion {

	/*
	 * 형변환
	 * 자료형을 다른 자료형으로 변경하는 것
	 * 자동형변환
	 * 연산시에 두개의 항을 하나의 자료형으로 일치시켜야 연산이 가능하다.
	 * ->데이터 손실이 적은 방향으로컴파일러가 직접 형변환을 해준다.
	 * 
	 * 명시적형변환
	 * 자동현변환이 되지 않는 조건에서 개발자가 직접 진행하는 것 (데이터 손실 가능)
	 * 
	 */
	public static void main(String[] args) {
		double pi = 3.141592;
		int num = (int)pi;
		System.out.println(num);
		
		long longNum = 30000000000000007L;
		int intNum = (int)longNum;
		System.out.println(intNum);
		
		

	}

}
