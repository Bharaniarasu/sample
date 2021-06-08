package com.Keywords;

public class Super1 extends SuperClass {
	String name = "Tony Stark";

	void doPrint() {

		System.out.println(name);
		System.out.println(super.name);

	}

	Super1() {
		super();// default one
		System.out.println(name);
	}
	/*
	 * void doCom1() { System.out.println("i am child class"); }
	 */
}
