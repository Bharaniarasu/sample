package com.ils;

public class AscendingNum {

	/*
	 * static int a=7; static int b=5; static int c=23;
	 */
	public static void main(String[] args) {

		// Scanner sc=new Scanner(System.in);
		int[] arr = { 12, 23, 34, 45 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; i < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					{
						for (int t : arr) {
							System.out.println(t);

						}

					}

				}
			}
		}
	}
}
