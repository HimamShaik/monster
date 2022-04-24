package com.javaprog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Generator {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Prabhas", "venkatesh", "chiranjivi", "mahesh babu", "nani");
		List<String> res = l.stream().filter(p -> p.startsWith("P")).collect(Collectors.toList());
		System.out.println(res);
	}

}
