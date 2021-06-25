package com.threads;

public class ChildThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			// Thread.yield();
			try {
				Thread.sleep(1000);
				System.out.println("Child Thred " + i);
			} catch (InterruptedException e) {
				System.out.println("---Child Interrupted---");
			}

		}
	}
}
