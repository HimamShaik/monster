package com.javaprog;

abstract class expected {

	public int a;

	public void ha() {
		System.out.println("ha");
	}

	abstract public void hai();

	public expected(int a) {

		this.a = a;
	}

}

public class Experment3 extends expected {

	public Experment3(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		expected ex = new expected(2) {

			@Override
			public void hai() {
				// TODO Auto-generated method stub

			}

		};

	}

	@Override
	public void hai() {
		// TODO Auto-generated method stub

	}

}
