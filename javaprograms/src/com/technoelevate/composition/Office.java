package com.technoelevate.composition;

public class Office {

	public static void main(String[] args) {
		Employee emp = new Employee("himam", 912195457, 24);
		Boss b = new Boss(25000, "himamsk42gmail.com", 0);
		Work w = new Work(emp, b);
		System.out.println(w.getB().getMailid());
		System.out.println(w.getH().getName());

	}

}
