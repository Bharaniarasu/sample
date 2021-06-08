package com.ils;

import java.util.Scanner;

public class Roots {
	public static void main(String[] atgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a'..................");
		Double a = sc.nextDouble();
		System.out.println("enter the value of b'..................");
		Double b = sc.nextDouble();
		System.out.println("enter the value of c'..................");
		Double c = sc.nextDouble();
		double result = b * b - (4 * a * c);
		if (result > 0) {
			double r1 = (-b + java.lang.Math.pow(result, 0.5)) / (2 * a);
			double r2 = (-b + java.lang.Math.pow(result, 0.5) / (2 * a));
			System.out.println("the roots are  =..." + r1 + "                 " + r2);
		} else if (result == 0) {
			double r3 = -b / (2 * a);
			System.out.println("value of the roots are==" + r3);
		} else {
			System.out.println("rooots are invalid");
		}
	}

}
