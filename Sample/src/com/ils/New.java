
/**
 * 
 */
package com.ils;

import java.util.Scanner;

/**
 * @author Bharni
 *
 */
public class New {
	public static void main(String[] args) {
		New value = new New();
		// value.doAdd();
		System.out.println("\n" + value.doAdd());
		value.doAdd();
		value.domul();
		value.dosub();
		value.dodiv();
		System.out.println();
	}
	Scanner sc = new Scanner(System.in);
	// System.out.println("enter value of a ===");
	int a = sc.nextInt();

	// System.out.println("enter value of b ===");
	int b = sc.nextInt();

	/*
	 * int a=100; int b=10;
	 */
	public double doAdd() {
		int c = a + b;
		System.out.println("add    " + c);
		return c;
	}

	protected void dodiv() {
		int n = a / b;
		System.out.println("div     " + n);
	}

	public int domul() {
		int m = a * b;
		System.out.println("mul      " + m);
		return m;

	}

	private int dosub() {
		int g = a - b;
		System.out.println("sub        " + g);
		return g;

	}

}
