/**
 * 
 */
package com.ils;

/**
 * @author Bharni
 *
 */
public class CharArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr = "hello";
		char val[] = arr.toCharArray();// to convert a string to charecters
		for (int i = 0; i < arr.length(); i++) {
			char a = val[i];

			// val[i]=a;
			System.out.println(a);
		}
		// for(int c=0;c<arr.length();c++) {

	}
}
