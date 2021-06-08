package com.String;

public class Buffer {

	public static void main(String[] args) {
		String []names= {"hai","hello","vanakkam"};
		StringBuilder sb=new StringBuilder("hello");
		String data="";
		sb.insert(2, "zzz");
		System.out.println(sb);
		sb.replace(2, 5, "yyy");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.deleteCharAt(2));
		/*for(String st:names) {
			sb.append(st);	
			data=data+st;
			System.out.println("data "+data);
			System.out.println("data Hash  "+data.hashCode());
		System.out.println("sb  "+sb);
		System.out.println("sb Hash "+sb.hashCode());
	}*/

	} 

}
