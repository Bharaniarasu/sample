package com.ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		ThrowKeyword th = new ThrowKeyword();
		try {
			th.doCall(5, 0);
		} catch (NullPointerException npe) {
			System.out.println("called second time");
		}

	}

	private void doCall(int a, int b) {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException npe) {
			System.out.println("caught");
			throw npe;
		}

	}

}
