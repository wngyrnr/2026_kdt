package com.kh.example.oop7;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	
	public Product() {
		super();
	}


	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}


	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}


	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
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
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}


	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String inform() {
		return "상품명 : " + pName + " 가격 : " + price + "브랜드 : " + brand;
	}
	
	
}
