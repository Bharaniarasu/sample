package com.collection;

public class Bike {
	public int price;
	int cc;
	int mileage;
	String company;
	public String toString() {
		return " "+cc+" "+mileage+" "+price+" "+company;
	}

	public Bike(int i, int j, int k, String string) {
		this.price = i;
		this.cc = j;
		this.mileage = k;
		this.company = string;

	}

	public static void main(String[] args) {
	}

}
