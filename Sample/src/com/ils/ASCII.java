package com.ils;

import java.util.Scanner;

public class ASCII {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");

		char ch = sc.next().charAt(0);
		int num = ch;
		System.out.println("The ASCII value of the given  number is ................." + num);
		sc.close();
	}

}
