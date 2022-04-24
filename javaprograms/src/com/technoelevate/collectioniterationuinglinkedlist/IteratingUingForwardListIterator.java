package com.technoelevate.collectioniterationuinglinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratingUingForwardListIterator {
	private static LinkedList cars2 = new LinkedList();

	public static void main(String[] args) {
		Hero h1 = new Hero("NTR", "Lamborghini car");
		Hero h2 = new Hero("Mahesh Babu", "Mercedes GLS 350D Car");
		Hero h3 = new Hero("Balayya", "Bentley Car");
		Hero h4 = new Hero("Prabhas", "Rolls Royce Car");

		cars2.add(h1);
		cars2.add(h2);
		cars2.add(h3);
		cars2.add(h4);

		getDetails();

	}

	public static void getDetails() {
		ListIterator itr = cars2.listIterator();

		while (itr.hasNext()) {
			Hero hero = (Hero) itr.next();
			System.out.println(hero.getName() + " uses " + hero.getCar());
		}
	}
}
