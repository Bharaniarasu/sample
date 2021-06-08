package my.training.basic;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element value for the array");
		int input = sc.nextInt();
		int mark[] = new int[input];
		System.out.println("enter the array values");
		for (int x = 0; x < input; x++) {
			mark[x] = sc.nextInt();
		}
		System.out.println("before");
		for (int i = 0; i <= mark.length - 1; i++) {

			System.out.print("  " + mark[i]);
		}
		int m = 0, n = mark.length - 1;
		while (m <= n) {
			int temp = mark[m];
			mark[m] = mark[n];
			mark[n] = temp;
			m++;
			n--;
		}
		System.out.println("   \nafter ");
		for (int k = 0; k <= mark.length - 1; k++) {

			System.out.print("  " + mark[k]);

		}

		System.out.println("\n Enter the key value for counting");
		int key = sc.nextInt();
		int y = 0;
		int count = 0;
		for (int z = 0; z <= mark.length - 1; z++) {

			while (y < mark.length) {
				if (key == mark[y]) {
					count++;
				}
				y++;
			}

		} // System.out.println("\n The counting of "+key +" is -------- "+ count);
		if (count > 0) {
			System.out.println("the key value " + key + "  is present  " + count + "  times");
		} else {
			System.out.println("the key value  " + key + "  is not present ");
		}
		int temp = mark[0];
		int w = 0;
		while (w < mark.length - 1) {
			mark[w] = mark[w + 1];
			w++;
		}
		mark[w] = temp;
		System.out.println("forward mooved values are ");
		for (Integer g : mark) {
			System.out.print("  " + g);
		}
		sc.close();
	}
}
