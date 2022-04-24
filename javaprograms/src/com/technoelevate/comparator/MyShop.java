package com.technoelevate.comparator;

public class MyShop {

	private String name;
	private double cost;
	private int quantity;

	public MyShop(String name, double cost, int quantity) {
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", cost=" + cost + ", quantity=" + quantity + "]";
	}

	public String getName() {
		return name;
	}

	public Double getCost() {
		return cost;
	}

	public int getQuantity() {
		return quantity;
	}

}
