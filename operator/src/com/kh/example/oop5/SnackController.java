package com.kh.example.oop5;
/*
 * - **필드**
    - `s:Snack = new Snack()` — 내부 보관용 스낵 객체
- **생성자**
    - `SnackController()` — 기본 생성자
- **메서드**
    - `saveData(String kind, String name, String flavor, int numOf, int price):String`
        - 전달받은 값들을 **setter**로 `s`에 저장
        - 저장 완료 메시지 문자열을 반환 (예: `"저장 완료되었습니다."`)
    - `confirmData():String`
        - 현재 `s`에 저장된 정보를 `s.information()`으로 반환
 */

public class SnackController {
	Snack s = new Snack();
	
	public SnackController() {
	}
	
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장완료되었습니다.";
	}
	public String confirmData() {
		return s.information();
	}
}
