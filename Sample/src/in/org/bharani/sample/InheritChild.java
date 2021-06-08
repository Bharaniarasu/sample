package in.org.bharani.sample;

public class InheritChild extends Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritChild ic = new InheritChild();

		int n = ic.c;
		System.out.println(n);
		System.out.println(ic.a);
	}

	InheritChild() {
		super();
		super.a = 56;
	}

}
