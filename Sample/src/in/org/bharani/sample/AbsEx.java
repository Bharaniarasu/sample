package in.org.bharani.sample;

public class AbsEx extends Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsEx ab = new AbsEx();

		ab.doSub();
	}

	@Override
	public int doAdd(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	protected int doCopy(String a, int b) {
		// TODO Auto-generated method stub
		a = "hi";
		b = 34;
		return 0;
	}

	public void doSub() {

	}

}
