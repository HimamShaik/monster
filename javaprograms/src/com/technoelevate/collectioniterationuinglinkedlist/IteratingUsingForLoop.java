package com.technoelevate.collectioniterationuinglinkedlist;

import java.util.LinkedList;

public class IteratingUsingForLoop {

	private static LinkedList<Hero> cars = new LinkedList<Hero>();

	public static void main(String[] args) {

		Hero h1 = new Hero("NTR", "Lamborghini car");
		Hero h2 = new Hero("Mahesh Babu", "Mercedes GLS 350D Car");
		Hero h3 = new Hero("Balayya", "Bentley Car");
		Hero h4 = new Hero("Prabhas", "Rolls Royce Car");

		cars.add(h1);
		cars.add(h2);
		cars.add(h3);
		cars.add(h4);

		getDetails();

	}

	public static void getDetails() {

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).getName() + " uses " + cars.get(i).getCar());
		}
	}
}
