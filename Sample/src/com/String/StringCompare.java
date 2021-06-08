package com.String;

import java.util.Arrays;

public class StringCompare {

	public static void main(String[] args) {
		String s1="hello welcome";
		System.out.println(s1.matches("\\w{5} \\w{7}"));
		System.out.println(s1.replace("ll", "xx"));
		System.out.println(s1.replaceAll("\\s", "_"));
		System.out.println(s1.replaceFirst(" ", "*"));
		String[] s2=s1.split(" ",1);
		System.out.println(Arrays.toString(s2));
		System.out.println(s1.join("//", "23","12","2012"));
		int a=344;
		String b=String.valueOf(a);
		System.out.println(b+12);
		System.out.println(s1.contains("llo"));
	}

}
