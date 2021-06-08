/**
 * 
 */
package com.ils;

import java.util.Scanner;

/**
 * @author Bharni
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double obj = 3.14;
		double area;
		Scanner in = new Scanner(System.in);
		System.out.println("enter radius");
		int r1 = in.nextInt();
		area = 3.14 * r1 * r1;
		in.close();
		System.out.println("hello=" + area);

	}

}
