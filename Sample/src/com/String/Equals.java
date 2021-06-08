package com.String;

public class Equals {

	public static void main(String[] args) {
		String s1 = new String("hello");//heap memory
		String s2 = s1+s1;//"hello";//"hello";//string constant pool
		s1 ="hellohello";
		//s2=new String("hai");
		if (s1 == s2) {
			System.out.println("s1==s2  //" + "s1 Hash "+s1.hashCode() + "  " +"s2 Hash  "+ s2.hashCode());
		} else {
			System.out.println("s1!=s2  //" + "s1 Hash "+s1.hashCode() + "  " +"s2 Hash  "+ s2.hashCode());
		
		}
		if (s1.equals(s2)) {
			System.out.println("equals // " +"s1 Hash  "+s1.hashCode() + "  " +"s2 Hash  "+s2.hashCode());
		} else {
			System.out.println("not equals  //"+"s1!=s2  " + "s1 Hash "+s1.hashCode() + "  " +"s2 Hash  "+ s2.hashCode());
		}
	}

}
