package com.kh.example.oop2;

public class Run {
	
	
	public static void main(String[] args) {
		Student st = new Student();
		
		System.out.println(st.information());
		
		
		
		//setter와 getter는 필드값을 저장하거나 반환하는 메서드
		st.setName("최지원");
		System.out.println(st.getName());
		System.out.println(st.information());
	}

}
