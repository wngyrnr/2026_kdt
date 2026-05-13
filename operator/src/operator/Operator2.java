package operator;

import java.util.Scanner;

public class Operator2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("true의 부정 : " + !(true));
		System.out.println("false의 부정 : "+ !(false));
		
		System.out.println("값1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("값2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("값1이 값2보다 크지않다. : " + !(num1 > num2));
	}
	
	

}
