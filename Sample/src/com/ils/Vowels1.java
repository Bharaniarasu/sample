package com.ils;

import java.util.Scanner;

public class Vowels1 {
	public static void main(String[] arg) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		s = sc.nextLine();
		System.out.println("Vowels in a string '" + s + "' are :");
		vowels(s);
		sc.close();
	}

	static void vowels(String str) {
		char ch;
		int i = 0;
		for (int j = 0; j < str.length(); j++) {
			ch = str.charAt(j);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				i = 1;
				System.out.println("----->" + ch);
			}
		}
		if (i == 0)
			System.out.println("There are no vowels in a entered string");

	}
}