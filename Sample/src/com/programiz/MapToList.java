package com.programiz;

import java.util.ArrayList;
import java.util.HashMap;

public class MapToList {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(123, "value");
		hm.put(124, "value1");
		hm.put(125, "value2");
		hm.put(126, "value3");
		hm.put(127, "value4");
		hm.put(128, "value5");
		hm.put(129, "value6");
		ArrayList list1=new ArrayList(hm.entrySet());
		ArrayList list2=new ArrayList(hm.values());
		System.out.println(list1);
		System.out.println(list2);
	}

}
