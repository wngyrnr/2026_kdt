package com.kh.interface1;

public class Run {
	public static void main(String[] args) {
		//interface는 객체생성을 할 수는 없지만
		//참조변수로 사용이 가능하다.
		Animal dog = new Dog();
		dog.speak();
		dog.move();
		
		((Dog)dog).eat();
	}

}
