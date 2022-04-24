package com.technoelevate.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetInReverse {
	private static HashSet hs = new HashSet();

	public static void main(String[] args) {

		hs.add("himam");
		hs.add("abhi");
		hs.add("gnanshwar");
		hs.add("prudvi");

		System.out.println("After adding to HashSet");
		for (Object obj : hs) {

			System.out.println(obj);
		}

		LinkedList al = new LinkedList(hs);
		Collections.reverse(al);
		// Collections.sort(al);
		System.out.println("After sorting elements of HashSet");

		for (Object obj1 : al) {
			System.out.println(obj1);
		}

	}

}
