package com.technoelevate.variables;

public class NonStaticAccessNonStaticDirectly {
	public void move() {

		System.out.println("hai this is himam");
	}

	public void fly() {
		move();

		System.out.println("hello this gynan");
	}
	/*
	 * non static non static method directly because both are present in the same
	 * object
	 */

	public static void main(String[] args) {

		NonStaticAccessNonStaticDirectly n1 = new NonStaticAccessNonStaticDirectly();
		n1.fly();

	}

}
