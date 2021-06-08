package com.ils;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of count");
		int count = sc.nextInt();
//int count=8;
		System.out.println("the fibonacci series are.........!");
		for (int i = 2; i < count; i++) {
			int n3 = n2 + n1;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}
		sc.close();
	}

}
