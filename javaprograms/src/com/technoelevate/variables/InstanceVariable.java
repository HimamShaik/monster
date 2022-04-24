package com.technoelevate.variables;

public class InstanceVariable {
	int a;
	double b;

	public static void main(String[] args) {
		InstanceVariable iv = new InstanceVariable();
		iv.a = 4;
		iv.b = 4.4;
		System.out.println(iv.a * iv.b);

	}

}
