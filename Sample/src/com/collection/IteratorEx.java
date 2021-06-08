package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<Object> names = new ArrayList<Object>();
		Bike bike1=new Bike(12334, 344, 23,"bmw");
		Bike bike2=new Bike(12334, 344, 23,"bmw");
		names.add("hello");
		names.add("welcome");
		names.add("all");
		names.add("of");
		names.add("you");
		names.add(6);
		names.add(bike1);
		names.add(bike2);
		ListIterator lit=names.listIterator();
		while(lit.hasNext()) {
			if(lit.next().equals(bike2)) {
				lit.set("same object");
			}
		}System.out.println(names);
	}

}
