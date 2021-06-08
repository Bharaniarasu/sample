package com.programiz;

public class ArrayContainsValue {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9};
		int toFind=4;
		boolean val=false;
		for(int a:arr) {
			if(a==toFind) {
				val=true;
			
		}
		}
if(val==true) {
	System.out.println("value is here");
}else {
	System.out.println("value not find");
}
	}

}
