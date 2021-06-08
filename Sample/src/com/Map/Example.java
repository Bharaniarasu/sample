package com.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.WeakHashMap;

public class Example {

	public static void main(String[] args) {
		String  val="data";
		String val1="dataNew";
		WeakHashMap hm=new WeakHashMap();
		hm.put(val, 10);
		hm.put(val1, 120);
		val=null;
		Hashtable ht=new Hashtable();
		ht.put(12, "value");
		ht.put(123, "value");
		ht.put(1, "value");
		ht.put(1234, "value");
		
		System.out.println(ht);
	}

}
