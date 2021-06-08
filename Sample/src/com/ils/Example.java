/**
 * 
 */
package com.ils;

import java.util.Scanner;

/**
 * @author Bharni
 *
 */
public class Example {

	/**
	 * @param args
	 */
//	static int a=3;
//	static  int b=6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value = new Scanner(System.in);
		System.out.println("enter value of a");

		int a = value.nextInt();
		System.out.println("enter value of b");
		int b = value.nextInt();
		int c = a + b;
		System.out.println("addition is = " + c);
		value.close();

		;
	}

}
