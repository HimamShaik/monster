package com.technoelevate.basic;

public class TempClass {

	public static void main(String[] args) {
		temp2 t = new temp2();
		t.move();
		t.getName();
		t.great();
	}

}

abstract class temp1 {
	public void great() {
		System.out.println("hello " + this.getName());
	}

	public String getName() {
		return "Jeigyanshu";
	}

	abstract public void move();
}

class temp2 extends temp1 {
	public void move() {
		System.out.println("hai sameeer");
	}
}