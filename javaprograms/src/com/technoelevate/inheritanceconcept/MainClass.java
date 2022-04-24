package com.technoelevate.inheritanceconcept;

public class MainClass {

	public static void main(String[] args) {
		Animals a1 = new Animals("tommy", 4, 2, 2);

		Dog d1 = new Dog("Jimmi", 4, 1, 3.4, 2, 2);
		System.out.println(a1.getTail());
		d1.getLegs();

	}

}
