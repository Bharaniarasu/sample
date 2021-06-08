package com.ExceptionHandling;

import java.util.Scanner;

public class ThrowsKeyword {
	int doAdd() throws ArithmeticException,ArrayIndexOutOfBoundsException{
		Scanner sc = new Scanner(System.in);
		int a = 54;
		System.out.println("enter B value");
		int b = sc.nextInt();
		
			int c = a / b;
			
				if (b == 1) {
					b = b - 1;
					c = a / b;
				}
				if (b == 2) {
					int arr[] = { 1, 2, 3, 4, 5 };
					arr[9] = 2;
				
				}
				return c;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
