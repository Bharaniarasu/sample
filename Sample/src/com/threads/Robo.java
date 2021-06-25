package com.threads;

import org.apache.log4j.Logger;

import com.log4j.Example;

public class Robo extends Thread {
	private static Logger log = Logger.getLogger(Robo.class);
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Robo "+i);
		}
		
		
	}}

