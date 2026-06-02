package com.kh.example.oop6;

public class Student {
	private String name;
	private String sbject;
	private int score;
	/*
	 	- **필드**
    - `name : String` — 이름
    - `subject : String` — 과목
    - `score : int` — 점수
- **생성자**
    - `Student()` — 기본 생성자
    - `Student(String name, String subject, int score)` — 필드 초기화 생성자
- **메서드**
    - 각 필드별 **getter / setter** 직접 구현
    - `inform(): String`
        
        → `"이름 : {이름} / 과목 : {과목} / 점수 : {점수}"` 형태의 문자열 반환
	 */
	
	
	
	public Student() {
		super();
	}



	public Student(String name, String sbject, int score) {
		super();
		this.name = name;
		this.sbject = sbject;
		this.score = score;
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
	 * @return the sbject
	 */
	public String getSbject() {
		return sbject;
	}



	/**
	 * @param sbject the sbject to set
	 */
	public void setSbject(String sbject) {
		this.sbject = sbject;
	}



	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}



	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	public String inform() {
		return "이름 : " + name + "/ 과목 :" + sbject+ "/점수 : "+ score;
				//"이름 : {이름} / 과목 : {과목} / 점수 : {점수}"` 형태의 문자열 반환
		
	}
	
	
}
