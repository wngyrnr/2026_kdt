package com.kh.thread.runable;


//스레드를 만드는 방법2
//Thread클래스를 상속받는 클래스를 작성.
public class Task2 extends Thread{

	public void Run() {
		super.run();
	}
}
