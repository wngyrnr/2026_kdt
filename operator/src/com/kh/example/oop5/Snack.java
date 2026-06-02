package com.kh.example.oop5;


/*
	- **필드**
- `kind:String` — 종류
- `name:String` — 이름
- `flavor:String` — 맛
- `numOf:int` — 개수
- `price:int` — 가격
- **생성자**
- `Snack()` — 기본 생성자
- `Snack(String kind, String name, String flavor, int numOf, int price)` — 모든 필드를 매개변수로 초기화
- **메서드**
- 각 필드별 **getter / setter** 직접 구현
- `information():String` — 담긴 데이터를 한 줄 문자열로 반환
    - 예) `빵(케이크 - 블루베리) 1개 15000원`
*/


public class Snack {
	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {
	}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}

	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
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
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	/**
	 * @return the numOf
	 */
	public int getNumOf() {
		return numOf;
	}

	/**
	 * @param numOf the numOf to set
	 */
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	public String information() {
		return kind+"(" +name+ "-" +flavor +")"+numOf+"개"+price+"원";
	}
	//`information():String` — 담긴 데이터를 한 줄 문자열로 반환 - 예) `빵(케이크 - 블루베리) 1개 15000원`
	
}
