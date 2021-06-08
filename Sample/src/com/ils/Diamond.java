package com.ils;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 1; row <= 3; row++) {
			for (int t1 = 2; t1 >= row; t1--) {
				System.out.print("   ");

			}
			for (int t2 = 1; t2 <= row; t2++) {
				System.out.print("  " + t2);

			}
			for (int t3 = 1; t3 < row; t3++) {
				System.out.print("  " + t3);

			}

			for (int j = 1; j < row; j++) {
				for (int row1 = 3; row1 >= 1; row1--) {

					for (int t5 = 2; t5 >= row1; t5--) {
						System.out.print("  ");
					}
					for (int t4 = 1; t4 <= row1; t4++) {
						System.out.print(" " + t4);

					}

					for (int t6 = 1; t6 < row1; t6++) {
						System.out.print(" " + t6);
					}
					System.out.println();
				}

			}
		}
	}
}
