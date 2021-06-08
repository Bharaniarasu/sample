package com.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {

		// System.out.println(" TreeSet "+ts);

		//Bike bike1 = new Bike(232323, 123, 456, "ducati");
		LinkedList<Object> hs = new LinkedList<Object>();
		hs.add(9);
		hs.add(23);
		hs.add(8);
		hs.add(1);
		hs.add(12);
		hs.add(23);
		hs.add(2);
		hs.add(41);
		hs.add(54);
		Comp cd = new Comp();
		//Collections.sort(hs, cd);
		;
		System.out.println("before " + hs);
		TreeSet<Object> TSet = new TreeSet<Object>(hs);
		TreeSet<Object> TSet1 = (TreeSet<Object>) TSet.descendingSet();
		System.out.println(TSet);
		System.out.println(TSet1);

	}
}
