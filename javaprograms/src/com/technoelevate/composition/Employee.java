package com.technoelevate.composition;

public class Employee {
	private String name;
	private long no;
	private int age;

	public Employee(String name, long no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public long getNo() {
		return no;
	}

	public int getAge() {
		return age;
	}

}
