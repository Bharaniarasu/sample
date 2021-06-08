package com.ils;

public class Encode1 extends Encode {
	static String input;
	static int num1 = Encode.num;
	char val = Encode.n;

	String DoEnCode() {
		// Encode en = new Encode();

		System.out.println("The ASCII value of the given  char    " + val + "   is ................." + num);
		input = Integer.toBinaryString(num);
		System.out.println("binary  ---> " + input);

		Decode1 d3 = new Decode1();
		d3.DoDeCode();
		return input;

	}
}
