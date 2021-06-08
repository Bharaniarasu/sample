package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListObj {

	public static void main(String[] args) {
		Bike b1 = new Bike(60000, 125, 55, "hero");
		Bike b2 = new Bike(60000, 125, 55, "bajaj");
		Bike b3 = new Bike(80000, 200, 35, "tvs");
		Bike b4 = new Bike(70000, 180, 58, "mahindra");
		Bike b5 = new Bike(30000, 100, 35, "ktm");
		ArrayList<Bike> bikeList = new ArrayList<Bike>();
		bikeList.add(b1);
		bikeList.add(b2);
		bikeList.add(b3);
		bikeList.add(b4);
		bikeList.add(b5);
		System.out.println(b1.hashCode());
		System.out.println("before");
		System.out.println(bikeList);
		ComparatorDemo cd=new ComparatorDemo();
		Collections.sort(bikeList,cd);
		System.out.println("after");
		System.out.println(bikeList);
	}

}
