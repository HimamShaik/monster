package com.technoelevate.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoExceptionprogram {

	public static void main(String[] args) throws IOException {

		InputStreamReader al = new InputStreamReader(System.in);

		BufferedReader tl = new BufferedReader(al);
		tl.readLine();

	}
}