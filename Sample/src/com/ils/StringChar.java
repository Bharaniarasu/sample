/**
 * 
 */
package com.ils;

import java.util.*;

/**
 * @author Bharni
 *
 */
public class StringChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a= "Hellooo";
		Scanner arr=new Scanner(System.in);		
		System.out.println("enter the input=");
		String a=arr.next();	/*
		char[] ch=new char[a.length()];
		
		for(int i=0;i<a.length();i++) {
			ch[i]=a.charAt(i);	
			}*/
		
		char[] b=a.toCharArray();
			for(char c:b) {
			//char[] vall  =a.toCharArray();
			
			StringChar d=new StringChar();	
			if ( c=='a') {
					
				
			System.out.println(c);arr.close();
				}
	}}
}
