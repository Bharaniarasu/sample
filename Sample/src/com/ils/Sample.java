/**
 * 
 */
package com.ils;

/**
 * @author Bharni
 *
 */
public class Sample {
	static int c = 30;
	static final int z = 200;
	private static void doSub() {
		int d = 0;
		int e = 12;
		System.out.println("subtact =" + (d - e));
	}
	public static void main(String[] args) {
		Sample val = new Sample();
		val.a = 20;
		System.out.println(val.b);
		Sample.c = 20;
		Addition ad = new Addition();
		
		// sample.z=12;
				System.out.println(val.z);
		val.doAdd();
		doSub();

	}

	int a = 10;

	int b = 98;

	private void doAdd() {
		int d = 10;
		int e = 20;
		System.out.println("addition =" + (d + e));
	}

}