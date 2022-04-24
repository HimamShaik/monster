package com.technoelevate.arraylistimplementing;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList(2);
		list.addElement("Neeraj");
		list.addElement("Sachin");
		list.addElement("swamy");
		// System.out.println(list.size());
		list.addElement("abhi");
		list.addElement("gnaneshwar");
		list.addElement("prudvi");
		list.addElement("himam");
		list.addElement("iqbal");
		list.addElement("iqbal");
		// System.out.println(list.size());

		// System.out.println(list.getElement(1));
		// list.getAllElements();

		Iterator r1 = list.Nonstop();
		while (r1.hasNext()) {
			System.out.println(r1.next());
		}

	}
}
