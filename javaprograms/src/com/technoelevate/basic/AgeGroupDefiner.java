package com.technoelevate.basic;

import java.util.Scanner;

public class AgeGroupDefiner {

	public static void age() {
		Scanner scan = new Scanner(System.in);
		int h = 1;
		while (h == 1) {
			System.out.println("Enter the age");
			int age = scan.nextInt();
			if (age >= 0 && age <= 25) {
				System.out.println(age + ":your age is comes under Gen Z ");
			}

			else if (age >= 26 && age <= 41) {
				System.out.println(age + ":your age is comes under Millennial");
			}

			else {
				System.out.println(age + ": your age is neither Millennial nor Gen Z");
			}
		}
	}

	public static void main(String[] args) {
		age();
	}

}
