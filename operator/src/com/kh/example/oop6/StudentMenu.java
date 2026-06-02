package com.kh.example.oop6;
/*
 	- **필드**
    - `ssm : StudentController = new StudentController()`
- **생성자**
    - `StudentMenu()` — 다음 순서로 출력
        1. **학생 정보 출력**
            - `printStudent()` 호출 → 배열 반복 출력
        2. **학생 성적 출력**
            - `avgScore()` 호출 → 합계와 평균 출력
        3. **성적 결과 출력**
            - 각 학생 점수가 `CUT_LINE` 미만이면 `"재시험 대상"`, 이상이면 `"통과"`
 */
public class StudentMenu {
	
	StudentController ssm = new StudentController();

	public StudentMenu() {
		super();
		
	}
/*
 	1. **학생 정보 출력**
            - `printStudent()` 호출 → 배열 반복 출력
 */	
		Student[] stArr = ssm.printStudent();
		

	
	
}
