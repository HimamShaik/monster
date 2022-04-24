package com.javaprog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String_rep_words {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string ");
		String result = br.readLine();

		String input[] = result.split(" ");
		Arrays.sort(input);

		for (int i = 0; i < input.length - 1; i++) {
			int count = 0;
			if (input[i] != input[i + 1]) {

				for (int j = 0; j < input.length; j++) {
					if (input[i].equals(input[j])) {
						count += 1;
					}
				}
				System.out.println("input " + input[i] + " is counted " + count);
			} else {
				continue;
			}

		}

	}
}
