package in.org.bharani.sample;

import my.training.basic.Parent;;

public class ChildClass extends Parent {
	public static void main(String args[]) {
		ChildClass cc = new ChildClass();
		cc.doCopy();
		cc.doFarm();

	}

	public void doFarm() {
		System.out.println("child");
	}
}
