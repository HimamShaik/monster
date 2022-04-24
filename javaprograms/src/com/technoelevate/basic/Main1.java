package com.technoelevate.basic;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList<Shop>();

		Shop s = new Shop("bajji", 20);
		Shop s1 = new Shop("bajji", 32);
		Shop s2 = new Shop("bajji", 44);
		Shop s3 = new Shop("bajji", 55);
		Shop s4 = new Shop("bajji", 11);
		Shop s5 = new Shop("bajji", 23);
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		// System.out.println(l);
		Collections.sort(l);
		for (Object obj : l) {
			System.out.println(obj);
		}
	}

}
