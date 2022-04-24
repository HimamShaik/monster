package com.technoelevate.loosecoupling;

public class Person {

	public static void main(String[] args) {
		Travel t = new Bus();
		Travel t1 = new Train();
		Mytravel t2 = new Mytravel(t);
		t2.start();
	}

}
