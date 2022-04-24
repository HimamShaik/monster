package com.technoelevate.collection.casestudy1;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryMart {
	static ArrayList list = new ArrayList();
	static Scanner s = new Scanner(System.in);

	protected static void view() {
		System.out.println("Carrot , Beans , Ladies fingers , Tomato");

		System.out.println("press 2 to add the grocery items");
		System.out.println("press 3 to view the grocery items in your bag");
		System.out.println("press 4 to remove the items from bag");
		System.out.println("press 5 to exit");

	}

	protected static void addi(int i) {
		System.out.println("press 1 to add Carrot");
		System.out.println("press 2 to add Ladies fingers");
		System.out.println("press 3 to add Tomato");
		System.out.println("press 4 to add Beans");
		System.out.println("press 5 to stop adding");
		while (true) {
			int a = s.nextInt();

			if (a == 1) {
				list.add("carrot");
			} else if (a == 2) {
				list.add("ladies fingers");
			} else if (a == 3) {
				list.add("tomato");
			} else if (a == 4) {
				list.add("beans");
			} else {
				break;
			}
		}
	}

	protected static void show() {
		System.out.print(list.size() + " : items");
		System.out.println(list);
	}

	protected static void remove() {
		int b = s.nextInt();
		list.remove(b);
	}
}
