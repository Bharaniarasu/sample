package com.ils;

public class BiggerNum {
	static int a = 241;
	static int b = 34;
	static int c = 55;

	public static void main(String[] args) {
		if (a > c)
			if (a > b) {
				// TODO Auto-generated method stub
				System.out.println("a   " + a + "............is bigger.........");
			}
		if (b > a)
			if (b > c) {
				System.out.println("b is bigger" + b);
			}
		if (c > a)
			if (c > b) {
				System.out.println("c is greater" + c);
			}
	}
}
