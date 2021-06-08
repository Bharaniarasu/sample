package com.String;

import java.util.Arrays;

public class ToUpperLower {

	public static void main(String[] args) {
		String st1 = "uppercase";
		char[] ch = st1.toCharArray();
		for (int i = 0; i <= ch.length; i++) {
			if (i % 2 == 0) {
				if (ch[i] >= 'a' || ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				}
			}
			st1 = new String(ch);
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(st1);
for(int i=0;i<=st1.length()-1;i++) {
	
if(i%2==0) {
		System.out.print(st1.substring(i,i+1).toUpperCase());
	}
else{
	System.out.print(st1.substring(i,i+1).toLowerCase());}
		}

	}
}
