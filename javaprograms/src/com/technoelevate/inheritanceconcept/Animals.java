package com.technoelevate.inheritanceconcept;

public class Animals {
	private String name;
	private int legs;
	private int tail;
	private double length;

	public Animals(String name, int legs, int tail, double length) {
		this.name = name;
		this.legs = legs;
		this.tail = tail;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public int getLegs() {
		return legs;
	}

	public int getTail() {
		return tail;
	}

	public double getLength() {
		return length;
	}

}
