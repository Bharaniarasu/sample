package com.collection;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Bike b1 = (Bike) o1;
		Bike b2 = (Bike) o2;
		if (b1.cc > b2.cc) {
			return +1;
		} else if (b1.cc < b2.cc) {
			return -1;
		} else {
			if (b1.price > b2.price) {
				return -1;
			} else if (b1.price < b2.price) {
				return 1;
			} else {
				if (b1.mileage > b2.mileage) {
					return 1;

				} else if (b1.mileage < b2.mileage) {
					return -1;
				} else {

				}
			}
			return 0;
		}
	}

}
