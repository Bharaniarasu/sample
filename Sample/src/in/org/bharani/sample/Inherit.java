package in.org.bharani.sample;

public class Inherit {
	static {
		System.out.println("static block");
	}

	static int c = 2323;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inherit in = new Inherit();
	}
	int a = 12;

	Inherit() {
		int mn = 123;
		System.out.println("constructor");
	}

}
