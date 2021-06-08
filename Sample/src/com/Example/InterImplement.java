package com.Example;

import java.util.Comparator;

public class InterImplement implements FourWheeler,Comparator {

	@Override
	public void doCall() {
System.out.println("over ridden");
	}

	@Override
	public void doCopy() {
		System.out.println("over ridden");
	}

	@Override
	public void doRun() {
		System.out.println("over ridden");
	}

	@Override
	public int doResult() {
		System.out.println("over ridden");
		return 0;
	}

	public static void main(String[] args) {
		InterImplement inter=new InterImplement();
		System.out.println(inter.car);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
