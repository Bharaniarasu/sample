package com.ils;

public class D1 {
	String output = "";

	public String doDecode() {
		E1 deCode = new E1();
		String input = E1.a;
		for (int i = 0; i < input.length(); i++) {

			char in = input.charAt(i);
			int number = in;
			int num = number - 8;
			char ch = (char) num;
			output = output + ch;

		}

		return output;

	}
}
