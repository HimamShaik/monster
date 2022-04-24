package com.technoelevate.map;

import java.util.Collections;
import java.util.TreeMap;

public class SortingMap {

	public static void main(String[] args) {
		TreeMap tree = new TreeMap(Collections.reverseOrder());
		tree.put(12, "himam");
		tree.put(11, 33);
		tree.put(10, "harsha");
		System.out.println(tree);
//		System.out.println(tree.entrySet());
		// shMap map = new HashMap(tree);

	}

}
