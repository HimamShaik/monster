package com.technoelevate.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class User {
	static ArrayList<MyShop> list = new ArrayList<MyShop>();

	public static void main(String[] args) {
		MyShop mc0 = new MyShop("Shampoo", 99, 1);
		MyShop mc1 = new MyShop("soap", 60, 2);
		MyShop mc2 = new MyShop("detergent", 180, 2);
		MyShop mc3 = new MyShop("facewash", 99, 1);
		MyShop mc4 = new MyShop("ricebag", 1200, 1);
		MyShop mc5 = new MyShop("milk", 60, 4);
		MyShop mc6 = new MyShop("ice-cream", 300, 3);
		MyShop mc7 = new MyShop("sugar", 90, 4);

		list.add(mc0);
		list.add(mc1);
		list.add(mc2);
		list.add(mc3);
		list.add(mc4);
		list.add(mc5);
		list.add(mc6);
		list.add(mc7);

		Collections.sort(list, new MyComparator());

		for (MyShop rl : list) {
			System.out.println(rl);
		}
	}

}
