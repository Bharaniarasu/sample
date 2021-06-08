package com.ExceptionHandling;

public class CreditException extends Exception {

	public static void main(String[] args) {
		CreditException.giveCredit(500);
	}

	CreditException(int a) {
		System.out.println("i dont have that much  \n" + "i have only  " + a);

	}

	public static void giveCredit(int a) {
		if (a > 400) {
			try {
				throw new CreditException(400);

			} catch (CreditException ce) {
				System.out.println("credit is an Exception");
			}
		}

	}

}
