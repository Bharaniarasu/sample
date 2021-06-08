package com.ils;

import java.util.Scanner;

public class Looping {
	static int count = 0;
	static int total = 0;

	public static void main(String args) {

		while (count < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter marks");
			int mark = sc.nextInt();
			// int mark=34;
			total = total + mark;
			count = count + 1;
			sc.close();
		}
		System.out.println(total);
	}

}
