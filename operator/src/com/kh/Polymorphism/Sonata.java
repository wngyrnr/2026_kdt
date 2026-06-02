package com.kh.Polymorphism;

public class Sonata extends Car{

	public Sonata(String color, String fuel, int year) {
		super(color,fuel,year);
	}
	
	public void moveSonata() {
		System.out.println("쌩썡~Sonata");
	}

	
}
