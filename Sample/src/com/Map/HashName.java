package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.collection.ArrayListObj;
import com.collection.Bike;

public class HashName {

	public static void main(String[] args) {

		ArrayListObj alo = new ArrayListObj();
		Bike b1 = new Bike(60000, 125, 55, "hero");
		Bike b2 = new Bike(65000, 105, 45, "bajaj");
		Bike b3 = new Bike(80000, 200, 35, "tvs");
		Bike b4 = new Bike(70000, 180, 58, "mahindra");
		Bike b5 = new Bike(30000, 100, 35, "ktm");
		HashMap hm = new HashMap();
		hm.put(11, b1);
		hm.put(22, b2);
		hm.put(33, b3);
		hm.put(44, b4);
		hm.put(55, b5);
		System.out.println(hm);
		Set s = hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			//System.out.println(i.next());
			Map.Entry me=(Entry) i.next();
			//System.out.println(me.getValue());
			Bike bike=(Bike) me.getValue();	
			if(me.getKey().equals(33)){
				
			bike.price=33333;
			
		}
		}System.out.println(hm);

	}}


