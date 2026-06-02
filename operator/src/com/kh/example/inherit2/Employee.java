package com.kh.example.inherit2;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	
	public Employee() {
		super();
	}


	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name,age,height,weight);
		this.salary = salary;
		this.dept = dept;
	}


	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}


	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}


	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString()+" " + salary +" "+ dept;
	}
	
}
