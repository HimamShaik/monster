package com.javaprog;

public class string_reverse_2 {

	public static void main(String[] args) {
		String s1 = "naveen";
		char s2[] = s1.toCharArray();

		for (int i = s2.length - 1; i > -1; i--) {
			System.out.print(s2[i]);
		}

	}
}
