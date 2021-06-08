package in.org.bharani.sample;

public class ParameterMethods {
	static int a;

	protected void doAdd() {
		System.out.println("Addition");
	}

	void doDiv() {
		System.out.println("Division");
	}

	private void doMul() {
		System.out.println("multiplication");
	}

	public void doSub() {
		a = 1;
		System.out.println("subtraction");
	}
}
