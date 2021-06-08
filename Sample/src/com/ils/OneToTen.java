package com.ils;

public class OneToTen {
	public static void main(String[] args) {
		for (int count = 2, lc = 1; count < 200; count += 2, lc++) {
			System.out.print("  " + count);
			if (lc % 8 == 0) {
				System.out.println("   ");
			}
		}
	}
}