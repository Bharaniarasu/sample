package com.ils;

import java.util.Scanner;

public class GreatNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1 st value............");
		int a = sc.nextInt();
		System.out.println("enter the 2 nd value............");
		int b = sc.nextInt();
		System.out.println("enter the 3 rd value............");
		int c = sc.nextInt();
		sc.close();
		// for(int i=0;i<sc;i++);
		if (a > b)
			if (a > c)
				System.out.println("1 is bigger...............!!");
		if (b > a)
			if (b > c)
				System.out.println("2 is bigger...............!!");
			else
				// if(c>a) if (c>b)
				System.out.println("3 is bigger...............!!");

	}

}
