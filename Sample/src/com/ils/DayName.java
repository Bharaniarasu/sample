package com.ils;

import java.util.Scanner;

public class DayName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day number ....................");
		int day = sc.nextInt();
		System.out.println(SetDayName(day));
		sc.close();

	}

	public static String SetDayName(int day) {
		String dayname = "";
		switch (day) {
		case 1:
			dayname = "monday";
			break;
		case 2:
			dayname = "tuesday";
			break;
		case 3:
			dayname = "wednesday";
			break;
		case 4:
			dayname = "thursday";
			break;
		case 5:
			dayname = "friday";
			break;
		case 6:
			dayname = "saturday";
			break;
		case 7:
			dayname = "sunday";
			break;
		}
		return dayname;
	}
}
