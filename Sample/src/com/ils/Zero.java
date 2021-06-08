package com.ils;

import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		float a = sc.nextFloat();
		if (a > 0) {
			if (a > 1) {
				System.out.println("small positive");
			} else if (a > 100000) {
				System.out.println("large positive");
			} else {
				System.out.println("positive number");
			}
		}
		if (a < 0) {
			if (a < -10000) {
				System.out.println("small negative");
			} else if (a < -1) {
				System.out.println("large negative");
			} else {
				System.out.println("negative");

			}
		}
		sc.close();
	}
}
