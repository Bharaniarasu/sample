package com.ils;

import java.util.Scanner;

public class EnStr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");

		String ch = sc.next();
		for (int i = 0; i < ch.length(); i++) {
			char n = ch.charAt(i);

			int num = n - 1;

			System.out.println("The ASCII value of the given  char    " + n + "   is ................." + num);
		}
		sc.close();
	}

}