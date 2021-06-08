package com.ils;

import java.util.Scanner;

public class SumOfN {
	static int i;
	static int sum = 0;
	static double avereage;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of N");
		int n = sc.nextInt();
		for (i = 1; i < n; i++) {
			sum = sum + i;
			avereage = sum / n;
		}
		System.out.println("sum........." + sum);
		System.out.println("avereage........." + avereage);
		sc.close();
	}

}
