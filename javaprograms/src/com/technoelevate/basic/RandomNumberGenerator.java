package com.technoelevate.basic;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random ran = new Random();

		System.out.println(ran.nextInt(4));
	}

}
