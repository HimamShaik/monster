package com.javaprog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("himam");
		list.add("abhi");
		list.add("gnani");

		List<String> fil = list.stream().filter(p -> p.startsWith("G")).collect(Collectors.toList());
		System.out.println(fil);
	}

}
