package com.kh.thread.runable;

public class Run {
/*
 	스레드 : 프로그램 내에서 실행의 흐름을 가지고 있는 최소단위
 	메
 */
	public static void main(String[] args) {
		
		//Runnable을 구현한 객체를 생성 후 스레드 생성자에게 전달.
		Runnable t1run = new Task1();
		Thread t1 new Thread(t1run);
		
		t1.start();

	}

}
