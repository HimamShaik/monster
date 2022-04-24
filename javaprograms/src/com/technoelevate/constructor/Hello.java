package com.technoelevate.constructor;

public class Hello extends Hai {
	Hello() {
		super(7);
		System.out.println("hello man");
	}

	public static void main(String[] args) {
		Hello h = new Hello();

	}

}
