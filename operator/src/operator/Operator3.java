package operator;

public class Operator3 {
	
	/*
	 산술 연산자 
	 + - * / %
	 
	 
	 복잡대입연산자 
	 산술연산 후 대입연산을 사용할 때는 축약이 가능하다.
	 +=  -=  *=  /=  %=
	 
	 */
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a / b = " + (a / b)); //0으로 나누면 에러
		System.out.println("a * b = " + (a * b));
		System.out.println("a % b = " + (a % b));
		
		a = a + b;
		a += b; // a = a + b; == a += b;
		System.out.println(a);
		
	}

}
