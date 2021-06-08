package com.programiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ArrayToSet {

	public static void main(String[] args) {
int []arr= {1,2,3,4,56,67,78,89,657};
String []name= {"hai","hello","vanakkam"};
ArrayList al=new ArrayList(Arrays.asList(name));
TreeSet ts=new TreeSet(al);
System.out.println("list  "+al);
System.out.println("set  "+ts);
	}

}
