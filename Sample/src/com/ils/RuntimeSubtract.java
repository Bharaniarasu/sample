/**
 * 
 */
package com.ils;

import java.util.Scanner;

/**
 * @author Bharni
 *
 */
public class RuntimeSubtract {

	/**
	 * @param args
	 */// static int a;
		// static int b;

	public static void main(String[] args) {
		Scanner sub = new Scanner(System.in);
		System.out.println("enter value of a");
		Double a = sub.nextDouble();
		System.out.println("enter value of b =");
		Double b = sub.nextDouble();
		double c = a - b;
		System.out.println("subtraction of values" + c);
		// TODO Auto-generated method stub
		sub.close();
	}

}
