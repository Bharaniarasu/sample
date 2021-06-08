package com.String;

public class RepeatNonRepeat {

	public static void main(String[] args) {
		String word="vanakkamv";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			boolean bool=false;
			for(int j=i+1;j<word.length();j++) {
				if(ch==word.charAt(j)) {
					bool=true;
					break;
				}
			}if(bool==false) {
				System.out.println(ch+"  not repeated");
				break;
			}
		}

	}

}
