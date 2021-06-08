package com.String;

public class CountOfFirstChar {

	public static void main(String[] args) {
	String s1="thupparkku thuppaya thuppakki thupparkku thuppaya thoovum mazhai";
	char start=s1.charAt(0);
	int count=1;
	for(int i=1;i<=s1.length()-1;i++) {
		if(start==s1.charAt(i)) {
			count++;
		}
	}
System.out.println("char count of "+start+"   "+count);
	}

}
