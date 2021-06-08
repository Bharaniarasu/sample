package com.ils;

import java.util.Scanner;

public class E1 {

	static String a = "";
	String[] input = new String[10];
	int num;
	int num1;

	String[] getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		String ch = sc.next();
		char[] ar = new char[ch.length()];
		for (int i = 0; i < ch.length(); i++) {
			char n = ch.charAt(i);
			num = n;
			String input = Integer.toBinaryString(num);
			// System.out.print("binary code is ---> " + input);
			int dec2 = num + 8;
			char st = (char) (dec2);
			// System.out.println("st "+st);
			String str = String.valueOf(st);
			a = a + str;
		}
		sc.close();
		return input;
	}
}
