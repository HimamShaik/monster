package com.technoelevate.encapsulation;

public class Playerx {

	public static void main(String[] args) {
		Bgmi player = new Bgmi();
		player.name = "Jeigyanshu";
		player.health = 20;
		player.weapon = "sword";

		int damage = 10;
		player.looseHealth(damage);
		System.out.println("Remaining health : " + player.healthRemaining());

		damage = 11;
		player.looseHealth(damage);
		System.out.println("Remaining health : " + player.healthRemaining());

	}

}
