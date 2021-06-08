package com.ils;

import java.util.Scanner;

public class FrenToCel {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fahrenheit value:..........");
		double frenheit = sc.nextFloat();
		double Celsius = frenheit - 32 * (0.5556);
		System.out.println("celsius is....=" + Celsius + "celsius");
		sc.close();
	}

}
