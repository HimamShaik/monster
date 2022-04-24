package com.technoelevate.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
	public static void date() {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		int dd = d.getDayOfMonth();
		int mm = d.getMonthValue();
		int m=d.getDayOfYear();
		int yyyy = d.getYear();
		System.out.println(dd + "-" + mm + "-" + yyyy+m);
		System.out.printf("%d-%d-%d", dd, mm, yyyy);
		System.out.println();
	}

	public static void time() {
		LocalTime t = LocalTime.now();
		System.out.println(t);
	}

	public static void main(String[] args) {
		date();
		time();
	}

}
