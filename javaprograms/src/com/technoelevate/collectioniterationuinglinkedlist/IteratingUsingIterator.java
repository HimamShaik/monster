package com.technoelevate.collectioniterationuinglinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingUsingIterator {

	private static LinkedList<Hero> cars1 = new LinkedList<Hero>();

	public static void main(String[] args) {
		Hero h1 = new Hero("NTR", "Lamborghini car");
		Hero h2 = new Hero("Mahesh Babu", "Mercedes GLS 350D Car");
		Hero h3 = new Hero("Balayya", "Bentley Car");
		Hero h4 = new Hero("Prabhas", "Rolls Royce Car");

		cars1.add(h1);
		cars1.add(h2);
		cars1.add(h3);
		cars1.add(h4);

		getDetails();

	}

	public static void getDetails() {

		Iterator itr = cars1.iterator();
		while (itr.hasNext()) {
			Hero hero = (Hero) itr.next();
			System.out.println(hero.getName() + " " + hero.getCar());

		}
	}
}
