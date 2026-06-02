package com.kh.example.oop3;

/*
	pakage
	클래스간 공간적 충돌이나 접그납ㅇ법의 충돌을 막기 위해 저장위치를 구분해서 명확하게 접근할 수 있도록 해주는 개념
	
	네정보은닉 : 객체내의정보를 의도와 다르게 변경하는 것을 막기위해
			직접접근을 막고 메서드를 통한 접근방식읠 사용하는 것.
			직접접근을 막는 방법 = 접근제한자를 사용
			접근제한자 : 클래서,필드,메서드를 구성요소의 접근 범위를 제한하는 키워드
			
			
			public / protected / default / private
			
			public : 어디서든 접근 가능
			protected : 같은 패키지 + 상속관계에 없는 경우
			default : 같은 패키치
			private : 오직 클래스내에서만 접근가능
			
			
*/


public class Book {
	
	String title, publisher,author;
	int price;
	double discountRate;
	
	
	
	
	
	public Book() {
		
	}
	
	public Book(String title, String publisher,String author) {
		this(title,publisher,author,0,0);
	}
	public Book(String title, String publisher,String author
			, int price, double discountRate) 
	{
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
		
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
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

	/**
	 * @return the discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate the discountRate to set
	 */
	
	public void setDiscountRate() {
		if(discountRate < 0 || 1<discountRate) {
			this.discountRate=0;
			return;
		}
		this.discountRate = discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public void inform() {
		System.out.printf("%s, %s, %s, %d, %f \n",title,publisher,author,price,discountRate);
	
	}
	
	

}
