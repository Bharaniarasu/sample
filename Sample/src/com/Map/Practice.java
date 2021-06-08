package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		LinkedHashMap hm = new LinkedHashMap();
		hm.put("idli", 20);
		hm.put("dosai", 20);
		hm.put("vadai", 5);
		hm.put("briyani", 50);
		HashMap hmNew = new HashMap();
		hmNew.putAll(hm);

		System.out.println(hmNew);
		System.out.println(hm.get("vadai"));
		System.out.println(hm.containsKey("dosai"));
		System.out.println(hm.containsValue(20));
		System.out.println(hm.remove("vadai", 5));
		System.out.println(hm.size());
		// hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		Set s = hm.entrySet();
		System.out.println(s);
		Set key = hm.keySet();
		System.out.println(key);
		
		System.out.println(hm.values()  );
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(Object s1:s) {
			Map.Entry m=(Map.Entry) s1;
			//System.out.println(m);
			if(m.getValue().equals(20)) {
			System.out.println(" key   "+((Map.Entry) s1).getKey());
			m.setValue(2345);
			//System.out.println("value   "+m.getValue());
			
		}}System.out.println(hm);

	}

}
