package com.technoelevate.collectioniterationuinglinkedlist;

public class Hero {
	private String name;
	private String car;

	public Hero(String name, String weapon) {
		this.name = name;
		this.car = weapon;
	}

	public String getName() {
		return name;
	}

	public String getCar() {
		return car;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCar(String weapon) {
		this.car = weapon;
	}

}
