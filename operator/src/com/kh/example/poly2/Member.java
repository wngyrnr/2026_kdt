package com.kh.example.poly2;

public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount;
	
	
	public Member() {
		super();
	}


	public Member(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		
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


	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}


	/**
	 * @return the couponCount
	 */
	public int getCouponCount() {
		return couponCount;
	}


	/**
	 * @param couponCount the couponCount to set
	 */
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}
	
	

}
