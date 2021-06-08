package com.ils;

public class E1D1 {

	public static void main(String[] args) {

		E1 encode = new E1();
		encode.getInput();

		System.out.println("the Encoded output for the Input is -----  " + encode.a);
		D1 decode = new D1();
		decode.doDecode();
		System.out.println("the decoded output is  ----  " + decode.output);
	}

}
