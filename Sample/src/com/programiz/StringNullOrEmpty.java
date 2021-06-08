package com.programiz;

public class StringNullOrEmpty {

	public static void main(String[] args) {
		String str=null;
		String str1="";
		String str2=" ";
		System.out.println(str +checkString(str));
		System.out.println(str1+checkString(str1));
		System.out.println(str2+checkString(str2));
 
	}

	private static String checkString(String str) {
	if(str==null) {
		return null;
	}else if(str.trim().isEmpty()) {
		return "empty";
	}else {
		return " may be contains value" ;
	}
	
	}

}
