package com.String;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String word = sc.next().toLowerCase();
		int count = 0;
		boolean bool=true;
		for (int i = 0; i <= word.length() - 1; i++) {
			char value = word.charAt(i);
			switch (value) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			default:
				bool=false;
				break;

			}

		}
		if(count==0) {
			System.out.println("vowels null");
		}
		System.out.println(count);
	}

}
