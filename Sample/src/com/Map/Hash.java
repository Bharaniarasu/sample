package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hash {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("hsteve",12);
		hm.put("kstark",34);
		hm.put("fbruce",45);
		hm.put("bourne",102);
		hm.put("astark",19);
		System.out.println(hm.containsValue("bruc"));
		System.out.println("hm  "+hm);
		//System.out.println(hm);
		Set s=hm.keySet();	
		//System.out.println("keys are  "+s);
		Collection v=hm.values();
		//System.out.println("values are  "+v);
		Set es=hm.entrySet();
		//System.out.println("entries are  "+es);
		Iterator i=es.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Entry) i.next();
			if(me.getKey().equals(101)) {
				me.setValue("renamed");
				//System.out.println("key   "+me.getValue());
			}
		
		}	System.out.println(hm);
	TreeMap tm=new TreeMap();
	tm.putAll(hm);
	System.out.println("tm  "+tm);
	System.out.println(tm.firstEntry());
	}

}
