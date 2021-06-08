package com.String;

public class Reverse {

	public static void main(String[] args) {
		StringBuffer st1=new StringBuffer("welcome");
		System.out.println(st1.reverse());
		String st2="welew";String st3="";
		for(int i=st2.length()-1;i>=0;i--) {
			st3+=st2.charAt(i);
			
		}System.out.println(st3);
if(st2.equals(st3)) {
	System.out.println("palindrome");
}else {
	System.out.println("not palindrome");
}
	}

}
