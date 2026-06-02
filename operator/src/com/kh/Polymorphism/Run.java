package com.kh.Polymorphism;

public class Run {
		/*
		 	클래스 참조변수  			=  			new 클래스 생성자();
		 	(부모클래스가 위치할 수 있음)				(자식클래스가 위치할 수 있음)
		 	실제로 어디까지 접근이 가능한가				실제로 어떤 형태의 메모리가 생성되는가
		 */
	
	
	public static void main(String[] args) {
		
		//Cake c1 = new CheeseCake();
			//c1은 Cake의 메모리까지 접근이 가능하며
			//실제로는 CheeseCkae의 메모리 공간까지 존재한다.
		
		//c1.milky(): 접근범위를 넘어선다.
		//c1.sweet();
		//오버라이딩시에는 실제 메모리에 있는 재정의된 메서드가 호출됨.
		//c1.yummy();
		
		//CheeseCake c2 = new Cake();
		//실제 메모리가 Cake이므로 CheeseCake공간에 접근할 수 없음.
		//-> 접근범위가 실제 메모리크기보다 클 수 없다.
		
		
		//CheeseCake c2 = c1;
		//c1은 Cake타입이므로 실제 메모리가 어떤지는 알 수 없고 Cake까지만 사용이 되는 
		//CheeseCake의 메모리공간을 사용할 수 있다는게보장되지 않기때문에 
		
 	

	Car c1 = new Car("red" , "gasoline" , 2021);
	c1.drive();
	
	//((Sonata).c1)moveSonata());
	
	
	//자식타입 참조변수에 자식객체를 다루는 경우
	Avante c2 = new Avante("white" , "LPG" , 2023);
	c2.drive();
	
	Car c3 = c2;
	c3.drive();
	
	/*
	 	"상속구조"의 클래스를 간의 형변환 가능
	 	1. UpCasting
	 	자식타입 -> 부모타입으로 형변환
	 	자동형변환
	 	ex) Car c = new Sonata();
	 	
	 	2.DownCasting
	 	부모타입 -> 자식타입으로 형변환
	 	강제형변환 해야됨, 업캐스팅관계에 있을 때(실제 메모리가 자식타입일 때)만 가능.
	 	((Sonata)c).MoveSonata();
	 */
	
	}
}
