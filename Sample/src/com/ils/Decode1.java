package com.ils;

public class Decode1 extends Encode {
	int dec;
	String a = "";
	// Encode1 en1 = new Encode1();
	String input1 = Encode1.input;

	String DoDeCode() {

		int dec = Integer.parseInt(input1, 2);
		int decplus = dec + 11;
		System.out.println("Decoded value of the binary -->" + decplus);
		int dec1 = dec;
		char st1 = (char) (dec1);
		// System.out.println("Decoded char value=======>" + st1);
		int dec2 = dec + 8;
		char st = (char) (dec2);
		System.out.println("decoded output of the given input--->" + st);
		String str = String.valueOf(st);

		a = a + str;

		return a;

	}

}
