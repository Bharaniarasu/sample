package com.ExceptionHandling;

public class UserThrows {
	

	public static void main(String[] args) {
		ThrowsKeyword th=new ThrowsKeyword();
		try{th.doAdd();
	
		}catch(ArithmeticException ae) {
			System.out.println("arithmetic exception");
		}catch(ArrayIndexOutOfBoundsException arrOut) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		}

}
