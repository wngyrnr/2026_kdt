package com.kh.example.inherit2;

public class Student extends Person{

	private int grade;
	private String major;
	
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name,age,height,weight);
		this.grade = grade;
		this.major = major;
	}


	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}


	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}


	/**
	 * @return the mojor
	 */
	public String getMojor() {
		return major;
	}


	/**
	 * @param mojor the mojor to set
	 */
	public void setMojor(String mojor) {
		this.major = mojor;
	}


	public String toString() {
		return super.toString()+" "+this.grade+" , "+this.major;
	}

	
	

}
