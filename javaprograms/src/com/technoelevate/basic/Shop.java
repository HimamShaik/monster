package com.technoelevate.basic;

public class Shop implements Comparable<Shop> {
	private String name;
	private int cost;

	public Shop(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public Integer getCost() {
		return cost;
	}

	@Override
	public int compareTo(Shop o) {
		return this.getCost().compareTo(o.getCost());
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + ", cost=" + cost + "]";
	}

}
