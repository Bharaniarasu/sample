package com.Garbage.Collection;

public class GarbageCollector {
	GarbageCollector gc;
	public static void main(String[] args) {
		GarbageCollector gc1 = new GarbageCollector();
		GarbageCollector gc2 = new GarbageCollector();
		GarbageCollector gc3 = new GarbageCollector();
		GarbageCollector gc4 = new GarbageCollector();
		gc1=null;
		Runtime.getRuntime().gc();
		
		//System.gc();
		System.out.println(gc1);
		System.out.println(Runtime.getRuntime().totalMemory()+"  "+Runtime.getRuntime().freeMemory());
		//System.out.println(gc1 + "  -gc1 \n" + gc2 + "  -gc2\n" + gc3 + "   -gc3\n" + gc4 + "   -gc4\n");
	}
	private void doGarbage() {
		GarbageCollector gc5 = new GarbageCollector();
		
		
	}
	public void finalize() {
		System.out.println("finalize called");
	}

}
