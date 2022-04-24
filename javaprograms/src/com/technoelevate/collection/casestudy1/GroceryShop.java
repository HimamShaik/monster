package com.technoelevate.collection.casestudy1;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryShop {

	static Scanner s = new Scanner(System.in);
	static ArrayList list = new ArrayList();

	private static void view() {
		System.out.println("Carrot , Beans , Ladies fingers , Tomato");

		System.out.printf(
				"press 2 to add the grocery items %n press 3 to view the grocery items in your bag %npress 4 to remove the items from bag %npress 5 to exit");
	}

	private static void addi(int i) {
		System.out.println(
				"press 1 to add Carrot \n press 2 to add Ladies fingers \n press 3 to add Tomato \n press 4 to add Beans \n press 5 to stop adding");
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

	private static void show() {
		System.out.print(list.size() + " : items");
		System.out.println(list);
	}

	private static void remove() {
		int b = s.nextInt();
		list.remove(b);
	}

	public static void main(String[] args) {
		boolean shop = true;
		System.out.println(
				"press 1 to view the grocery items \n press 2 to add the grocery items \n press 3 to view the grocery items in your bag \n press 4 to remove the items from bag \n press 5 to exit");

		while (shop == true) {
			int no = s.nextInt();
			if (no == 1) {
				view();
			} else if (no == 2) {
				addi(2);

				System.out.println("press 3 to view the grocery items in your bag");
				System.out.println("press 4 to remove the items from bag");
				System.out.println("press 5 to exit");
			} else if (no == 3) {
				show();
				System.out.println("press 1 to view the grocery items");
				System.out.println("press 2 to add the grocery items");
				System.out.println("press 4 to remove the items from bag");
				System.out.println("press 5 to exit");
			} else if (no == 4) {
				remove();
				System.out.println("press 1 to view the grocery items");
				System.out.println("press 2 to add the grocery items");
				System.out.println("press 3 to view the grocery items in your bag");
				System.out.println("press 4 to remove the items from bag");
				System.out.println("press 5 to exit");
			} else {
				System.out.println("items present in your bag is");
				show();
				System.out.println("pay for " + list.size() + "for these item");
				System.out.println("Thanks for visiting Groceryshop plese visit again");
				break;
			}
		}
	}

}
