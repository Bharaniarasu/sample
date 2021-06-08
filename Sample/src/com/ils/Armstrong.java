package com.ils;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, a, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input number");
		int n = sc.nextInt();

		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);

		}
		if (temp == c) {
			System.out.println("the input was an amstrong number");
		} else {
			System.out.println("the input was not an amstrong number");
		}
	}

}
