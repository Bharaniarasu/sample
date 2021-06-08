package com.ils;

import java.util.Scanner;

public class StringAscending {
	public static void main(String[] args) {
		StringAscending sa = new StringAscending();
		sa.getInput();

	}

	public String getInput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter Number of Students........");
		String st = sc.next();
		return st;

	}
}