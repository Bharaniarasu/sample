/**
 * 
 */
package com.ils;

import java.util.Scanner;

/**
 * @author Bharni
 *
 */
public class RuntimeMultiply {
	// int a,b;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mul = new Scanner(System.in);
		System.out.print("enter a = ");
		double a = mul.nextDouble();
		System.out.print("2nd value = ");
		int b = mul.nextInt();
		double c = a * b;
		System.out.print("multiply =" + c);
		mul.close();

	}

}
