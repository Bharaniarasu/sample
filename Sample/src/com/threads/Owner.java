package com.threads;

public class Owner {

	public static void main(String[] args) {
		Robo r = new Robo();
		MiniRobo mr=new MiniRobo();
		//r.run();
		mr.setPriority(6);
		mr.start();
		r.setPriority(7);
		r.start();
		System.out.println(r.getId());
		System.out.println(r.getName());
		
		System.out.println(r.getState());
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Owner " + i);
		}
		//System.out.println(r.getState());
	}

}
