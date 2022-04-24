package com.technoelevate.exception;

public class BankKhata {
	public static void main(String[] args) {
		BalayaBank anshuAcc = new BalayaBank("Jeigyanshu", 1000, "Jiggy", "Jiggy123");
		// System.out.println(anshuAcc.getBalance());

		anshuAcc.deposite("Jiggy", "Jiggy123", 500);
		anshuAcc.withdraw("Jigg", "Jiggy123", 500);
		anshuAcc.deposite("Jiggy", "Jiggy123", 500);

	}

}
