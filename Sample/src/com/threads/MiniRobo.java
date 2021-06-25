package com.threads;

public class MiniRobo extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Mini Robo " + i);
		}
	}
}
