package com.kh.example.abstractNInterface;

public abstract class SmartPhone {
	
	private String maker;

	public SmartPhone() {}
	
	
	
	/**
	 * @return the maker
	 */
	public String getMaker() {
		return maker;
	}



	/**
	 * @param maker the maker to set
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}



	public abstract String printInformation();
	
	
	
	

}
