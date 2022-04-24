package com.technoelevate.variables;

public class StaticAccessNonstaticByRv {

	public void move() {
		System.out.println("hai this is himam");
	}

	public static void fly() {
		StaticAccessNonstaticByRv s1 = new StaticAccessNonstaticByRv();
		s1.move();
		System.out.println("hello this gynan");
	}

	public static void main(String[] args) {
		fly();

	}

}
