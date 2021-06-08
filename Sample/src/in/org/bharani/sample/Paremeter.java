package in.org.bharani.sample;

public class Paremeter {
	public static void main(String args[]) {
		Paremeter par = new Paremeter();
		ParameterMethods pm = new ParameterMethods();
		pm.doSub();

		// System.out.println();
		int a = (int) par.doAdd();
		System.out.println(a);
		float b = par.doSub(a);
		System.out.println("b is  " + b);
	}

	private float doAdd() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		float c = a + b;
		System.out.println("c is   " + c);
		return c;

	}

	private float doSub(int b) {
		// TODO Auto-generated method stub
		b -= 10;
		System.out.println("b is" + b);
		return b;
	}

}
