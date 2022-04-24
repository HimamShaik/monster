package com.technoelevate.encapsulation;

public class PlayerY {

	public static void main(String[] args) {
		EnhncedBgmi player = new EnhncedBgmi("Himam", -20, "M416");
		System.out.println("Initia health :" + player.getHealth());
		System.out.println("playername :" + player.getname());
		System.out.println("weapon : " + player.getWeapon());
	}

}
