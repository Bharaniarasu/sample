/**
 * 
 */
package com.ils;

import java.util.Scanner;

/**
 * @author Bharni
 *
 */
public class Addition {
	static double c;
	static double t = 12;
	static final int d = 12;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a value");
		int a = obj.nextInt();
		Addition add = new Addition();

		add.a = (double) 20;
		c = 12;
		add.doAdd();
		System.out.println("value of add" + c);
		obj.close();
		// TODO Auto-generated method stub

	}
	Double a = 234.98;

	Double b = 4.2;

	private Double doAdd() {
		// int f=12;
//	int g;

		System.out.println(c = (a + b));
		return c;
	}

}
