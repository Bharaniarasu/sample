package com.ils;

import java.util.Scanner;

public class CompareIf {

	static int b = 36;
	static int c = 9;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		if (a > b) {
			if (a > c) {
				System.out.println("a is bigger");
			} else if (c > a) {
				System.out.println(" c is bigger");

			} else
				System.out.println("a and b is bigger");
		}
		if (b > a) {
			if (b > c) {
				System.out.println("b is bigger");
			} else if (c > b) {
				System.out.println("c is bigger");
			} else {
				System.out.println("b and c is bigger");
			}

		} else if (a == b) {
			System.out.println("a b are equal ");

		} else if (c == b) {
			System.out.println("b c equal");
		} else if (c == a) {
			System.out.println("a c equal");
			sc.close();
		}
	}
}
