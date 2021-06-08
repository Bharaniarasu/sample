package in.org.bharani.sample;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("outer try");
			try {
				System.out.println(10 / 0);

				System.out.println("inner try");

			} catch (NullPointerException npe) {
				System.out.println("inner catch");
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("inner 2nd catch");

			}
		} catch (ArithmeticException aex) {
			System.exit(0);// to terminate execution from here..............................
			System.out.println("outer 1st catch");

		} catch (Exception e) {
			System.out.println("outer 2nd catch");
		}

	}
}
