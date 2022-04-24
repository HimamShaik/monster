package com.technoelevate.composition;

public class Work {
	private Employee h;
	private Boss b;

	public Work(Employee h, Boss b) {
		this.h = h;
		this.b = b;
	}

	public Employee getH() {
		return h;
	}

	public Boss getB() {
		return b;
	}

}
