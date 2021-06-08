package com.ils;

import java.util.Scanner;

public class Ascend {

	public static void main(String[] args) {
		// Create Object for Scanner class to get input from keyword
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of element count: ");
		// Set array size
		int Value = sc.nextInt();

		// Get input from keyword
		System.out.print("Enter array values\n");
		int[] arr = new int[Value];

		// Get all input from keyword
		for (int i = 0; i < Value; i++) {
			arr[i] = sc.nextInt();
		}

		// Validate the element for ascending sort order
		for (int m = 0; m < arr.length; m++) {
			for (int n = m + 1; n < arr.length; n++) {
				if (arr[m] > arr[n]) {
					int temp = arr[m];
					arr[m] = arr[n];
					arr[n] = temp;
				}
			}
		}

		// Display the sorted order
		System.out.print("Sorted order are: \n");
		for (int t : arr) {
			System.out.println(t);
		}
		sc.close();
	}
}