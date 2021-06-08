/**
 * 
 */
package com.ils;

import java.util.Scanner;

/**
 * @author Bharni
 *
 */
public class RuntimeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.print("enter name = ");
		String c = str.next();
		System.out.print("enter name 2 =  " + c);
		String name = str.next();
		System.out.println(c + name);
		// TODO Auto-generated method stub
		str.close();
	}

}
