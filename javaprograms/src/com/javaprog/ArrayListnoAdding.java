package com.javaprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListnoAdding {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i <= 100; i++) {
			list.add(i);
		}
		for (Integer obj : list) {
			if (obj % 10 == 0) {
				System.out.print(obj + " ");
			}
		}
		System.out.println();
		List<Integer> l = list.stream().filter(j -> j >= 20 && j <= 80).collect(Collectors.toList());
		Collections.reverse(l);
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			int a = itr.next();
			if (a % 10 == 0) {
				System.out.println(a);
			}
		}
	}
}
