package com.technoelevate.composition;

public class Boss {
	private double sal;
	private String mailid;
	private int leves;

	public Boss(double sal, String mailid, int leves) {
		this.sal = sal;
		this.mailid = mailid;
		this.leves = leves;
	}

	public double getSal() {
		return sal;
	}

	public String getMailid() {
		return mailid;
	}

	public int getLeves() {
		return leves;
	}

}
