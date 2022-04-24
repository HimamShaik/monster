package com.javaprog;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	private String name;
	private int id;
	private String address;
	private int sal;

	public Student(String name, int id, String address, int sal) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.sal = sal;
	}

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student("himam", 1, "hyd", 5000));
		list.add(new Student("sai", 2, "bang", 50000));
		list.add(new Student("samer", 3, "goa", 52000));
		list.add(new Student("saho", 4, "mum", 40000));

		// list.stream().filter(ste -> ste.sal >= 50000).forEach(ste ->
		// System.out.println(ste.name + " " + ste.id));

		list.stream().collect(Collectors.toList());
		System.out.println(list);
	}

}
