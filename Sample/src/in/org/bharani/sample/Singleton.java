package in.org.bharani.sample;

public class Singleton {
	public static Singleton st;
	public static final Singleton getInstance() {
		if (st == null) {
			st = new Singleton();
			System.out.println("accessed");
		}
		return st;
	}

	public String name;

	private Singleton() {
		name = "hello";
	}

}
