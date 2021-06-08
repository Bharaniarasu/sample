package com.ils;

import java.util.Scanner;

public class CommonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter count for array");
		int count = sc.nextInt();

		int arr1[] = new int[count];
		System.out.println("enter first array");
		for (int i = 0; i < count; i++) {

			arr1[i] = sc.nextInt();
		}
		int arr2[] = new int[count];
		System.out.println("enter second array");
		for (int j = 0; j < count; j++) {

			arr2[j] = sc.nextInt();
		}
		// int[]arr1= {12,34,56,78,30};
		// int arr2[]= {13,44,34,77,30};
		// System.out.println("enter 2nd array");
		// int[] arr2=new int[5];
		for (int i = 0; i <= arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i] + "  ");

				}
			}
		}
		sc.close();
	}

}
