package in.org.bharani.sample;

public class Interface123 implements One { // cant extend a instance from a class , but we can implement here
	public static void main(String args[]) {
		Interface123 in123 = new Interface123();
		in123.doCopy();
		in123.doAdd();
		in123.doPrint();
		in123.doSub();
		System.out.println(in123.a);
	}

	String a;

	public void doAdd() {
		System.out.println(2 + 5);
	}

	public String doCopy() {
		a = "copy";
		System.out.println("copied" + a);
		return a;

	}

	public void doPrint() {
		System.out.println("hello");
	}

	public int doSub() {
		System.out.println(7 - 3);
		return 0;

	}
}
