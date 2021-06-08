package com.ils;

public class ConstructorOverload {// class and constructor names are same
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverload co = new ConstructorOverload("bharani", 8198997, "namakkal");// called the constructor which
																							// has the same parameter
																							// values
		ConstructorOverload co1 = new ConstructorOverload("hai", 12);
		ConstructorOverload co2 = new ConstructorOverload(23, 12);
		System.out.println("value  " + co.name1);

	}
	String name1;// to create variables for constructor overloading
	int dob1;

	String place1;

	public ConstructorOverload(int a, int b) {// called automatically when object is created
		int n = a;
		int m = b;

		System.out.println(a + b);
	}

	private ConstructorOverload(String a, int b) {

		System.out.println(a + b);
	}

	public ConstructorOverload(String string, int i, String string2) {// string refers Bharani and i refers dob in main
																		// method
		name1 = string;// string name assigned to name1
		dob1 = i;
		place1 = string2;
		System.out.println("Empty");// doesnot have return value
	}

}
