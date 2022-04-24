package com.javaprog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingDataUsingBufferReader {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the name of resourse");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String name = read.readLine();
		System.out.println(name);

	}

}
