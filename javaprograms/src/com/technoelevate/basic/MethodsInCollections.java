package com.technoelevate.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsInCollections {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("himam");
		list.add("gnaneshwar");
		list.add("prudhvi");
		list.add("abhilash");
		// Collections.sort(list);
		// Collections.reverse(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.swap(list, 1, 2);
		System.out.println(list);
	}

}
