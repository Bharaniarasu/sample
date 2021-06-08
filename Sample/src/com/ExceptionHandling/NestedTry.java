package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 54;
		System.out.println("enter B value");
	
		try {
			int b = sc.nextInt();
			int c = a / b;
			try {
				if (b == 1) {
					b = b - 1;
					c = a / b;
				}
				if (b == 2) {
					int arr[] = { 1, 2, 3, 4, 5 };
					arr[9] = 2;
				}

			} catch (ArrayIndexOutOfBoundsException arrout) {
				System.out.println("array out of bound");
			}
		} catch (ArithmeticException ame) {
			System.out.println("i am outer catch");
		}catch(InputMismatchException imm) {
			System.out.println("input must be a int value");
		}
	}

}
