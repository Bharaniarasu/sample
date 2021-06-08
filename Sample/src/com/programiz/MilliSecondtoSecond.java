package com.programiz;

import java.util.concurrent.TimeUnit;

public class MilliSecondtoSecond {

	public static void main(String[] args) {
		long milliSec = 1000000;
		long minute = TimeUnit.MILLISECONDS.toMinutes(milliSec);
		long second = TimeUnit.MILLISECONDS.toSeconds(milliSec);
		System.out.println("minutes are   " + minute);
		System.out.println("seconds are  " + second);
	}

}
