package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicate {
	String word = "hai my first lang is tamil";
	String sentence = "tamil is my mother tounge i love tamil tamil is the oldest lang";

	public static void main(String[] args) {
		CountDuplicate count = new CountDuplicate();
		count.countChar();// to count chars in a string
		count.countWord();// to count words in a sentence
	}

	private void countWord() {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] st = sentence.split(" ");
		for (String s : st) {
			if (hm.containsKey(s)) {
				hm.put(s, hm.get(s) + 1);
			} else {
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
		Set<Entry<String, Integer>> me = hm.entrySet();
		for (Map.Entry<String, Integer> m : me) {
			if (m.getValue() > 1) {
				System.out.println(m);
			}
		}
	}

	private void countChar() {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] ch = word.toCharArray();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		Set<Map.Entry<Character, Integer>> se = hm.entrySet();
		for (Map.Entry<Character, Integer> en : se) {
			if (en.getValue() > 1) {
				System.out.println(en);
			}
		}
	}

}
