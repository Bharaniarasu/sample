package com.ils;

public class LoopFor {
	public static void main(String args[]) {
		int row;
		int col;

		/*
		 * for(row=3;row>=1;row--) { for(col=3;col>=row;col--) {
		 * System.out.print("   "+col); } System.out.println(" " );
		 */
		for (row = 1; row <= 3; row++) {
			for (col = 1; col <= row; col--) {
				{
					System.out.print("   ");
				}
				/*
				 * for(int row = 3;row<col;row--) { System.out.print(col);
				 */
			}
		}
		System.out.println(" ");
	}
}