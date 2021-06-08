package com.ils;

import java.util.Scanner;

public class Encode {
public static final String input = null;
	//String a="";
	static char n;
	static int num;

	// public static void main(String args[]) {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encode e2 = new Encode();
		e2.getInput();

//System.out.println("......."+e2.a);
	}

	int getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");

		String ch = sc.next();
		for (int i = 0; i < ch.length(); i++) {
			n = ch.charAt(i);

			num = n;

			Encode1 e3 = new Encode1();
			e3.DoEnCode();

		}
		sc.close();
		Decode1 de1 = new Decode1();
		System.out.print("......" + de1.a);
		// return n;
		return num;
	}
	/*
	 * Encode1 en1=new Encode1(); en1.doEncode();
	 * 
	 * 
	 * return n; //return input(); }
	 */

}
