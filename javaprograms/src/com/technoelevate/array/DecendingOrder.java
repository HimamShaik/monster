package com.technoelevate.array;

import java.util.Scanner;

public class DecendingOrder {
	public static void sort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array values : " + size);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		sort();
	}
}
