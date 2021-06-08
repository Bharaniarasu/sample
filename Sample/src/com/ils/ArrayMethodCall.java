package com.ils;

public class ArrayMethodCall {

	public static void main(String ar[]) {
		ArrayMethodCall amc = new ArrayMethodCall();
		String c = amc.doAdd("hai", "hello");
		System.out.println(c);
	}

	public String doAdd(String a, String b) {
		String c = a + b;
		System.out.println(c);
		return c;
	}
}
