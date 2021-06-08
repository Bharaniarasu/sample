/**
 * 
 */
package com.ils;

import java.util.Scanner;

public class Vowels {
	static int count;

	public static void main(String args[]) {
		Scanner value = new Scanner(System.in);
		System.out.println("enter value of a");

		String str = value.next();
		value.close();
		// String str = new String("Hi Welcome ");
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
				count++;
			System.out.println("Given string contains " + a);
			System.out.println(count);
		}
	}

}