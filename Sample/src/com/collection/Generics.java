package com.collection;

import java.util.HashMap;

public class Generics {

	public static void main(String[] args) {
		String data="ammaappa";
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		char []ch=data.toCharArray();
		for(char c:ch) {
			if(hm.containsKey(c)) {
				System.out.println(hm.get(c));
				hm.put(c, hm.get(c)+1);
				
			}else {
				hm.put(c, 1);
			}
		}System.out.println(hm);

	}

}
