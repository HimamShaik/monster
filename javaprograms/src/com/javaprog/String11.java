package com.javaprog;

public class String11 {
	public static void main(String[] args) {
		String s1 = "himam";
		String dup = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (dup.indexOf(c) == -1) {
				dup += c;
			}
		}
		System.out.println(dup);
	}
}
