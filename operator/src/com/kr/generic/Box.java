package com.kr.generic;


//<T> : T라고 우선 쓴다음 객체생성시에 타입을 정하겠다.
public class Box<T> {
	private T value;
	private T[] arr;
	private int num;
	
	
	
	public Box() {
		
	}

	
	public Box(T value, T[] arr, int num) {
		super();
		this.value = value;
		this.arr = arr;
		this.num = num;
	}

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * @return the arr
	 */
	public T[] getArr() {
		return arr;
	}

	/**
	 * @param arr the arr to set
	 */
	public void setArr(T[] arr) {
		this.arr = arr;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	
}