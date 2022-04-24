package com.technoelevate.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<MyShop> {
	@Override
	public int compare(MyShop o1, MyShop o2) {
		return o1.getCost().compareTo(o2.getCost());

//		double c = o1.getCost();
//		double c1 = o2.getCost();
//
//		c /= 10; // c=c/10;
//		c %= 10;
//		c1 /= 10;
//		c1 %= 10;
//		if (c > c1) {
//			return +1;
//		} else if (c < c1) {
//			return -1;
//		} else {
//			return 0;
//		}
	}
}