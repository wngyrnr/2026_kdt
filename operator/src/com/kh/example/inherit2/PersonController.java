package com.kh.example.inherit2;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		
		int stCount = 0;
		for(Student st :s) {
			if(st == null) {
				break;
			}
			stCount++;
		}
		int empCount = 0;
		for(Student st :s) {
			if(st == null) {
				break;
			}
			empCount++;
		}
		int[] countArr = {stCount,empCount};
		return countArr;
	}
		
			
	
	
	public void insertStudent(String name, int age, double height, double weight,int grade,String major) {
		Student st = new Student(name, age, height, weight, grade,major);
		for(int i = 0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] =st;
				break;
			}
			
		}
	}
	public Student[] printStudent() {
		return s;
	}
	
	
	public void insertEmployee(String name, int age, double height, double weight,int salary, String dept) {
		Student st = new Student(name, age, height, weight, salary, dept);
		for(int i = 0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] =st;
				break;
			}
		}


	}
	public Employee[] printEmployee(){
		return e;
	}
	
}
