package com.Example;

public class Runner {

	public static void main(String[] args) {
		//Bike b=new Bike();
		//b.doRun();
		Vehicle v=new Vehicle() {
			
			@Override
			public void doRun() {
				System.out.println("overriden");
				
			}
			
		};
		v.doRun();
	}

}
