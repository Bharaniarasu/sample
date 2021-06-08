package com.ils;

import java.util.Scanner;

public class Average {
	public static void main(String args[]) {
		int count = 1;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int value = sc.nextInt();
		while (count < value) {
			System.out.println("enter count" + count);
			int c = sc.nextInt();
			sum = sum + c;
			++count;

		}
		double average = sum / value;
		System.out.println("the average is   =" + average);
		sc.close();
	}
}
