package com.javaprog;

import java.util.ArrayList;

public class Arryalstsize {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);
		list.add("himam");
		list.add(2);
		list.add(true);
		list.add(12);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
