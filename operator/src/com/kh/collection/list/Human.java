package com.kh.collection.list;

public class Human {
	private String name;
	private int age;
	
	
	
	
	public Human() {
		super();
	}




	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}




	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}




	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}



	//Object의 equals를 재정의
	//객체생성시 객체비교를 할 일이 있는 객체라면 equals로 재정의해야함.
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Human) {// 주소값은 다르지만 Human객체라면 필드비교를 통해 확인
//			Human h = (Human)obj;
//			return this.name.equals(h.getName() && this.age = getAge());
//			
//		}
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}



	
	
	
	
	

}
