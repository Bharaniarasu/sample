package in.org.bharani.sample;

import java.util.Scanner;

public class EncodeNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncodeNew e2 = new EncodeNew();
		e2.getInput();
		System.out.println();

	}
	String input;
	int num;
	int num1;

	String a = "";
	// public static void main(String args[]) {

	int getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");

		String ch = sc.next();
		char[] ar = new char[ch.length()];
		for (int i = 0; i < ch.length(); i++) {
			char n = ch.charAt(i);
			num1 = n;
			num = n - 33;

			// System.out.println("Encoded ASCII value of the given char " + n + " is
			// ................." + num1);
			input = Integer.toBinaryString(num);
			// System.out.println("binary code is ---> " + input);

			int dec = Integer.parseInt(input, 2);
			// System.out.println("Decoded value of the binary -->" + dec);
			int dec1 = dec + 33;
			char st1 = (char) (dec1);
			// System.out.println("Decoded char value=======>" + st1);
			int dec2 = dec + 8;
			char st = (char) (dec2);
			// System.out.println("decoded output of th given input--->" + st);
			String str = String.valueOf(st);

			a = a + str;

			// ar[i]=str;
		}
		System.out.println(a);
		sc.close();

		/*
		 * Encode1 en1=new Encode1(); en1.doEncode();
		 */
		return num;
		// return input();
	}

}
