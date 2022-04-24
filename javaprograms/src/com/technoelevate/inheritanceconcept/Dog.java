package com.technoelevate.inheritanceconcept;

public class Dog extends Animals {

	private int eyes;
	private int ears;

	public Dog(String name, int legs, int tail, double length, int eyes, int ears) {
		super(name, legs, tail, length);
		this.eyes = eyes;
		this.ears = ears;
	}

	public int getEyes() {
		return eyes;
	}

	public int getEars() {
		return ears;
	}

}
