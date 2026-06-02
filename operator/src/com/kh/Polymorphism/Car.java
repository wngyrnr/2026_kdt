package com.kh.Polymorphism;

public class Car {
	private String color;
	private String fuel;
	private int year;
	
	
	public Car() {
		super();
	}
	
	public Car(String color, String fuel, int year) {
		super();
		this.color = color;
		this.fuel = fuel;
		this.year = year;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the fuel
	 */
	public String getFuel() {
		return fuel;
	}


	/**
	 * @param fuel the fuel to set
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	
	public void drive() {
		System.out.println("부릉부릉~");
	}
	
	public String toString() {
		return this.color+ ","+ this.fuel +"," + this.year;
	}
	
	
}
