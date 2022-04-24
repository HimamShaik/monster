package com.technoelevate.basic;

import java.util.Scanner;

public class UserDataInput {
	public static void data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the age");
		int age = sc.nextInt();
		System.out.println("enter the mobile no");
		long no = sc.nextLong();
		System.out.println("enter the gender in m/f");
		char gender = sc.next().charAt(0);
		System.out.println("are you present working r not true/false");
		boolean work = sc.nextBoolean();

		System.out.println(name);
		System.out.println(age);
		System.out.println(no);
		System.out.println(gender);
		System.out.println(work);

	}

	public static void main(String[] args) {
		data();
	}

}
