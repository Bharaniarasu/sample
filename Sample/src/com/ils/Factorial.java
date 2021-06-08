package com.ils;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("the factorial number is =" + fact);
		sc.close();
	}

}
