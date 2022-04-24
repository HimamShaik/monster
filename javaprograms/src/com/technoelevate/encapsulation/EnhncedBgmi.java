package com.technoelevate.encapsulation;

public class EnhncedBgmi {

	private String name;
	private int health = 100;
	private String weapon;

	public EnhncedBgmi(String name, int health, String weapon) {

		this.name = name;
		if (health > 0 && health <= 100) {
			this.health = health;
		}
		this.weapon = weapon;
	}

	public String getWeapon() {
		return weapon;
	}

	public void looseHealth(int damage) {
		this.health -= damage;
		if (this.health <= 0) {
			System.out.println("Player knocked out");
		}
	}

	public int getHealth() {
		return health;
	}

	public String getname() {
		return name;
	}
}
