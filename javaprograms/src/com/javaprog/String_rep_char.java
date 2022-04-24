package com.javaprog;

public class String_rep_char {

	public static void main(String[] args) {
		String ch = "himam";
		String rep = "";
		char[] c = ch.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(c[i] + " : is repeated" + count);
			}
		}
	}
}
