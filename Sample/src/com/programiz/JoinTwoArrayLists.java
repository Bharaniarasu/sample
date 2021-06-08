package com.programiz;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class JoinTwoArrayLists {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add("123");
		list1.add("hello");
		ArrayList list2=new ArrayList();
		list2.add("456");
		list2.add("vanakkam");
		ArrayList add=new ArrayList();
		add.addAll(list1);
		add.addAll(list2);
		
		System.out.println(add);
		String []arr=new String[add.size()];
		add.toArray(arr);
		for(String st:arr) {
			System.out.println(st);
			
		}
		//System.out.println(System.getProperty("user.dir"));// tovie the location

	}

}
