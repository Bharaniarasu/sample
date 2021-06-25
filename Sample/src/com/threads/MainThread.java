package com.threads;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		ChildThread ct = new ChildThread();
		ct.start();
		// Thread.yield();
		// ct.join();
		ct.interrupt();
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Main Thred " + i);
		}

	}

}
