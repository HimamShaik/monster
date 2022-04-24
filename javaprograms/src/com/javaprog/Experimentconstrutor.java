package com.javaprog;

public class Experimentconstrutor {

	public static int d;
	public static String name;

	public Experimentconstrutor(int d, String name) {
		this.d = d;
		this.name = name;
	}

	public static void main(String[] args) {

		Experimentconstrutor al = new Experimentconstrutor(1, "himam");
		System.out.println(d);
		System.out.println(name);
	}

}
