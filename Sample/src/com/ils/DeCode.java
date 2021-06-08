package com.ils;

public class DeCode {
	int DoDeCode() {
		Encode en = new Encode();
		String bin = en.input;

		int dec = Integer.parseInt(bin, 2);
		System.out.println("-->" + dec);

		char st = (char) dec;
		System.out.println("____" + st);
		return st;

	}
}
