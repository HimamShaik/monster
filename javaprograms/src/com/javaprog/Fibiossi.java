package com.javaprog;

public class Fibiossi {

	public static void main(String[] args) {
		long n1 = 0;
		long n2 = 1;
		long n3;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 1; i <= 10; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}
}
