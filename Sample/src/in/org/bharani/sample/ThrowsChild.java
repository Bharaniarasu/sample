package in.org.bharani.sample;

public class ThrowsChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsThrow tt = new ThrowsThrow();
//throws

		/*
		 * try { tc.doDiv(); } catch (ArithmeticException ae) { // TODO Auto-generated
		 * catch block System.out.println("exception came"); } System.out.println();
		 * 
		 * }
		 */

//throw
		ThrowsChild tc = new ThrowsChild();
		try {
			tc.doThrow();
		} catch (ArithmeticException ae) {
			System.out.println("exception  catched");
		}

	}

	void doThrow() {
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException ae) {

			System.out.println("exception");
			throw ae;
		}
	}
}
