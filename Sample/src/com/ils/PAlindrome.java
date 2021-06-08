package com.ils;

import java.util.Scanner;

public class PAlindrome {

	public static void main(String[] args) {
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int temp = num;
		while (num > 0) {
			sum = (sum * 10) + num % 10;
			num = num / 10;

		}
		System.out.println("reverse value is  " + sum);
		if (temp == sum) {
			System.out.println("the given number is a palindrome");

		} else {
			System.out.println("the given number was not a palindrome");
		}

		sc.close();
	}

}
