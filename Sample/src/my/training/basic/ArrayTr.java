package my.training.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayTr at=new ArrayTr( value); ArrayTr at1=new ArrayTr(); ArrayTr [] obj=
		 * {at,at1}; System.out.println(obj);
		 */
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter value");
			int val = sc.nextInt();

			total = total + val;
			arr[i] = total;
			// arr=total.charAt(i);

		}
		System.out.println(Arrays.toString(arr));
	}

}
