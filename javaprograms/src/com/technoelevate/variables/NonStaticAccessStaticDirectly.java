package com.technoelevate.variables;

public class NonStaticAccessStaticDirectly {
	public void move() {
		fly();
		System.out.println("hai this is himam");
	}

	public static void fly() {

		System.out.println("hello this gynan");
	}

	/*
	 * non-static access static variable directly because static is constant present
	 * in static pool area as single unit(copy) so non static will no confuse to
	 * call static method
	 */

	public static void main(String[] args) {
		NonStaticAccessStaticDirectly n1 = new NonStaticAccessStaticDirectly();
		n1.move();

	}

}
