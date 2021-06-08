package com.ils;

import java.util.Scanner;

public class StringPal {
	// int reverse;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int temp = st.length();
		for (int i = temp - 1; i >= 0; i--) {
			String reverse = "";
			reverse = reverse + st.charAt(i);

			if (st.equals(reverse)) {
				System.out.println("the string is a palindrome");
			} else {
				System.out.println("it was not a palindrome");
			}
			sc.close();
		}
	}
}
