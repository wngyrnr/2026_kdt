package com.kh.thread.multi;

public class Task2 extends Thread{

	
	public void Run() {
		
		
		//1~20까지 수 중에서 짝수만 출력
		for(int i = 0; i<20; i++) {
			if(i%2 ==1) {
				System.out.println( i + " " );
			}
			
		}
	}
}