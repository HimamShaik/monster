package com.technoelevate.variables;

public class StaticAccessStaticDirectly {
	public static void move() {
		System.out.println("hai this is himam");
	}

	public static void fly() {
		move();
		System.out.println("hello this gynan");
	}

	public static void main(String[] args) {
		fly();

	}

}
