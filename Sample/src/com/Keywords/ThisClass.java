package com.Keywords;

public class ThisClass {
	String name;
	int age;

	void doCopy(String name, int age) {
		this.name = name;
		this.age = age;

	}

	void doPrint() {
		System.out.println("Name is  =  " + name + "  \n" + "Age is  =  " + age);
	}

	ThisClass(String name, int age) {
		this();// must on 1st line into a constructor only
		this.name = name;
		this.age = age;
		System.out.println("Name is  =  " + name + "  \n" + "Age is  =  " + age);
	}

	ThisClass() {
		System.out.println("Name is  =  " + name + "  \n" + "Age is  =  " + age);
	}

}
