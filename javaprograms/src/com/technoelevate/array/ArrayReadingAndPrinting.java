package com.technoelevate.array;

import java.util.Scanner;

public class ArrayReadingAndPrinting {
	public static void main(String[] args) {
		System.out.println("enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int a2[] = { 1, 2, 3 };
		int a[] = new int[size];

		System.out.println("enter the array elemets :" + size);
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
