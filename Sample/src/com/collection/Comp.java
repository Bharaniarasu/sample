package com.collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Comp {
	public static void main(String[] org) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		// String value=sc.next();
		ArrayList al = new ArrayList();

		while (true) {
			String i = sc.next();
			String data="no";
			if (i.equals(data)) {
				break;
			} else {
				int j=Integer.parseInt(i);
				al.add(j);
			}
			
		}System.out.println("before  "+al);
		TreeSet ts=new TreeSet(al);
		System.out.println(ts);

	}
}
