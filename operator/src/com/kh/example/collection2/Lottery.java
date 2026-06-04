package com.kh.example.collection2;

import java.util.Objects;

//- **필드**
//- `name : String` — 이름
//- `phone : String` — 휴대폰 번호(‘-’ 없이)
//- **생성자**
//- `Lottery()` — 기본 생성자
//- `Lottery(String name, String phone)` — 필드 초기화
//- **메서드**
//- 각 필드 **setter/getter**
//- `toString(): String`
//- `hashCode(): int` — Set 중복 판별용
//- `equals(Object obj): boolean` — Set 중복 판별용

public class Lottery {
	private String name;
	private String phone;
	
	public Lottery() {
		super();
	}
		
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lottery other = (Lottery) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	

	
	
	
	
	

}
