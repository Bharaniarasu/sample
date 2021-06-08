package com.ils;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		Scanner New = new Scanner(System.in);
		int a = New.nextInt();
		for (int b = 1; b <= 10; b++) {
			System.out.println(a + "X" + b + "=" + (a * b));
		}

		New.close();
	}

}
